package dad.javafx.complex;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Calculator extends Application {

	private ComboBox<String> cb;
	private TextField tfReal;
	private TextField tfImaginary;
	private TextField tfReal2;
	private TextField tfImaginary2;
	private TextField tfRealResult;
	private TextField tfImaginaryResult;
	private Label a;
	private Label a2;
	private Label aResult;
	private Label i;
	private Label i2;
	private Label iResult;
	private Separator sp;
	private Button btn;
	
	@Override
	public void start(Stage stage) throws Exception {
		
		cb = new ComboBox<String>();
		cb.getItems().addAll("+", "-", "*", "/");
		cb.getSelectionModel().selectFirst();
		
		tfReal = new TextField("0");
		tfReal.setPrefColumnCount(5);
		tfReal.setMaxWidth(50);
		tfReal.setAlignment(Pos.CENTER);
		
		tfImaginary = new TextField("0");
		tfImaginary.setPrefColumnCount(5);
		tfImaginary.setMaxWidth(50);
		tfImaginary.setAlignment(Pos.CENTER);
		
		tfReal2 = new TextField("0");
		tfReal2.setPrefColumnCount(5);
		tfReal2.setMaxWidth(50);
		tfReal2.setAlignment(Pos.CENTER);
		
		tfImaginary2 = new TextField("0");
		tfImaginary2.setPrefColumnCount(5);
		tfImaginary2.setMaxWidth(50);
		tfImaginary2.setAlignment(Pos.CENTER);
		
		tfRealResult = new TextField("0");
		tfRealResult.setPrefColumnCount(5);
		tfRealResult.setMaxWidth(50);
		tfRealResult.setDisable(true);
		tfRealResult.setAlignment(Pos.CENTER);
		
		tfImaginaryResult = new TextField("0");
		tfImaginaryResult.setPrefColumnCount(5);
		tfImaginaryResult.setMaxWidth(50);
		tfImaginaryResult.setDisable(true);
		tfImaginaryResult.setAlignment(Pos.CENTER);
		
		a = new Label("+");
		a2 = new Label("+");
		aResult = new Label("+");
		i = new Label("i");
		i2 = new Label("i");
		iResult = new Label("i");
		sp = new Separator();
		btn = new Button("=");
		
		HBox hbUp = new HBox();
		hbUp.setSpacing(5);
		hbUp.setAlignment(Pos.CENTER);
		hbUp.getChildren().addAll(tfReal, a, tfImaginary, i);
		
		HBox hbCenter = new HBox();
		hbCenter.setSpacing(5);
		hbCenter.setAlignment(Pos.CENTER);
		hbCenter.getChildren().addAll(tfReal2, a2, tfImaginary2, i2);
		
		HBox hbDown = new HBox();
		hbDown.setSpacing(5);
		hbDown.setAlignment(Pos.CENTER);
		hbDown.getChildren().addAll(tfRealResult, aResult, tfImaginaryResult, iResult);
		
		VBox vbLeft = new VBox();
		vbLeft.setSpacing(5);
		vbLeft.setAlignment(Pos.CENTER);
		vbLeft.getChildren().addAll(cb);
		
		VBox vbCenter = new VBox();
		vbCenter.setSpacing(5);
		vbCenter.setAlignment(Pos.CENTER);
		vbCenter.getChildren().addAll(hbUp, hbCenter, sp, hbDown);
		
		VBox vbRight = new VBox();
		vbRight.setSpacing(5);
		vbRight.setAlignment(Pos.CENTER);
		vbRight.getChildren().addAll(btn);
		
		HBox root = new HBox();
		root.setSpacing(5);
		root.setAlignment(Pos.CENTER);
		root.getChildren().addAll(vbLeft, vbCenter, vbRight);
		
		Scene scene = new Scene(root, 320, 200);		
		stage.setScene(scene);
		stage.setTitle("Complex Calculator");
		stage.show();
		
	}

	public static void main(String[] args) {
		launch(args);
	}
	
}
