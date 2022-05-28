package com.study.proxymode.staticproxy;

/**
 * @author: Rrow
 * @date: 2022/5/28 17:38
 */
public class StaticProxyTestMain {

    public static void main(String[] args) {
        /*
            由于静态代理只能代理成员变量的那一类属性，无法帮忙代理别人，比如这里Shuzuku就会报错
            因为这里NachacoProxyPerson构造方法只让Nekoha来进行传入
            这里静态代理就不能完成了
         */
        NachacoProxyPerson nachacoProxyPerson = new NachacoProxyPerson(new Nekoha());
        // 由代理人发起调用，内部是调用传入对象的方法，在方法的前后进行增强
        nachacoProxyPerson.play();
    }

}
