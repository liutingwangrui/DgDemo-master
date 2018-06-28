package com.jiangtea.dgdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import me.imid.swipebacklayout.lib.app.SwipeBackActivity;

public class MainActivity extends SwipeBackActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = (Button) findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,DialogActivity.class));
//                BottomStyleDialog bottomStyleDialog = new BottomStyleDialog(MainActivity.this);
//                bottomStyleDialog.show();
            }
        });
    }
}
