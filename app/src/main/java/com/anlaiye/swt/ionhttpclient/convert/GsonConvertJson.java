package com.anlaiye.swt.ionhttpclient.convert;


import com.anlaiye.swt.ionhttpclient.util.LogUtils;
import com.anlaiye.swt.ionhttpclient.exception.DataException;
import com.anlaiye.swt.ionhttpclient.exception.NoDataException;

/**
 * 介绍：Gson解析实体
 * 作者：sweet
 * 邮箱：sunwentao@imcoming.cn
 * 时间: 2017/3/2
 */

public class GsonConvertJson<T> extends BaseGsonConvertJson<T> {
    private final Class<T> clazz;

    public GsonConvertJson(Class<T> clazz) {
        this.clazz = clazz;
    }

    @Override
    public T convert(String str) throws DataException {
        T t ;
        try {
            t = gson.fromJson(str,clazz);
        }catch (Exception e){
            LogUtils.e("hw----gson error ----", e);
            throw new DataException();
        }
        if(t==null){
            throw new NoDataException();
        }
        return t;
    }
}
