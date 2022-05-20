package com.example.ornatis_tcc.remote;

import com.example.ornatis_tcc.model.ContaAdministradora;
import com.example.ornatis_tcc.model.Funcionario;
import com.example.ornatis_tcc.model.Servico;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Body;
import retrofit2.http.Path;

public interface RouterInterface {

    //INSERÇÃO DE CONTA
    @POST("/contaAdministradora/cadastrarConta")//rota da req e o verbo http
    Call<ContaAdministradora> addEmpresa(@Body ContaAdministradora objUsuario);

    //LISTAGEM DE DADOS DE PERFIL
    @GET("/contaAdministradora/listarPerfil/{id_empresa}")
    Call<ContaAdministradora> getDadosPerfilEstabelecimento(@Path("id_empresa") int id_empresa);

    //INSERÇÃO DE FUNCIONÁRIO
    @POST("/contaAdministradora/cadastroFuncionario")
    Call<Funcionario> addFuncionario(@Body Funcionario objFuncionario);

    //LISTAGEM DE FUNCIONÁRIOS
    @GET("/contaAdministradora/listarFuncionarios/{id_empresa}")
    Call<ArrayList<Funcionario>> getFuncionarios(@Path("id_empresa") int id_empresa);

    //EXCLUSÃO DE FUNCIONÁRIO
//    @DELETE("/contaAdministradora/excluirFuncionario")
//    Call<Funcionario> deleteFuncionario(@Body Funcionario funcionario);


    @DELETE("/contaAdministradora/desabilitarFuncionario/{id_funcionario}")
    Call<Funcionario> deleteFuncionario(@Path("id_funcionario") int id_funcionario);

    //INSERÇÃO DE SERVIÇO
    @POST("/contaAdministradora/cadastrarServico")
    Call<Servico> addServico(@Body Servico objServico);

    //LISTAGEM DE SERVIÇOS
    @GET("/contaAdministradora/listarServicos/{id_empresa}")
    Call<ArrayList<Servico>> getServicos(@Path("id_empresa") int id_empresa);


    //DESATUALIZADAS

        //LISTAGEM DE CONTA
        @GET("/tcc_ornatis_back-end/api-ornatis/rotas/adm/{id_empresa}&acao=carregarDadosConta")
        Call<ContaAdministradora>getContaAdministradora(@Path("id_empresa") int id_empresa);


    //LISTAGEM DE FUNCIONÁRIOS
    //    @GET("/tcc_ornatis_back-end/api-ornatis/rotas/adm/")
    //    Call<ArrayList<Funcionarios>>getFuncionario();

        //LISTAGEM DOS DADOS DO FUNCIONÁRIO
    //    @GET("/tcc_ornatis_back-end/api-ornatis/rotas/adm/")
    //    Call<Funcionarios>getFuncionarioId();

}
