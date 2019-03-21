import java.awt.*;
import javax.swing.*;

public class Windows extends JFrame
{
	JPanel p = new JPanel();
	
	JTextArea ta;
	JButton b;
	
	public Windows()
	{
		ta = new JTextArea(20,20);
		b= new JButton("Invia");
		
		p.add(ta);
		p.add(b);
		
		this.getContentPane().add(p);
		
		this.setBounds(100,100,300,400);
		this.setVisible(true);
		
	}

	public static void main(String[] args) 
	{
		new Windows();
	}

}
