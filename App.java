import javax.swing.*;

public class App
{
	public static void main(String... args)
	{
		SwingUtilities.invokeLater(new Runnable() {
			public void run()
			{
				JFrame frame = new JFrame("TJ's Text Editor");
				frame.setSize(600, 500);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}
		});
	}
}