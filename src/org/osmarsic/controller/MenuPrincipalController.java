package org.osmarsic.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import org.osmarsic.sistema.Principal;


public class MenuPrincipalController implements Initializable {
    private Principal escenarioPrincipal;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
    }

    public Principal getEscenarioPrincipal() {
        return escenarioPrincipal;
    }

    public void setEscenarioPrincipal(Principal escenarioPrincipal) {
        this.escenarioPrincipal = escenarioPrincipal;
    }
    public void ventanaMedicos(){
        escenarioPrincipal.ventanaMedicos();
    }
    public void ventanaTelefonosM(){
        escenarioPrincipal.ventanaTelefonosM();
    }
    public void ventanaPacientes(){
        escenarioPrincipal.ventanaPacientes();
    }
    
    public void ventanaContactoU(){
        escenarioPrincipal.ventanaContactoU();
    }
    
    public void ventanaEspecialidades(){
        escenarioPrincipal.ventanaEspecialidades();
    }
    public void ventanaAreas(){
        escenarioPrincipal.ventanaAreas();
    }
    public void ventanaCargos(){
        escenarioPrincipal.ventanaCargos();
    }
    
    public void ventanaDatosp(){
        escenarioPrincipal.ventanaDatosp();
    }
    
    
    
    
 }
