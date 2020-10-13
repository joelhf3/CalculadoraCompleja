package dad.javafx.complex;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Calculator extends Application {

	private ComboBox cb;
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
		
		cb = new ComboBox<>();
		tfReal = new TextField("0");
		tfImaginary = new TextField("0");
		tfReal2 = new TextField("0");
		tfImaginary2 = new TextField("0");
		tfRealResult = new TextField("0");
		tfImaginaryResult = new TextField("0");
		a = new Label("+");
		a2 = new Label("+");
		aResult = new Label("+");
		i = new Label("i");
		i2 = new Label("i");
		iResult = new Label("i");
		sp = new Separator();
		btn = new Button("=");
		
		VBox vbLeft = new VBox();
		vbLeft.setSpacing(5);
		vbLeft.setAlignment(Pos.CENTER);
		vbLeft.getChildren().addAll(cb);
		
		VBox vbCenter = new VBox();
		vbCenter.setSpacing(5);
		vbCenter.setAlignment(Pos.CENTER);
		vbCenter.getChildren().addAll(cb);
		
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
