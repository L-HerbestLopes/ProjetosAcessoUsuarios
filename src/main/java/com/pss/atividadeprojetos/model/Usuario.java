package com.pss.atividadeprojetos.model;

import com.pss.atividadeprojetos.presenter.acesso.UsuarioAcessoStrategy;


public class Usuario {
    private String nome;
    private String email;
    private String senha;
    private UsuarioAcessoStrategy acesso;

    public Usuario(String nome, String email, String senha, UsuarioAcessoStrategy acesso) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        
        this.acesso = acesso;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }
    
    public UsuarioAcessoStrategy getAcesso() {
        return acesso;
    }

    @Override
    public String toString() {
        return acesso.usuarioToString(nome);
    }
    
    
}
