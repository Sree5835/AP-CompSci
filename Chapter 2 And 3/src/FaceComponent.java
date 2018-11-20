import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import javax.swing.JComponent;
import javax.swing.JFrame;

/*
A class that draws an alien face.
*/
public class FaceComponent extends JComponent //https://www.ecosia.org/images?q=turkey+clip+art#id=C3FFB8A5E8F80E63D0EAC96A26B71AD635782727
{
	public void paintComponent(Graphics g)
	{
		// Recover Graphics2D
		Graphics2D g2 = (Graphics2D) g;
		
		// Create the head
		Ellipse2D.Double head = new Ellipse2D.Double(25, 50, 60, 60);
		
		// Change the color of the upcoming "draw command" to green, to make the eyes green
		g2.setColor(Color.ORANGE.darker());
		
		//Draw the head
		g2.fill(head);
		
		// Create the head
		Ellipse2D.Double body = new Ellipse2D.Double(10, 100, 100, 100);
				
		// Change the color of the upcoming "draw command" to green, to make the eyes green
		g2.setColor(Color.ORANGE.darker());
				
		//Draw the head
		g2.fill(body);
		
		// Change the color of the upcoming "draw command" to green, to make the eyes green
		g2.setColor(Color.GREEN);
		
		//Create the left eye
		Rectangle eye = new Rectangle(25, 70, 15, 15);
		
		//Draw the left eye
		g2.fill(eye);
		
		//Move the left eye over so it becomes the right eye
		eye.translate(50, 0);
		
		//Draw the right eye
		g2.fill(eye);
		
		// Create the mouth
		Line2D.Double leg1 = new Line2D.Double(40, 180, 20, 230);
		Line2D.Double toe_1_1 = new Line2D.Double(20, 230, 10, 240);
		Line2D.Double toe_1_2 = new Line2D.Double(20, 230, 20, 240);
		Line2D.Double toe_1_3 = new Line2D.Double(20, 230, 30, 240);
		Line2D.Double leg2 = new Line2D.Double(80, 180, 100, 230);
		Line2D.Double toe_2_1 = new Line2D.Double(100, 230, 90, 240);
		Line2D.Double toe_2_2 = new Line2D.Double(100, 230, 20, 240);
		Line2D.Double toe_2_3 = new Line2D.Double(100, 230, 110, 240);
		
		//change the color of the mouth to red, and then draw it
		g2.setColor(Color.RED);
		g2.draw(leg1);
		g2.draw(toe_1_1);
		g2.draw(toe_1_2);
		g2.draw(toe_1_3);
		g2.draw(leg2);
		g2.draw(toe_2_1);
		g2.draw(toe_2_2);
		g2.draw(toe_2_3);
		
		// Draw the greeting
		g2.setColor(Color.BLUE);
		g2.drawString("Bawk! Bawk!", 60, 300);
	}
	
	//For this project, you will not need to change this main method at all!  
	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		frame.setSize(150, 250);
		frame.setTitle("An Alien Face");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		FaceComponent component = new FaceComponent();
		frame.add(component);
		
		frame.setVisible(true);
	}
}