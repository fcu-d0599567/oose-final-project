package productline;

public class EmpolyeeSystem_Y extends EmpolyeeSystem{

	public EmpolyeeSystem_Y(Employee[] employees) {
		super(employees);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Employee[] assingWork(Component[] worklist) {
		Employee[] result = new Employee[5];
		int ID;
		for (int x = 0; x < worklist.length; x++) {
			ID = 99;
			System.out.println(x +" "+ worklist[x].getCondition()+ " " +worklist[x].getPosition());
			if (worklist[x].getCondition().equals("Strength")) {
				ID = findBestStrength();
				worklist[x].setEffective(6 - employee_list[ID].getStrength());
				
			} else if (worklist[x].getCondition().equals("Job score")) {
				ID = findBestJob_score();
				worklist[x].setEffective(6 - employee_list[ID].getJob_score());
			} else if (worklist[x].getCondition().equals("Carefulness")) {
				ID = findBestCarefulness();
				worklist[x].setEffective(6 - employee_list[ID].getCarefulness());
			}
			
			if (ID == 99) {
				System.out.println("人數不足.");
				return result;
			}
			
			employee_list[ID].setPosition(worklist[x].getPosition());
			employee_list[ID].setWork(true);
			result[x] = employee_list[ID];
			
		}
		this.worklist = worklist;
		return result;
	}

	@Override
	public int[] startSimulator() {
		int finalProductCount = -1;
		int[] productCount = new int[6];

		for (int x = 0; x < worklist.length; x++) {
			if (worklist[x].getEffective() > finalProductCount) {
				finalProductCount = worklist[x].getEffective();
			}
			productCount[x] = worklist[x].getEffective();

		}
		productCount[worklist.length] = finalProductCount;
		return productCount;
	}
	
	public void resetEffective(int position,Employee man) {  							//重設該工作崗位上的效率值(此為Y系統，效率值算法不一樣)
		if (worklist[position].getCondition().equals("Strength")) {
			worklist[position].setEffective(6 - man.getStrength());
			
		} else if (worklist[position].getCondition().equals("Job score")) {
			worklist[position].setEffective(6 - man.getJob_score());
			
		} else if (worklist[position].getCondition().equals("Carefulness")) {
			worklist[position].setEffective(6 - man.getCarefulness());
		}
	}
}
