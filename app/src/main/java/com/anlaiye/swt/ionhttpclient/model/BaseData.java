package com.anlaiye.swt.ionhttpclient.model;

import java.util.List;

/**
 * 介绍：基类
 * 作者：sweet
 * 邮箱：sunwentao@imcoming.cn
 * 时间: 2017/3/2
 */
public class BaseData<T> {
    protected boolean result;//废弃
    protected String message;//错误的时候肯定有
    protected int flag;//错误码
    protected T data;

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }




    public boolean isEmptyList(List<?> list){
        return list==null||list.isEmpty();
    }
}
