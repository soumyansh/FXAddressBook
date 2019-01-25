package application;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class NewPersonController {
	private Main main;
	private Stage stage;
	@FXML
	private TextField firstNameField, lastNameField, phoneField, cityField;

	public void setMain(Main main, Stage stage) {
		this.main = main;
		this.stage = stage;

	}

	@FXML
	public void handleOk() {
		Person person = new Person(firstNameField.getText(), lastNameField.getText(), phoneField.getText(),
				cityField.getText());
		main.getPersonData().add(person);
		stage.close();
	}

	@FXML
	public void handleCancel() {
		stage.close();
	}
}
