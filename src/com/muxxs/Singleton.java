package com.muxxs;

/**
 * 饿汉式单例模式实现
 *
 * @author Muxxs
 * @date 2021/04/02
 */
public class Singleton {
    /**
     * 在第一次被调用的时候初始化自己 只有一个静态地址/指针
     * 长期存储 需要的时候再返回
     * 永远都是一个地址
     */
    private static Singleton instance = new Singleton();

    /**
     * private 保证了其他类无法实例化此类
     * 必须通过 getInstance 方法才能获取到唯一的 instance 实例
     */

    private Singleton(){
        System.out.println("----饿汉单例模式----");
        System.out.println("饿汉式单例模式输出信息");
    }
    public static void end(){
        System.out.println("----饿汉单例结束----");
    }

    public static Singleton getInstance(){
        return instance;
    }
}
