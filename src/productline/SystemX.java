package productline;

import java.awt.Button;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SystemX  extends JFrame{
	public SystemX() {
		this.setLayout(new GridLayout(0, 2));
		this.setTitle("�Ͳ��u������");
		JButton btX = new JButton("X �t��");
		JButton btY = new JButton("Y �t��");
		this.add(btX);
		this.add(btY);
		this.setSize(300, 200);
		this.setVisible(true);

		// �ƥ�Ĳ�o
		btX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SystemX sx=new SystemX();

				
			}
		});
		btY.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SystemY sy=new SystemY();

			}
		});
	}
}
