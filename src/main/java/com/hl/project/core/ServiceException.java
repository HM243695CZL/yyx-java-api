package com.hl.project.core;

/**
 * 服务异常如"账号密码错误"，该异常只做INFO级别的日志记录
 */
public class ServiceException extends RuntimeException {
    public ServiceException() {}

    public ServiceException(String message) {
        super(message);
    }

    public ServiceException(String message, Throwable cause) {
        super(message, cause);
    }
}
