package com.eddie.javabase.reactor;

import lombok.Data;

/**
 * @program: AprilSky
 * @description: reactor中内部处理的event类
 * @author: Eddie.tran
 * @create: 2019-06-01 15:34:51
 * @version: V1.0
 **/
@Data
public class Event {
    private InputSource source;
    private EventType type;

}
