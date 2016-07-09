package com.zhanghan.baselib.ui.base;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by ZhangHan on 2016/7/9.
 * 所有fragment的基类
 */
public abstract class AbsBaseFargment extends Fragment implements BaseView {

    //绑定presenter
    abstract void bindPresenter();

    //初始化view和事件
    abstract void initViewsAndEvents();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
    }


    @Override
    public void close() {

    }

    @Override
    public void showMessage(String msg) {

    }

    @Override
    public void showProgress(String msg) {

    }

    @Override
    public void showProgress(String msg, int progress) {

    }

    @Override
    public void hideProgress() {

    }

    @Override
    public void showErrorMessage(String msg, String content) {

    }

    @Override
    public void showSuccessMessage(String msg, String content) {

    }
}
