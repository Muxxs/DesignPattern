package com.muxxs;

/**
 * 设计模式的java工程
 *
 * @author Muxxs
 * @date 2021/04/02
 */
public class Main {
    public static void main(String[] args) {
	// write your code here
        // 简单工厂
        Computer C = EasyFactory.createComputer("hp");
        C.start();
        C.end();

        // 单例模式
        Singleton S = Singleton.getInstance();
        S.end();
        LazySingleton LS = LazySingleton.getInstance();
        LS.end();



    }
}
