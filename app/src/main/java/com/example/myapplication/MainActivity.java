package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
private ImageView Slika;
private int broj;
private TextView Rez;
private ImageView mImageView;
Random rand= new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Rez=findViewById(R.id.Rezultat);
        Slika=findViewById(R.id.Slika);
        mImageView=findViewById(R.id.Slika);
    }

  public void clickButtonKocka(View view){
      broj = rand. nextInt(6)+1;
      if(broj == 1){
        mImageView.setImageResource(R.drawable.jedan);
        Rez.setText("jedinica");
      } else if (broj == 2) {
          mImageView.setImageResource(R.drawable.dva);
          Rez.setText("dvojka");
      } else if (broj == 3) {
          mImageView.setImageResource(R.drawable.tri);
          Rez.setText("trojka");
      } else if (broj == 4) {
          mImageView.setImageResource(R.drawable.cetiri);
          Rez.setText("četvorka");
      } else if (broj == 5) {
          mImageView.setImageResource(R.drawable.pet);
          Rez.setText("petica");
      } else if (broj == 6) {
          mImageView.setImageResource(R.drawable.sest);
          Rez.setText("šestica");
      }
  }


}