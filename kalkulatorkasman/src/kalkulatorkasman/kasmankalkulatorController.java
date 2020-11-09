/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulatorkasman;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author kasman
 */
public class kasmankalkulatorController implements Initializable {

    @FXML
    private TextField text_result;

    /**
     * Initializes the controller class.
     */
    String op="";
    long number1;
    long number2;
   //clickCTRL
    public void number(ActionEvent ae){
      String no = ((Button)ae.getSource()).getText();
      txt_result.setText(txt_result.getText()+no);
        
    }
    //second
    public void operation(ActionEvent ae){
     String operation = ((Button)ae.getSource()).getText();
     if (!operation.equals("=")){
         if(!op.equals("")){
             return;
             
         }
         op = operation;
        number1 = Long.parseLong(txt_result.getText());
            txt_result.setText("");
        }else {
        
            if(op.equals("")){
                return;
            }
            number2 = Long.parseLong(txt_result.getText());
            calculate(number1, number2, op);
            op="";
        }
    }
     // 3 Methode
    public void calculate (long n1, long n2, String op){
    
        switch (op){
        
            case "+" : txt_result.setText(n1 + n2 + "");break;
            case "-" : txt_result.setText(n1 - n2 + "");break;
            case "*" : txt_result.setText(n1 * n2 + "");break;
            case "/" : 
                if (n2 == 0){
                txt_result.setText("0");break;
                }
                txt_result.setText(n1/n2+ "");break;
        
        }
    
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
   
    
}
