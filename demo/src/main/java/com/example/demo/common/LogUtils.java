package com.example.demo.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogUtils {
    protected final static Logger logger = LoggerFactory.getLogger(LogUtils.class);
    public static void info(String msg) {
        logger.info("APPLICATION_LOGUTILS" + msg);
    }
    public static void warn(String msg) {
        logger.warn("APPLICATION_LOGUTILS" + msg);
    }
    public static void error(String msg) {
        logger.error("APPLICATION_LOGUTILS" + msg);
    }
    public static void debug(String msg) {
        logger.debug("APPLICATION_LOGUTILS" + msg);
    }
    public static void trace(String msg) {
        logger.trace("APPLICATION_LOGUTILS" + msg);
    }
}