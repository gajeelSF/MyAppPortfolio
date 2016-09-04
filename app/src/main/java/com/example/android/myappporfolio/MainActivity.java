package com.example.android.myappporfolio;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private static int duration = Toast.LENGTH_SHORT;

    public void popularMoviesClick (View view){
        Context context = getApplicationContext();
        Button button = (Button) findViewById(R.id.popular_movie_button);
        String text = "This button will launch "+button.getText().toString()+"!";
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void stockHawkClick(View view) {
        Context context = getApplicationContext();
        Button button = (Button) findViewById(R.id.stock_hawk_button);
        String text = "This button will launch "+button.getText().toString()+"!";
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void buildItBiggerClick(View view) {
        Context context = getApplicationContext();
        Button button = (Button) findViewById(R.id.build_it_bigger_button);
        String text = "This button will launch "+button.getText().toString()+"!";
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void MakeYourAppMaterialClick(View view) {
        Context context = getApplicationContext();
        Button button = (Button) findViewById(R.id.make_your_app_material_button);
        String text = "This button will launch "+button.getText().toString()+"!";
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
    public void goUbiquitousClick(View view) {
        Context context = getApplicationContext();
        Button button = (Button) findViewById(R.id.go_ubiquitous_button);
        String text = "This button will launch "+button.getText().toString()+"!";
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
    public void capstoneClick(View view) {
        Context context = getApplicationContext();
        Button button = (Button) findViewById(R.id.capstone_button);
        String text = "This button will launch "+button.getText().toString()+"!";
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

}
