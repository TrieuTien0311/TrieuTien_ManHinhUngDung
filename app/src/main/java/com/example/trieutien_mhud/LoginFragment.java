package com.example.trieutien_mhud;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class LoginFragment extends Fragment {

    public LoginFragment() {
        // Constructor trống là bắt buộc
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        // Gắn layout fragment_login.xml vào fragment này
        View view = inflater.inflate(R.layout.fragment_login, container, false);

        // Tìm tới TextView "Chưa có tài khoản? Đăng ký"
        TextView tvGoToRegister = view.findViewById(R.id.tvGoToRegister);

        // Bắt sự kiện click để chuyển sang RegisterFragment
        tvGoToRegister.setOnClickListener(v -> {
            // Dùng FragmentManager để thay fragment
            getParentFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container, new RegisterFragment())
                    .addToBackStack(null)
                    .commit();
        });

        return view;
    }
}