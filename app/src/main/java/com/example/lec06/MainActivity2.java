package com.example.lec06;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void GotoDialer(View view) {
        Uri uri= Uri.parse("tel:+92 3078636043");
        Intent intent=new Intent(Intent.ACTION_DIAL);
        startActivity(intent);

    }

    public void Gotowebside(View view) {
        Uri uri= Uri.parse("https://github.com/adnan657/Lec_06-new-activity-insert-");
        Intent intent=new Intent(Intent.ACTION_VIEW);
        startActivity(intent);
    }
}