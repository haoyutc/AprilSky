package com.eddie.dubbo.adaptive;

import com.alibaba.dubbo.common.URL;

public interface WheelMaker {
    Wheel makeWheel(URL url);
}
