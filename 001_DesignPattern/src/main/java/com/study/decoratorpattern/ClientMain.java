package com.study.decoratorpattern;

/**
 * @author: Rrow
 * @date: 2022/6/6 17:53
 */
public class ClientMain {
    public static void main(String[] args) {
        // 创建一个自己继承了抽象类并实现对应方法的具体组件
        ConcreteComponent c1 = new ConcreteComponent();
        // 传入创建出来继承了Component组件的一个类
        CreateDecoratorA createDecoratorA = new CreateDecoratorA(c1);
        // 调用传入具体组件的方法
        createDecoratorA.operation();
        CreateDecoratorB createDecoratorB = new CreateDecoratorB(c1);
        createDecoratorB.operation();
        Decorator decorator = new CreateDecoratorB(createDecoratorA);
        decorator.operation();
    }
}
