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

import rikkeisoft.nguyenducdung.com.fresherfragment.ClickFragment;
import rikkeisoft.nguyenducdung.com.fresherfragment.R;
import rikkeisoft.nguyenducdung.com.fresherfragment.activity.MainActivity;

public class BFragment extends Fragment implements View.OnClickListener {
    private Button btnBack;
    private ClickFragment clickFragment;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_b, container, false);
        init(view);
        btnBack.setOnClickListener(this);
        return view;
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    private void init(View view) {
        btnBack = view.findViewById(R.id.btn_back_a);
    }

    @Override
    public void onClick(View v) {
        ((ClickFragment) getActivity()).changeFragment(new AFragment());
    }
}
