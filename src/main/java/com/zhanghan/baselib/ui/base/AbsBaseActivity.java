package com.zhanghan.baselib.ui.base;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import org.xutils.x;

/**
 * Created by ZhangHan on 2016/7/9.
 * 所有activity的基类
 */
public abstract class AbsBaseActivity extends AppCompatActivity implements BaseView {

    //绑定presenter
    public abstract void bindPresenter();

    //初始化标题栏
    public abstract void initTitlelBar();

    //初始化view和事件
    public abstract void initViewsAndEvents();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: 2016/7/9  将此activity加入管理类，统一管理
        BaseAppManager.getInstance().addActivity(this);
        // TODO: 2016/7/9  注入view
        x.view().inject(this);
        // TODO: 2016/7/9  设置沉浸式
        setStatusBar();
        // TODO: 2016/7/9  设置打开activity动画
        setOpenAnim();
        // TODO: 2016/7/9 设置标题栏
        initTitlelBar();
        // TODO: 2016/7/9 初始化部分视图事件
        initViewsAndEvents();
        // TODO: 2016/7/9  绑定presenter
        bindPresenter();
    }

    //设置状态栏背景色
    public void setStatusBar() {
        //需要此功能的话，在子类重写
    }

    //设置打开activity动画
    public void setOpenAnim() {
        //需要此功能的话，在子类重写
    }

    //设置关闭activity动画
    public void setCloseAnim() {
        //需要此功能的话，在子类重写
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //todo 移除此activity
        BaseAppManager.getInstance().removeActivity(this);

    }


    @Override
    public void close() {
        //todo 设置关闭activity时的动画
        setCloseAnim();
        //todo 关闭activity
        finish();
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
