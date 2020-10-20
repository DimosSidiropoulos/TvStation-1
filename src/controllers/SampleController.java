package controllers;



import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;



public class SampleController {
	@FXML
	private Label statusLbl;
	
	@FXML
	private TextField usernameTxt;
	
	@FXML
	private TextField passwordTxt;
	@FXML
	private Button loginBtn;
	@FXML
	private Button registerBtn;
	
	
	@FXML void LoginOnclick(ActionEvent event) {
		String username=usernameTxt.getText();
		String password=passwordTxt.getText();
		
		if(username.isEmpty() || password.isEmpty()); {
			statusLbl.setText("Εισάγετε τα στοιχεία σας");
			return;
			}
		
	
		}
	
	@FXML void RegisterOnclick(ActionEvent event) {
	//todo
	}
}
