package com.example.testgithub2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    //test branch 2

    for (int i = 0; i < 10; i++) {
      i++;
    }


    int number  = 2;
    int number2  = 2;
    float n = 2.5f;
    float n2 = 3.9f;


    List<String> s = new ArrayList<>();
    List<String> s2 = new ArrayList<>();

  }
}
