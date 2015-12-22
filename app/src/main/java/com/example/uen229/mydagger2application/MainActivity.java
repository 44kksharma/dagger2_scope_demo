package com.example.uen229.mydagger2application;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.uen229.mydagger2application.Sandwitches.CashewSandwich;
import com.example.uen229.mydagger2application.Sandwitches.SandwichModule;
import com.example.uen229.mydagger2application.butters.ButterModule;
import com.example.uen229.mydagger2application.component.ButterComponent;
import com.example.uen229.mydagger2application.component.DaggerButterComponent;
import com.example.uen229.mydagger2application.component.DaggerSandwichComponent;
import com.example.uen229.mydagger2application.component.SandwichComponent;
import com.example.uen229.mydagger2application.utensils.Knife;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    private final String TAG = getClass().getSimpleName();

    //@Inject
    //AlmondButter someAlmondButter;
    @Inject
    CashewSandwich sandwich;

    @Inject
    CashewSandwich sandwich2;

    @Inject
    Knife mKnife;

    @Inject
    Knife mKnife2;

    SandwichComponent sandwichComponent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*create the dependent butter for the sandwich here*/
        ButterComponent butterComponent = DaggerButterComponent.builder().
                butterModule(new ButterModule()).build();
        /*create a scope sandwichcomponent here */

        sandwichComponent = DaggerSandwichComponent.builder().sandwichModule(new SandwichModule()).
                butterComponent(butterComponent)
                .build();
        //finally we have a sandwichComponent, lets inject our dependencies
        sandwichComponent.inject(this);

        Log.v(TAG, " first:" + sandwich.toString());
        Log.v(TAG, "second:" + sandwich2.toString());
        Log.v(TAG, "first knife:" + mKnife.toString());
        Log.v(TAG, "second knife" + mKnife2.toString());
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        //not necessary but it clearly shows the scope being tied to lifecycle of activity
        sandwichComponent=null;
    }
}
