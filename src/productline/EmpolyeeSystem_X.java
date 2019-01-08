package productline;

public class EmpolyeeSystem_X extends EmpolyeeSystem{

	public EmpolyeeSystem_X(Employee[] employees) {
		super(employees);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Employee[] assignWork(Component[] worklist) {
		Employee[] result = new Employee[5];
		int ID;
		for (int x = 0; x < worklist.length; x++) {
			ID = 99;
			System.out.println(x +" "+ worklist[x].getCondition()+ " " +worklist[x].getPosition());
			if (worklist[x].getCondition().equals("Strength")) {
				ID = findBestStrength();
				worklist[x].setEffective(employee_list[ID].getStrength());
				
			} else if (worklist[x].getCondition().equals("Job score")) {
				ID = findBestJob_score();
				worklist[x].setEffective(employee_list[ID].getJob_score());
			} else if (worklist[x].getCondition().equals("Carefulness")) {
				ID = findBestCarefulness();
				worklist[x].setEffective(employee_list[ID].getCarefulness());
			}
			
			if (ID == 99) {
				System.out.println("¤H¼Æ¤£¨¬.");
				return result;
			}
			
			employee_list[ID].setPosition(worklist[x].getPosition());
			employee_list[ID].setWork(true);
			result[x] = employee_list[ID];
			
		}
		this.worklist = worklist;
		this.result = result;
		return result;
	}

	@Override
	public int[] startSimulator() {
		int finalProductCount = 123456789;
		int day = 5 ;
		int[] productCount = new int[6];
		for (int x = 0; x < worklist.length; x++) {
			if (worklist[x].getEffective() < finalProductCount) {
				finalProductCount = worklist[x].getEffective();
			}
			productCount[x] = day * worklist[x].getEffective();
		}
		productCount[worklist.length] = day * finalProductCount;
		return productCount;
	}

	@Override
	public Component[] resetEffective(Employee[] result, Component[] worklist) {
		for(int x = 0;x < worklist.length ; x++) {
			
			if (worklist[x].getCondition().equals("Strength")) {
				worklist[x].setEffective(result[x].getStrength());
			} else if (worklist[x].getCondition().equals("Job score")) {
				worklist[x].setEffective(result[x].getJob_score());
			} else if (worklist[x].getCondition().equals("Carefulness")) {
				worklist[x].setEffective(result[x].getCarefulness());
			}	
		}
		return worklist;
	}

}
