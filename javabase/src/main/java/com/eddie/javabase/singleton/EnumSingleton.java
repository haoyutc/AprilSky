package com.eddie.javabase.singleton;

/**
 * @program: AprilSky
 * @description: 枚举单例实现
 * @author: Eddie.tran
 * @create: 2019-05-17 15:59:41
 * @version: V1.0
 **/
public enum EnumSingleton {
    INSTANCE;

    private String objName;

    public String getObjName() {
        return objName;
    }

    public void setObjName(String objName) {
        this.objName = objName;
    }

    public static void main(String[] args) {
        //单例测试
        EnumSingleton firstSingleton = EnumSingleton.INSTANCE;
        firstSingleton.setObjName("firstName");
        System.out.println(firstSingleton.getObjName());

        EnumSingleton secondSingleton = EnumSingleton.INSTANCE;
        secondSingleton.setObjName("secondName");
        System.out.println(firstSingleton.getObjName());
        System.out.println(secondSingleton.getObjName());

        //反射获取实例
        EnumSingleton[] singletons = EnumSingleton.class.getEnumConstants();
        for (EnumSingleton enumSingleton : singletons) {
            System.out.println(enumSingleton.getObjName());
        }

    }
}
