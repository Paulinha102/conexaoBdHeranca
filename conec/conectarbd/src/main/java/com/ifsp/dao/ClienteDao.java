package com.ifsp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.ifsp.util.*;
import com.ifsp.model.*;

public class ClienteDao {
    private Connection con;
    public ClienteDao() {
        this.con = new Conexao().getConnection();
    }

    // Cadastro:
    public  void cadastrarPfisica(PessoaFisica pf) throws SQLException {
        String query;
        query = "INSERT INTO cliente (nome, endereco, telefone, cep , data_nasc, cpf ) VALUES (?, ?, ? , ?, ? ,? );";
        PreparedStatement st = con.prepareStatement(query);
        st.setString(1, pf.getNome());
        st.setString(2, pf.getEndereco());
        st.setString(3, pf.getTelefone());
        st.setString(4, pf.getCep());
        st.setString(5, pf.getDataNasc());
        st.setString(6, pf.getCpf());

        st.execute();
        st.close();
        con.close();
    }

    public void cadastrarPjuridica(PessoaJuridica pj) throws SQLException {
        String query;
        query = "INSERT INTO cliente (nome, endereco, telefone, cep , razao_social, cnpj ) VALUES (?, ?, ? , ?, ? ,? );";
        PreparedStatement st = con.prepareStatement(query);
        st.setString(1, pj.getNome());
        st.setString(2, pj.getEndereco());
        st.setString(3, pj.getTelefone());
        st.setString(4, pj.getCep());
        st.setString(5, pj.getRazaoSocial());
        st.setString(6, pj.getCnpj());

        st.execute();
        st.close();
        con.close();
    }

    public List<PessoaJuridica> pesquisarpj() throws SQLException, Exception {
        
        List<PessoaJuridica> lista = new ArrayList();
        String query = "SELECT * FROM cliente WHERE cpf ='' OR cpf IS NULL ";
        PreparedStatement st = con.prepareStatement(query); 
        ResultSet rs = st.executeQuery();
        
        while(rs.next()) {          
            PessoaJuridica pj = new PessoaJuridica();
            pj.setIdCliente(rs.getInt("idCliente"));
            pj.setEndereco(rs.getString("endereco"));
            pj.setNome(rs.getString("nome"));
            pj.setTelefone(rs.getString("telefone"));
            pj.setCep(rs.getString("cep"));
            pj.setCnpj(rs.getString("cnpj"));
            pj.setRazaoSocial(rs.getString("razao_social"));
            lista.add(pj);
     
        }
        return lista;
    }

    public List<PessoaFisica> pesquisarpf() throws SQLException, Exception {
        
        List<PessoaFisica> lista = new ArrayList();
        String query = "SELECT * FROM cliente WHERE cnpj =''  OR  cnpj IS NULL ";
        PreparedStatement st = con.prepareStatement(query); 
        ResultSet rs = st.executeQuery();
        
        while(rs.next()) {          
            PessoaFisica pf = new PessoaFisica();
            pf.setIdCliente(rs.getInt("idCliente"));
            pf.setNome(rs.getString("nome"));
            pf.setEndereco(rs.getString("endereco"));
            pf.setTelefone(rs.getString("telefone"));
            pf.setCep(rs.getString("cep"));
            pf.setCpf(rs.getString("cpf"));
            pf.setDataNasc(rs.getString("data_nasc"));
            lista.add(pf);           
        }
        return lista;
    }
    
}