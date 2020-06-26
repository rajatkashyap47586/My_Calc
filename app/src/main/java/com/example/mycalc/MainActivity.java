package com.example.mycalc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private Button one,two,three,four,five,six,seven,eight,nine,zero,decimal,clear,submit;
    private Button Add,Sub,Mul,Div,exit;
    private TextView info,result;
    private final char Addition='+';
    private final char Subtraction='-';
    private final char Multiplication='*';
    private final char Division='/';
    private final char EQU='0';
    private double value1=Double.NaN;
    private double value2=Double.NaN;
    private char action;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_main);
        setupUI();

        one.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String temp=info.getText().toString();
                try{
                if(temp.charAt(temp.length()-1)=='n')
                    info.setText("");}catch(Exception ex){}
                info.setText(info.getText().toString()+"1");
            }});

        two.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String temp=info.getText().toString();
                try{
                if(temp.charAt(temp.length()-1)=='n')
                    info.setText("");}catch(Exception ex){}
                info.setText(info.getText().toString()+"2");
        }});

        three.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String temp=info.getText().toString();
                try{
                if(temp.charAt(temp.length()-1)=='n')
                    info.setText("");}catch(Exception ex){}
                info.setText(info.getText().toString()+"3");
            }});

        four.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String temp=info.getText().toString();
                try{
                if(temp.charAt(temp.length()-1)=='n')
                    info.setText("");}catch(Exception ex){}
                info.setText(info.getText().toString()+"4");
            }});

        five.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String temp=info.getText().toString();
                try{
                if(temp.charAt(temp.length()-1)=='n')
                    info.setText("");}catch(Exception ex){}
                info.setText(info.getText().toString()+"5");
            }});

        six.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String temp=info.getText().toString();
                try{
                if(temp.charAt(temp.length()-1)=='n')
                    info.setText("");}catch(Exception ex){}
                info.setText(info.getText().toString()+"6");
            }});

        seven.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String temp=info.getText().toString();
                try{
                if(temp.charAt(temp.length()-1)=='n')
                    info.setText("");}catch(Exception ex){}
                info.setText(info.getText().toString()+"7");
            }});

        eight.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String temp=info.getText().toString();
                try{
                if(temp.charAt(temp.length()-1)=='n')
                    info.setText("");}catch(Exception ex){}
                info.setText(info.getText().toString()+"8");
            }});

        nine.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String temp=info.getText().toString();
                try{
                if(temp.charAt(temp.length()-1)=='n')
                    info.setText("");}
                catch(Exception ex){}
                info.setText(info.getText().toString()+"9");
            }});

        zero.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String temp=info.getText().toString();
                try{
                if(temp.charAt(temp.length()-1)=='n')
                    info.setText("");}catch(Exception ex){}
                info.setText(info.getText().toString()+"0");
            }});

        decimal.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String temp=info.getText().toString();
                try{
                if(temp.charAt(temp.length()-1)=='n')
                    info.setText("");}catch(Exception ex){}
                info.setText(info.getText().toString()+".");
            }});

        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp=result.getText().toString();
                if(temp.length()>0){
                    if(temp.charAt(temp.length()-1)!='t')
                    {
                        int index = temp.lastIndexOf('=');
                        String temp2 = temp.substring(index+1);
                        value1 = Double.parseDouble(temp2);
                    }
                    else
                        value1=Double.parseDouble(info.getText().toString());
                }
                action=Addition;
                result.setText(String.valueOf(value1)+ "+");
                info.setText("");
            }
        });

        Sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp=result.getText().toString();
                if(temp.length()>0){
                    if(temp.charAt(temp.length()-1)!='t')
                    {
                        int index = temp.lastIndexOf('=');
                        String temp2 = temp.substring(index+1);
                        value1 = Double.parseDouble(temp2);
                    }
                    else
                        value1=Double.parseDouble(info.getText().toString());
                }
                action=Subtraction;
                result.setText(String.valueOf(value1)+ "-");
                info.setText("");
            }
        });

       Mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp=result.getText().toString();
                if(temp.length()>0){
                    if(temp.charAt(temp.length()-1)!='t')
                    {
                        int index = temp.lastIndexOf('=');
                        String temp2 = temp.substring(index+1);
                        value1 = Double.parseDouble(temp2);
                    }
                    else
                        value1=Double.parseDouble(info.getText().toString());
                }
                action=Multiplication;
                result.setText(String.valueOf(value1)+ "*");
                info.setText("");
            }
        });

        Div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp=result.getText().toString();
                if(temp.length()>0){
                    if(temp.charAt(temp.length()-1)!='t')
                    {
                        int index = temp.lastIndexOf('=');
                        String temp2 = temp.substring(index+1);
                        value1 = Double.parseDouble(temp2);
                    }
                    else
                        value1=Double.parseDouble(info.getText().toString());
                }
                action=Division;
                result.setText(String.valueOf(value1)+ "/");
                info.setText("");
            }
        });

        submit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                compute();
                action=EQU;
                result.setText(result.getText().toString()+String.valueOf(value2)+"="+String.valueOf(value1));
                info.setText(null);

            }
        });

        clear.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                if(info.getText().length()>0){
                    CharSequence name=info.getText().toString();
                    info.setText(name.subSequence(0,name.length()-1));
                }
                else {
                    value1=Double.NaN;
                    value2=Double.NaN;
                    info.setText(null);
                    result.setText(null);
                }
            }
        });

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                finish();
                System.exit(0);
            }
        });

        setupUI();
    }

    private void setupUI()
    {
        one=(Button)findViewById(R.id.button1);
        two=(Button)findViewById(R.id.button2);
        three=(Button)findViewById(R.id.button3);
        four=(Button)findViewById(R.id.button4);
        five=(Button)findViewById(R.id.button5);
        six=(Button)findViewById(R.id.button6);
        seven=(Button)findViewById(R.id.button7);
        eight=(Button)findViewById(R.id.button8);
        nine=(Button)findViewById(R.id.button9);
        zero=(Button)findViewById(R.id.button0);
        decimal=(Button)findViewById(R.id.buttondecimal);
        Add=(Button)findViewById(R.id.buttonadd);
        Sub=(Button)findViewById(R.id.buttonsub);
        Mul=(Button)findViewById(R.id.buttonmul);
        Div=(Button)findViewById(R.id.buttondiv);
        clear=(Button)findViewById(R.id.clear);
        info=(TextView)findViewById(R.id.user);
        result=(TextView)findViewById(R.id.result);
        exit=(Button)findViewById(R.id.exit);
        submit=(Button)findViewById(R.id.buttonsubmit);
    }

    private void compute()
    {
        if(!Double.isNaN(value1))
        {
            value2=(Double.parseDouble(info.getText().toString()));
            switch(action)
            {
                case Addition:
                    value1=value1+value2;
                    break;
                case Subtraction:
                    value1=value1-value2;
                    break;
                case Multiplication:
                    value1=value1*value2;
                    break;
                case Division:
                    value1=value1/value2;
                    break;

                case EQU:
                        break;

            }
        }
        else
        {
            value1=Double.parseDouble(info.getText().toString());

        }
    }
}
