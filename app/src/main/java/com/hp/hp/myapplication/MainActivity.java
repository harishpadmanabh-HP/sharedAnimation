package com.hp.hp.myapplication;

import android.app.ActivityOptions;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout linearLayout;
    ImageView imageView;
//give same transition name in xml for widgets in animation
    //style window transition enable

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView=findViewById(R.id.imageView);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent shared=new Intent(MainActivity.this,Shared.class);
               //pairs with widget and transition name
                //multiple pairs can also be added                 Pair[] pairs=new Pair[n];
                Pair[] pairs=new Pair[1];
                pairs[0]=new Pair<View,String>(imageView,"shared");
                ActivityOptions options=ActivityOptions.makeSceneTransitionAnimation(MainActivity.this,pairs);
               //start activity with activity options
                startActivity(shared,options.toBundle());
            }
        });
    }
}
