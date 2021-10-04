/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplopatroncomposite;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author HEIZEL
 */
public class EjemploPatronComposite extends Application {
    
    
    @Override
    public void start(Stage primaryStage) {
       
        Composite alemania = new Composite("Alemania");
        Leaf hamb = new Leaf("Hamburgo");
        Leaf berlin = new Leaf("Berlín");
        Leaf baviera = new Leaf("Baviera");
        alemania.añadirComponente(hamb);
        alemania.añadirComponente(berlin);
        alemania.añadirComponente(baviera);
        Composite francia = new Composite("Francia");
        francia.añadirComponente(new Leaf("Paris"));
        Composite europa = new Composite("Europa");
        europa.añadirComponente(alemania);
        europa.añadirComponente(francia);
        System.out.println(europa.metodoDefecto());
        alemania.eliminarComponente(hamb);
        
        System.out.println(europa.metodoDefecto());
        Label label = new Label();
        label.setText(europa.metodoDefecto());
        
   
        StackPane root = new StackPane();
        root.getChildren().add(label);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Patrón Composite");
        primaryStage.setScene(scene);
        primaryStage.show();
        
       
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
