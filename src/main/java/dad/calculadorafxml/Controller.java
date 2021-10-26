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

    }

    @FXML
    void on1Action(ActionEvent event) {

    }

    @FXML
    void on2Action(ActionEvent event) {

    }

    @FXML
    void on3Action(ActionEvent event) {

    }

    @FXML
    void on4Action(ActionEvent event) {

    }

    @FXML
    void on5Action(ActionEvent event) {

    }

    @FXML
    void on6Action(ActionEvent event) {

    }

    @FXML
    void on7Action(ActionEvent event) {

    }

    @FXML
    void on8Action(ActionEvent event) {

    }

    @FXML
    void on9Action(ActionEvent event) {

    }

    @FXML
    void onDivideAction(ActionEvent event) {

    }

    @FXML
    void onIgualAction(ActionEvent event) {

    }

    @FXML
    void onMultiAction(ActionEvent event) {

    }

    @FXML
    void onRestAction(ActionEvent event) {

    }

    @FXML
    void onSumAction(ActionEvent event) {

    }

}
