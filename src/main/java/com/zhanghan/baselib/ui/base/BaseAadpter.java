package com.zhanghan.baselib.ui.base;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import org.xutils.x;

import java.util.List;

/**
 * Created by ZhangHan on 2016/7/9.
 * 自己封装一层适配器，减少重复编写时需要全部重写
 */
public class BaseAadpter<T> extends BaseAdapter {

    private Context mContext;
    private List<T> mDataList;
    private LayoutInflater mInflater;
    private int mResId;
    private Class<?> mHolderClass;
    Object mHolder;

    /**
     * @param context     上下文
     * @param dataList    数据源
     * @param resId       布局资源文件id
     * @param holderClass 子类viewholder 的class
     */
    public BaseAadpter(Context context, List<T> dataList, int resId, Class<?> holderClass) {
        mContext = context;
        mDataList = dataList;
        mResId = resId;
        mHolderClass = holderClass;
        mInflater = LayoutInflater.from(context);
    }

    //获取viewholder
    public Object getHolder() {
        return mHolder;
    }

    //获取当前适配器中的数据源
    public List<T> getDataList() {
        return mDataList;
    }

    //设置信息数据源
    public void setDataList(List<T> dataList) {
        mDataList = dataList;
        notifyDataSetChanged();
    }

    //清除数据信息
    public void clear() {
        mDataList.clear();
        notifyDataSetChanged();
    }

    //移除某一个子项
    public void remove(T data) {
        mDataList.remove(data);
        notifyDataSetChanged();
    }

    //通过position移除某一个子项
    public void remove(int position) {
        mDataList.remove(position);
        notifyDataSetChanged();
    }

    //在数据源中增加子项
    public void add(List<T> dataList) {
        mDataList.addAll(dataList);
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return mDataList.size();
    }

    @Override
    public T getItem(int position) {
        return mDataList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = mInflater.inflate(mResId, null);
            try {
                mHolder = mHolderClass.newInstance();
                x.view().inject(mHolder, convertView);
                convertView.setTag(mHolder);
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }

        } else {
            mHolder = convertView.getTag();
        }
        return convertView;
    }

    public static interface BaseViewHolder {

    }
}
