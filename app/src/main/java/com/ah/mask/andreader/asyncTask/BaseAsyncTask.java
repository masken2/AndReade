package com.ah.mask.andreader.asyncTask;

import android.os.AsyncTask;

/**
 * 异步线程回调基类，所有的异步操作都要继承此类
 * Created by Administrator on 2015/11/27.
 */
class BaseAsyncTask<T, E> extends AsyncTask<T,Void, E>{


    AsyncTackCallBack<E> asyncTackCallBack;

    @SafeVarargs
    @Override
    protected final E doInBackground(T... params) {
        return null;
    }

    @Override
    protected void onPostExecute(E e) {
        super.onPostExecute(e);
        if (asyncTackCallBack !=null){
            asyncTackCallBack.onPostExecute(e);
        }
    }

    public void setAsyncTackCallBack(AsyncTackCallBack<E> asyncTackCallBack) {
        this.asyncTackCallBack = asyncTackCallBack;
    }
}
