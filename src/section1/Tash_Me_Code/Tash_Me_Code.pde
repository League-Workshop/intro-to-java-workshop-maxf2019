  PImage mustache;

PImage friend; 
    
  
void setup (){

 friend =
    loadImage ("maxresdefault.jpg");
    size (800,600);
    friend.resize(width,height);
}
void draw () {
  background(friend);
}