import processing.core.PApplet;

public class Sketch extends PApplet {
	
  /**
  * Program Sketch.java draw objects in random locations. 
  * @author: Stephanie Tam
  */
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(173, 230, 255);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
    float flowerX = 150;
    float flowerY = 150;
    float petalSize = 100;
    float petalDistance = petalSize / 2;

    background(0, 200, 0);

    fill(255, 128, 0);

    // upper-left petal
    ellipse(flowerX - petalDistance, flowerY - petalDistance, petalSize, petalSize);

    // center petal
    fill(255, 0, 0);
    ellipse(flowerX, flowerY, petalSize, petalSize);

  /**
    float circleX = 180;
    float circleY = 200;
    float circleDiameter = 200;

    ellipse(circleX, circleY, circleDiameter, circleDiameter);
	  
	// sample code, delete this stuff
    stroke(128);
    line(150, 25, 270, 350);  

    stroke(255);
    line(50, 125, 70, 50);  
  */

  }
  
  // define other methods down here.
}