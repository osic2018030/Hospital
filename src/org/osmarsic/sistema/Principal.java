package org.osmarsic.sistema;

import java.io.InputStream;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import org.osmarsic.controller.AreasController;
import org.osmarsic.controller.CargosController;
import org.osmarsic.controller.ContactoUrgenciaController;
import org.osmarsic.controller.DatospController;
import org.osmarsic.controller.EspecialidadesController;
import org.osmarsic.controller.MedicoController;
import org.osmarsic.controller.MenuPrincipalController;
import org.osmarsic.controller.PacientesController;
import org.osmarsic.controller.TelefonosMedicosController;

public class Principal extends Application {
    private final String PAQUETE_VISTA = "/org/osmarsic/view/";
    private Stage escenarioPrincipal;
    private Scene escena;
    @Override
    public void start(Stage escenarioPrincipal) {
        this.escenarioPrincipal = escenarioPrincipal;
        escenarioPrincipal.setTitle("Hospital de Infectologia");
        menuPrincipal();
        escenarioPrincipal.show();
    }
    
    public void menuPrincipal(){
        try{
            MenuPrincipalController menuPrincipal = (MenuPrincipalController)cambiarEscena("MenuPrincipalView.fxml",602,398);
            menuPrincipal.setEscenarioPrincipal(this);
        }catch(Exception e){
            e.printStackTrace();
                    }
    }
      
    public void ventanaMedicos(){
    try{
        MedicoController medicoController = (MedicoController)cambiarEscena("Medicosview.fxml", 749, 507);
        medicoController.setEscenarioPrincipal(this);
    }catch(Exception e){
        e.printStackTrace();
                    }
    }
    
    public void ventanaTelefonosM(){
    try{
        TelefonosMedicosController telefonomController = (TelefonosMedicosController)cambiarEscena("TelefonoMedicosview.fxml", 862, 507);
        telefonomController.setEscenarioPrincipal(this);
    }catch(Exception e){
        e.printStackTrace();
                    }
    }

    public void ventanaPacientes(){
    try{
        PacientesController pacienteController = (PacientesController)cambiarEscena("Pacientesview.fxml", 979, 557);
        pacienteController.setEscenarioPrincipal(this);
    }catch(Exception e){
        e.printStackTrace();
                    }
    }
        
    public void ventanaContactoU(){
    try{
        ContactoUrgenciaController contactoUrgenciaController = (ContactoUrgenciaController)cambiarEscena("ContactoUrgenciaview.fxml", 759, 491);
        contactoUrgenciaController.setEscenarioPrincipal(this);
    }catch(Exception e){
        e.printStackTrace();
                    }
    } 
    
    public void ventanaEspecialidades(){
    try{
        EspecialidadesController especialidadesController = (EspecialidadesController)cambiarEscena("Especialidadeview.fxml", 600, 400);
        especialidadesController.setEscenarioPrincipal(this);
    }catch(Exception e){
        e.printStackTrace();
                    }
    }  
    
    public void ventanaAreas(){
    try{
       AreasController areasController = (AreasController)cambiarEscena("Areasview.fxml", 600, 400);
        areasController.setEscenarioPrincipal(this);
    }catch(Exception e){
        e.printStackTrace();
                    }
    }  
    
    public void ventanaCargos(){
    try{
       CargosController cargosController = (CargosController)cambiarEscena("Cargosview.fxml", 600, 400);
        cargosController.setEscenarioPrincipal(this);
    }catch(Exception e){
        e.printStackTrace();
                    }
    }  
    
    public void ventanaDatosp(){
    try{
       DatospController datospController = (DatospController)cambiarEscena("Datospview.fxml", 319, 309);
       datospController.setEscenarioPrincipal(this);
    }catch(Exception e){
        e.printStackTrace();
                    }
    } 
    public Initializable cambiarEscena(String fxml, int ancho, int alto) throws Exception{
        Initializable resultado = null;
        FXMLLoader cargadorFXML = new FXMLLoader();
        InputStream archivo = Principal.class.getResourceAsStream(PAQUETE_VISTA+fxml);
        cargadorFXML.setBuilderFactory(new JavaFXBuilderFactory());
        cargadorFXML.setLocation(Principal.class.getResource(PAQUETE_VISTA+fxml));
        escena = new Scene((AnchorPane)cargadorFXML.load(archivo),ancho,alto);
        escenarioPrincipal.setScene(escena);
        escenarioPrincipal.sizeToScene();
        resultado = (Initializable)cargadorFXML.getController();
        return resultado;
    }
    
 
    public static void main(String[] args) {
        launch(args);
    }
    
}
