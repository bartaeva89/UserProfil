package com.example.android.userprofil;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView profile_picture=(ImageView)findViewById(R.id.profile_picture);
        TextView name=(TextView)findViewById(R.id.name);
        TextView birthday=(TextView)findViewById(R.id.birthday);
        TextView country=(TextView)findViewById(R.id.country);
        name.setText("Barta Éva Anna");
        birthday.setText("16/12/89");
        country.setText("Hungary");
        name.setTextSize(30);
        name.setTextColor(Color.BLUE);
        name.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        birthday.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        country.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        profile_picture.setImageResource(R.drawable.picture);

    }
}
