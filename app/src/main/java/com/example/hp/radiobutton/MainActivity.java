package com.example.hp.radiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
     Button button;
     RadioButton genderbutton;
     RadioGroup radiogroup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radiogroup=findViewById(R.id.rgroup);
    }

    public void bttn(View view) {
        int selectedId=radiogroup.getCheckedRadioButtonId();
        genderbutton=findViewById(selectedId);
        if(selectedId==-1)
        {
            Toast.makeText(this, "Nothing is selected", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(this,genderbutton.getText(), Toast.LENGTH_SHORT).show();
        }
    }
}
