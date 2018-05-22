package com.rain.pushdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

// 主要测试多渠道打包和app端对端推送
public class MainActivity extends AppCompatActivity {

    private TextView tv_content,tv_content2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_content = findViewById(R.id.tv_content);
        tv_content2 = findViewById(R.id.tv_content2);
        tv_content.setText(Constant.BASE_URL);
        tv_content2.setText(Constant.SERVER_HOST);
    }
}
