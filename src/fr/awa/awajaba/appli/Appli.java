/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.awa.awajaba.appli;

import fr.awa.awajaba.entites.EvaluationRepas;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author root
 */
public class Appli extends Application {
    

    
    @Override
    public void start(Stage primaryStage) {
        
        TextArea com = new TextArea();
        Label upperText = new Label();
        

        
    ToggleGroup group = new ToggleGroup();
    
    RadioButton radio0 = new RadioButton("0");
    radio0.setUserData(0);
    
    RadioButton radio1 = new RadioButton("1");
    radio1.setUserData(1);
    
    RadioButton radio2 = new RadioButton("2");
    radio2.setUserData(2);
    
    RadioButton radio3 = new RadioButton("3");
    radio3.setUserData(3);
    
    RadioButton radio4 = new RadioButton("4");
    radio4.setUserData(4);
    
    RadioButton radio5 = new RadioButton("5");
    radio5.setUserData(5);
    
    radio2.setSelected(true);
    
    radio0.setToggleGroup(group);
    radio1.setToggleGroup(group);
    radio2.setToggleGroup(group);
    radio3.setToggleGroup(group);
    radio4.setToggleGroup(group);
    radio5.setToggleGroup(group);
    
    
    
    
    
    
        
        VBox sceneT = new VBox();
        HBox rdBtn = new HBox();
        //StackPane root = new StackPane();
        
        
        
        rdBtn.getChildren().add(radio0);
        
        
        rdBtn.getChildren().add(radio1);
        
        
        rdBtn.getChildren().add(radio2);
        
        rdBtn.getChildren().add(radio3);
        
        rdBtn.getChildren().add(radio4);
        
        rdBtn.getChildren().add(radio5);
        
        sceneT.getChildren().add(com);
        
        sceneT.getChildren().add(rdBtn);
        
        
        
        
        Button btn = new Button();
        btn.setText("Enregistrer");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                EvaluationRepas eval = new EvaluationRepas();
                eval.setCommentaire(com.getText());
                eval.setNote(Integer.parseInt(group.getSelectedToggle().getUserData().toString()));
                System.out.println(eval.toString());
            }
        });
        
        Button btnEff = new Button();
        btnEff.setText("Effacer");
        btnEff.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                com.setText("");
                radio0.setSelected(false);
                radio1.setSelected(false);
                radio2.setSelected(false);
                radio3.setSelected(false);
                radio4.setSelected(false);
                radio5.setSelected(false);
            }
        });
        
        
        
        sceneT.getChildren().add(btnEff);
        sceneT.getChildren().add(btn);
        
        Scene scene = new Scene(sceneT, 400, 300);
        
        primaryStage.setTitle("Evaluation d'un repas");
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
