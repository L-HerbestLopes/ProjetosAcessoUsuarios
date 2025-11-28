package com.pss.atividadeprojetos.model;

import java.util.ArrayList;
import java.util.List;



public class UsuarioRepository {
    private List<Usuario> usuarios;
    
    public UsuarioRepository() {
        usuarios = new ArrayList<>();
    }
    
    public void incluir(Usuario usuario) {
        usuarios.add(usuario);
    }
    
    public Usuario get(String nomeUsuario) {
        for(Usuario usuario : usuarios) {
            if(usuario.getNome().equals(nomeUsuario)) {
                return usuario;
            }
        }
        
        return null;
    }
    
    public boolean checarUsuario(String nomeUsuario) {
        for(Usuario usuario : usuarios) {
            if(usuario.getNome().equals(nomeUsuario)) {
                return true;
            }
        }
        
        return false;
    }
}
