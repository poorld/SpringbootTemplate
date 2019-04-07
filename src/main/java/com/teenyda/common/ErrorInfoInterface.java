package com.teenyda.common;

/**
 * @Author Administrator
 * @Date 2019-01-06.
 * @Email teenyda@gmail.com
 */
public interface ErrorInfoInterface {

    /**
     * 状态码
     * @return
     */
    int getCode();

    /**
     * 信息
     * @return
     */
    String getMessage();
}


