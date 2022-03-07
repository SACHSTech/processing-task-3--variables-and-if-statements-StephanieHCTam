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

    int randX = 100; // 100 for original
    int randY = 50; // 50 for original

    // Sky colour
    if (randY == 50) { // On ground
      background(58, 50, 168); // Blue
    }
    else if (randY < 50 && randY > -250) { // In sky
      background(255, 255, 181); // Yellow
    }
    else if (randY > 50 && randY < 400) { // Under ground
      background(200, 255, 170); // Green
    }
    else {
      background(255, 201, 251); // Pink
    }

    // Bird
    float circleX = 180;
    float circleY = 200;
    float circleDiameter = 200;

    ellipse(circleX, circleY, circleDiameter, circleDiameter);

  

  }
  
  // define other methods down here.
}