package com.puppyyuan.exception;

import com.puppyyuan.enums.ResultEnum;

/**
 * Created by yuanpeng on 2017/9/26.
 */
public class ManException extends RuntimeException {

    private Integer code;

    public ManException(ResultEnum resultEnum){
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
