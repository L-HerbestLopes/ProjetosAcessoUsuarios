package com.pss.atividadeprojetos.presenter;

import com.pss.atividadeprojetos.presenter.acesso.PrimeiroAdministradorAcessoStrategy;
import com.pss.atividadeprojetos.model.Usuario;
import com.pss.atividadeprojetos.model.UsuarioRepository;


// classe será usada para criar e editar usuarios
public class CadastroInicialPresenter {
    private Usuario usuario;
    private UsuarioRepository repository;
    
    public CadastroInicialPresenter(UsuarioRepository repository) {
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
        String nome = "Pedro Silva";
        String email = "pedro.silva@gmail.com";
        String senha = "123";
        
        usuario = new Usuario(nome, email, senha, new PrimeiroAdministradorAcessoStrategy());
        
        repository.incluir(usuario);
    }
}
