package com.muxxs;

public class LazySingleton {
    private static LazySingleton instance = null;

    private LazySingleton(){
        System.out.println("----懒汉单例模式----");
        System.out.println("懒汉式单例模式输出信息");
    }
    public static void end(){
        System.out.println("----懒汉单例结束----");
    }

    public static LazySingleton getInstance(){
        synchronized (LazySingleton.class) { // 多线程情况下防止重复实例化
            if (instance == null) {
                instance = new LazySingleton();
            }
        }
        return instance;
    }
}
