package application;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class MainWindowController {
	@FXML
	TableView<Person> tableView;
	@FXML
	TableColumn<Person, String> firstNameColumn;
	@FXML
	TableColumn<Person, String> lastNameColumn;
	@FXML
	Label firstNameLabel, lastNameLabel, phoneLabel, cityLabel;
	private Main main;

	// for initializing the Table view and Filling the data
	public void initialize() {
		firstNameColumn.setCellValueFactory(new PropertyValueFactory<Person, String>("firstName"));

		lastNameColumn.setCellValueFactory(new PropertyValueFactory<Person, String>("lastName"));
		tableView.getSelectionModel().selectedItemProperty()
				.addListener((observable, oldValue, newValue) -> showDetails(newValue));

	}

	public void showDetails(Person person) {
		firstNameLabel.setText(person.getFirstName());
		lastNameLabel.setText(person.getLastName());
		phoneLabel.setText(person.getPhone());
		cityLabel.setText(person.getCity());

	}

	@FXML
	public void handleNew() {
		main.newPersonWindow();
	}

	@FXML
	public void handleEdit() {

	}

	@FXML
	public void handleDelete() {
		int index=tableView.getSelectionModel().getSelectedIndex();
		main.getPersonData().remove(index);

	}

	public void setMain(Main main) {
		this.main = main;
		tableView.setItems(main.getPersonData());
	}

}
