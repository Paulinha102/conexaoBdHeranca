package com.ifsp.model;

public class PessoaFisica extends Cliente{
    private String dataNasc, cpf;
	public String getDataNasc() {
        return this.dataNasc;
    }
    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }
    public String getCpf() {
        return this.cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}