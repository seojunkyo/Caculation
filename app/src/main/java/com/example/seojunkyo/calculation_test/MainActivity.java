package com.example.seojunkyo.calculation_test;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    private Button btnOne;
    private Button btnTwo;
    private Button btnThr;
    private Button btnFou;
    private Button btnFiv;
    private Button btnSix;
    private Button btnSvn;
    private Button btnEig;
    private Button btnNin;
    private Button btnZer;
    private Button btnPlu;
    private Button btnDev;
    private Button btnAc;
    private Button btnMin;
    private Button btnMul;
    private Button btnRes;

    private int a;
    private int where=0;
    private int flag=0;

    private TextView input;
    private TextView input2;
    private TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnOne = (Button)findViewById(R.id.btn1);
        btnTwo = (Button)findViewById(R.id.btn2);
        btnThr = (Button)findViewById(R.id.btn3);
        btnFou = (Button)findViewById(R.id.btn4);
        btnFiv = (Button)findViewById(R.id.btn5);
        btnSix = (Button)findViewById(R.id.btn6);
        btnSvn = (Button)findViewById(R.id.btn7);
        btnEig = (Button)findViewById(R.id.btn8);
        btnNin = (Button)findViewById(R.id.btn9);
        btnZer = (Button)findViewById(R.id.btn0);
        btnPlu = (Button)findViewById(R.id.btnPlus);
        btnMin = (Button)findViewById(R.id.btnMinus);
        btnMul = (Button)findViewById(R.id.btnMutiply);
        btnDev = (Button)findViewById(R.id.btnDevide);
        btnRes = (Button)findViewById(R.id.btnEqual);
        btnAc = (Button)findViewById(R.id.btnAc);

        input=(TextView)findViewById(R.id.input);
        input2=(TextView)findViewById(R.id.input2);
        res=(TextView)findViewById(R.id.result);

        OnClickListener cal = new OnClickListener(){

            @Override
            public void onClick(View v) {
                TextView temp;

                if(flag==0) {
                    temp = input;
                }
                else if(flag==1){
                    temp = input2;
                }
                else{
                    temp = input;
                    input.setText("");
                    input2.setText("");
                    res.setText("");
                    flag=0;
                }
                if(v==btnOne){
                    temp.setText(temp.getText().toString()+1);
                }
                else if(v==btnTwo){
                    temp.setText(temp.getText().toString()+2);
                }
                else if(v==btnThr){
                    temp.setText(temp.getText().toString()+3);
                }
                else if(v==btnFou){
                    temp.setText(temp.getText().toString()+4);
                }
                else if(v==btnFiv){
                    temp.setText(temp.getText().toString()+5);
                }
                else if(v==btnSix){
                    temp.setText(temp.getText().toString()+6);
                }
                else if(v==btnSvn){
                    temp.setText(temp.getText().toString()+7);
                }
                else if(v==btnEig){
                    temp.setText(temp.getText().toString()+8);
                }
                else if(v==btnNin){
                    temp.setText(temp.getText().toString()+9);
                }
                else if(v==btnZer){
                    temp.setText(temp.getText().toString()+0);
                }
                else if(v==btnPlu){
                    a = Integer.valueOf(temp.getText().toString().trim());
                    where =1;
                    flag=1;
                }
                else if(v==btnMin){
                    a = Integer.valueOf(temp.getText().toString().trim());
                    where =2;
                    flag=1;
                }
                else if(v==btnMul){
                    //*
                    a = Integer.valueOf(temp.getText().toString().trim());
                    where =3;
                    flag=1;
                }
                else if(v==btnDev){
                    // /
                    a = Integer.valueOf(temp.getText().toString().trim());
                    where =4;
                    flag=1;
                }
                else if(v==btnRes){
                    //=
                    if(where==1){
                        a = a + Integer.valueOf(temp.getText().toString().trim());
                        res.setText(Integer.toString(a));
                    }
                    else if(where==2){
                        a = a - Integer.valueOf(temp.getText().toString().trim());
                        res.setText(Integer.toString(a));
                    }

                    else if(where==3){
                        a = a * Integer.valueOf(temp.getText().toString().trim());
                        res.setText(Integer.toString(a));
                    }

                    else if(where==4){
                        a = a / Integer.valueOf(temp.getText().toString().trim());
                        res.setText(Integer.toString(a));
                    }
                    flag=2;
                }
                else if(v==btnAc){
                    //C
                    input.setText("");
                    input2.setText("");
                    res.setText("");
                }
            }
        };
            btnOne.setOnClickListener(cal);
            btnTwo.setOnClickListener(cal);
            btnThr.setOnClickListener(cal);
            btnFou.setOnClickListener(cal);
            btnFiv.setOnClickListener(cal);
            btnSix.setOnClickListener(cal);
            btnSvn.setOnClickListener(cal);
            btnEig.setOnClickListener(cal);
            btnNin.setOnClickListener(cal);
            btnZer.setOnClickListener(cal);
            btnPlu.setOnClickListener(cal);
            btnMin.setOnClickListener(cal);
            btnMul.setOnClickListener(cal);
            btnDev.setOnClickListener(cal);
            btnAc.setOnClickListener(cal);
            btnRes.setOnClickListener(cal);
    }
}
