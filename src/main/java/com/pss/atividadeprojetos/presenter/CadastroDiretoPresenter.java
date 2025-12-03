package com.pss.atividadeprojetos.presenter;

import com.pss.atividadeprojetos.model.Usuario;
import com.pss.atividadeprojetos.model.UsuarioRepository;


public class CadastroDiretoPresenter {
    private Usuario usuario;
    private UsuarioRepository repository;
    
    public CadastroDiretoPresenter(UsuarioRepository repository) {
        if(repository == null) {
            throw new RuntimeException("Instância de UsuarioRepository não foi inicializada corretamente.");
        }
        
        this.repository = repository;
        
        concluir();
    }
    
    private void cancelar() {
        // ...
    }
    
    private void concluir() {
        String nome = "Maria Oliveira";
        String email = "maria.oliveira12@gmail.com";
        String senha = "9987";
        
        usuario = new Usuario(nome, email, senha, new UsuarioComumAcessoStrategy());
        
        repository.incluir(usuario);
    }
}
