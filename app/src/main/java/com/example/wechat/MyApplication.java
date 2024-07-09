package com.example.wechat;

import android.app.Application;
import android.util.Log;

import com.example.emojilibrary.LQREmotionKit;
import com.example.wechat.core.util.ChatKit;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        LQREmotionKit.init(getApplicationContext());

        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                // 记录异常日志
                Log.e("UncaughtException", "Uncaught exception in thread " + t.getName(), e);

                // 处理异常，例如，收集崩溃报告，重启应用，或者退出应用
                handleUncaughtException(t, e);
            }
        });

        ChatKit chatKit = ChatKit.getChatKit();
        chatKit.init(this);
    }

    private void handleUncaughtException(Thread t, Throwable e) {
        // 示例：简单地退出应用程序
        System.exit(1);
    }
}