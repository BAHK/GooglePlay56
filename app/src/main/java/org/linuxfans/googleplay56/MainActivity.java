package org.linuxfans.googleplay56;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;

public class MainActivity extends AppCompatActivity
{

    private Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mToolbar = findViewById(R.id.activity_main_toolbar);

        mToolbar.setLogo(R.mipmap.ic_launcher);
        mToolbar.setTitle("Google55");
        mToolbar.setSubtitle("sub title");


        setSupportActionBar(mToolbar);

        mToolbar.setNavigationIcon(R.mipmap.ic_feedback);
        mToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                finish();
            }
        });
        // 初始化 actionbar
    }

//    private void initActionBar()
//    {
//        // 获取 actionbar
//        mActionBar = getActionBar();
//
//        mActionBar.setTitle("GooglePlay");// 设置图标
//        mActionBar.setIcon(R.mipmap.ic_launcher);//设置 ICON
//
//        mActionBar.setDisplayHomeAsUpEnabled(true);//设置可见
//        mActionBar.setDisplayShowHomeEnabled(true);
//    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        return super.onCreateOptionsMenu(menu);
//        MenuInflater inflater;
//        inflater.inflate(R.menu.main, menu);
//        //在初始化菜单的时候，创建SearchView对象
//        SearchView searchView;
//        //设置搜索监听
//        //要想这边不发生空指针异常，就必须在<item/>加入android:actionViewClass="android.widget.SearchView"这个属性(菜单条目中配置)
//        //android通过这个属性去加载SearchView，然后赋值给searchView。
//        searchView.setOnQueryTextListener((SearchView.OnQueryTextListener) this);
//        return true;
    }
}
