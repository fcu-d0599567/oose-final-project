package productline;

public class empolyeeSystem {
	employee[] employees;
	public empolyeeSystem(employee[] employees) {
		this.employees = employees;
		
	}

	public String makeStrength() {
		int max=0,maxStrength=0;
		for(int i=0;i<employees.length;i++) {
			if(maxStrength<=employees[i].getStrength()) {
				maxStrength = employees[i].getStrength();
				max= i;
			}
		}
		return employees[max].getName() + "can do this work. his Strength =" + employees[max].getStrength();
	}
	
	public String makeCarefuless() {
		int max=0,maxCarefuless=0;
		for(int i=0;i<employees.length;i++) {
			if(maxCarefuless<=employees[i].getCarefulness()) {
				maxCarefuless = employees[i].getCarefulness();
				max= i;
			}
		}
		return employees[max].getName() + "can do this work. his Carefulness =" + employees[max].getCarefulness();
	}
	
	public String makeJob_score() {
		int max=0,maxJob_score=0;
		for(int i=0;i<employees.length;i++) {
			if(maxJob_score<=employees[i].getJob_score()) {
				maxJob_score = employees[i].getJob_score();
				max= i;
			}
		}
		return employees[max].getName() + "can do this work. his Job_score =" + employees[max].getJob_score();
	}

}
