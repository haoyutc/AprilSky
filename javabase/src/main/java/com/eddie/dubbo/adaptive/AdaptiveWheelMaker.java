package com.eddie.dubbo.adaptive;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.extension.ExtensionLoader;

/**
 * @program: AprilSky
 * @description:
 * @author: Eddie.tran
 * @create: 2019-10-03 23:20:50
 * @version: V1.0
 **/
public class AdaptiveWheelMaker implements WheelMaker {

    @Override
    public Wheel makeWheel(URL url) {
        if (url == null) {
            throw new IllegalArgumentException("url==null");
        }
        String wheelMakerName = url.getParameter("Wheel.maker");
        if (wheelMakerName == null) {
            throw new IllegalArgumentException("wheelMakerName == null");
        }
        WheelMaker wheelMaker = ExtensionLoader.getExtensionLoader(WheelMaker.class).getExtension(wheelMakerName);
        return wheelMaker.makeWheel(url );
    }
}
