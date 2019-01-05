package productline;

import java.awt.Button;
import java.awt.Font;
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
	
	public Client() {
		this.setTitle("�Ͳ��u������");
		this.setSize(600, 300);
		this.setLayout(new GridLayout(2, 2));
		
		ImageIcon img1 = new ImageIcon("src/Image/shoes.jpg");
		this.add(new JLabel(img1));
		ImageIcon img2 = new ImageIcon("src/Image/car.jpg");
		this.add(new JLabel(img2));
		
		JButton btX = new JButton("�c�l");
		btX.setFont(new Font("Serif",Font.BOLD,15));
		this.add(btX);
		JButton btY = new JButton("�T��");
		btY.setFont(new Font("Serif",Font.BOLD,15));
		this.add(btY);
		this.setVisible(true);

		// �ƥ�Ĳ�o
		btX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new SystemX();
				
			}
		});
		btY.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new SystemY();
			}
		});
	}
}