int X=495,Y=449,X2=318,Y2=429;
int accel=5;
PImage catPic;
void setup(){
  size(800,800);
 catPic = loadImage("puss.jpg");
 catPic.resize(800, 800);
background(catPic);
ellipse(X, Y, 60, 60);
 ellipse(X2, Y2, 50, 50);
}
void draw(){
  //if(mousePressed){
    fill(200,00,00);
    noStroke();
 ellipse(X, Y, 60, 60);
 ellipse(X2, Y2, 50, 50);
println("Mouse’s x-position: " + mouseX + "\n" + "Mouse’s y-position: " + mouseY + "\n");//}
keyPressed();
}

void keyPressed(){
    X--;
  Y--;
  X2--;
  Y2--;
  if (keyPressed);
  Y-=2*accel;
X-=2*accel;
Y2-=2*accel;
X2-=2*accel;

}