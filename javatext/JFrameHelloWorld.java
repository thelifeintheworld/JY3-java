import javax.swing.*;

public class JFrameHelloWorld
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("JFrame");
		JPanel pane = new JPanel();
		JLabel label =new JLabel("Hello World");
		pane.add(label);
		frame.setContentPane(pane);
		frame.setSize(300,200);
		frame.setVisible(true);
	}
}