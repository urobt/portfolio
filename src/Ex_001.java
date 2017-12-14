import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 
public class Ex_001 extends JFrame implements ItemListener {
//�޺� �ڽ��� �̺�Ʈ�� ó���ϱ� ���� ItemListener ���� 
   JLabel jl;
   
   public Ex_001() {
      jl = new JLabel(new ImageIcon("��.jpg"));
      //������ ��ü�� �̿��Ͽ� JLabel ��ü ����
      JComboBox<String> jcomb = new JComboBox<String>();
      // �޺� �ڽ� ��ü ����
      Container ct = getContentPane();
      ct.setLayout(new FlowLayout());
      ct.add(jl);
      jcomb.addItem("��");
      jcomb.addItem("�ٳ���");
      jcomb.addItem("��");
      jcomb.addItem("���");
      jcomb.addItem("�޵�");
      jcomb.addItem("����");
      // �޺��ڽ��� �������� �߰�
      ct.add(jcomb);
      jcomb.addItemListener(this);
      // �޺��ڽ��� ������ ���
   }
   
   public void itemStateChanged(ItemEvent ie) {
      // �޺��ڽ��� �׸��� ���õɶ� ȣ��
      String fruit = (String)ie.getItem();
      // �̺�Ʈ�� �߻���Ų �������� ���ڿ��� ���Ѵ�
      jl.setIcon(new ImageIcon(fruit+".jpg"));
      // JLabel ��ü�� ���ο� ���������� ����
   }
 
   public static void main(String[] args) {
      Ex_001  jcbt = new Ex_001();
      jcbt.setTitle("JComboBox Test");
      jcbt.setSize(375,250); 
      jcbt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      jcbt.setVisible(true); 
   }
}