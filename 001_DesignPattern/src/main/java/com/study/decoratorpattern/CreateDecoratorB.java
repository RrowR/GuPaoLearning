package com.study.decoratorpattern;

/**
 * @author: Rrow
 * @date: 2022/6/6 17:49
 */
public class CreateDecoratorB extends Decorator{
    /**
     * 构造方法，传入组件对象
     * @param component
     */
    public CreateDecoratorB(Component component) {
        super(component);
    }

    private void operationFirst(){} // 在父类方法调用前执行操作
    private void operationLast(){} // 在父类方法调用后执行操作

    public void operation(){
        operationFirst();       // 添加的功能
        super.operation();      // 选择调用父类的方法，如果不调用就代表重写了父类的方法
        operationLast();        // 添加的功能
    }

}
