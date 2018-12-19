package com.example.ashish.location;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] str  = {"Khalil1","Khalil1","Khalil1","Khalil1","Khalil1","Khalil1","Khalil1","Khalil1","Khalil1","Khalil1","Khalil1"};

        List<testClass> testClasses = new ArrayList<>();
        testClasses.add(new testClass(1,"Khalil"));
        testClasses.add(new testClass(2,"Khalil"));
        testClasses.add(new testClass(3,"Khalil"));
        testClasses.add(new testClass(4,"Khalil"));
        testClasses.add(new testClass(56,"Khalil"));
        testClasses.add(new testClass(6,"Khalil"));
        testClasses.add(new testClass(7,"Khalil"));
        testClasses.add(new testClass(8,"Khalil"));
        testClasses.add(new testClass(9,"Khalil"));
        testClasses.add(new testClass(12,"Khalil"));
        testClasses.add(new testClass(15,"Khalil"));
        System.out.println("Output for foreach");
        for (testClass i: testClasses){
            System.out.println(i.getA());
        }

        System.out.println("Output for for");

        for (int i = 0; i <testClasses.size() ; i++) {
            System.out.println(testClasses.get(i).getA());
        }


    }
}
