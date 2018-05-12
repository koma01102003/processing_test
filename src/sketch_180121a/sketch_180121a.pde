float angle =0;

void setup() {
  size(800, 600);
  colorMode(RGB, 256);
  background(0);
}

void draw() {
  if (mousePressed) {
    fill(255, random(0, 255), random(0, 255));

    stroke(0, 0, 0);

    translate(mouseX, mouseY);
    rotate(angle);
    rect(0, 0, 50, 50);
    angle +=0.1;
  }
}
