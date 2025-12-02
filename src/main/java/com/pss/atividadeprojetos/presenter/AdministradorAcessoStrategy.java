package com.pss.atividadeprojetos.presenter;


public class AdministradorAcessoStrategy implements UsuarioAcessoStrategy {

    @Override
    public String usuarioToString(String nome) {
        return nome + " (Administrador)";
    }
    
}
