package com.example.testgithub2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
  private static final String TAG = "MainActivity";

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    TextView textView = findViewById(R.id.txtTest);

    textView.setText("salam");

//    TestClass testClass = new TestClass();
//    testClass.updateMethod(this,textView);

    for (int i = 0; i < 20; i++) {

      Log.i(TAG, "updateMethod: " + i);
      try {
        Thread.sleep(1000);
        textView.setText("alo" + i);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    //s
    //s
  }
}
