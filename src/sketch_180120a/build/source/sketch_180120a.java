import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class sketch_180120a extends PApplet {

float angle =0;

public void setup() {
  
  colorMode(RGB, 256);
  background(0);
}

public void draw() {
  if (mousePressed) {
    noFill();
    //fill(256, 256, random(0, 255));

    stroke(0, random(255), random(255));

    translate(mouseX, mouseY);
    rotate(angle);
    rect(0, 0, 30, 30);
    angle +=0.1f;
  }
}
  public void settings() {  size(800, 600); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "sketch_180120a" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
