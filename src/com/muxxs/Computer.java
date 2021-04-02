package com.muxxs;

/**
 * 电脑
 * 产品的抽象方法
 * 具体操作由具体的产品类去实现
 *
 * @author Muxxs
 * @date 2021/04/02
 */
public abstract class Computer {
    /**
     * 抽象类的方法 每个子类都要有
     */
    Computer(){
        System.out.println("----简单工厂方法----");
    }
    public abstract void start();
    public void end(){
        System.out.println("----简单工厂结束----");
    }
}

