
   PImage mustache;

PImage friend;
void setup(){
 friend=loadImage("kim jong un.jpg");
 size(800,800);
 friend.resize(800,800);
 
 
}
void draw(){
 background(friend);
 mustache=loadImage("mustache.png");
 image(mustache,mouseX,mouseY);

}