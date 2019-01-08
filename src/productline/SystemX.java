package productline;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SystemX extends JFrame {
	Employee[] Employees;
	Employee[] result;
	int[] effect;
	Container cp;

	public SystemX(Employee[] employees) {
		this.Employees = employees;
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
		Productline_X p = new Productline_X(employees);
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
			public void actionPerformed(ActionEvent e) {
				JFrame assign = new JFrame();
				assign.setTitle("鞋子-工作崗位");
				assign.setSize(300, 400);
				cp = assign.getContentPane();
				result = p.assignWork();
				effect = p.startSimulator();
				Object[][] assignEmpolyee = new Object[result.length][2];
				for (int x = 0; x < result.length; x++) {
					assignEmpolyee[x][0] = result[x].getName();
					assignEmpolyee[x][1] = result[x].getPosition();
				}
				String[] columns = { "Name", "position" };
				JTable jt = new JTable(assignEmpolyee, columns);
				jt.setPreferredScrollableViewportSize(new Dimension(300, 200));
				cp.add(new JScrollPane(jt),BorderLayout.NORTH);
				
				Panel panel=new Panel();
				JTextField tprevious = new JTextField(10);
				tprevious.setText("欲換員工名");
				JTextField tnew = new JTextField(10);
				tnew.setText("替換員工名");
				JLabel label = new JLabel();
				label.setText("→");
				panel.add(tprevious);
				panel.add(label);
				panel.add(tnew);
				cp.add(panel,BorderLayout.CENTER);
				JButton btChange = new JButton("更換員工");
				cp.add(btChange,BorderLayout.SOUTH);
				for(int z=0;z<employees.length;z++) {
					employees[z].reWork();
				}
				assign.setVisible(true);
				
				btChange.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String previous = tprevious.getText();
						String change = tnew.getText();
						p.changeEmpollyee(previous,change);
						
						JFrame jchange = new JFrame();
						jchange.setTitle("鞋子-工作崗位");
						jchange.setSize(300, 400);
						Container cp1 = jchange.getContentPane();
						for (int x = 0; x < result.length; x++) {
							assignEmpolyee[x][0] = result[x].getName();
							assignEmpolyee[x][1] = result[x].getPosition();
						}
						String[] columns = { "Name", "position" };
						JTable jt1 = new JTable(assignEmpolyee, columns);
						jt1.setPreferredScrollableViewportSize(new Dimension(300, 200));
						cp1.add(new JScrollPane(jt1),BorderLayout.NORTH);
						for(int z=0;z<employees.length;z++) {
							employees[z].reWork();
						}
						jchange.setVisible(true);
					}
				});
			}
		});
		
		
//		我寫了交換員工的方法惹  宣告成這樣 public Employee[] changeEmpollyee(String man1,String man2)
//		意思是你只要給我兩個人的名字，無論有沒有在工作崗位裡面，沒錯！ 無論有沒有在裡面我都可以交換他們！！
//		然後你寫的其實有個漏洞，你沒改到EmpolyeeSystem裡面的Effective 所以模擬出來的結果還是一樣的，但是我也解決惹。  
		
		
		bt2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int x=0;
				JFrame mod = new JFrame();
				mod .setTitle("鞋子-工作崗位");
				mod .setSize(300, 300);
				cp = mod.getContentPane();
				Object[][] effectEmpolyee = new Object[result.length+1][2];
				for (x = 0; x < result.length; x++) {
					effectEmpolyee[x][0] = result[x].getName();
					effectEmpolyee[x][1] = effect[x];
				}
				effectEmpolyee[x][0] = "產量「每五天為一週期」";
				effectEmpolyee[x][1] = effect[x];
				String[] columns = { "Name", "Effect" };
				JTable jt = new JTable(effectEmpolyee, columns);
				jt.setPreferredScrollableViewportSize(new Dimension(300, 300));
				cp.add(new JScrollPane(jt));
				mod.setVisible(true);
			}
		});
	}
}