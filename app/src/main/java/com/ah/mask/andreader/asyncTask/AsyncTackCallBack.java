package com.ah.mask.andreader.asyncTask;

/**
 * 异步线程回调接口
 * Created by Administrator on 2015/11/27.
 */
public interface AsyncTackCallBack<T> {

    void onPostExecute(T result);
}
