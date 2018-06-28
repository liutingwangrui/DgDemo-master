package com.jiangtea.dgdemo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

import me.imid.swipebacklayout.lib.app.SwipeBackActivity;

/**
 * Created by Administrator on 2018/6/28 0028.
 */

public class DialogActivity extends SwipeBackActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        Button btn = (Button) findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BottomStyleDialog bottomStyleDialog = new BottomStyleDialog(DialogActivity.this,data);
                bottomStyleDialog.show();
            }
        });
    }
    private List<String>data=new ArrayList<>();
    private void initData() {
        // 填充数据集合
        for (int i = 0; i <3; i++) {
         data.add("第"+i+"条数据");
        }

    }
}
