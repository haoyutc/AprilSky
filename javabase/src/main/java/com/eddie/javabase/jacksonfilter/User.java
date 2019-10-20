package com.eddie.javabase.jacksonfilter;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * @program: AprilSky
 * @description:
 * @author: Eddie.tran
 * @create: 2019-06-01 12:32:58
 * @version: V1.0
 **/
//@JsonFilter("non-password")//方法二
@Data
public class User {
    String username;

    //    //方法一
//    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)//jackson
//    @JSONField(serialize = false)//fastjson
    String password;
    //    @JsonIgnore
    Integer age;
    String gender;
    String blog;
}
