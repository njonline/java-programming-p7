import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;

/**
 * Creating a screen for displaying information.
 * @author Nicklas_b
 *
 */

public class Screen extends Canvas {

	private static final long serialVersionUID = 8249297415526368997L;

	public Screen(int width, int height, String title, CakeShop cakeShop) {
		JFrame frame = new JFrame(title);
		
		frame.setPreferredSize(new Dimension(width, height));
		frame.setMaximumSize(new Dimension(width, height));
		frame.setMinimumSize(new Dimension(width, height));
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.add(cakeShop);
		frame.setVisible(true);
		cakeShop.start();
	}
}
