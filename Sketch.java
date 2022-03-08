import processing.core.PApplet;

public class Sketch extends PApplet {
	
  /**
  * Program Sketch.java draw objects in random locations. 
  * @author: Stephanie Tam
  */
	
  // Bird
  float circleX = random(0, width);
  float circleY = random(0, height);

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

    // Bird
    float circleDiameter = 200;
    float circleDistance = circleDiameter / 10;

    // Body
    fill(242, 22, 84);
    ellipse(circleX, circleY, circleDiameter, circleDiameter);
  
    // Beak
    fill(255, 233, 38);
    triangle((float)(circleX/1.17), (float)(circleY/1.1), circleX, (float)(circleY/0.87), (float)(circleX/0.87), (float)(circleY/1.1));

    // Left Eye
    fill(24, 0, 102);
    ellipse(circleX - circleDistance, circleY - circleDistance, circleDiameter/10, circleDiameter/6);

    // Right Eye
    fill(24, 0, 102);
    ellipse(circleX + circleDistance, circleY - circleDistance, circleDiameter/10, circleDiameter/6);
    
    // Values for time
    int intHours = hour();
    int intMinutes = minute();
    int intSeconds = second();

    // Print time
    String strTime = (str(intHours % 12) + ":" + str(intMinutes) + ":" + str(intSeconds));

    // Size and font
    noStroke();
    fill(0, 0, 200);
    textSize(40);
    text(strTime, 150, 380);

  }
  
  // define other methods down here.
}