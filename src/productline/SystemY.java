package productline;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SystemY extends JFrame{
	employee[] employees;
	employee[] result;
	int[] effect;
	Container cp;

//	public SystemY(employee[] employees) {
//		this.employees = employees;
//		this.setTitle("�T��������");
//		this.setSize(600, 300);
//		cp = this.getContentPane();
//		Panel panelBT = new Panel();
//		panelBT.setLayout(new GridLayout(2, 1));
//		JButton bt1 = new JButton("���t�u�@");
//		panelBT.add(bt1);
//		JButton bt2 = new JButton("����");
//		panelBT.add(bt2);
//		this.add(panelBT, BorderLayout.WEST);
//		//Productline_Y p = new Productline_Y(employees);
//		Object[][] showEmpolyee = new Object[employees.length][4];
//		for (int x = 0; x < employees.length; x++) {
//			showEmpolyee[x][0] = employees[x].getName();
//			showEmpolyee[x][1] = employees[x].getStrength();
//			showEmpolyee[x][2] = employees[x].getJob_score();
//			showEmpolyee[x][3] = employees[x].getCarefulness();
//		}
//		String[] columns = { "Name", "Strength", "Job score", "Carefulness" };
//		JTable jt = new JTable(showEmpolyee, columns);
//		jt.setPreferredScrollableViewportSize(new Dimension(400, 300));
//		cp.add(new JScrollPane(jt), BorderLayout.CENTER);
//
//		this.setVisible(true);
//
//		// �ƥ�Ĳ�o
//		bt1.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				JFrame assign = new JFrame();
//				assign.setTitle("�T��-�u�@�^��");
//				assign.setSize(300, 400);
//				cp = assign.getContentPane();
//				result = p.assignWork();
//				effect = p.startSimulator();
//				Object[][] assignEmpolyee = new Object[result.length][2];
//				for (int x = 0; x < result.length; x++) {
//					assignEmpolyee[x][0] = result[x].getName();
//					assignEmpolyee[x][1] = result[x].getPosition();
//				}
//				String[] columns = { "Name", "position" };
//				JTable jt = new JTable(assignEmpolyee, columns);
//				jt.setPreferredScrollableViewportSize(new Dimension(300, 200));
//				cp.add(new JScrollPane(jt),BorderLayout.NORTH);
//				
//				Panel panel=new Panel();
//				JTextField tprevious = new JTextField(10);
//				tprevious.setText("�������u�W");
//				JTextField tnew = new JTextField(10);
//				tnew.setText("�������u�W");
//				JLabel label = new JLabel();
//				label.setText("��");
//				panel.add(tprevious);
//				panel.add(label);
//				panel.add(tnew);
//				cp.add(panel,BorderLayout.CENTER);
//				JButton btChange = new JButton("�󴫭��u");
//				cp.add(btChange,BorderLayout.SOUTH);
//				for(int z=0;z<employees.length;z++) {
//					employees[z].reWork();
//				}
//				assign.setVisible(true);
//				
//				btChange.addActionListener(new ActionListener() {
//					public void actionPerformed(ActionEvent e) {
//						String previous = tprevious.getText();
//						int previousNum=-1;
//						for(int x=0;x<result.length;x++) {
//							if(previous.equalsIgnoreCase(result[x].getName())) {
//								previousNum = x;
//								break;
//							}
//						}
//						String change = tnew.getText();
//						int changeNum=-1;
//						for(int y= 0;y<employees.length;y++) {
//							if(change.equalsIgnoreCase(employees[y].getName())) {
//								changeNum = y;
//								break;
//							}
//						}
//						employees[changeNum].setPosition(result[previousNum].getPosition());
//						result[previousNum].setPosition(null);
//						result[previousNum]=employees[changeNum];
//						if(previousNum==0||previousNum==4) {
//							effect[previousNum] = result[previousNum].getStrength();
//						}else if(previousNum==1||previousNum==3) {
//							effect[previousNum] = result[previousNum].getJob_score();
//						}else if(previousNum==2) {
//							effect[previousNum] = result[previousNum].getCarefulness();
//						}else{
//							System.out.println("������m");
//						}
//						
//						JFrame jchange = new JFrame();
//						jchange.setTitle("�T��-�u�@�^��");
//						jchange.setSize(300, 400);
//						Container cp1 = jchange.getContentPane();
//						for (int x = 0; x < result.length; x++) {
//							assignEmpolyee[x][0] = result[x].getName();
//							assignEmpolyee[x][1] = result[x].getPosition();
//						}
//						String[] columns = { "Name", "position" };
//						JTable jt1 = new JTable(assignEmpolyee, columns);
//						jt1.setPreferredScrollableViewportSize(new Dimension(300, 200));
//						cp1.add(new JScrollPane(jt1),BorderLayout.NORTH);
//						for(int z=0;z<employees.length;z++) {
//							employees[z].reWork();
//						}
//						jchange.setVisible(true);
//					}
//				});
//			}
//		});
//		
//		bt2.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				int x=0;
//				JFrame mod = new JFrame();
//				mod .setTitle("�T��-�u�@�^��");
//				mod .setSize(300, 300);
//				cp = mod.getContentPane();
//				Object[][] effectEmpolyee = new Object[result.length+1][2];
//				for (x = 0; x < result.length; x++) {
//					effectEmpolyee[x][0] = result[x].getName();
//					effectEmpolyee[x][1] = effect[x];
//				}
//				effectEmpolyee[x][0] = "���q�G�u���@�ӭn�X�ѡv";
//				effectEmpolyee[x][1] = effect[x];
//				String[] columns = { "Name", "Effect" };
//				JTable jt = new JTable(effectEmpolyee, columns);
//				jt.setPreferredScrollableViewportSize(new Dimension(300, 300));
//				cp.add(new JScrollPane(jt));
//				mod.setVisible(true);
//			}
//		});
//	}
}