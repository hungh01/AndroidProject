package com.example.androidproject;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {
    private EditText edtsdt, edtPassword, edtConfirmPassword;
    private Button btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        // Ánh xạ các thành phần trong giao diện
        edtsdt = findViewById(R.id.edtsdt);
        edtPassword = findViewById(R.id.edtPassword);
        edtConfirmPassword = findViewById(R.id.edtConfirmPassword);
        btnRegister = findViewById(R.id.btnRegister);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Lấy thông tin nhập vào từ người dùng
                String sdt = edtsdt.getText().toString();
                String password = edtPassword.getText().toString();
                String confirmPassword = edtConfirmPassword.getText().toString();

                // Kiểm tra thông tin đăng ký
                if (sdt.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
                    // Hiển thị thông báo nếu có trường thông tin bị bỏ trống
                    Toast.makeText(RegisterActivity.this, "Vui lòng nhập thông tin số điện thoại", Toast.LENGTH_SHORT).show();
                } else if (!password.equals(confirmPassword)) {
                    // Hiển thị thông báo nếu mật khẩu và xác nhận mật khẩu không khớp
                    Toast.makeText(RegisterActivity.this, "Mật khẩu và xác nhận mật khẩu không khớp", Toast.LENGTH_SHORT).show();
                } else {
                    // Đăng ký thành công
                    Toast.makeText(RegisterActivity.this, "Đăng ký thành công", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
