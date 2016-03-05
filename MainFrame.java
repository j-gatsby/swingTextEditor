import javax.swing.*;

public class MainFrame extends JFrame
{
	private JTextArea textArea;
	private JButton button;

	super("TJ's Text Editor");

	setLayout(new BorderLayout());

	textArea = new JTextArea();
	button = new JButton("OK");

	add(textArea, BorderLayout.CENTER);
	add(button, BorderLayout.SOUTH);

	setSize(600, 500);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setVisible(true);
}
