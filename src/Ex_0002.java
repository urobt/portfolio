import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class RadioButtonPanel extends JPanel implements ActionListener {
	
	JLabel jl1 = new JLabel("����� ������?");
	JLabel jl2 = new JLabel("");
	public RadioButtonPanel(){
		JRadioButton jrb1 = new JRadioButton("����");
		JRadioButton jrb2 = new JRadioButton("����");
		add(jl1);
		add(jl2);
		add(jrb1);
		add(jrb2);
		jrb1.addActionListener(this);
		jrb2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae){
		String s = ae.getActionCommand();
		jl2.setText(s);
	
	}
}

class ComboPanel extends JPanel implements ItemListener {
	JLabel jl1 = new JLabel("����� ��������?");
	JLabel jl2 = new JLabel("");
	
	public ComboPanel(){
		JComboBox jcb = new JComboBox();
		jcb.addItem("A��");
		jcb.addItem("B��");
		jcb.addItem("O��");
		jcb.addItem("AB��");
		add(jl1);
		add(jl2);
		add(jcb);
		jcb.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent ie){
		Object s = ie.getItem();
		jl2.setText(s.toString());
	}
}

public class Ex_0002 extends JFrame{
	public Ex_0002(){
		JTabbedPane jtp = new JTabbedPane();
		RadioButtonPanel rbp = new RadioButtonPanel();
		ComboPanel cp = new ComboPanel();
		jtp.addTab("����", rbp);
		jtp.addTab("������", cp);
		getContentPane().add(jtp);
	}
	public static void main(String[] args) {
		Ex_0002 jtpt = new Ex_0002();
		jtpt.setTitle("GroupHolder Test");
		jtpt.setSize(500,150);
		jtpt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jtpt.setVisible(true);
		}
	}