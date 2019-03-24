package PL;

import javafx.*;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class StudentUI {

	public StudentUI() {
		Stage secondStage = new Stage();
		secondStage.setTitle("Student");
		BorderPane pane = new BorderPane();
		Scene scene = new Scene(pane, 300, 275);
		secondStage.setScene(scene);
		secondStage.show();
	}
}
