package com.unclebryan.spi;

/**
 * @author unclebryan
 * @version 1.0
 * @project service-provider-interface
 * @description
 * @date 2022/9/14 00:31:14
 */
public interface Logger {
    void info(String msg);
    void debug(String msg);
}
