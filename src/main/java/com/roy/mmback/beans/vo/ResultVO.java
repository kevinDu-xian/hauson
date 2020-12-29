package com.roy.mmback.beans.vo;

/**
 * 通用数据返回
 * @param <T>
 */
public class ResultVO<T> {
    private String code;
    private String msg;
    private Object data;

    public ResultVO(String code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public ResultVO(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public ResultVO(String code, Object data) {
        this.code = code;
        this.data = data;
    }

    public ResultVO(Object data) {
        this.data = data;
    }

    public ResultVO() {}

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
