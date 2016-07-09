package com.zhanghan.baselib.data.http;

import org.xutils.common.Callback;

/**
 * Created by ZhangHan on 2016/7/9.
 */
public class HttpCallBack<ResultType> implements Callback.CommonCallback<ResultType> {

    @Override
    public void onSuccess(ResultType resultType) {
        //可以根据公司的需求进行统一的请求成功的逻辑处理
    }

    @Override
    public void onError(Throwable throwable, boolean b) {
        //可以根据公司的需求进行统一的请求网络失败的逻辑处理
    }

    @Override
    public void onCancelled(CancelledException e) {

    }

    @Override
    public void onFinished() {

    }
}
