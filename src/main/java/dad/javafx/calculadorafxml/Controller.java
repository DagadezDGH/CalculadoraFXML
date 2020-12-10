package dad.javafx.calculadorafxml;

//Hay un problema con Git con authentication is required but no credentialsprovider has been registered

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class Controller implements Initializable {

	Calculadora calculadora = new Calculadora();

	public Controller() throws IOException {

		FXMLLoader loader = new FXMLLoader(getClass().getResource("/viewFXML.fxml"));
		loader.setController(this);
		loader.load();
	}

	public void initialize(URL location, ResourceBundle resources) {

	}
	
	public GridPane getView() {
		return view;
	}
	@FXML
	private GridPane view;

	@FXML
	private TextField ventanaField;

	@FXML
	private Button key7Button;
	
	@FXML
	private Button key8Button;
	
	@FXML
	private Button key9Button;
	
	@FXML
	private Button ceButton;
	
	@FXML
	private Button cButton;
	
	@FXML
	private Button key4Button;
	
	@FXML
	private Button key5Button;
	
	@FXML
	private Button key6Button;
	
	@FXML
	private Button multiplicaButton;
	
	@FXML
	private Button divideButton;
	
	@FXML
	private Button key1Button;
	
	@FXML
	private Button key2Button;
	
	@FXML
	private Button key3Button;
	
	@FXML
	private Button restaButton;
	
	@FXML
	private Button key0Button;
	
	@FXML
	private Button comaButton;
	
	@FXML
	private Button sumaButton;
	
	@FXML
	private Button resultadoButton;

	@FXML
	void on0Action(ActionEvent event) {
    	calculadora.insertar('0');
    	ventanaField.setText(calculadora.getPantalla());

    }
	@FXML
	void on1Action(ActionEvent event) {
    	calculadora.insertar('1');
    	ventanaField.setText(calculadora.getPantalla());

    }
	@FXML
	void on2Action(ActionEvent event) {
    	calculadora.insertar('2');
    	ventanaField.setText(calculadora.getPantalla());

    }
	@FXML
	void on3Action(ActionEvent event) {
    	calculadora.insertar('3');
    	ventanaField.setText(calculadora.getPantalla());

    }
	@FXML
	void on4Action(ActionEvent event) {
    	calculadora.insertar('4');
    	ventanaField.setText(calculadora.getPantalla());

    }

	@FXML
	void on5Action(ActionEvent event) {
    	calculadora.insertar('5');
    	ventanaField.setText(calculadora.getPantalla());

    }
	@FXML
	void on6Action(ActionEvent event) {
    	calculadora.insertar('6');
    	ventanaField.setText(calculadora.getPantalla());

    }
	@FXML
	void on7Action(ActionEvent event) {
    	calculadora.insertar('7');
    	ventanaField.setText(calculadora.getPantalla());

    }
	@FXML
	void on8Action(ActionEvent event) {
    	calculadora.insertar('8');
    	ventanaField.setText(calculadora.getPantalla());

    }
	@FXML
	void on9Action(ActionEvent event) {
    	calculadora.insertar('9');
    	ventanaField.setText(calculadora.getPantalla());

    }
	
	
	@FXML
	void onCeAction(ActionEvent event) {
    	calculadora.borrarTodo();
    	ventanaField.setText(calculadora.getPantalla());

    }

	@FXML
	void onCAction(ActionEvent event) {
    	calculadora.borrar();
    	ventanaField.setText(calculadora.getPantalla());

    }
	
	@FXML
	void onComaAction(ActionEvent event) {
    	calculadora.insertarComa();
    	ventanaField.setText(calculadora.getPantalla());

    }
	
	@FXML
	void onSumaAction(ActionEvent event) {
    	calculadora.operar(Calculadora.SUMAR);
    	ventanaField.setText(calculadora.getPantalla());

    }
	
	@FXML
	void onRestaAction(ActionEvent event) {
    	calculadora.operar(Calculadora.RESTAR);
    	ventanaField.setText(calculadora.getPantalla());

    }
	@FXML
	void onMultiplicaAction(ActionEvent event) {
    	calculadora.operar(Calculadora.MULTIPLICAR);
    	ventanaField.setText(calculadora.getPantalla());

    }
	@FXML
	void onDivideAction(ActionEvent event) {
    	calculadora.operar(Calculadora.DIVIDIR);
    	ventanaField.setText(calculadora.getPantalla());

    }
	@FXML
	void onResultadoAction(ActionEvent event) {
    	calculadora.operar(Calculadora.IGUAL);
    	ventanaField.setText(calculadora.getPantalla());

    }
	
}
