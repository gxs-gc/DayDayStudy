package com.example.demo_oneactivity_multifragment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
//        if (savedInstanceState == null) {
//            fragment1 = new RepertoryFragment1();
//            mTransaction = getSupportFragmentManager().beginTransaction();
//            mTransaction.add(R.id.container, fragment1, MyWalletFragment.class.getSimpleName());
//            mTransaction.commit();
//        }
//        forgetpwdFragment1 = ForgetpwdFragment1.newInstance();
//        FragmentUtils.add(getSupportFragmentManager(), forgetpwdFragment1,R.id.container);
    }

//    @Override
//    public void onStockClickListener() {
//        RepertoryFragment2 fragment2 = new RepertoryFragment2();
//        mTransaction = getSupportFragmentManager().beginTransaction();
//        mTransaction.hide(fragment1);
//        mTransaction.add(R.id.container, fragment2, fragment2.getClass().getSimpleName());
//        mTransaction.addToBackStack(null);
//        mTransaction.commit();
//    }
//    /**
//     * 下一步按钮
//     */
//    @Override
//    public void onNextItemCLickListener(String phone) {
//        ForgetpwdFragment2 forgetpwdFragment2 = ForgetpwdFragment2.newInstance(phone);
////        FragmentUtils.hide(forgetpwdFragment1);
//        FragmentUtils.add(getSupportFragmentManager(), forgetpwdFragment2,R.id.container,false,true);
//        FragmentUtils.showHide(forgetpwdFragment2,forgetpwdFragment1);
//    }
}