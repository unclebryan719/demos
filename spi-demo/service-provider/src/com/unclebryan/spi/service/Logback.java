package com.unclebryan.spi.service;

import com.unclebryan.spi.Logger;

/**
 * @author unclebryan
 * @version 1.0
 * @project service-provider
 * @description
 * @date 2022/9/14 00:35:25
 */
public class Logback implements Logger {
    @Override
    public void info(String s) {
        System.out.println("Logback info 打印日志：" + s);
    }

    @Override
    public void debug(String s) {
        System.out.println("Logback debug 打印日志：" + s);
    }
}
