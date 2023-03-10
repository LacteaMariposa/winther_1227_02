package gui.test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JFrameTest2 extends JFrame implements ActionListener{
	ImageIcon icon = new ImageIcon("images/스노우볼.jpg");
	JLabel lbl = new JLabel(icon, JLabel.CENTER);
	JPanel pan = new JPanel();
	JButton btn1 = new JButton("AKMU");
	JButton btn2 = new JButton("200%");
	JButton btn3 = new JButton("RE-Bay");
	
	public JFrameTest2() {
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		
		pan.add(btn1); pan.add(btn2); pan.add(btn3);
		add(pan, "North");
		
		add(lbl, "Center");
		setTitle("JFrame 상속 연습");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocation(200, 200);
		setSize(500, 525);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new JFrameTest2();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object btnSource = e.getSource();
		if(btnSource == btn1) {
			icon = new ImageIcon("images/프로필.jpg");
		}else if(btnSource == btn2) {
			icon = new ImageIcon("images/200.jpg");
		}else {
			icon = new ImageIcon("images/리방.jpg");
		}
		lbl.setIcon(icon);
	}

}
