package com.example.wechat.widget.inputPanel;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.wechat.R;

public class StageKeyboardFragment extends Fragment {

    private StageKeyboardViewModel mViewModel;

    public static StageKeyboardFragment newInstance() {
        return new StageKeyboardFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        mViewModel = new ViewModelProvider(this).get(StageKeyboardViewModel.class);
        return inflater.inflate(R.layout.fragment_keyboard_stage, container, false);
    }
}