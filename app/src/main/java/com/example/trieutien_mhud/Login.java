package com.example.trieutien_mhud;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);

        // Giúp layout tràn toàn màn hình (EdgeToEdge)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // --- Bắt sự kiện nhấn "Create Account" ---
        TextView tvSignIn = findViewById(R.id.tvSignIn);
        tvSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Chuyển sang Register activity
                Intent intent = new Intent(Login.this, Register.class);
                startActivity(intent);
            }
        });

        // --- Bắt sự kiện nhấn nút "SIGN IN" ---
        Button btnLogin = findViewById(R.id.btnlogin);
        final EditText inputUsername = findViewById(R.id.inputUsername);
        final EditText inputPassword = findViewById(R.id.idPassword);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Lấy giá trị từ EditText
                String username = inputUsername.getText().toString().trim();
                String password = inputPassword.getText().toString().trim();

                // Kiểm tra username và password
                if (username.equals("TrieuTien123") && password.equals("03112005")) {
                    // Đúng thông tin, chuyển sang màn hình Profile
                    Intent intent = new Intent(Login.this, Profile.class);
                    startActivity(intent);
                    finish(); // Đóng Login để không quay lại khi nhấn Back
                } else {
                    // Sai thông tin, hiển thị thông báo lỗi
                    Toast.makeText(Login.this, "Invalid username or password", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}