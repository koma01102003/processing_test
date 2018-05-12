float angle =0;

void setup() {
  size(800, 600);
  colorMode(RGB, 256);
  background(0);
}

void draw() {
  if (mousePressed) {
    noFill();
    //fill(256, 256, random(0, 255));

    stroke(0, random(255), random(255));

    translate(mouseX, mouseY);
    rotate(angle);
    rect(0, 0, 30, 30);
    angle +=0.1;
  }
}
