package dad.calculadorafxml;

import java.io.IOException;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class App extends Application {

	@Override
	public void start(Stage primaryStage) throws IOException {
		
		primaryStage.setTitle("CalculadoraFXML");
		primaryStage.getIcons().add(new Image("/images/calculator-32x32.png"));
		Controller controller = new Controller();
		Scene scene = new Scene(controller.getView(), 500, 320);
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}

}
