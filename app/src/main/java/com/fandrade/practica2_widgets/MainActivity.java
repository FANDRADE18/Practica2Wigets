package com.fandrade.practica2_widgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
 private CheckBox check1,check2,check3;
 private Button btn1;
 private Spinner spColores;
 private List<String> Liscol= new ArrayList<String>();
 private ArrayAdapter<String> adptList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        check1=(CheckBox)findViewById(R.id.checkBox1);
        check2=(CheckBox)findViewById(R.id.checkBox2);
        check3=(CheckBox)findViewById(R.id.checkBox3);
        btn1=(Button) findViewById(R.id.button1);
        spColores=(Spinner) findViewById(R.id.spin1);


        Liscol.add("ROJO");
        Liscol.add("VERDE");
        Liscol.add("AZUL");
        Liscol.add("AMARILLO");
adptList = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,Liscol);
spColores.setAdapter(adptList);

spColores.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String ColorSelect=Liscol.get(position);
        Toast.makeText(getApplicationContext(),"SELECCIONO EL COLOR "+ColorSelect,Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
});






        btn1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        if(check1.isChecked())
            Toast.makeText(getApplicationContext(),"SELECCIONASTE EL COLOR ROJO",Toast.LENGTH_SHORT).show();
        if(check2.isChecked())
            Toast.makeText(getApplicationContext(),"SELECCIONASTE EL COLOR VERDE",Toast.LENGTH_SHORT).show();
        if(check3.isChecked())
            Toast.makeText(getApplicationContext(),"SELECCIONASTE EL COLOR AZUL",Toast.LENGTH_SHORT).show();
    }
});

        check1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(check1.isChecked()==true)
                    Toast.makeText(getApplicationContext(),"MARCASTE EL COLOR ROJO",Toast.LENGTH_SHORT).show();

            }
        });
        check2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(check2.isChecked()==true)
                    Toast.makeText(getApplicationContext(),"MARCASTE EL COLOR VERDE",Toast.LENGTH_SHORT).show();

            }
        });
        check3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(check3.isChecked()==true)
                    Toast.makeText(getApplicationContext(),"MARCASTE EL COLOR AZUL",Toast.LENGTH_SHORT).show();

            }
        });
    }
}