import java.util.Scanner;

import javafx.application.Application; 
import javafx.scene.control.Alert; 
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class EchoFx extends Application {

	
 @SuppressWarnings("resource")
public void start(Stage primaryStage) throws Exception {
	 Byte byteValue;
	
	 Short shortValue;
	 Long longValue;
	 Float floatValue;
	 Double doubleValue; 
	 String charValue;
	 boolean booleanValue;
	 Scanner keyboard = new Scanner(System.in);
	 System.out.println("Enter a byte value ( number between -128 and 127 )");
	 byteValue = keyboard.nextByte();
	
	 shortValue = keyboard.nextShort();
	 longValue = keyboard.nextLong();
	 floatValue = keyboard.nextFloat();
	 booleanValue = keyboard.hasNext();
	 Alert alert = new Alert(AlertType.INFORMATION);
	 alert.setTitle("Echo App");
	 alert.setContentText("you have just entered" + byteValue);
	 alert.showAndWait();
	 
	 
	 

 }
 
 public static void main(String []args) {
		Application.launch(args);
}

}
