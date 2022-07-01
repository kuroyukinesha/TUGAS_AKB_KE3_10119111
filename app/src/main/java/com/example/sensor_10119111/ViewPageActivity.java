package com.example.sensor_10119111;
// nim = 10119111
// nama = fauzi f
// kelas = if 3

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ViewPageActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_page);

        Button btnAct             = findViewById(R.id.btnAct);
        btnAct.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnAct:
                Intent pindahIntent1 = new Intent(ViewPageActivity.this, MainActivity.class);
                startActivity(pindahIntent1);
                break;
        }
    }
}