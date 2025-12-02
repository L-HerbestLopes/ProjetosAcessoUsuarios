package com.pss.atividadeprojetos.presenter;


public class NaoUsuarioAcessoStrategy implements UsuarioAcessoStrategy {

    @Override
    public String usuarioToString(String nome) {
        return nome + " (Aguardando autorização)";
    }
    
}
