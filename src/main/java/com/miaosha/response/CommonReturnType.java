package com.miaosha.response;

/**
 * @author dalongm
 * @date 2019/4/10 16:40
 * @description
 */
public class CommonReturnType {
    // 表面对应请求的处理结果，“success”或“fail  ”
    private String status;

    // 若status=success,则data返回前端需要的json
    // 否则使用通用的错误码格式
    private Object data;

    // 定义一个通用的创建方法
    public static CommonReturnType create(Object result){
        return CommonReturnType.create(result,"success");
    }

    public static CommonReturnType create(Object result,String status){
        CommonReturnType type = new CommonReturnType();
        type.setData(result);
        type.setStatus(status);
        return type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "CommonReturnType{" +
                "status='" + status + '\'' +
                ", data=" + data +
                '}';
    }
}
