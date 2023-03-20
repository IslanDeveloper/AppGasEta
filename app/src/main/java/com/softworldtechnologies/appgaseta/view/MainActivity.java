package com.softworldtechnologies.appgaseta.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.softworldtechnologies.appgaseta.R;
import com.softworldtechnologies.appgaseta.apoio.UtilGasEta;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );

        Toast.makeText ( this, UtilGasEta.calcularMelhorOpcao ( 5.12, 3.99 ), Toast.LENGTH_SHORT ).show ( );
    }
}