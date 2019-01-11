package com.example.user.bottomnavigationview;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class HomeFragment extends Fragment implements View.OnClickListener {

    private View view;

    private TextInputLayout tilName;
    private EditText etName;

    private Button btnShow;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_home, container, false);

        tilName = view.findViewById(R.id.tilName);
        etName = view.findViewById(R.id.etName);

        btnShow = view.findViewById(R.id.btnShow);

        btnShow.setOnClickListener(this);

        return view;
    }


    private void showData() {
        Toast.makeText(getActivity(), "Value: " + etName.getText().toString(), Toast.LENGTH_SHORT).show();

    }


    @Override
    public void onClick(View v) {
        int id = v.getId();

        if (id == R.id.btnShow) {
            showData();
        }

    }

}
