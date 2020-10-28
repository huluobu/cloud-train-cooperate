package com.carrot.testcloud.exception.common;


import org.apache.commons.lang.StringUtils;

/**
 * @Author carrot
 * @Description
 * @Date 2020/6/28 16:57
 **/


public interface Assert {

    /**
     * 创建异常
     * @param param  异常对象
     * @return
     */
    BaseException newException(Object param);

    /**
     * 创建异常
     * @param param 异常对象
     * @param args  占位符信息
     * @return
     */
    BaseException newException(Object param, Object... args);


    /**
     * 断言对象 param.
     * 如果对象为 null ，则抛出异常
     * @param param 待判断的对象
     */
    default void assertNotNull(Object param) {
        if (param==null) {
            throw newException(null);
        }
    }
    /**
     * 断言对象 param.
     * 如果对象为 null ，则抛出异常
     * 异常占位符:args 支持传递参数方式，避免在判断之前进行字符串拼接操作
     *
     * @param param 待判断的对象
     * @param args message占位符对应的参数列表
     */
    default void assertNotNull(Object param, Object... args) {
        if (param==null) {
            throw newException(param,args);
        }
    }


    /**
     * 断言字符串 param.
     * 如果字符串为 blank，则抛出异常
     * @param param 待判断的字符串
     */
    default void assertNotBlank(String param) {
        if (StringUtils.isBlank(param)) {
            throw newException(param);
        }
    }

    /**
     * 断言字符串 param.
     * 如果字符串为 blank，则抛出异常
     * 异常占位符:args 支持传递参数方式，避免在判断之前进行字符串拼接操作
     *
     * @param param 待判断字符串
     * @param args message占位符对应的参数列表
     */
    default void assertNotBlank(String param, Object... args) {
        if (StringUtils.isBlank(param)) {
            throw newException(param,args);
        }
    }

    /**
     * 断言结果是否为 true param.
     * 如果结果为 true，则抛出异常
     * @param param 待判断的字符串
     */
    default void assertBool(boolean param) {
        if (param) {
            throw newException(param);
        }
    }
    /**
     * 断言结果是否为 true param.
     * 如果结果为 true，则抛出异常
     * 异常占位符:args 支持传递参数方式，避免在判断之前进行字符串拼接操作
     *
     * @param param 待判断字符串
     * @param args message占位符对应的参数列表
     */
    default void assertBool(boolean param, Object... args) {
        if (param) {
            throw newException(args);
        }
    }

    /**
     * 断言结果是否为 true param.
     * 如果结果为 true，则抛出异常
     *
     * @param param 待判断字符串
     */
    default Exception getAssertBool(boolean param) {
        if (param) {
            return  newException(param);
        }
        return null;
    }

    /**
     * 断言结果是否为 true param.
     * 如果结果为 true，则抛出异常
     * @param param  断言结果
     * @param args message占位符对应的参数列表
     * @return
     */
    default Exception getAssertBool(boolean param, Object... args) {
        if (param) {
            return  newException(args,args);
        }
        return null;
    }



}
