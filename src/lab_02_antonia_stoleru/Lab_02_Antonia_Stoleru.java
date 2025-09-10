/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

// Link for git repository: https://github.com/antostol/Lab_02_Antonia_Stoleru.git
package lab_02_antonia_stoleru;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;

/**
 *
 * @author 2484936
 */
public class Lab_02_Antonia_Stoleru extends Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
       BorderPane root = new BorderPane();
       Scene sc = new Scene(root, 250, 300);
       stage.setTitle("Java Games");
       stage.show();
       StackPane middle = new StackPane();
       Label lb1 = new Label("Random game");
       Label lb2 = new Label("Waiting...");
       Label lblImage = new Label("");
       
    }
    
}
