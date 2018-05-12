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

public class sketch_180218a extends PApplet {

public void setup() {
  
  colorMode(HSB, 100);
  background(0, 0, 0);
  noStroke();
  rectMode(CENTER);

  for ( int y = 16; y < 512; y += 32 ) {
    for ( int x = 16; x < 512; x += 32 ) {
      fill( random(40, 100), random(40, 150), 90);
      rect(x, y, 24, 24);
    }
  }
}
  public void settings() {  size(512, 512); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "sketch_180218a" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
