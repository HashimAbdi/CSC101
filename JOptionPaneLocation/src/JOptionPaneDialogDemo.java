import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class JOptionPaneDialogDemo {

	public static void main(String[] args) {
		JOptionPane pane = new JOptionPane(" Hashim is the best"); 
		JDialog dialog = pane.createDialog(null, "Hello");
		dialog.setLocation(1000,550);
		dialog.setVisible(true);
		
		
		
		
		

	}

}
