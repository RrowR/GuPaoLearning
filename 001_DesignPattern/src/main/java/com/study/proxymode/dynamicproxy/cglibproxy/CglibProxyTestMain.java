package com.study.proxymode.dynamicproxy.cglibproxy;

import net.sf.cglib.core.DebuggingClassWriter;

/**
 * @author: Rrow
 * @date: 2022/5/29 3:36
 */
public class CglibProxyTestMain {
    public static void main(String[] args) {

        /*
            这个要先放到上面才能生成出来，然后控制台会有显示
            CGLIB debugging enabled, writing to 'F:\CGLIB'
         */
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY,"./CGLIB");
        new NekohaProxy().getInstance(Shuzuku.class);
        // shuzuku.play();
    }
}
