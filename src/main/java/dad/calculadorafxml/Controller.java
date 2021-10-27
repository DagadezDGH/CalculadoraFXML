package dad.calculadorafxml;

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

public class Controller implements Initializable{

		Calculadora calculadora = new Calculadora();
	
    	@FXML
    	private GridPane root;
    	
		@FXML
	    private Button key7Button;

	    @FXML
	    private Button key8Button;

	    @FXML
	    private Button key9Button;

	    @FXML
	    private Button ceButton;

	    @FXML
	    private Button key4Button;

	    @FXML
	    private Button key5Button;

	    @FXML
	    private Button key6Button;

	    @FXML
	    private Button multiButton;

	    @FXML
	    private Button key1Button;

	    @FXML
	    private Button key2Button;

	    @FXML
	    private Button key3Button;

	    @FXML
	    private Button restButton;

	    @FXML
	    private Button comaButton;

	    @FXML
	    private Button sumButton;

	    @FXML
	    private Button key0Button;

	    @FXML
	    private Button cButton;

	    @FXML
	    private Button divideButton;

	    @FXML
	    private Button igualButton;

	    @FXML
	    private TextField resultadoText;
	    
    public Controller() throws IOException {
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/View.fxml"));
		loader.setController(this);
		loader.load();
		}
    
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
	
	public GridPane getView() {
		return root;
	}
	
    @FXML
    void on0Action(ActionEvent event) {
    	calculadora.insertar('0');
    	resultadoText.setText(calculadora.getPantalla());
    }

    @FXML
    void on1Action(ActionEvent event) {
       	calculadora.insertar('1');
    	resultadoText.setText(calculadora.getPantalla());
    }

    @FXML
    void on2Action(ActionEvent event) {
       	calculadora.insertar('2');
    	resultadoText.setText(calculadora.getPantalla());
    }

    @FXML
    void on3Action(ActionEvent event) {
       	calculadora.insertar('3');
    	resultadoText.setText(calculadora.getPantalla());
    }

    @FXML
    void on4Action(ActionEvent event) {
       	calculadora.insertar('4');
    	resultadoText.setText(calculadora.getPantalla());
    }

    @FXML
    void on5Action(ActionEvent event) {
       	calculadora.insertar('5');
    	resultadoText.setText(calculadora.getPantalla());
    }

    @FXML
    void on6Action(ActionEvent event) {
       	calculadora.insertar('6');
    	resultadoText.setText(calculadora.getPantalla());
    }

    @FXML
    void on7Action(ActionEvent event) {
       	calculadora.insertar('7');
    	resultadoText.setText(calculadora.getPantalla());
    }

    @FXML
    void on8Action(ActionEvent event) {
       	calculadora.insertar('8');
    	resultadoText.setText(calculadora.getPantalla());
    }

    @FXML
    void on9Action(ActionEvent event) {
       	calculadora.insertar('9');
    	resultadoText.setText(calculadora.getPantalla());
    }

    @FXML
    void onCAction(ActionEvent event) {
    	calculadora.borrar();
    	resultadoText.setText(calculadora.getPantalla());
    }

    @FXML
    void onCEAction(ActionEvent event) {
    	calculadora.borrarTodo();
    	resultadoText.setText(calculadora.getPantalla());
    }

    @FXML
    void onComaAction(ActionEvent event) {
    	calculadora.insertarComa();
    	resultadoText.setText(calculadora.getPantalla());
    }
    @FXML
    void onDivideAction(ActionEvent event) {
    	calculadora.operar(Calculadora.DIVIDIR);
    	resultadoText.setText(calculadora.getPantalla());
    }

    @FXML
    void onIgualAction(ActionEvent event) {
    	calculadora.operar(Calculadora.IGUAL);
    	resultadoText.setText(calculadora.getPantalla());
    }

    @FXML
    void onMultiAction(ActionEvent event) {
    	calculadora.operar(Calculadora.MULTIPLICAR);
    	resultadoText.setText(calculadora.getPantalla());
    }

    @FXML
    void onRestAction(ActionEvent event) {
    	calculadora.operar(Calculadora.RESTAR);
    	resultadoText.setText(calculadora.getPantalla());
    }

    @FXML
    void onSumAction(ActionEvent event) {
    	calculadora.operar(Calculadora.SUMAR);
    	resultadoText.setText(calculadora.getPantalla());

    }

}
