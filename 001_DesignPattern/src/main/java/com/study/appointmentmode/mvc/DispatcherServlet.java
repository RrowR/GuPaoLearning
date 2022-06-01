package com.study.appointmentmode.mvc;

import com.study.appointmentmode.mvc.controllers.MemberController;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: Rrow
 * @date: 2022/6/1 22:29
 */

// 程序调度的入口
public class DispatcherServlet extends HttpServlet {

    private Map<String, Method> handlerMapping = new HashMap();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doDispatch(req,resp);        
    }

    private void doDispatch(HttpServletRequest req, HttpServletResponse resp) {
        // 拿到URL
        String url = req.getRequestURI();
        // 根据URL拿到method
        Method method = handlerMapping.get(url);
        // 调用方法
        // method.invoke();
    }

    @Override
    public void init() throws ServletException {
        try {
            handlerMapping.put("/web/getMemberById.json", MemberController.class.getMethod("getMemberById",new Class[]{String.class}));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
