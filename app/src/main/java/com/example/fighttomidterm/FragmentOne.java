package com.example.fighttomidterm;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentOne extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_one, container, false);

        TextView textView = view.findViewById(R.id.text_view);
        EditText editText = view.findViewById(R.id.edit_text);
        Button button = view.findViewById(R.id.button);

        button.setOnClickListener(v -> {
            String input = editText.getText().toString();
            textView.setText("You typed: " + input);
        });

        return view;
    }
}