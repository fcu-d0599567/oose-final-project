package productline;

import java.awt.Button;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SystemX  extends JFrame{
	public SystemX() {
		this.setLayout(new GridLayout(0, 2));
		this.setTitle("生產線模擬器");
		JButton btX = new JButton("X 系統");
		JButton btY = new JButton("Y 系統");
		this.add(btX);
		this.add(btY);
		this.setSize(300, 200);
		this.setVisible(true);

		// 事件觸發
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
