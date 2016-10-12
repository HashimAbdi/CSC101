import java.awt.Component;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

@SuppressWarnings("serial")
public class JOptionPaneLocation extends Component {
	public void JOpitionLocation() {
		
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame("Hashim is the BEST");
		JOptionPane JOptionPaneLocation = new JOptionPane(); 
		frame.setLocation(0,0);
		frame.setSize(1000,1000);
		frame.setVisible(true);
		
	}
}
		
