package productline;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SystemX  extends JFrame{
	employee[] employees;
	public SystemX(employee[] employees) {
		empolyeeSystem empolyeeSystem = new empolyeeSystem(employees);
		this.setTitle("鞋子模擬器");
		this.setSize(600, 300);
		
		
		
		Panel panelBT = new Panel();
		panelBT.setLayout(new GridLayout(2,1));
		JButton bt1 = new JButton("分配工作");
		panelBT.add(bt1);
		JButton bt2 = new JButton("模擬");
		panelBT.add(bt2);
		this.add(panelBT,BorderLayout.WEST);
		
		Panel panel1 = new Panel();
		JTextField f1 = new JTextField("輸入");
		panel1.add(f1);
		
		this.add(panel1,BorderLayout.CENTER);
		this.setVisible(true);

		// 事件觸發
		bt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f1.setText(empolyeeSystem.makeStrength());
			}
		});
		bt2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f1.setText("4 一雙/小時");
			}
		});
	}
}
