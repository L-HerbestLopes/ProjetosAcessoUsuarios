package com.pss.atividadeprojetos.presenter.acesso;


public class PrimeiroAdministradorAcessoStrategy implements UsuarioAcessoStrategy{

    @Override
    public String usuarioToString(String nome) {
        return nome + " (Administrador)";
    }
    
    @Override
    public String toString() {
        return "administrador";
    }
}
