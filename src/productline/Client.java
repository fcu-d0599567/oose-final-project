package productline;

import java.awt.Button;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Client extends JFrame {

	public static void main(String[] args) {
		Employee[] employees = new Employee[8];
		employees[0] = new Employee("John", 5, 1, 2);
		employees[1] = new Employee("Henk", 4, 2, 1);
		employees[2] = new Employee("Peggy", 3, 3, 3);
		employees[3] = new Employee("Crasandra", 2, 4, 5);
		employees[4] = new Employee("Tina", 1, 5, 4);
		employees[5] = new Employee("Willy", 4, 3, 4);
		employees[6] = new Employee("Emily", 1, 1, 1);
		employees[7] = new Employee("Alice", 2, 5, 3);

		new Client(employees);

	}

	public Client(Employee[] employees) {
		this.setTitle("生產線模擬器");
		this.setSize(600, 300);
		this.setLayout(new GridLayout(2, 2));

		ImageIcon img1 = new ImageIcon("src/Image/shoes.jpg");
		this.add(new JLabel(img1));
		ImageIcon img2 = new ImageIcon("src/Image/car.jpg");
		this.add(new JLabel(img2));

		JButton btX = new JButton("鞋子");
		btX.setFont(new Font("Serif", Font.BOLD, 15));
		this.add(btX);
		JButton btY = new JButton("汽車");
		btY.setFont(new Font("Serif", Font.BOLD, 15));
		this.add(btY);
		this.setVisible(true);

		// 事件觸發
		btX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new SystemX(employees);
			}
		});
		btY.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new SystemY(employees);
			}
		});
	}
}