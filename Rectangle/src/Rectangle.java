import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.TextInputDialog;
import javafx.scene.control.Alert.AlertType;
import java.util.Optional;


public class Rectangle  extends Application 
{

	@Override	
	public void start(Stage primaryStage) 
	{
	
	TextInputDialog dialog = new TextInputDialog();	
	dialog.setHeaderText("Input width and hieght of the rectangle seperated by space");

	Optional<String> input = dialog.showAndWait();	
	String [] side = input.get().split (" ");
	
	
	double width = Double.parseDouble(side[0]);	
	double hieght = Double.parseDouble(side[1]); 
	
	double perimeter = 2*width + 2*hieght;	
	double area = width*hieght;
	
	javafx.scene.control.Alert alert = new javafx.scene.control.Alert(AlertType.INFORMATION);
	alert.setContentText(" the perimeter of the rectangle is " + perimeter + "\nThe area of the rectangle is " + area);		
	alert.showAndWait();
	}



}