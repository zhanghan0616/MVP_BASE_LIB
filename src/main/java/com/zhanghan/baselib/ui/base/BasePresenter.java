package com.zhanghan.baselib.ui.base;

/**
 * Created by ZhangHan on 2016/7/9.
 * MVP中所有Presenter的接口，完成view的绑定和解除
 */
public interface BasePresenter<T extends BaseView> {

    /**
     * 与View相互响应
     */
    void attachView(T view);

    /**
     * 释放资源
     */
    void detachView();
}
