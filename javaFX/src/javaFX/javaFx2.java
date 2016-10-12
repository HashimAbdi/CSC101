/* @author Hashim Abdi 
 * Contact: ha24533@nvcc.edu
 * the purpose of this program is to demonstrate how to use the formula 
 * for example, going from Inches to Feet. You must divide by 12 
 * 
 */


package javaFX;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.text.DecimalFormat;
import java.util.Optional;

import javax.swing.JOptionPane;

import javafx.application.*;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;

	public class javaFx2 extends Application  
	{

		@Override
		public void start(Stage primaryStage)
		{
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			DecimalFormat decimalformat = new DecimalFormat("#.00"); //  this will only allow two decimal places for my output 
			
			Dimension screenDimension = toolkit.getScreenSize();
			
			Double screenWidth = screenDimension.getWidth();
			Double screenHeight = screenDimension.getHeight();
			

			/*this is where i want to do the converting from centimeters to inches to feet
			 * Here is the formula 
			 *  cm  x  0.39* = in this is converting from Centimeters to Inches 
			 * in/12= ft  = this is converting from Inches to Feet 
			 *  in  x  2.54 = cm  = this is going from Inches to Centimeters 
			 */
			String r =  readInputUsingJavaFX(); //readInputUsingJOption();
			Double height = Double.parseDouble(r); // now i have height in double 
			Double heightInches = height*0.39; // i have to convert to inches before feet. Also this has to be double because of the 0.39
			Double heightFeet = height/12;
			
			
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.getDialogPane().setPrefSize(250,150);
			
			
			// this is converting from Centimeters to Inches 
			alert.setTitle("Height");
			alert.setContentText("Your Height is" + decimalformat.format(heightInches) + "inches"); 
			
			
			// next set is converting inches to feet 
			alert.setContentText("Your Height is" + decimalformat.format(heightFeet) + "Feet"); 
			
			
			
			
			System.out.println(alert.getWidth());
			System.out.println(alert.getHeight());
			alert.setX(screenWidth - alert.getWidth()); // this will move the dialog horizontally 
			alert.setY(screenHeight - alert.getHeight()); // this will move the dialog vertically 
			alert.showAndWait();
			
	
			
			primaryStage.show();
		}



		public static void main(String[] args) 
		{
			Application.launch(args);
		}
		
		public static String readInputUsingJOption()
		{
			// reads input using JOption
			String prompt = JOptionPane.showInputDialog(null, "Inches");
			return prompt;
		}
		
		public static String readInputUsingJavaFX()
		{
			// reads input using JavaFX
			TextInputDialog inputDialog = new TextInputDialog();
			inputDialog.setTitle("Enter Your Height"); 
			inputDialog.setHeaderText("Height centermiter to feet/inches converter");
			inputDialog.setContentText(" Enter Your Height in centimeters"); 
			inputDialog.setX(0); // i did this because i want it to show on top right 
			inputDialog.setY(0);
			Optional<String> result = inputDialog.showAndWait();
			
			return result.get();
		}
	}
	