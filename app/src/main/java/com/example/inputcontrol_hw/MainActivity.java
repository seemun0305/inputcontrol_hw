package com.example.inputcontrol_hw;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox chocolatesyrup, sprinkles, crushednuts, cherries, oriocookiescrumbles;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chocolatesyrup = (CheckBox)findViewById(R.id.chocolate_syrup);
        crushednuts = (CheckBox)findViewById(R.id.crushed_nuts);
        sprinkles = (CheckBox)findViewById(R.id.sprinkles);
        cherries = (CheckBox)findViewById(R.id.cherries);
        oriocookiescrumbles = (CheckBox)findViewById(R.id.orio_cookies_crumbles);
        Button btn = (Button)findViewById(R.id.getBtn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String result = "Toppings:";
                if(chocolatesyrup.isChecked()){
                    result += "\nChocolate Syrup";
                }
                if(crushednuts.isChecked()){
                    result += "\nCrushed Nuts";
                }
                if(sprinkles.isChecked()){
                    result += "\nSprinkles";
                }
                if(cherries.isChecked()){
                    result += "\nCherries";
                }
                if(oriocookiescrumbles.isChecked()){
                    result += "\nOrio Cookies Crumbles";
                }
                Toast.makeText(getApplicationContext(), result, Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void onCheckboxClicked(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        String str="";
        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.chocolate_syrup:
                str = checked?"Chocolate Syrup Selected":"Chocolate Syrup Deselected";
                break;
            case R.id.crushed_nuts:
                str = checked?"Crushed Nuts Selected":"Crushed Nuts Deselected";
                break;
            case R.id.sprinkles:
                str = checked?"Sprinkles Selected":"Sprinkles Deselected";
                break;
            case R.id.cherries:
                str = checked?"Cherries Selected":"Cherries Deselected";
                break;
            case R.id.orio_cookies_crumbles:
                str = checked?"Orio Cookies Crumbles Selected":"Orio Cookies Crumbles Deselected";
                break;
        }
        Toast.makeText(getApplicationContext(), str, Toast.LENGTH_SHORT).show();
    }
}