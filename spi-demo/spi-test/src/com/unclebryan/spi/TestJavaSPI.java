package com.unclebryan.spi;

/**
 * @author unclebryan
 * @version 1.0
 * @project spi-test
 * @description
 * @date 2022/9/14 00:43:00
 */
public class TestJavaSPI {
    public static void main(String[] args) {
        LoggerService loggerService = LoggerService.getService();
        loggerService.info("你好");
        loggerService.debug("测试Java SPI 机制");
    }
}
