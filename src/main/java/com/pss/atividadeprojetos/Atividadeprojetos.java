package com.pss.atividadeprojetos;

import com.pss.atividadeprojetos.model.Usuario;
import com.pss.atividadeprojetos.model.UsuarioRepository;
import com.pss.atividadeprojetos.presenter.CadastrarUsuarioPresenter;


public class Atividadeprojetos {

    public static void main(String[] args) {
        UsuarioRepository repository = new UsuarioRepository();
        CadastrarUsuarioPresenter novo = new CadastrarUsuarioPresenter(repository);
        
        Usuario pedro = repository.get("Pedro Silva");
        
        System.out.println(pedro);
    }
}
