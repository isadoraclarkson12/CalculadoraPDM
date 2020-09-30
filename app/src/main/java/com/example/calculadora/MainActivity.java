package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.*;
import android.app.Activity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity {
    Button btn1;
    TextView result = findViewById(R.id.txtResult);
    String txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(actionHandle);
    }
    View.OnClickListener actionHandle= new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.btn0:

                    break;

                case R.id.btn1:
                    txt = String.valueOf(result.getText());
                    if(txt.equals("0")){
                        txt = "1";
                    }else{
                        txt += "1";
                    }
                    result.setText(txt);
                    break;
                case R.id.btn2:
                    txt = String.valueOf(result.getText());
                    if(txt.equals("0")){
                        txt = "2";
                    }else{
                        txt += "2";
                    }
                    result.setText(txt);
                    break;
                case R.id.btn3:
                    txt = String.valueOf(result.getText());
                    if(txt.equals("0")){
                        txt = "3";
                    }else{
                        txt += "3";
                    }
                    result.setText(txt);
                    break;
                case R.id.btn4:
                    txt = String.valueOf(result.getText());
                    if(txt.equals("0")){
                        txt = "4";
                    }else{
                        txt += "4";
                    }
                    result.setText(txt);
                    break;
                case R.id.btn5:
                    txt = String.valueOf(result.getText());
                    if(txt.equals("0")){
                        txt = "5";
                    }else{
                        txt += "5";
                    }
                    result.setText(txt);
                    break;
                case R.id.btn6:
                    txt = String.valueOf(result.getText());
                    if(txt.equals("0")){
                        txt = "6";
                    }else{
                        txt += "6";
                    }
                    result.setText(txt);
                    break;
                case R.id.btn7:
                    txt = String.valueOf(result.getText());
                    if(txt.equals("0")){
                        txt = "7";
                    }else{
                        txt += "7";
                    }
                    result.setText(txt);
                    break;
                case R.id.btn8:
                    txt = String.valueOf(result.getText());
                    if(txt.equals("0")){
                        txt = "8";
                    }else{
                        txt += "8";
                    }
                    result.setText(txt);
                    break;
                case R.id.btn9:
                    txt = String.valueOf(result.getText());
                    if(txt.equals("0")){
                        txt = "9";
                    }else{
                        txt += "9";
                    }
                    result.setText(txt);
                    break;
                case R.id.btnC:
                    result.setText("0");
                    break;
                case R.id.btnIgual:
                    break;
                case R.id.btnMais:
                    break;
                case R.id.btnMenos:
                    break;
                case R.id.btnDivi:
                    break;
                case R.id.btnMult:
                    break;
            }
        }
    };

}