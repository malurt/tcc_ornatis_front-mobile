package com.example.ornatis_tcc.UI.conta_administradora.funcionario;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.ornatis_tcc.R;

public class PrestadorListagemFuncionarios extends AppCompatActivity {

    private TextView adicionando_novo_funcionario;
    private ImageView iv_foto_perfil_funcionario;
    private String tv_nome_do_funcionario, tv_profissao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prestador_listagem_funcionarios);

        adicionando_novo_funcionario = findViewById(R.id.adicionando_novo_funcionario);


        //MUDAR DE TELA AO CLICAR NO +
//        adicionando_novo_funcionario.setOnClickListener(view -> {
//            startActivity(new Intent(PrestadorListagemFuncionarios.this, PrestadorCadastrarFuncionario.class));
//        });



    }


}