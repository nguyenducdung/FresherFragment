package rikkeisoft.nguyenducdung.com.fresherfragment.activity;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import rikkeisoft.nguyenducdung.com.fresherfragment.ClickFragment;
import rikkeisoft.nguyenducdung.com.fresherfragment.R;
import rikkeisoft.nguyenducdung.com.fresherfragment.activity.fragment.AFragment;
import rikkeisoft.nguyenducdung.com.fresherfragment.activity.fragment.BFragment;

public class MainActivity extends AppCompatActivity implements ClickFragment {
    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        AFragment aFragment = new AFragment();
        fragmentTransaction.add(R.id.fl_show_fragment,aFragment);
        fragmentTransaction.commit();
    }

    @Override
    public void changeFragment(Fragment fragment) {
        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fl_show_fragment, fragment);
        fragmentTransaction.commit();
    }
}
