import javax.swing.*;
import java.awt.*;
public class grid implements KeyListener
{
JLabel label;
void grid()
{
JFrame frame=new JFrame();
frame.setSize(420,420);
frame.setVisible(true);
frame.add(label);
label=new JLabel();
label.setBounds(100,100,70,70);
label.setBackground(Color.red);
label.addKeyListener(this);
frame.addKeyListener(this);
}
public void keyPressed(KeyEvent e)
{
switch(e.getKeyCode())
{
case 37 : label.setLocation(label.getX()-10,label.getY());
break;
case 38 : label.setLocation(label.getX(),label.getY()-10);
break;
case 39 : label.setLocation(label.getX()+10,label.getY());
break;
case 40 : label.setLocation(label.getX(),label.getY()+10);
break;

}
}
public static void main(String args[])
{
grid g1=new grid();
}
}







using System;

namespace HierarchicalInheritance
{
    // Base class (Parent class)
    class Animal
    {
        public string Name { get; set; }

        public void Eat()
        {
            Console.WriteLine($"{Name} is eating.");
        }
    }

    // Derived class 1 (inherits from Animal)
    class Dog : Animal
    {
        public void Bark()
        {
            Console.WriteLine($"{Name} is barking.");
        }
    }

    // Derived class 2 (inherits from Animal)
    class Cat : Animal
    {
        public void Meow()
        {
            Console.WriteLine($"{Name} is meowing.");
        }
    }

    class Program
    {
        static void Main(string[] args)
        {
            // Create instances of the derived classes
            Dog dog = new Dog { Name = "Buddy" };
            Cat cat = new Cat { Name = "Whiskers" };

            // Access methods from the base class
            dog.Eat();  // Buddy is eating.
            cat.Eat();  // Whiskers is eating.

            // Access methods from the derived classes
            dog.Bark();  // Buddy is barking.
            cat.Meow();  // Whiskers is meowing.
        }
    }
}
