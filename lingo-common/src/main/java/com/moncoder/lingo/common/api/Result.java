package com.moncoder.lingo.common.api;

import lombok.*;

/**
 * @author Moncoder
 * @version 1.0
 * @description 通用返回结果
 * @date 2024/3/9 16:34
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result<T> {

    /**
     * 提示消息
     */
    private String message;

    /**
     * 状态码
     */
    private Long code;

    /**
     * 数据
     */
    private T data;

    /**
     * 请求成功无数据
     * @return
     */
    public static <T> Result<T> success(){
        return new Result<>(ResultCode.SUCCESS.getMessage(), ResultCode.SUCCESS.getCode(), null);
    }

    /**
     * 请求成功有数据
     * @param data
     * @param <T>
     * @return
     */
    public static <T> Result<T> success(T data){
        return new Result<>(ResultCode.SUCCESS.getMessage(), ResultCode.SUCCESS.getCode(), data);
    }

    /**
     * 请求失败
     * @return
     */
    public static <T> Result<T> failed(){
        return new Result<>(ResultCode.FAILED.getMessage(), ResultCode.FAILED.getCode(), null);
    }

    /**
     * 请求失败
     * @param message 自定义提示信息
     * @return
    */
    public static <T> Result<T> failed(String message){
        return new Result<>(message, ResultCode.FAILED.getCode(), null);
    }


    /**
     * 未登录
     * @param <T>
     * @return
     */
    public static <T> Result<T> unauthorized(){
        return new Result<>(ResultCode.UNAUTHORIZED.getMessage(),
                ResultCode.UNAUTHORIZED.getCode(), null);
    }

    /**
     * 未授权
     * @param <T>
     * @return
     */
    public static <T> Result<T> forbidden(){
        return new Result<>(ResultCode.FORBIDDEN.getMessage(),
                ResultCode.FORBIDDEN.getCode(), null);
    }
}