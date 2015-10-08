import java.awt.Canvas;

public class CakeShop extends Canvas implements Runnable {
	
	private static final long serialVersionUID = 5473673920275536866L;
	
	public static final int WIDTH = 640, HEIGHT = WIDTH / 12 * 9;
	
	private Thread thread;
	private boolean running = false;
	
	public CakeShop() {
		new Screen(WIDTH, HEIGHT, "Grandma's Cake Shop", this);
	}

	public synchronized void start() {
		thread = new Thread(this);
		thread.start();
		running = true;
	}
	
	public synchronized void stop() {
		try {
			thread.join();
			running = false;
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void run() {
		
	}

	public static void main(String[] args) {
		new CakeShop();
	}

}
