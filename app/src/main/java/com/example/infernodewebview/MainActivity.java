package com.example.infernodewebview;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView list1;
    FragmentManager fm = getSupportFragmentManager();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(savedInstanceState == null){
            Fragment1 frag1_ = new Fragment1();
            FragmentTransaction ft = fm.beginTransaction();
            ft.add(R.id.vazio, frag1_,"frag1_");
            ft.commit();
        }

        list1 = findViewById(R.id.list1);

        String [] lista = new String [] {"Twitch","Reddit","Discord"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,lista);

        list1.setAdapter(adapter);

        list1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                FragmentTransaction ft = fm.beginTransaction();

                if(position == 0){
                    Fragment1 frag1 = new Fragment1();
                    ft = fm.beginTransaction();
                    ft.replace(R.id.vazio,frag1,"frag1");
                }
                if(position == 1){
                    Fragment2 frag2 = new Fragment2();
                    ft = fm.beginTransaction();
                    ft.replace(R.id.vazio,frag2,"frag2");
                }
                if(position == 2){
                    Fragment3 frag3 = new Fragment3();
                    ft = fm.beginTransaction();
                    ft.replace(R.id.vazio,frag3,"frag3");
                }
                ft.commit();
            }
        });
    }
}