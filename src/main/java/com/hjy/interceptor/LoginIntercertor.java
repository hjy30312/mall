package com.hjy.interceptor;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class LoginIntercertor
        implements HandlerInterceptor {
    Logger logging = Logger.getLogger(LoginIntercertor.class);

    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {

        logging.trace("preHandle");
        System.out.println("preHandle");
        HttpSession session =
                httpServletRequest.getSession();
        //获取登录成功后放置的用户信息
        String name = (String)
                session.getAttribute("username");
        if (name != null) { //登录过
            return true;
        } else {    //未登录或登录失败
            System.out.println("preHandle：登录失败");
            httpServletResponse.sendRedirect("/login");
            return false;
        }
    }
    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }
    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
