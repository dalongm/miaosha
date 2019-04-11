package com.miaosha.validator;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @author dalongm
 * @date 2019/4/11 10:05
 * @description
 */
public class ValidationResult {
    // 校验结果是否有错
    private boolean hasError = false;

    private Map<String, String> errorMsgMap = new HashMap<>();

    public boolean isHasError(){
        return hasError;
    }

    public void setHasError(boolean hasError) {
        this.hasError = hasError;
    }

    public Map<String, String> getErrorMsgMap() {
        return errorMsgMap;
    }

    public void setErrorMsgMap(Map<String, String> errorMsgMap) {
        this.errorMsgMap = errorMsgMap;
    }

    //实验通用的通用格式化字符串信息获取错误的msg方法
    public String getErrMsg(){
        return StringUtils.join(errorMsgMap.values().toArray(),",");
    }
}
