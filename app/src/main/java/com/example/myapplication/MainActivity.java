package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.app.Dialog;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button add,button2;
    EditText textview;
    DraggableView layout;
    Spinner spinner,spinner1;
    String font;
    int color,size;

    LinearLayout Layout;

    ArrayList<String> arrSize=new ArrayList<>();
    ArrayList<String> arrFont=new ArrayList<>();
    ArrayList<String> arrColor=new ArrayList<>();
    ArrayList<EditText> arrText=new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        color= ContextCompat.getColor(MainActivity.this,R.color.black);

        add=findViewById(R.id.button5);
        button2=findViewById(R.id.button6);
        layout=(DraggableView) findViewById(R.id.layt1);
        spinner=findViewById(R.id.spinner);
        spinner1=findViewById(R.id.spinner2);
        textview=layout.findViewById(R.id.textView);
        Layout=findViewById(R.id.Layout);


        button2.setBackgroundColor(color);

        arrSize.add("8");
        arrSize.add("10");
        arrSize.add("12");
        arrSize.add("14");
        arrSize.add("16");
        arrSize.add("18");
        arrSize.add("20");
        arrSize.add("24");
        arrSize.add("32");
        setspin(arrSize,spinner);

        arrFont.add("Anta");
        arrFont.add("Roboto");
        arrFont.add("kodeMono");
        arrFont.add("Micro5");
        setspin(arrFont,spinner1);

//        switch (spinner.getSelectedItemPosition()){
//            case 0 : textview.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/Anta-Regular.ttf"));
//            break;
//            case 2 : textview.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/KodeMono-Bold.ttf"));
//            break;
//            case 1 : textview.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/Roboto-Black.ttf"));
//            break;
//            case 3 : textview.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/Micro5-Regular.ttf"));
//            break;
//        }
        textview.setTextColor(color);
        arrText.add(textview);
       // textview.setTextSize(size);
        //textview.setTypeface(Typeface.createFromAsset(getAssets(),font));


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText edt=new EditText(MainActivity.this);
                DraggableView layout1=new DraggableView(MainActivity.this);
                edt.setTextColor(color);
                layout1.addView(edt);
                Layout.addView(layout1);
                arrText.add(edt);
                setEText(edt);
            }
        });
        setEText(textview);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog dilog=new Dialog(MainActivity.this);
                dilog.setContentView(R.layout.colorpicor);
                TextView t2,t3,t4,t5,t6,t7,t8;
                t2=dilog.findViewById(R.id.textView2);
                t3=dilog.findViewById(R.id.textView3);
                t4=dilog.findViewById(R.id.textView4);
                t5=dilog.findViewById(R.id.textView5);
                t6=dilog.findViewById(R.id.textView6);
                t7=dilog.findViewById(R.id.textView7);
                t8=dilog.findViewById(R.id.textView8);
                t2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        color=ContextCompat.getColor(MainActivity.this,R.color.black);
                        dilog.dismiss();
                        button2.setBackgroundColor(color);
                    }
                });
                t3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        color=ContextCompat.getColor(MainActivity.this,R.color.blue);
                        dilog.dismiss();
                        button2.setBackgroundColor(color);
                    }
                });
                t4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        color=ContextCompat.getColor(MainActivity.this,R.color.green);
                        dilog.dismiss();
                        button2.setBackgroundColor(color);
                    }
                });
                t5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        color=ContextCompat.getColor(MainActivity.this,R.color.orange);
                        dilog.dismiss();
                        button2.setBackgroundColor(color);
                    }
                });
                t6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        color=ContextCompat.getColor(MainActivity.this,R.color.red);
                        dilog.dismiss();
                        button2.setBackgroundColor(color);
                    }
                });
                t7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        color=ContextCompat.getColor(MainActivity.this,R.color.white);
                        dilog.dismiss();
                        button2.setBackgroundColor(color);
                    }
                });
                t8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        color=ContextCompat.getColor(MainActivity.this,R.color.yellow);
                        dilog.dismiss();
                        button2.setBackgroundColor(color);
                    }
                });
                dilog.show();

            }

        });
    }

    public void setspin(ArrayList<String> arr, Spinner spinner){
        ArrayAdapter<String> spinadaptr=new ArrayAdapter<>(MainActivity.this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,arr);
        spinner.setAdapter(spinadaptr);
    }

    public void setEText(EditText n){
            n.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    n.setTextColor(color);
                    switch (spinner1.getSelectedItemPosition()){
                        case 0 : n.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/Anta-Regular.ttf"));
                            break;
                        case 2 : n.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/KodeMono-Bold.ttf"));
                            break;
                        case 1 : n.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/Roboto-Black.ttf"));
                            break;
                        case 3 : n.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/Micro5-Regular.ttf"));
                            break;
                    }
                    switch (spinner.getSelectedItemPosition()){
                        case 0: n.setTextSize(8);
                        break;
                        case 1: n.setTextSize(10);
                            break;
                        case 2: n.setTextSize(12);
                            break;
                        case 3: n.setTextSize(14);
                            break;
                        case 4: n.setTextSize(16);
                            break;
                        case 5: n.setTextSize(18);
                            break;
                        case 6: n.setTextSize(20);
                            break;
                        case 7: n.setTextSize(24);
                            break;
                        case 8: n.setTextSize(32);
                            break;
                    }
                    n.setTextColor(color);
                }
            });

    }
}