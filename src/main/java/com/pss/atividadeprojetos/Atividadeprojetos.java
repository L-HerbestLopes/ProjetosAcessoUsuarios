package com.pss.atividadeprojetos;

import com.pss.atividadeprojetos.model.Usuario;
import com.pss.atividadeprojetos.model.UsuarioRepository;
import com.pss.atividadeprojetos.presenter.CadastroInicialPresenter;
import com.pss.atividadeprojetos.presenter.SistemaPresenter;
import com.pss.atividadeprojetos.presenter.acesso.PrimeiroAdministradorAcessoStrategy;
import com.pss.atividadeprojetos.view.SistemaView;


public class Atividadeprojetos {

    public static void main(String[] args) {
        UsuarioRepository repository = new UsuarioRepository();
        
        SistemaPresenter sistema = new SistemaPresenter();
    }
}
