package com.mdmazlan.profile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView txt_setting,txt_privacy,txt_support, txt_about, txt_logout;
    ImageView img_add_person,img_burger_menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt_setting = findViewById(R.id.setting);
        txt_privacy = findViewById(R.id.privacy);
        txt_support = findViewById(R.id.support);
        txt_about = findViewById(R.id.about);
        txt_logout = findViewById(R.id.logout);
        img_add_person = findViewById(R.id.add_person);
        img_burger_menu = findViewById(R.id.burger_manu);


        img_burger_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This is Burger Menu", Toast.LENGTH_SHORT).show();
            }
        });

        img_add_person.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This is Add Person", Toast.LENGTH_SHORT).show();
            }
        });

        txt_setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This is Settings", Toast.LENGTH_SHORT).show();
            }
        });
        txt_privacy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This is Privacy", Toast.LENGTH_SHORT).show();
            }
        });
        txt_support.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This is Support", Toast.LENGTH_SHORT).show();
            }
        });
        txt_about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This is About", Toast.LENGTH_SHORT).show();
            }
        });
        txt_logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This is Logout", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
