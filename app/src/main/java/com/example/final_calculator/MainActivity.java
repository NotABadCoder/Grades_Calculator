package com.example.final_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText marks1;
    private EditText marks2;
    private EditText marks3;
    private EditText marks4;
    private EditText marks5;
    private EditText marks6;
    private EditText marks7;
    private EditText marks8;
    private EditText marks9;
    private EditText marks10;
    private EditText marks11;
    private EditText marks12;
    private EditText marks13;
    private EditText marks14;
    private EditText marks15;
    private EditText marks16;
    private EditText marks17;
    private EditText marks18;
    private EditText marks19;
    private EditText marks20;
    private EditText marks21;
    private EditText marks22;
    private TextView total;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        marks1=findViewById(R.id.marks1);
        marks2=findViewById(R.id.marks2);
        marks3=findViewById(R.id.marks3);
        marks4=findViewById(R.id.marks4);
        marks5=findViewById(R.id.marks5);
        marks6=findViewById(R.id.marks6);
        marks7=findViewById(R.id.marks7);
        marks8=findViewById(R.id.marks8);
        marks9=findViewById(R.id.marks9);
        marks10=findViewById(R.id.marks10);
        marks11=findViewById(R.id.marks11);
        marks12=findViewById(R.id.marks12);
        marks13=findViewById(R.id.marks13);
        marks14=findViewById(R.id.marks14);
        marks15=findViewById(R.id.marks15);
        marks16=findViewById(R.id.marks16);
        marks17=findViewById(R.id.marks17);
        marks18=findViewById(R.id.marks18);
        marks19=findViewById(R.id.marks19);
        marks20=findViewById(R.id.marks20);
        marks21=findViewById(R.id.marks21);
        marks22=findViewById(R.id.marks22);
        total=findViewById(R.id.total);
        marks1.addTextChangedListener(new Edit());
        marks2.addTextChangedListener(new Edit());
        marks3.addTextChangedListener(new Edit());
        marks4.addTextChangedListener(new Edit());
        marks5.addTextChangedListener(new Edit());
        marks6.addTextChangedListener(new Edit());
        marks7.addTextChangedListener(new Edit());
        marks8.addTextChangedListener(new Edit());
        marks9.addTextChangedListener(new Edit());
        marks10.addTextChangedListener(new Edit());
        marks11.addTextChangedListener(new Edit());
        marks12.addTextChangedListener(new Edit());
        marks13.addTextChangedListener(new Edit());
        marks14.addTextChangedListener(new Edit());
        marks15.addTextChangedListener(new Edit());
        marks16.addTextChangedListener(new Edit());
        marks17.addTextChangedListener(new Edit());
        marks18.addTextChangedListener(new Edit());
        marks19.addTextChangedListener(new Edit());
        marks20.addTextChangedListener(new Edit());
        marks21.addTextChangedListener(new Edit());
        marks22.addTextChangedListener(new Edit());
        updateCumulativeValues();
        Button clear=findViewById(R.id.Clear);
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                marks1.setText("");
                marks2.setText("");
                marks3.setText("");
                marks4.setText("");
                marks5.setText("");
                marks6.setText("");
                marks7.setText("");
                marks8.setText("");
                marks9.setText("");
                marks10.setText("");
                marks11.setText("");
                marks12.setText("");
                marks13.setText("");
                marks14.setText("");
                marks15.setText("");
                marks16.setText("");
                marks17.setText("");
                marks18.setText("");
                marks19.setText("");
                marks20.setText("");
                marks21.setText("");
                marks22.setText("");
            }
        });
    }
    private void updateCumulativeValues(){
        int number=0;
        String marks = marks1.getText().toString();
        if(!marks.isEmpty()){
            number+=Integer.parseInt(marks);
        }
        marks=marks2.getText().toString();
        if(!marks.isEmpty()){
            number+=Integer.parseInt(marks);
        }
        marks=marks3.getText().toString();
        if(!marks.isEmpty()){
            number+=Integer.parseInt(marks);
        }
        marks=marks4.getText().toString();
        if(!marks.isEmpty()){
            number+=Integer.parseInt(marks);
        }
        marks=marks5.getText().toString();
        if(!marks.isEmpty()){
            number+=Integer.parseInt(marks);
        }
        marks=marks6.getText().toString();
        if(!marks.isEmpty()){
            number+=Integer.parseInt(marks);
        }
        marks=marks7.getText().toString();
        if(!marks.isEmpty()){
            number+=Integer.parseInt(marks);
        }
        marks=marks8.getText().toString();
        if(!marks.isEmpty()){
            number+=Integer.parseInt(marks);
        }
        marks=marks9.getText().toString();
        if(!marks.isEmpty()){
            number+=Integer.parseInt(marks);
        }
        marks=marks10.getText().toString();
        if(!marks.isEmpty()){
            number+=Integer.parseInt(marks);
        }
        marks=marks11.getText().toString();
        if(!marks.isEmpty()){
            number+=Integer.parseInt(marks);
        }
        marks=marks12.getText().toString();
        if(!marks.isEmpty()){
            number+=Integer.parseInt(marks);
        }
        marks=marks13.getText().toString();
        if(!marks.isEmpty()){
            number+=Integer.parseInt(marks);
        }
        marks=marks14.getText().toString();
        if(!marks.isEmpty()){
            number+=Integer.parseInt(marks);
        }
        marks=marks15.getText().toString();
        if(!marks.isEmpty()){
            number+=Integer.parseInt(marks);
        }
        marks=marks16.getText().toString();
        if(!marks.isEmpty()){
            number+=Integer.parseInt(marks);
        }
        marks=marks17.getText().toString();
        if(!marks.isEmpty()){
            number+=Integer.parseInt(marks);
        }
        marks=marks18.getText().toString();
        if(!marks.isEmpty()){
            number+=Integer.parseInt(marks);
        }
        marks=marks19.getText().toString();
        if(!marks.isEmpty()){
            number+=Integer.parseInt(marks);
        }
        marks=marks20.getText().toString();
        if(!marks.isEmpty()){
            number+=Integer.parseInt(marks);
        }
        marks=marks21.getText().toString();
        if(!marks.isEmpty()){
            number+=Integer.parseInt(marks);
        }
        marks=marks22.getText().toString();
        if(!marks.isEmpty()){
            number+=Integer.parseInt(marks);
        }
        total.setText(String.valueOf(number));

    }
    private class Edit implements TextWatcher {

        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            // Not used
        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            // Not used
        }

        @Override
        public void afterTextChanged(Editable editable) {
            updateCumulativeValues();
        }
    }
}