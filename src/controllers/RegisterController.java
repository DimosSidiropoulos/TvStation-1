package controllers;



import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;



public class RegisterController {
	@FXML
	private Label statusLbl;
	
	@FXML
	private TextField usernameTxt;
	
	@FXML
	private TextField passwordTxt;
	@FXML
	private Button loginBtn;
	
	@FXML void saassasa(ActionEvent event) {
		if(usernameTxt.getText().equals("user")&& passwordTxt.getText().equals("123")) {
			statusLbl.setText("Login OK");}
		else {
			statusLbl.setText("FFailed");
		}
	}
}
