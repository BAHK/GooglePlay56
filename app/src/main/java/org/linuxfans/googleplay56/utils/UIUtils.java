package org.linuxfans.googleplay56.utils;

import android.content.Context;
import android.content.res.Resources;

import org.linuxfans.googleplay56.BaseApplication;

/*
 *  @项目名：  GooglePlay56 
 *  @包名：    org.linuxfans.googleplay56.utils
 *  @文件名:   UIUtils
 *  @创建者:   Administrator
 *  @创建时间:  2017/8/31 0031 上午 10:25
 *  @描述：    提供 UI 操作的工具类
 */
public class UIUtils
{
    /**
     * 上下文
     * @return
     */
    public static Context getContext()
    {
        return BaseApplication.getContext();
    }
    public static Resources getResources()
    {
        return getContext().getResources();
    }
    public static String getString(int resId)
    {
        return getResources().getString(resId);
    }

    public static String getPackageName()
    {
        return getContext().getPackageName();
    }
}
