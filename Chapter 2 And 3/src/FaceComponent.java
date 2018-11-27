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
		Ellipse2D.Double head = new Ellipse2D.Double(25, 50, 100, 100);
		
		// Change the color of the upcoming "draw command" to green, to make the eyes green
		g2.setColor(Color.ORANGE.darker());
		
		//Draw the head
		g2.fill(head);
		
		// Create the head
		Ellipse2D.Double body = new Ellipse2D.Double(35, 60, 80, 80);
				
		// Change the color of the upcoming "draw command" to green, to make the eyes green
		g2.setColor(Color.ORANGE);
				
		//Draw the head
		g2.fill(body);
		
		
		// Create the mouth
		Line2D.Double one = new Line2D.Double(75, 60, 75, 140);
		Line2D.Double two = new Line2D.Double(36, 100, 114, 100);
		Line2D.Double three = new Line2D.Double(46, 71, 104, 129);
		Line2D.Double four = new Line2D.Double(46, 130, 104, 72);
		
		//change the color of the mouth to red, and then draw it
		g2.setColor(Color.BLACK);
		g2.draw(one);
		g2.draw(two);
		g2.draw(three);
		g2.draw(four);
		
		// Draw the greeting
		g2.setColor(Color.BLUE);
		int i = 15;
		while(i<=18){
			g2.drawString("H a p p y  T h a n k g i v i n g!", i, 40);	
			i++;
		}
		//g2.drawString("Happy Thankgiving", 60, 300);
	}
	
	//For this project, you will not need to change this main method at all!  
	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		frame.setSize(200, 200);
		frame.setTitle("The Thanksgiving Pi");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		FaceComponent component = new FaceComponent();
		frame.add(component);
		
		frame.setVisible(true);
	}
}