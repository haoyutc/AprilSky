package com.eddie.dubbo.spi.dubbo;

import com.alibaba.dubbo.common.extension.ExtensionLoader;
import org.junit.Test;

/**
 * @program: AprilSky
 * @description:
 * @author: Eddie.tran
 * @create: 2019-10-03 17:09:56
 * @version: V1.0
 **/
public class DubboSpiTest {

    @Test
    public void sayHello(){
        ExtensionLoader<Robot> extensionLoader = ExtensionLoader.getExtensionLoader(Robot.class);
        Robot optimusPrime = extensionLoader.getExtension("optimusPrime");
        optimusPrime.sayHello();
        Robot bumblebee = extensionLoader.getExtension("bumblebee");
        bumblebee.sayHello();
    }

}
