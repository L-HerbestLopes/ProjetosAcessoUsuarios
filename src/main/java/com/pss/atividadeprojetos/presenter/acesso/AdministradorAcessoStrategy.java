package com.pss.atividadeprojetos.presenter.acesso;


public class AdministradorAcessoStrategy implements UsuarioAcessoStrategy {

    @Override
    public String usuarioToString(String nome) {
        return nome + " (Administrador)";
    }
    
}
