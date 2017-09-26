package com.puppyyuan.handle;

import com.puppyyuan.domain.Result;
import com.puppyyuan.exception.ManException;
import com.puppyyuan.utils.ResultUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by yuanpeng on 2017/9/26.
 */
@ControllerAdvice
public class ExceptionHandle {

    private final static Logger log = LoggerFactory.getLogger(ExceptionHandle.class);

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result handle(Exception e){
        if(e instanceof ManException){
            ManException manException = (ManException) e;
            return ResultUtils.error(manException.getCode(), manException.getMessage());
        }else{
            log.error("[系统异常]{}", e);
            return ResultUtils.error(-1, "位置错误");
        }
    }
}
