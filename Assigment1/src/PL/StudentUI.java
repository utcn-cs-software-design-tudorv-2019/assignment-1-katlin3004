package PL;

import javax.swing.JTabbedPane;

import BL.UserOperations;
import Model.User;
import javafx.*;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class StudentUI {

	private Label labelIdUser;
	private Label labelName;
	private Label labelIdCard;
	private Label labelCNP;
	private Label labelAdress;

	private TextField idUserTextField;
	private TextField nameTextField;
	private TextField idCardTextField;
	private TextField cnpTextField;
	private TextField adressTextField;

	private Button addButton;
	private Button updateButton;
	private Button viewButton;
	
	private JTabbedPane table;

	public StudentUI() {

		labelIdUser = new Label("Id User");
		labelName = new Label("Name");
		labelIdCard = new Label("Id Card");
		labelCNP = new Label("Cnp");
		labelAdress = new Label("Adress");

		idUserTextField = new TextField();
		nameTextField = new TextField();
		idCardTextField = new TextField();
		cnpTextField = new TextField();
		adressTextField = new TextField();

		addButton = new Button("Add");
		updateButton = new Button("Update");
		viewButton = new Button("View");

		Stage secondStage = new Stage();
		secondStage.setTitle("Student");

		// Creating a Grid Pane
		GridPane gridPane = new GridPane();
		// Setting size for the pane
		gridPane.setMinSize(500, 400);
		// Setting the padding
		gridPane.setPadding(new Insets(10, 10, 10, 10));
		// Setting the vertical and horizontal gaps between the columns
		gridPane.setVgap(10);
		gridPane.setHgap(10);

		gridPane.add(labelIdUser, 0, 0);
		gridPane.add(labelName, 0, 1);
		gridPane.add(labelIdCard, 0, 2);
		gridPane.add(labelCNP, 0, 3);
		gridPane.add(labelAdress, 0, 4);

		gridPane.add(idUserTextField, 1, 0);
		gridPane.add(nameTextField, 1, 1);
		gridPane.add(idCardTextField, 1, 2);
		gridPane.add(cnpTextField, 1, 3);
		gridPane.add(adressTextField, 1, 4);

		gridPane.add(addButton, 0, 6);
		gridPane.add(updateButton, 1, 6);
		gridPane.add(viewButton, 2, 6);

		Scene scene = new Scene(gridPane);
		secondStage.setScene(scene);
		secondStage.show();

		addButton.setOnAction(e -> addUserClick());
		updateButton.setOnAction(e -> updateUserClick());
		viewButton.setOnAction(e -> viewUserClick());

	}

	private void addUserClick() {
		System.out.println("Add");
		User user = new User();
		user.setName(nameTextField.getText());
		user.setIdcard(Integer.parseInt(idCardTextField.getText()));
		user.setCnp(Integer.parseInt(cnpTextField.getText()));
		user.setAdress(adressTextField.getText());
		UserOperations userOperations = new UserOperations();
		userOperations.addUser(user);
	}

	private void updateUserClick() {
		System.out.println("Update");
		User user = new User();
		user.setIduser(Integer.parseInt(idUserTextField.getText()));
		user.setName(nameTextField.getText());
		user.setIdcard(Integer.parseInt(idCardTextField.getText()));
		user.setCnp(Integer.parseInt(cnpTextField.getText()));
		user.setAdress(adressTextField.getText());
		UserOperations userOperations = new UserOperations();
		userOperations.updateUser(user);
	}

	private void viewUserClick() {
		System.out.println("View");
	}
}
