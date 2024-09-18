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