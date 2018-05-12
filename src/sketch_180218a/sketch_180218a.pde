void setup() {
  size(512, 512);
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
