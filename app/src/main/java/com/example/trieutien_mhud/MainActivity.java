package com.example.trieutien_mhud;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Khi chạy app -> mở Login trước
        Intent intent = new Intent(MainActivity.this, Login.class);
        startActivity(intent);

        // Đóng MainActivity để user không quay về nó
        finish();
    }
}
