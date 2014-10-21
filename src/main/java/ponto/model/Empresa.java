package ponto.model;

import java.util.List;

/**
 * Created by Ton on 21/10/2014.
 */
public class Empresa {

    private String nome;

    private String cnpj;

    private String inscricaoEstadual;

    //Agregação
    private List<Endereco> enderecoList;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public List<Endereco> getEnderecoList() {
        return enderecoList;
    }

    public void setEnderecoList(List<Endereco> enderecoList) {
        this.enderecoList = enderecoList;
    }

    //metodos de negócio
    public void cadastrarUsuario() {

    }


    public void cadastroEmpresa() {

    }


}
