import java.awt.event.*;
import javax.swing.*;
class Text extends JFrame implements ActionListener
 {
static JTextField T;
static JFrame F;
static JButton B;
static JLabel L;
Text()
{
}
public static void main(String[] args)
{
F = new JFrame("textfield");
L = new JLabel("nothing entered");
B = new JButton("submit");Text obj = new Text();
B.addActionListener(obj);
T = new JTextField(16);
JPanel P = new JPanel();
P.add(T);
P.add(B);
P.add(L);
F.add(P);
F.setSize(300, 300);
F.show();
}
public void actionPerformed(ActionEvent e)
{
String s = e.getActionCommand();
if (s.equals("submit")) 
{
L.setText(T.getText());
T.setText(" ");
}
}
}
