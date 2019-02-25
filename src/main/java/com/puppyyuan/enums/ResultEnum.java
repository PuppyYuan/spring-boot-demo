package com.puppyyuan.enums;

/**
 * Created by yuanpeng on 2017/9/26.
 */
public enum ResultEnum {
    /*未知错误*/
    UNKNOWNERROR(-1, "位置错误"),
    /*成功*/
    SUCCESS(0, "成功"),
    /*上小学*/
    PRIMARY_SCHOOL(100, "上小学"),
    /*上初中*/
    MIDDLE_SCHOOL(101, "上初中")
    ;

    private Integer code;
    private String message;

    ResultEnum(Integer code, String message){
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
