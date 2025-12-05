package com.pss.atividadeprojetos.presenter.acesso;


/**
 * Padrão Strategy que representa o acesso do usuário ao sistema.
 * O uso do padrão Strategy foi escolhido uma vez que o acesso do usuário pode mudar durante runtime (usuário se torna adminstrador, por exemplo).
 */
public interface UsuarioAcessoStrategy {
    public String usuarioToString(String nome);
}
