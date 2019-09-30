package com.example.testgithub2;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by ${hosseiiin} on 2/2/2019.
 */
public class TestClass {
  private static final String TAG = "TestClass";

  public void updateMethod(Activity activity, final TextView button) {

    activity.runOnUiThread(new Runnable() {
      @Override
      public void run() {
        for (int i = 0; i < 20; i++) {

          Log.i(TAG, "updateMethod: " + i);
          try {
            Thread.sleep(1000);
            button.setText("alo" + i);
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
        }

      }
    });


  }
}
