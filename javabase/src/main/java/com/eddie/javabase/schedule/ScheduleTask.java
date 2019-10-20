/*
package com.eddie.javabase.schedule;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

*/
/**
 * @program: AprilSky
 * @description:
 * @author: Eddie.tran
 * @create: 2019-08-26 20:34:30
 * @version: V1.0
 **//*

@Component
public class ScheduleTask {
    private static final Logger LOGGER = LoggerFactory.getLogger(ScheduleTask.class);
    private static final SimpleDateFormat SIMPLE_DATE_FORMAT = new SimpleDateFormat("HH:mm:ss");

    */
/**
    * @Description: fixedRate :固定速率执行，每5秒执行一次
    * @Param:  
    * @return:  
    * @Author: Eddie.tran
    * @Date: 2019-08-26 :20:40
    *//*

    @Scheduled(fixedRate = 5000)
    public void reportCurrentTimeWhithFixRate(){
        LOGGER.info("Current Thread :{}",Thread.currentThread().getName());
        LOGGER.info("Fixed Rate Task : The time is now {}", SIMPLE_DATE_FORMAT.format(new Date()));
    }


}
*/
