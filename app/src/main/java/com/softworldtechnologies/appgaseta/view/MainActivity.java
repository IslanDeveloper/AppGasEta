package com.softworldtechnologies.appgaseta.view;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.softworldtechnologies.appgaseta.R;
import com.softworldtechnologies.appgaseta.apoio.UtilGasEta;

public class MainActivity extends AppCompatActivity {

    EditText editGasolina;
    EditText editEtanol;

    TextView textResultado;

    Button buttonCalcular;
    Button buttonLimpar;
    Button buttonSalvar;
    Button buttonFinalizar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );

        editGasolina = findViewById ( R.id.edit_gasolina );
        editEtanol = findViewById ( R.id.edit_etanol );

        textResultado = findViewById ( R.id.text_resultado );

        buttonCalcular = findViewById ( R.id.button_calcular );
        buttonLimpar = findViewById ( R.id.button_limpar );
        buttonSalvar = findViewById ( R.id.button_salvar );
        buttonFinalizar = findViewById ( R.id.button_finalizar );

        buttonCalcular.setOnClickListener ( v -> {

        } );

        buttonLimpar.setOnClickListener ( v -> {

        } );

        buttonSalvar.setOnClickListener ( v -> {

        } );

        buttonFinalizar.setOnClickListener ( v -> finishAffinity ( ) );

        Toast.makeText ( this, UtilGasEta.calcularMelhorOpcao ( 5.12, 3.99 ), Toast.LENGTH_SHORT ).show ( );
    }
}