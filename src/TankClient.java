import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class TankClient extends Frame{
	public void lauchFrame() {
		this.setLocation(180,90);
		this.setSize(800,600);
		this.setTitle("TankWar");
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		this.setResizable(false);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		TankClient client = new TankClient();
		client.lauchFrame();
		System.out.println("t");
	}
}
