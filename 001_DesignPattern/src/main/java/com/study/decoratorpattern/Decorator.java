package com.study.decoratorpattern;

/**
 * @author: Rrow
 * @date: 2022/6/6 17:36
 */

// 这里是一个抽象类
public abstract class Decorator extends Component{

    // 持有组件对象
    protected Component component;

    /**
     * 构造方法，传入组件对象
     */
    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        // 转发请求给组件对象，可以在转发前执行一次附加动作
        component.operation();
    }
}
