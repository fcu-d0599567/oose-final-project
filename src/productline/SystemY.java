package productline;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SystemY extends JFrame{
	
	public SystemY() {
		this.setTitle("�T��������");
		this.setSize(600, 300);
		Panel btPanel = new Panel();
		btPanel.setLayout(new GridLayout(2,1));
		JButton bt1 = new JButton("���t�u�@");
		btPanel.add(bt1);
		JButton bt2 = new JButton("����");
		btPanel.add(bt2);
		this.add(btPanel,BorderLayout.WEST);
		this.setVisible(true);

		// �ƥ�Ĳ�o
		bt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		bt2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
	}
}
