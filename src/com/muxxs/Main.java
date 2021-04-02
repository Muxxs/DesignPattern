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
        Computer C = EasyFactory.createComputer("hp");
        C.start();
    }
}
