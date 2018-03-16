package com.zzq.demo.exception;

/**
 * 自定义异常
 */
public class RestException extends RuntimeException{
    private int code;
    private String message;
    private Object data;

    public RestException(int code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public RestException(int code, String message) {
        new RestException(code,message,null);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
