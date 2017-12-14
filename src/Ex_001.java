import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 
public class Ex_001 extends JFrame implements ItemListener {
//콤보 박스의 이벤트를 처리하기 위해 ItemListener 포함 
   JLabel jl;
   
   public Ex_001() {
      jl = new JLabel(new ImageIcon("감.jpg"));
      //아이콘 객체를 이용하여 JLabel 객체 생성
      JComboBox<String> jcomb = new JComboBox<String>();
      // 콤보 박스 객체 생성
      Container ct = getContentPane();
      ct.setLayout(new FlowLayout());
      ct.add(jl);
      jcomb.addItem("감");
      jcomb.addItem("바나나");
      jcomb.addItem("배");
      jcomb.addItem("사과");
      jcomb.addItem("앵두");
      jcomb.addItem("포도");
      // 콤보박스에 아이템을 추가
      ct.add(jcomb);
      jcomb.addItemListener(this);
      // 콤보박스에 리스너 등록
   }
   
   public void itemStateChanged(ItemEvent ie) {
      // 콤보박스의 항목이 선택될때 호출
      String fruit = (String)ie.getItem();
      // 이벤트를 발생시킨 아이템의 문자열을 구한다
      jl.setIcon(new ImageIcon(fruit+".jpg"));
      // JLabel 객체를 새로운 아이콘으로 설정
   }
 
   public static void main(String[] args) {
      Ex_001  jcbt = new Ex_001();
      jcbt.setTitle("JComboBox Test");
      jcbt.setSize(375,250); 
      jcbt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      jcbt.setVisible(true); 
   }
}