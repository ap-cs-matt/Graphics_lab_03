// GraphicsLab03st.java
// Student Version

import java.awt.*;
import java.applet.*;
import java.util.*; 
																
//random coment 3
public class GraphicsLab03_Matthew_Pearce extends Applet
{

//-----------Random Color----------//
	
	public static Color randomColor()
	{	
		
		int r = (int)(Math.random()*256);
		int g =  (int)(Math.random()*256);
		int b =  (int)(Math.random()*256);

		Color randomColor = new Color(r,g,b);
    
		return randomColor;
    
	}
	
	//-----------Random Color----------//
	
	public void paint(Graphics g) 	
	{

	// Draw Grid
		g.drawRect(10,10,780,580);
		g.drawLine(400,10,400,590);
		g.drawLine(10,300,790,300);
		
	
		// Draw Random Lines
			int k=0;
			Random randInt = new Random();
				while (k <= 100)
         {
    	  //generating random coordinates
    	  	int x1 = (int)(Math.random()*385) +15; 
    	  	int y1 =(int)(Math.random()*280)+15;
    	  	int x2 = (int)(Math.random()*385) +15; 
    	  	int y2 = (int)(Math.random()*280)+15;
    
    	  	g.setColor(randomColor());
         
    	  	g.drawLine(x1,y1,x2,y2);
    	  	k++;
         }

	
		// Draw Random Squares
				k=0;
				while (k <= 100)
        {
		 int st_x =(int)(Math.random()*320)+410; 
         int st_y = (int)(Math.random()*225)+15; 

         g.setColor(randomColor());
         g.fillRect(st_x,st_y,50,50);
        
         k++;
         }

	
		// Draw Random Circles
			k=0;
			int r=0;
			while (k<=100)
		{
				r = (int)(Math.random()*200); 
				g.setColor(randomColor());
     
					if(r<=100)
						{
     
							int cx = (int)(Math.random()*285) +10;
							int cy = (int)(Math.random()*190) +305;
   
							g.drawOval(cx,cy,r,r);
						}
					else
						{
  
							int cx = (int)(Math.random()*160) +15;
							int cy = (int)(Math.random()*85) +305;
							g.drawOval(cx,cy,r,r);
						} 
   
   
				k++;
   } 

	
		// Draw 3-D Box
   
			//Square
				g.setColor(randomColor());
				g.fillRect(600,450,75,75);
	
			//trapezoid
				Polygon trap = new Polygon();
				trap.addPoint(600,450);
				trap.addPoint(637,450);
				trap.addPoint(637,413); 
				trap.addPoint(563,413);
   
				g.setColor(randomColor());
				g.fillPolygon(trap);
   
			// Triangle 
				Polygon tri = new Polygon();
				tri.addPoint(675,450);
				tri.addPoint(637,413);
				tri.addPoint(636,450);
   
				g.setColor(randomColor());
				g.fillPolygon(tri);
			// Rhombus
				Polygon rom = new Polygon();
				rom.addPoint(600,450);
				rom.addPoint(600,525);
				rom.addPoint(563,475);
				rom.addPoint(563,413);    
   
				g.setColor(randomColor());
				g.fillPolygon(rom);

	}
		
}