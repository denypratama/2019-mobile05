package polinema.ac.id.starterchapter05.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

import polinema.ac.id.starterchapter05.R;
import polinema.ac.id.starterchapter05.fragments.BlueFragment;
import polinema.ac.id.starterchapter05.fragments.RedFragment;

public class DynamicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dynamic);
    }

    public void handlerClickLoadRedFragment(View view) {
//        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
//        fragmentTransaction.replace(R.id.dynamic_fragment_placeholder,new RedFragment());
//        fragmentTransaction.commit();

//        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
//        fragmentTransaction.replace(R.id.dynamic_fragment_placeholder,new RedFragment(),"RED_FRAGMENT");
//        fragmentTransaction.addToBackStack(null);
//        fragmentTransaction.commit();

//        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
//        fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
//        fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
//        fragmentTransaction.replace(R.id.dynamic_fragment_placeholder,new RedFragment(),"RED_FRAGMENT");
//        fragmentTransaction.addToBackStack(null);
//        fragmentTransaction.commit();

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter_from_left,R.anim.exit_from_left,R.anim.enter_from_left,R.anim.exit_from_right);
        fragmentTransaction.replace(R.id.dynamic_fragment_placeholder,new RedFragment(),"RED_FRAGMENT");
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

    public void handlerClickLoadBlueFragment(View view) {
//        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
//        fragmentTransaction.replace(R.id.dynamic_fragment_placeholder,new BlueFragment());
//        fragmentTransaction.commit();

//        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
//        fragmentTransaction.replace(R.id.dynamic_fragment_placeholder,new BlueFragment(),"BLUE_FRAGMENT");
//        fragmentTransaction.addToBackStack(null);
//        fragmentTransaction.commit();

//        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
//        fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
//        fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
//        fragmentTransaction.replace(R.id.dynamic_fragment_placeholder,new BlueFragment(),"BLUE_FRAGMENT");
//        fragmentTransaction.addToBackStack(null);
//        fragmentTransaction.commit();

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter_from_left,R.anim.exit_from_left,R.anim.enter_from_left,R.anim.exit_from_right);
        fragmentTransaction.replace(R.id.dynamic_fragment_placeholder,new BlueFragment(),"BLUE_FRAGMENT");
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }
}
