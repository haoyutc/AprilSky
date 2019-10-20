/*
package com.eddie.javabase.schedule;

import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;

*/
/**
 * @program: AprilSky
 * @description:
 * @author: Eddie.tran
 * @create: 2019-08-26 21:06:55
 * @version: V1.0
 **//*

public class SchedulerConfig implements SchedulingConfigurer {

    private static final int POOL_SIZE=10;
    @Override
    public void configureTasks(ScheduledTaskRegistrar scheduledTaskRegistrar) {
        ThreadPoolTaskScheduler poolTaskScheduler = new ThreadPoolTaskScheduler();

        poolTaskScheduler.setPoolSize(POOL_SIZE);
        poolTaskScheduler.setThreadNamePrefix("my-scheduled-task-pool-");
        poolTaskScheduler.initialize();

        scheduledTaskRegistrar.setTaskScheduler(poolTaskScheduler);
    }
}
*/
