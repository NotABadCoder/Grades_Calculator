package com.example.final_calculator;

import static java.lang.Double.valueOf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
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
        total=findViewById(R.id.total);
        InputFilter filter = new InputFilter() {
            final int maxDigitsBeforeDecimalPoint=2;
            final int maxDigitsAfterDecimalPoint=2;
            public CharSequence filter(CharSequence source, int start, int end,
                                       Spanned dest, int dstart, int dend) {
                StringBuilder builder = new StringBuilder(dest);
                builder.replace(dstart, dend, source
                        .subSequence(start, end)
                        .toString());
                String temp = builder.toString();
                if(temp.equals(".")){
                    return ".";
                } else if(temp.equals("")){
                    return "";
                }
                else if(temp.indexOf(".")>-1){
                    int dotIndex = temp.indexOf(".");
                    String beforeDot = temp.substring(0,dotIndex);
                    String afterDot = temp.substring(dotIndex+1);
                    if(beforeDot.length()>maxDigitsBeforeDecimalPoint)
                        return "";
                    else if(afterDot.length()>maxDigitsAfterDecimalPoint)
                        return "";
                } else if(temp.length()>maxDigitsBeforeDecimalPoint){
                    return "";
                }
                return null;
            }
        };
        marks1.setFilters(new InputFilter[]{filter});

        marks2.setFilters(new InputFilter[]{filter});
        marks3.setFilters(new InputFilter[]{filter});
        marks4.setFilters(new InputFilter[]{filter});
        marks5.setFilters(new InputFilter[]{filter});
        marks6.setFilters(new InputFilter[]{filter});
        marks7.setFilters(new InputFilter[]{filter});
        marks8.setFilters(new InputFilter[]{filter});
        marks9.setFilters(new InputFilter[]{filter});
        marks10.setFilters(new InputFilter[]{filter});
        marks11.setFilters(new InputFilter[]{filter});
        marks12.setFilters(new InputFilter[]{filter});
        marks13.setFilters(new InputFilter[]{filter});
        marks14.setFilters(new InputFilter[]{filter});
        marks15.setFilters(new InputFilter[]{filter});
        marks1.setFilters(new InputFilter[]{filter});


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

            }
        });
    }
    private void updateCumulativeValues(){
        double number=0;
        String marks = marks1.getText().toString();
        if(!marks.isEmpty()){
            number+=Double.parseDouble(marks);
        }
        marks=marks2.getText().toString();
        if(!marks.isEmpty()){
            number+=Double.parseDouble(marks);
        }
        marks=marks3.getText().toString();
        if(!marks.isEmpty()){
            number+=Double.parseDouble(marks);
        }
        marks=marks4.getText().toString();
        if(!marks.isEmpty()){
            number+=Double.parseDouble(marks);
        }
        marks=marks5.getText().toString();
        if(!marks.isEmpty()){
            number+=Double.parseDouble(marks);
        }
        marks=marks6.getText().toString();
        if(!marks.isEmpty()){
            number+=Double.parseDouble(marks);
        }
        marks=marks7.getText().toString();
        if(!marks.isEmpty()){
            number+=Double.parseDouble(marks);
        }
        marks=marks8.getText().toString();
        if(!marks.isEmpty()){
            number+=Double.parseDouble(marks);
        }
        marks=marks9.getText().toString();
        if(!marks.isEmpty()){
            number+=Double.parseDouble(marks);
        }
        marks=marks10.getText().toString();
        if(!marks.isEmpty()){
            number+=Double.parseDouble(marks);
        }
        marks=marks11.getText().toString();
        if(!marks.isEmpty()){
            number+=Double.parseDouble(marks);
        }
        marks=marks12.getText().toString();
        if(!marks.isEmpty()){
            number+=Double.parseDouble(marks);
        }
        marks=marks13.getText().toString();
        if(!marks.isEmpty()){
            number+=Double.parseDouble(marks);
        }
        marks=marks14.getText().toString();
        if(!marks.isEmpty()){
            number+=Double.parseDouble(marks);
        }
        marks=marks15.getText().toString();
        if(!marks.isEmpty()){
            number+=Double.parseDouble(marks);
        }

        if (number == Math.floor(number)) {
            total.setText(String.format("%.0f", number));
        } else {
            total.setText(String.format("%.2f", number));
        }

    }
    public class CircleView extends View {

        private final Paint paint;
        private final int radius;

        public CircleView(Context context, int radius) {
            super(context);
            this.radius = radius;

            paint = new Paint();
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(Color.WHITE);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            canvas.drawCircle(radius, radius, radius, paint);
        }

        @Override
        protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            setMeasuredDimension(radius * 2, radius * 2);
        }
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
        public void afterTextChanged(Editable s) {

               updateCumulativeValues();

        }


    }
}