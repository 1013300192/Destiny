package com.example.eyeshieldtablelamp.YBF;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.example.eyeshieldtablelamp.R;

public class Task_management extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_management);
    }

    /**
     * 重写方法，创建menu
     **/
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.add,menu);
        return super.onCreateOptionsMenu(menu);
    }

    /**
     * 重写方法，为menu设置点击事件
     **/
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.add_task){
            //调用数据库添加操作
        }
        return super.onOptionsItemSelected(item);
    }
}