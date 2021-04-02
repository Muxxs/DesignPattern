package com.muxxs;

/**
 * 简单的工厂
 * 简单工厂模式
 *
 * @author Muxxs
 * @date 2021/04/02
 */
public class EasyFactory {

    /**
     * 创建计算机方法
     *
     * @param type 请求的类 -> 对应类的对象
     * @return {@link Computer}
     */
    public static Computer createComputer(String type){
        Computer mComputer=null; // 先生成空指针
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