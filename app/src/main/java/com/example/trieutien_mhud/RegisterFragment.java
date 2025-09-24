package com.example.trieutien_mhud;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class RegisterFragment extends Fragment {

    public RegisterFragment() {
        // Constructor trống là bắt buộc
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_register, container, false);

        // Tìm tới TextView "Đã có tài khoản? Đăng nhập"
        TextView tvGoToLogin = view.findViewById(R.id.tvGoToLogin);

        // Bắt sự kiện click để quay lại LoginFragment
        tvGoToLogin.setOnClickListener(v -> {
            getParentFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container, new LoginFragment())
                    .addToBackStack(null) // để nhấn Back quay lại Register
                    .commit();
        });

        return view;
    }
}