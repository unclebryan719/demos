package com.unclebryan.spi;

/**
 * @author unclebryan
 * @version 1.0
 * @project service-provider-interface
 * @description
 * @date 2022/9/14 00:32:00
 */
public class Main {
    public static void main(String[] args) {
        LoggerService service = LoggerService.getService();

        service.info("Hello SPI");
        service.debug("Hello SPI");
    }
}
