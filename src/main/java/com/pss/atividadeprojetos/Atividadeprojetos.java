package com.pss.atividadeprojetos;

import com.pss.atividadeprojetos.model.Usuario;
import com.pss.atividadeprojetos.model.UsuarioRepository;
import com.pss.atividadeprojetos.presenter.CadastroInicialPresenter;
import com.pss.atividadeprojetos.presenter.PrimeiroAdministradorAcessoStrategy;


public class Atividadeprojetos {

    public static void main(String[] args) {
        UsuarioRepository repository = new UsuarioRepository();
        
        Usuario usuario = new Usuario("Maria Oliveira", "maria.oliveira12@gmail.com", "99123", new PrimeiroAdministradorAcessoStrategy());
        repository.incluir(usuario);
        
        
        CadastroInicialPresenter novo = new CadastroInicialPresenter(repository);
        Usuario pedro = repository.get("Pedro Silva");
        System.out.println(pedro);
    }
}
