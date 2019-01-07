package productline;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SystemX extends JFrame {
	employee[] employees;
	Container cp;

	public SystemX(employee[] employees) {
		empolyeeSystem empolyeeSystem = new empolyeeSystem(employees);
		this.setTitle("鞋子模擬器");
		this.setSize(600, 300);
		cp = this.getContentPane();
		Panel panelBT = new Panel();
		panelBT.setLayout(new GridLayout(2, 1));
		JButton bt1 = new JButton("分配工作");
		panelBT.add(bt1);
		JButton bt2 = new JButton("模擬");
		panelBT.add(bt2);
		this.add(panelBT, BorderLayout.WEST);

		Object[][] showEmpolyee = new Object[employees.length][4];
		for (int x = 0; x < employees.length; x++) {
			showEmpolyee[x][0] = employees[x].getName();
			showEmpolyee[x][1] = employees[x].getStrength();
			showEmpolyee[x][2] = employees[x].getJob_score();
			showEmpolyee[x][3] = employees[x].getCarefulness();
		}
		String[] columns = { "Name", "Strength", "Job score", "Carefulness" };
		JTable jt = new JTable(showEmpolyee, columns);
		jt.setPreferredScrollableViewportSize(new Dimension(400, 300));
		cp.add(new JScrollPane(jt), BorderLayout.CENTER);

		this.setVisible(true);

		// 事件觸發
		bt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {/*
				JFrame assign = new JFrame();
				assign.setTitle("鞋子-工作崗位");
				assign.setSize(300, 300);
				cp = assign.getContentPane();
				employee result[] = assignWork();
				Object[][] assignEmpolyee = new Object[result.length][2];
				for (int x = 0; x < result.length; x++) {
					assignEmpolyee[x][0] = result[x].getName();
					assignEmpolyee[x][1] = result[x].getPosition();
				}
				String[] columns = { "Name", "position" };
				JTable jt = new JTable(assignEmpolyee, columns);
				jt.setPreferredScrollableViewportSize(new Dimension(300, 300));
				cp.add(new JScrollPane(jt));
				assign.setVisible(true);*/
			}
		});
		bt2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
	}
}
