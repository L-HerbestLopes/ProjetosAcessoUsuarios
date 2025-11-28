package com.pss.atividadeprojetos.presenter;

import com.pss.atividadeprojetos.model.Usuario;
import com.pss.atividadeprojetos.model.UsuarioRepository;


// classe será usada para criar e editar usuarios
public class EditarUsuarioPresenter {
    private Usuario usuario;
    private UsuarioRepository repository;
    
    public EditarUsuarioPresenter(UsuarioRepository repository) {
        if(repository == null) {
            throw new RuntimeException("Instância de UsuarioRepository não foi inicializada corretamente.");
        }
        
        this.repository = repository;
    }
    
    private void cancelar() {
        //...
    }
    
    private void concluir() {
        //...
    }
}
