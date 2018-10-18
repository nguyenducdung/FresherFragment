package rikkeisoft.nguyenducdung.com.fresherfragment.activity.fragment;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import rikkeisoft.nguyenducdung.com.fresherfragment.ClickFragment;
import rikkeisoft.nguyenducdung.com.fresherfragment.R;
import rikkeisoft.nguyenducdung.com.fresherfragment.activity.MainActivity;

public class AFragment extends Fragment implements View.OnClickListener {
    private EditText etName;
    private Button btnGoToB;
    private ClickFragment clickFragment;
    private String textInput;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a, container, false);

        init(view);
        btnGoToB.setOnClickListener(this);
        return view;
    }

//    @Override
//    public void onSaveInstanceState(Bundle outState) {
//        super.onSaveInstanceState(outState);
//        String text = etName.getText().toString().trim();
//        if (text != null) {
//            outState.putString("text", text);
//        }
//    }
//
//    @Override
//    public void onViewStateRestored(Bundle savedInstanceState) {
//        super.onViewStateRestored(savedInstanceState);
//        if (savedInstanceState != null) {
//            String textOld = savedInstanceState.getString("text");
//            etName.setText(textOld);
//        }
//    }
//
//    @Override
//    public void onPause() {
//        super.onPause();
//        String text = etName.getText().toString().trim();
//        if (text != null) {
//            textInput = text;
//        }
//    }
//
//    @Override
//    public void onStart() {
//        super.onStart();
//        etName.setText(textInput);
//
//    }

    private void init(View view) {
        etName = view.findViewById(R.id.et_name);
        btnGoToB = view.findViewById(R.id.btn_goto_b);
    }

    @Override
    public void onClick(View v) {
        ((ClickFragment) getActivity()).changeFragment(new BFragment());
    }

}
