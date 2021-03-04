import java.awt.*;
public class ChoiceExample
{
public static void main(String args[])
{
Frame f=new Frame();
Choice obj=new Choice();
obj.setBounds(50,100,50,50);
obj.add("1");obj.add("2");
obj.add("3");
obj.add("4");
f.add(obj);
f.setSize(500,500);
f.setLayout(null);
f.setVisible(true);
} 
}
