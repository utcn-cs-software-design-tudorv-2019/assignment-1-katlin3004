package PL;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AdministratorUI {

	public AdministratorUI() {
		Stage secondStage = new Stage();
		secondStage.setTitle("Administrator");
		BorderPane pane = new BorderPane();
		Scene scene = new Scene(pane, 300, 275);
		secondStage.setScene(scene);
		secondStage.show();
	}
}
