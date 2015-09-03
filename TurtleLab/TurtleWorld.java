
import java.awt.Color;

public class TurtleWorld
{
    public static void main(String args[])
    {
        World turtleWorld = new World();
        Turtle turtle = new Turtle(turtleWorld);
        turtle.setPenColor(Color.BLUE);
        turtle.setPenWidth(15);
        turtle.penUp();
        turtle.forward();
     
       
        turtle.turnLeft();
        turtle.forward();
        turtle.penDown();
        turtle.forward();
        turtle.backward(50);
        turtle.turnLeft();
        turtle.forward();
        turtle.turnRight();
        turtle.forward(50);
        turtle.getName();
       
        
        Turtle turtle2 = new Turtle(turtleWorld);
        turtle2.setPenColor(Color.RED);
        turtle2.setPenWidth(15);
        turtle2.penDown();
        turtle2.forward();
        turtle2.backward();
        turtle2.turnRight();
        turtle2.forward(50);
        //color = turtle2.getBodyColor();
        //System.out(color);
        //turtle2.setPicture(Koala.jpg);
        
        Turtle turtle3 = new Turtle(turtleWorld);
        turtle3.setPenColor(Color.GREEN);
        turtle3.setPenWidth(5);
        turtle3.penUp();
        turtle3.backward(10);
        turtle3.turnLeft();
        turtle3.forward(70);
       
        turtle3.penDown();
        int x = 0;
        while(x<36){
            turtle3.turn(10);
            turtle3.forward(2);
            x+=1;
        
        
        
        }
        turtle3.penUp();
        turtle3.forward(500);
    }
}
