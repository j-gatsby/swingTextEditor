import javax.swing.*;

public class App
{
	public static void main(String... args)
	{
		SwingUtilities.invokeLater(new Runnable() {
			public void run()
			{
				// Replacing with MainFrame.java and...
				//JFrame frame = new JFrame("TJ's Text Editor");
				new MainFrame();
			}
		});
	}
}
