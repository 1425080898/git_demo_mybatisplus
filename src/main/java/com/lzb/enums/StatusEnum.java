package com.lzb.enums;

import com.sun.org.apache.bcel.internal.classfile.Code;

/**
 * @author :xiaoLiu
 * @date ：Created in 2020/9/15 16:31
 * @description：
 * @modified By：
 * @version:
 */
public enum  StatusEnum {
    SUCCESS_CODE(1,"00000"),
    FAILED_CODE(2,"11111");
    private Integer status;
    private String code;

    StatusEnum(Integer status,String code) {
        this.status = status;
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public static String getCodeByStatus(Integer status){
        if (status==null){
            throw new RuntimeException("参数不能为null");
        }
        StatusEnum[] values = StatusEnum.values();
        for (StatusEnum value : values) {
            if (status.equals(value.status)){
                return value.code;
            }
        }
        return null;
    }
}
