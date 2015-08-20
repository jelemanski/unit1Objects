import java.awt.Color;

public class TurtleWorld
{
    public static void main(String args[])
    {
        World turtleWorld = new World();
        Turtle turtle = new Turtle(turtleWorld);
        turtle.setPenColor(Color.GREEN);
        turtle.penDown();
        turtle.forward(50);
        turtle.penUp();
        turtle.forward(25);
        turtle.penDown();
        turtle.forward();
        turtle.turnRight();
        turtle.forward(25);
        turtle.turnRight();
        turtle.forward(112);
        turtle.turnRight();
        turtle.forward();
    }
}
