import processing.core.PApplet;

public class Sketch extends PApplet {
	
  /**
  * Program Sketch.java creates a sketch of a bird at random locations with background color based on the location. Current time is shown.
  * @author: Stephanie Tam
  */
	
  // Bird
  float circleX = random(0, 400);
  float circleY = random(0, 400);

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

    // Change background color 
    if (circleX <= 200 && circleY >= 200){
      background(58, 50, 168); // Blue
    }
    else if (circleX >= 200 && circleY <= 200){
      background(255, 255, 181); // Yellow
    }
    else if (circleX <= 200 || circleY <=200){
      background(200, 255, 170); // Green
    }
    else if (circleX >= 200 && circleY >= 200){
      background(255, 201, 251); // Pink
    }
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
    triangle((float)(circleX - 30), (float)(circleY - 20), circleX, (float)(circleY + 30), (float)(circleX + 30), (float)(circleY - 20));

    // Left Eye
    fill(24, 0, 102);
    ellipse(circleX - circleDistance, circleY - circleDistance, circleDiameter/10, circleDiameter/6);

    // Right Eye
    fill(24, 0, 102);
    ellipse(circleX + circleDistance, circleY - circleDistance, circleDiameter/10, circleDiameter/6);
    
    // Current time
    String time = hour() + ":" + minute();

    if (hour() > 12){
      time = hour()- 12 + ":" + minute() + " PM";
      textSize(30); 
      text(time,(width/2), (height/2));
    }
    else if(hour() == 0){
      time = "12:" + minute() + " AM";
      textSize(30); 
      text(time,(width/2), (height/2));
    }
    else{
      textSize(30); 
      text(time,(width/2), (height/2));
    }
  }
}