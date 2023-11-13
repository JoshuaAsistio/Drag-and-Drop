import javax.swing.JFrame;

public class MyFrame extends JFrame {
	DragPanel dragPanel = new DragPanel();
	MyFrame() {
		setTitle("Drag and Drop Demo");
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		add(dragPanel);
		
		setVisible(true);
	}
}
