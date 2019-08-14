/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author IFNMG
 */
public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private Label num;
    @FXML
    private TextField campoNumero;
    @FXML
    private Label dobro;
    @FXML
    private Label triplo;
    @FXML
    private Label quadrado;
    @FXML
    private Label cubo;
    @FXML
    private Button calcularButton;
    @FXML
    private Button limparButton1;
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void calcular(ActionEvent event) {
        String t = campoNumero.getText();
        //transformar string em inteiro
        //int b = Integer.parseInt(t);
        double b = Double.parseDouble(t);
        //jogando texto no lael
        double c = b*2;
        String dobroR = ("Dobro: "+c);
        
        double d = b*3;
        String triploR = ("Triplo: "+d);
        
        double e = b*b;
        String quadradoR = ("Quadrado: "+e);
        
        double f = b*b*b;
        String cuboR = ("Cubo: "+f);
        
        dobro.setText(dobroR);
        triplo.setText(triploR);
        quadrado.setText(quadradoR);
        cubo.setText(cuboR);
    }

    @FXML
    private void limpar(ActionEvent event) {
        dobro.setText("Dobro:");
        triplo.setText("Triplo:");
        quadrado.setText("Quadrado:");
        cubo.setText("Cubo:");
    }
    
}
