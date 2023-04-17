package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText et1,et2;
    private TextView tv1;
    private RadioButton rb1,rb2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=(EditText) findViewById(R.id.et_a1);
        et2=(EditText) findViewById(R.id.et_a2);
        tv1=(TextView) findViewById(R.id.TexV);
        rb1=(RadioButton) findViewById(R.id.RB1);
        rb2=(RadioButton) findViewById(R.id.RB2);
    }

    //Calcular
    public void Calcular (View view){
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();

        int valor1_int = Integer.parseInt(valor1);
        int valor2_int = Integer.parseInt(valor2);

        if (rb1.isChecked() == true){
            int sumar = valor1_int + valor2_int;
            String result = String.valueOf(sumar);
            tv1.setText(result);
        }
        if (rb2.isChecked() == true){
            int restar = valor1_int - valor2_int;
            String result = String.valueOf(restar);
            tv1.setText(result);
        }
    }
}
