package com.calderon.janellarazel;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class Activity_LifeCycle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__life_cycle);
        Log.d("lab4","onCreate has executed..");

    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("lab4","onStart has executed..");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("lab4","onResume has executed..");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("lab4","onPause has executed..");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("lab4","onStop has executed");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("lab4","onRestart is again executed");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("lab4","object is deallocated");
    }

    public void display(View v){
        Toast.makeText(this,"Toast is displayed!",Toast.LENGTH_LONG).show();
    }

    public void display2(View v){
        Snackbar.make(v,"Snackbar is displayed",Snackbar.LENGTH_LONG).show();
    }

}
