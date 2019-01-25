/*
 * Name: Sricharan Sanakkayala
 * Date: 
 * Project: A program to make bubbles rain from the ceiling.  We will adjust it as we go.
 * 
 * 
 *  We have provided you with some working code. With a partner, look through
 *  the code to determine what is happening. Document your findings within the
 *  code. We will make MANY changes to this and it is important to know what is
 *  happening before we do.
 *  
 */

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.awt.Graphics2D;

import javax.swing.Timer;

public class RainingBubblesOriginal extends Applet 
{
	//constants to control size, speed, number of circles...
	private final int DELAY = 30;
	private final int MAX_SIZE = 30;
	private final int MAX_CIRCLES = 250;
	private final int MAX_VELOCITY = 20;
	
	//these are called "parallel arrays." Is there a better way to handle all
	//of this data?  Hint... these could all be ATTRIBUTES of a certain class.  Make that class and 
	//create a single array of that object.
	
//	private int[] x;
//	private int[] y;
//	private int[] yvelocity;
//	private int[] size;
	private Particle[] particle;
	private Particle[] snow;

	public void init() 
	{
		//What is the purpose of this method?  State as a comment under this line.
		// this method runs similar to public void main
		//Document this...what's going on in each line?...
		this.resize((int)Toolkit.getDefaultToolkit().getScreenSize().getWidth(),
					(int)Toolkit.getDefaultToolkit().getScreenSize().getHeight());
		// these two lines are to set the the size of the panel to the size of the screen
		
		
		//again, change these parallel arrays to make them better.
//		x = new int[MAX_CIRCLES];
//		y = new int[MAX_CIRCLES];
//		yvelocity = new int[MAX_CIRCLES];
//		size = new int[MAX_CIRCLES];
		particle = new Particle[MAX_CIRCLES];
		snow = new Particle[MAX_CIRCLES];
		for(int count = 0;count < MAX_CIRCLES; count++)
		{
			resetCircle(count);
		}
		
		//I needed this to use "repaint" the screen. It uses a timer which is "listenedTo" by an ActionListener
		ActionListener taskPerformer = new ActionListener() 
		{
			public void actionPerformed(ActionEvent evt) 
			{
				repaint();
			}
		};
		
		new Timer(DELAY, taskPerformer).start();
		
	}
		
	//This method is to "double buffer".  If it wasn't here,
	//the animations would flicker.  No need to modify/comment anything
	//in this method.
	public void update(Graphics g)
	{
		Graphics offgc;
		Image offscreen = null;
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		
		offscreen = createImage(d.width, d.height);
		offgc = offscreen.getGraphics();
		
		offgc.setColor(getBackground());
		offgc.fillRect(0,0,d.width,d.height);
		offgc.setColor(getForeground());
		
		paint(offgc);
		
		g.drawImage(offscreen, 0, 0, this);
		
	}
	
	private void resetCircle(int index)
	{
		//What does this method do?  Comment under this line.  Also, again - fix the parallel array issue.
		//instantiating new circles at the top and setting its values
//		y[index] = 0;
//		x[index] = (int)(Math.random()*this.getWidth());
//		yvelocity[index] = (int)(Math.random()*MAX_VELOCITY)+2;	
//		size[index] = (int)(Math.random()*MAX_SIZE);	
		particle[index] = new Particle((int)(Math.random()*this.getWidth()),0,0,(int)(Math.random()*MAX_VELOCITY)+2,(int)(Math.random()*MAX_SIZE));
	}
	
	private void makeSnow(int index,int x, int y, int size)
	{
		//What does this method do?  Comment under this line.  Also, again - fix the parallel array issue.
		//instantiating new circles at the top and setting its values
//		y[index] = 0;
//		x[index] = (int)(Math.random()*this.getWidth());
//		yvelocity[index] = (int)(Math.random()*MAX_VELOCITY)+2;	
//		size[index] = (int)(Math.random()*MAX_SIZE);	
		particle[index] = new Particle(x,y,0,0,size);
	}
	
	
	public void paint(Graphics g) 
	{	
		Ellipse2D circle;
		Graphics2D g2 = (Graphics2D)g;
		
		//Document this...what's going on in each line?... there should be a comment for each line.
		for(int count = 0;count < MAX_CIRCLES; count++)//this code runs the same number of times as the number of circle you want
		{ 
			//y[count] += yvelocity[count];//the y position changes according to the yvelocity
//			if(y[count]>this.getHeight())//when the ball hits the bottom of the screen
//			{
//				resetCircle(count);//reset circle
//			}
			particle[count].setY(particle[count].getY()+particle[count].getYVelocity());
			if(particle[count].getY()>this.getHeight())//when the ball hits the bottom of the screen
			{
				makeSnow(count,particle[count].getX(),this.getHeight()-particle[count].getSize(),particle[count].getSize());
				resetCircle(count);//reset circle
			}
			g2.setPaint(Color.CYAN);//set background of the ball to blue	
			circle =new Ellipse2D.Double(particle[count].getX(), particle[count].getY(), particle[count].getSize(), particle[count].getSize());	//updating position on the screen
			g2.fill(circle);// adds into the screen
					
		}
	}
}

/*FINALLY - change this to make it your own.  Make different colors (randomize it, if you want). 
 *  Change the starting spot of the bubbles.  Change the size.  Do something to make it your own.  
 *  Try to make some kind of video game out of it (I'm thinking pong...).  */
