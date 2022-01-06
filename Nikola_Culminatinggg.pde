
float mapX = 0, mapY = -5;
float playerSize = 10;
PImage map;
boolean left, right, up, down;


PFont f;

float x = 100;
float y = 100;
float w = 20;
float h = 20;

float xspeed = 1;
float yspeed = 1;

void setup()
{
  
  map = loadImage("maze.png");
  size(400,400);
  background(255);
  image(map, mapX, mapY, 500, 500);
  
  //title screen
  
   printArray(PFont.list());
  f = createFont("SourceCodePro-Regular.ttf", 24);
  textFont(f);
  textAlign(CENTER, CENTER);
  
  
}

void draw()
{
  
 background(102);
  textAlign(RIGHT);
  drawType(width * 0.25);
  textAlign(CENTER);
  drawType(width * 0.5);
  textAlign(LEFT);
  drawType(width * 0.75);
  
  background(255);
  image(map, mapX, mapY, 500, 500);
  noStroke();
  fill(255,0,0);
  
  
  if (left && !right && collision((byte)0)) {
    mapX++;
  }
  else if (right && !left && collision((byte)2)) {
    mapX--;
  }
  if (up && !down  && collision((byte)1)) {
    mapY++;
  }
  else if (down && !up  && collision((byte)3)) {
    mapY--;
  }
  
  rect(width/2-playerSize/2,height/2-playerSize/2,playerSize,playerSize);
  
  
  x = x + xspeed;
  y = y + yspeed;
  
  println("x: " + x);
  println("y: " + y);
  
  //have to change 
  if((x>width-30) || (x<30))
  {
    xspeed = xspeed * -1;
  }
  
  if ((y > height) || (y < 60))
  {
    yspeed = yspeed * -1;
  }
  
  //background(0);
  //ellipseMode(CENTER);
  //rectMode(CENTER);
  //noStroke();
  
  
  fill(150);
  rect(x,y,w,h);
  
}



boolean collision(byte direction){ //0 = left     1 = up     2 = right     3 = down
  color check = color(0,0,0);
  
  if(direction == 0){
    check = get(width/2-1, height/2);
    
  }
  else if(direction == 1){
    check = get(width/2, height/2-1);
    
  }
  else if(direction == 2){
    check = get(width/2+1, height/2);
    
  }
  else if(direction == 3){
    check = get(width/2, height/2+1);
    
  }
  float red = red(check), green = green(check), blue = blue(check);
  if((red+green+blue)/3 > 240){
    return true;
  }
  return false;
}


  


void keyPressed() {
  if (key == 'a') {
    left = true;
  }
  else if (key == 'd') {
    right = true;
  }
  else if (key == 'w') {
    up = true;
  }
  else if (key == 's') {
    down = true;
  }
}


void keyReleased() {
  if (key == 'a') {
    left = false;
  }
  else if (key == 'd') {
    right = false;
  }
  else if (key == 'w') {
    up = false;
  }
  else if (key == 's') {
    down = false;
  }
}

void drawType(float x) 
{
  line(x, 0, x, 65);
  line(x, 220, x, height);
  fill(0);
  text("ichi", x, 95);
  fill(51);
  text("ni", x, 130);
  fill(204);
  text("san", x, 165);
  fill(255);
  text("shi", x, 210);
}