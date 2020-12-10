package dad.javafx.calculadorafxml;

//Hay un problema con Git con authentication is required but no credentialsprovider has been registered

import java.io.IOException;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

	@Override
	public void start(Stage primaryStage) throws IOException {
		Controller controller = new Controller();
		Scene scene = new Scene(controller.getView(), 500, 320);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}