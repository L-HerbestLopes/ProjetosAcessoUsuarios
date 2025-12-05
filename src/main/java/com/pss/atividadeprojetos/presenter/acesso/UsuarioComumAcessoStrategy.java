package com.pss.atividadeprojetos.presenter.acesso;


public class UsuarioComumAcessoStrategy implements UsuarioAcessoStrategy {

    @Override
    public String usuarioToString(String nome) {
        return nome + " (Usuário)";
    }

    @Override
    public String toString() {
        return "usuario_padrao";
    }
    
    
    
}
