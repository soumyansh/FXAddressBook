package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

public class Main extends Application {
	private Stage primaryStage;

	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;

		mainWindow();
		// mwc.tableView.setItems(getPersonData());

	}

	public void mainWindow() {

		try {
			FXMLLoader loader = new FXMLLoader(Main.class.getResource("MainWindowView.fxml"));
			AnchorPane pane = loader.load();
			MainWindowController mainWindowController = loader.getController();
			mainWindowController.setMain(this);

			Scene scene = new Scene(pane);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void newPersonWindow() {

		try {
			FXMLLoader loader = new FXMLLoader(Main.class.getResource("NewPersonView.fxml"));
			AnchorPane pane = loader.load();
			
			Stage stage=new Stage();
			
			NewPersonController newPersonController = loader.getController();
			newPersonController.setMain(this,stage);

			Scene scene = new Scene(pane);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	
	

	// For Initial Data
	private ObservableList<Person> personData = FXCollections.observableArrayList();

	// getter of Observable List
	public ObservableList<Person> getPersonData() {
		return personData;
	}

	public void setPersonData(ObservableList<Person> personData) {
		this.personData = personData;
	}

	// Constructor of Main //Constructor of Person is getting called because of new
	public Main() {
		personData.add(new Person("Dr.", "Frank", "1234", "NewYork"));
		personData.add(new Person("Annie.", "Hathway", "12345", "Berlin"));
		personData.add(new Person("Soumyansh.", "Gupta", "9871", "London"));
		personData.add(new Person("Priyam", "Gupta", "5655", "Kentucky"));
	}

	public static void main(String[] args) {
		launch(args);
	}
}
