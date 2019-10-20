package com.eddie.javabase.jacksonfilter;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.PropertyFilter;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import org.junit.Test;

/**
 * @program: AprilSky
 * @description:
 * @author: Eddie.tran
 * @create: 2019-06-01 12:43:58
 * @version: V1.0
 **/
public class JsonFilterTest {

    private ObjectMapper setupJsonFilter() {
        ObjectMapper mapper = new ObjectMapper();
        String[] beanProperties = new String[]{"password"};
        String nonPasswordFilterName = "non-password";//需要跟User类上的注解@JsonFilter("non-password")里面的一致
        FilterProvider filterProvider = new SimpleFilterProvider()
                .addFilter(nonPasswordFilterName, SimpleBeanPropertyFilter.serializeAllExcept(beanProperties));
        //serializeAllExcept 表示序列化全部，除了指定字段
        //filterOutAllExcept 表示过滤掉全部，除了指定的字段
        mapper.setFilterProvider(filterProvider);
        return mapper;
    }

    @Test
    public void testJsonFilter() throws JsonProcessingException {
        User user = new User();
        user.setUsername("tomcatandjerry");
        user.setPassword("123456");
        user.setAge(36);
        user.setGender("男");
//        System.out.println(setupJsonFilter().writeValueAsString(user));
        PropertyFilter filter = (o, s, u) -> {
            if (s.equals("password")) {
                return false;
            }
            return true;
        };
        String json = JSON.toJSONString(user, filter);
        System.out.println(json);
    }
}
