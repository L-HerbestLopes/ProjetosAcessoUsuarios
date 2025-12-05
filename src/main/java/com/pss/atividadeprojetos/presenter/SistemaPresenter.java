package com.pss.atividadeprojetos.presenter;

import com.pss.atividadeprojetos.view.FormularioUsuarioView;
import com.pss.atividadeprojetos.view.SistemaView;


public class SistemaPresenter {
    private SistemaView view;
    
    
    public SistemaPresenter() {
        view = new SistemaView();
        configuraView();
    }
    
    private void configuraView() {
        view.setVisible(false);
        
        view.abrirJanela(new FormularioUsuarioView());
        
        view.setVisible(true);
    }
}
