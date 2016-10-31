import java.util.Scanner;

//import javafx.*;
//javafx.scene.control.Alert;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GroupSize extends Application
{
	    @Override
    public void start(Stage myStage) {

        myStage.setTitle("Calculator");

        GridPane rootNode = new GridPane();
        rootNode.setPadding(new Insets(15));
        rootNode.setHgap(5);
        rootNode.setVgap(5);
        rootNode.setAlignment(Pos.CENTER);

        Scene myScene = new Scene(rootNode, 300, 200);

        rootNode.add(new Label("First Value:"), 0, 0);
        TextField firstValue = new TextField();
        rootNode.add(firstValue, 1, 0);
        Button aButton = new Button("Calculate");
        rootNode.add(aButton, 1, 2);
        GridPane.setHalignment(aButton, HPos.LEFT);


        aButton.setOnAction(e -> {
            Integer numPeople = Integer.valueOf(firstValue.getText());
            if (numPeople > 10) 
			{
				System.out.println("Group size: " + numPeople / 2);
			}
			else if (numPeople >= 3) 
			{
				System.out.println("Group size: " + numPeople / 3);
			}
			else 
			{
				System.out.println("The number of people has to be at least 3");
			}
        });

        myStage.setScene(myScene);

        myStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }


}
	