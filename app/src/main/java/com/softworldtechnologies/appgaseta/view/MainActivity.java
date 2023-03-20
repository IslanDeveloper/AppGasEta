package com.softworldtechnologies.appgaseta.view;

import android.os.Bundle;
import android.text.TextUtils;
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

    double precoGasolina;
    double precoEtanol;
    String recomendacao;

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
            boolean isDadosOk = true;

            if(TextUtils.isEmpty ( editGasolina.getText () )){
                editGasolina.setError ( "Campo obrigatório" );
                editGasolina.requestFocus ();
                isDadosOk = false;
            }

            if(TextUtils.isEmpty ( editEtanol.getText () )){
                editEtanol.setError ( "Campo obrigatório" );
                editEtanol.requestFocus ();
                isDadosOk = false;
            }

            if(isDadosOk){
                precoGasolina = Double.parseDouble (editGasolina.getText ().toString () );
                precoEtanol = Double.parseDouble ( editEtanol.getText ().toString () );
                recomendacao = UtilGasEta.calcularMelhorOpcao (precoGasolina, precoEtanol );
                textResultado.setText ( recomendacao );
            } else {
                Toast.makeText ( this, "Digite os campos obrigatórios", Toast.LENGTH_SHORT ).show ( );
            }
        } );

        buttonLimpar.setOnClickListener ( v -> {
            editGasolina.setText ( "" );
            editEtanol.setText ( "" );
        } );

        buttonSalvar.setOnClickListener ( v -> {

        } );

        buttonFinalizar.setOnClickListener ( v -> finishAffinity ( ) );

        Toast.makeText ( this, UtilGasEta.calcularMelhorOpcao ( 5.12, 3.99 ), Toast.LENGTH_SHORT ).show ( );
    }
}