package com.moncoder.lingo.common.exception;

/**
 * @author Moncoder
 * @version 1.0
 * @description 非法参数异常
 * @date 2024/3/23 14:46
 */
public class IllegalArgumentException extends ApiException {

    public IllegalArgumentException(String message) {
        super(message);
    }

    public IllegalArgumentException(Throwable cause) {
        super(cause);
    }

    public IllegalArgumentException(String message, Throwable cause) {
        super(message, cause);
    }
}
