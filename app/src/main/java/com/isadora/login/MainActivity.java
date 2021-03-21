package com.isadora.login;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText campoNome,campoEmail;
    private TextView resultadoNomeEmmail,resultadoSexo;
    private RadioButton verde,azul,vermelho,sexoMasculino,sexoFeminino;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campoNome           = findViewById(R.id.edtNome);
        campoEmail          = findViewById(R.id.edtEmail);
        resultadoNomeEmmail = findViewById(R.id.txtResultadoNomeEmail);
        sexoMasculino       = findViewById(R.id.radioButtonMasculino);
        sexoFeminino        = findViewById(R.id.radioButtonFeminino);
        resultadoSexo       = findViewById(R.id.txtResultadoSexo);
        verde               = findViewById(R.id.radioButtonVerde);
        azul                = findViewById(R.id.radioButtonAzul);
        vermelho            = findViewById(R.id.radioButtonVermelho);
    }

    public void cor(){

        if(verde.isChecked()){
            resultadoNomeEmmail.setTextColor(getColor(R.color.green));
            resultadoSexo.setTextColor(getColor(R.color.green));
        }else if(azul.isChecked()){
            resultadoNomeEmmail.setTextColor(getColor(R.color.blue));
            resultadoSexo.setTextColor(getColor(R.color.blue));
        }else if(vermelho.isChecked()){
            resultadoNomeEmmail.setTextColor(getColor(R.color.red));
            resultadoSexo.setTextColor(getColor(R.color.red));
        }
    }

    public void sexo(){

        if(sexoMasculino.isChecked()){
            resultadoSexo.setText("Masculino");
        }else if(sexoFeminino.isChecked()){
            resultadoSexo.setText("Feminino");
        }
    }

    public void enviar(View view){
        cor();
        sexo();

        String nome     = campoNome.getText().toString();
        String email    = campoEmail.getText().toString();

        String texto    = "Nome: " +nome+ " E-mail: " +email;

        resultadoNomeEmmail.setText(texto);

    }

    public void limpar(View view){

        campoNome.setText("");
        campoEmail.setText("");
        resultadoNomeEmmail.setText("Resultado Nome e E-mail:");
        resultadoSexo.setText("Resultado Sexo:");

    }
}