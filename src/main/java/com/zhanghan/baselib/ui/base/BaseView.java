package com.zhanghan.baselib.ui.base;

/**
 * Created by ZhangHan on 2016/7/9.
 * MVP中所有 View的接口
 */
public interface BaseView {

    void close();

    void showMessage(String msg);

    void showProgress(String msg);

    void showProgress(String msg, int progress);

    void hideProgress();

    void showErrorMessage(String msg, String content);

    void showSuccessMessage(String msg, String content);

}
