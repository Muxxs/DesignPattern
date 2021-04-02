package com.muxxs;

/**
 * 简单的工厂
 * 简单工厂模式
 *
 * @author Muxxs
 * @date 2021/04/02
 */
public class EasyFactory {

    public static Computer createComputer(String type){
        Computer mComputer=null;
        switch (type) {
            case "lenovo":
                mComputer=new LenovoComputer();
                break;
            case "hp":
                mComputer=new HpComputer();
                break;
        }
        return mComputer;
    }
}