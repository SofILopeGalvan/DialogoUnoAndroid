package com.example.sofilop.dialogouno;

import android.app.DatePickerDialog;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import java.util.Calendar;

import android.app.DialogFragment;




import java.text.SimpleDateFormat;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    Button btnToas , btnDialogo, btnFecha;

    private DatePickerDialog fromDatePickerDialog;
    private DatePickerDialog toDatePickerDialog;

    private SimpleDateFormat dateFormatter;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnToas=(Button)findViewById(R.id.btnToas);
        btnDialogo=(Button)findViewById(R.id.btnDialogo);
        btnFecha=(Button)findViewById(R.id.btnFecha);




        dateFormatter = new SimpleDateFormat("dd-MM-yyyy", Locale.US);
       // setDateTimeFie();


        btnToas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast1=Toast.makeText(getApplicationContext(),"Mensaje por medio de Toast",Toast.LENGTH_SHORT);
                toast1.show();
            }
        });



        btnDialogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager=getSupportFragmentManager();
                DialogoAlerta dialogo=new DialogoAlerta();
                dialogo.show(fragmentManager,"tagAlerta");
            }
        });


        btnFecha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                DialogFragment newFragment = new DatePickerFragment();

                newFragment.show(getFragmentManager(), "datePicker");


            }
        });

    }



}
