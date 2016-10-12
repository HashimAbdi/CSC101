package javaFX;


	import javafx.application.*;
	import javafx.scene.Scene;
	//import javafx.scene.control.Button;
	import javafx.scene.control.Label;
	import javafx.stage.Stage;
	public class javaFX extends Application  {

		
		@Override
		public void start(Stage primaryStage) throws Exception {
			//Button button = new Button();
			Label lable = new Label("Hello");
			Scene scene = new Scene(lable);
			primaryStage.setScene(scene);
			primaryStage.show();
		}
		public static void main(String []args) {
			Application.launch(args);
		
		
		
		}
		
		
		
		}
		
