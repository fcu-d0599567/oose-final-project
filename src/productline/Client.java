package productline;

import java.awt.Button;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Client extends JFrame{
	
	public static void main(String[] args) {
		employee[] employees = new employee[5];
		employees[0] = new employee("John", 5, 1, 2);
		employees[1] = new employee("Henk", 4, 2, 1);
		employees[2] = new employee("Peggy", 3, 3, 3);
		employees[3] = new employee("Crasandra", 2, 4, 5);
		employees[4] = new employee("Tina", 1, 5, 4);
		
		new Client();
	}
	
	
	//客戶端介面
	public Client() {
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
				new SystemX();
				this.setVisible(true);
				
			}
		});
		btY.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new SystemY();
				this.setVisible(true);
			}
		});
	}
}