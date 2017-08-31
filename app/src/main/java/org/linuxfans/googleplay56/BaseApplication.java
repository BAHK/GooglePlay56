package org.linuxfans.googleplay56;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;

/*
 *  @项目名：  GooglePlay56 
 *  @包名：    org.linuxfans.googleplay56
 *  @文件名:   BaseApplication
 *  @创建者:   Administrator
 *  @创建时间:  2017/8/30 0030 下午 4:36
 *  @描述：    TODO
 */
public class BaseApplication extends Application
{
    private static  Context  mContext;
    private static  Thread   mMainThread;
    private static  long     mMainThreadId;
    private static  Looper   mMainLooper;
    private static  Handler  mMainHandler;


    public static Context getContext()
    {
        return mContext;
    }

    public static Thread getMainThread()
    {
        return mMainThread;
    }

    public static long getMainThreadId()
    {
        return mMainThreadId;
    }

    public static Looper getMainThreadLooper()
    {
        return mMainLooper;
    }

    public static Handler getMainHandler()
    {
        return mMainHandler;
    }

    @Override
    public void onCreate()
    {
        super.onCreate();

        // 上下文
        mContext = getApplicationContext();

        // 主线程
        mMainThread = Thread.currentThread();

        mMainThreadId = Process.myTid();

        mMainLooper = getMainLooper();

        // 创建主线程的 HANDLER

    }
}
