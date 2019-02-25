import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class ComboDemo extends JFrame implements ActionListener
{
	JComboBox c1,c2;
	JLabel l1,l2;
	JTextField t1,t2;
	JLabel l3,l4;
	JButton b1,b2,b3,b4;
	
		public ComboDemo()
		{
			setSize(400,400);
			setVisible(true);
			setLayout(null);
			
			l1=new JLabel("Number1");
			l1.setBounds(10,10,60,30);
			add(l1);
			
			t1=new JTextField();
			t1.setBounds(80,10,80,30);
			add(t1);	
			
			l2=new JLabel("Number1");
			l2.setBounds(10,60,60,30);
			add(l2);
			
			t2=new JTextField();
			t2.setBounds(80,60,80,30);
			add(t2);
			
			l3=new JLabel("Choice");
			l3.setBounds(10,110,80,30);
			add(l3);
			
			String counter[]={"Addition","Multiplication","Subtraction","Clear"};
			c1=new JComboBox(counter);
			c1.setBounds(80,115,100,20);
			add(c1);
			
			b1=new JButton("Add");
			b1.setBounds(50,160,60,30);
			add(b1);
			
			b2=new JButton("Mul");
			b2.setBounds(120,160,60,30);
			add(b2);
			
			b3=new JButton("Sub");
			b3.setBounds(190,160,60,30);
			add(b3);
			
			b4=new JButton("CLR");
			b4.setBounds(260,160,60,30);
			add(b4);
			
			b1.addActionListener(this);
			b2.addActionListener(this);
			b3.addActionListener(this);
			b4.addActionListener(this);
			
			l4=new JLabel();
			l4.setBounds(10,200,300,30);
			add(l4);
			
			
		}
		public void actionPerformed(ActionEvent ae)
		{
			int num1=Integer.parseInt(t1.getText());
			int num2=Integer.parseInt(t2.getText());
			int sub,add,mul;
			
			
			
			String msg=" ";
			msg="Current Operation: "+c1.getItemAt(c1.getSelectedIndex());

			if(ae.getSource()==b1)
			{
					repaint();
					add=num1+num2;
					l4.setText("\t"+msg+" "+add);
			}
			else if(ae.getSource()==b2)
			{
					repaint();
					mul=num1*num2;
					l4.setText("\t"+msg+" "+mul);
			}
			if(ae.getSource()==b3)
			{	
					repaint();
					sub=num1-num2;
					l4.setText("\t"+msg+" "+sub);
			}
			else if(ae.getSource()==b4)
			{
					repaint();
					t1.setText(null);
					t2.setText(null);
					l4.setText(null);
			}
		}
		public static void main(String args[])
		{
			new ComboDemo();
		}
		
}		
			
			