package com.example.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioGroup radioGroupAv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioGroupAv = (RadioGroup)findViewById(R.id.radrioGroupAverias);
    }

    public void tipoAv(View view) {

        String tipo ="";
        //Sobre que checbox se ha hecho click
        switch (view.getId()) {
            case R.id.checkBoxChapa:
                tipo ="Chapa";
                break;
            case R.id.checkBoxCristal:
                tipo ="Cristal";
                break;
            case R.id.checkBoxMecanica:
                tipo= "Averí mecánica";
                break;
        }
        Toast.makeText(this, tipo, Toast.LENGTH_SHORT).show();
    }

    public void conocerOpcionMarcada(View view) {
        //Recogemos el id del radioButton seleccionado
        int idSelecciondo = radioGroupAv.getCheckedRadioButtonId();
        String tipo ="";
        //Imprimimos un mensaje dependiendo del que se haya seleccionado.
        if(idSelecciondo == R.id.checkBoxChapa){
            tipo = "Has seleccionado chapa y pintura";
        }else if(idSelecciondo == R.id.checkBoxCristal){
            tipo = "Has seleccionado cristal";
        }else{
            tipo = "Has seleccionado averia mecanica";
        }

        Toast.makeText(this, tipo, Toast.LENGTH_SHORT).show();
    }
}
