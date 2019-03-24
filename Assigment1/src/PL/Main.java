package PL;

import javax.sound.midi.VoiceStatus;

import com.sun.scenario.effect.impl.prism.PrImage;

import BL.UserOperations;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

	private Button loginButton;
	private Label usernameLabel;
	private Label passwordLabel;
	private TextField usernameTextField;
	private PasswordField passwordTextField;

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		usernameLabel = new Label("Username");
		passwordLabel = new Label("Password");
		usernameTextField = new TextField();
		passwordTextField = new PasswordField();
		loginButton = new Button("Login");

		// Creating a Grid Pane
		GridPane gridPane = new GridPane();

		// Setting size for the pane
		gridPane.setMinSize(400, 200);

		// Setting the padding
		gridPane.setPadding(new Insets(10, 10, 10, 10));

		// Setting the vertical and horizontal gaps between the columns
		gridPane.setVgap(5);
		gridPane.setHgap(5);

		// Setting the Grid alignment
		gridPane.setAlignment(Pos.CENTER);

		// Arranging all the nodes in the grid
		gridPane.add(usernameLabel, 0, 0);
		gridPane.add(usernameTextField, 1, 0);
		gridPane.add(passwordLabel, 0, 1);
		gridPane.add(passwordTextField, 1, 1);
		gridPane.add(loginButton, 1, 2);

		loginButton.setOnAction(e -> loginClick(primaryStage, usernameTextField, passwordTextField));
		
		// Creating a scene object
		Scene scene = new Scene(gridPane);

		// Setting title to the Stage
		primaryStage.setTitle("Login");

		// Adding scene to the stage
		primaryStage.setScene(scene);

		// Displaying the contents of the stage
		primaryStage.show();
	}

	private void loginClick(Stage stage, TextField user, PasswordField pass) {
		UserOperations userOperations = new UserOperations();
		String username = user.getText();
		String password = pass.getText();
		if(userOperations.login(username, password).getRole().equals("regular")) {
			new StudentUI();
		} else if(userOperations.login(username, password).getRole().equals("admin")) {
			new AdministratorUI();
		}
	}


}
