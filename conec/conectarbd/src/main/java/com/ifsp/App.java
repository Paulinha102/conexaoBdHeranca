package com.ifsp;
import java.util.List;

import com.ifsp.dao.ClienteDao;
import com.ifsp.model.*;

public class App {
    public static void main(String[] args) throws Exception
    {

        ClienteDao dao = new ClienteDao();

        //PessoaFisica f = new PessoaFisica();
        // f.setNome("teste");
        // f.setEndereco("teste");
        // f.setTelefone("teste");
        // f.setCep("teste");
        // f.setCpf("teste");
        // f.setDataNasc("teste");
        // dao.cadastrarPfisica(f);

        // PessoaJuridica j = new PessoaJuridica();
        // j.setNome("teste2");
        // j.setEndereco("teste2");
        // j.setTelefone("teste2");
        // j.setCep("teste2");
        // j.setCnpj("teste2");
        // j.setRazaoSocial("teste2");
        // dao.cadastrarPjuridica(j);

        List<PessoaFisica> lisPf = dao.pesquisarpf();
        System.out.println("Pessoa Fisica");           
        for (PessoaFisica pf : lisPf) {
                System.out.println("id: "+ pf.getIdCliente());
                System.out.println("Nome: "+ pf.getNome());
                System.out.println("Endereço: "+ pf.getEndereco());
                System.out.println("Telefone: "+ pf.getTelefone());
                System.out.println("Cep: "+ pf.getCep());
                System.out.println("Cpf: "+ pf.getCpf());
                System.out.println("Data Nascimento: "+ pf.getDataNasc()); 
                System.out.println("\n");  
        }

        System.out.println("\n ......................................... \n");

        System.out.println("Pessoa Juridica");
        List<PessoaJuridica> listPj = dao.pesquisarpj();
        for (PessoaJuridica pj : listPj) {
            System.out.println("id: "+ pj.getIdCliente());
            System.out.println("Nome: "+ pj.getNome());
            System.out.println("Endereço: "+ pj.getEndereco());
            System.out.println("Telefone: "+ pj.getTelefone());
            System.out.println("Cep: "+ pj.getCep()); 
            System.out.println("Cnpj: "+ pj.getCnpj()); 
            System.out.println("Razão Social: "+ pj.getRazaoSocial()); 
            System.out.println("\n");
        }
    }
}
