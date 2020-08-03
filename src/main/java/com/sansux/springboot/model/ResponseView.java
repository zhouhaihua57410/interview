package com.sansux.springboot.model;

/**
 * @author: zhouhaihua
 * @date: 2020/7/6 15:54
 * @Description:
 */

public class ResponseView {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    /**
     * 执行正常，返回正常
     */
    public final static int OK = 0;
    /**
     * 执行正常，用户未登陆
     */
    public final static int OK_NOT_LOGIN = 1;
    /**
     * 执行正常，用户无权限
     */
    public final static int OK_NOT_AUTH = 2;
    /**
     * 执行正常，用户被禁用
     */
    public final static int OK_FORBIDDEN = 3;
    /**
     * 执行正常，用户未激活
     */
    public final static int OK_NOT_ACTIVE = 4;
    /**
     * 异常：前端忽略
     */
    public final static int EXCEPTION_IGNORE = -1;
    /**
     * 异常 ：弹窗显示message的内容
     */
    public final static int EXCEPTION_WINDOW_SHOW = -2;
    /**
     * 异常 ： toast显示message的内容
     */
    public final static int EXCEPTION_TOAST_SHOW = -3;
    /**
     * 异常 ：资源不存在
     */
    public final static int SOURCE_NOT_EXIST = -10;

    /**
     * 异常 ： 弹框，点击弹框后刷新
     */
    public final static int EXCEPTION_WINDOW_REFRESH_SHOW = -4;

    private int code = OK;
    private String message = "ok";
    private Object result;
    private String uuid;
    /**
     * 默认，ok
     */
    public ResponseView(){
        this.code = OK;
        this.message = "ok";
    }
    public ResponseView(int code,String msg){
        this.code = code;
        this.message = msg;
    }

    public ResponseView(int code,String msg,String uuid){
        this.code = code;
        this.message = msg;
        this.uuid=uuid;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
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

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }
}
