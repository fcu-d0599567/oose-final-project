package productline;

import productline.Productline.AbstractPart;

public class empolyeeSystem {
	employee[] employees;
	AbstractPart[] chain;
	public empolyeeSystem(employee[] employees) {
		this.employees = employees;
		
	}
	
	public employee[] assingWork(AbstractPart[] chain) {
		employee[] result = new employee[5];
		int employee_ID;
		for(int x = 0; x < chain.length; x++) {
			employee_ID = 99;
			
			if(chain[x].getCondition().equals("Strength")) {
				employee_ID = makeStrength();
				employees[employee_ID].setPosition(chain[x].position);
				employees[employee_ID].setWork(true);
				chain[x].setEffective(employees[employee_ID].getStrength());
				result[x] = employees[employee_ID];
			}else if(chain[x].getCondition().equals("Job score")) {
				employee_ID = makeJob_score();
				employees[employee_ID].setPosition(chain[x].position);
				employees[employee_ID].setWork(true);
				chain[x].setEffective(employees[employee_ID].getJob_score());
				result[x] = employees[employee_ID];
			}else if(chain[x].getCondition().equals("Carefulness")) {
				employee_ID = makeCarefulness();
				employees[employee_ID].setPosition(chain[x].position);
				employees[employee_ID].setWork(true);
				chain[x].setEffective(employees[employee_ID].getCarefulness());
				result[x] = employees[employee_ID];
			}
			
			if(employee_ID == 99) {
				System.out.println("¤H¼Æ¤£¨¬.");
			}
		}
		this.chain = chain;
		return result;
	}
	
	public int[] startSimulator() {
		int finalProductCount = 123456789;
		int[] productCount = new int[6];
		
		for(int x=0; x < chain.length; x++) {
			if(chain[x].getEffective() < finalProductCount) {
				finalProductCount = chain[x].getEffective();
			}
			productCount[x] = chain[x].getEffective();
			
		}
		productCount[chain.length] = finalProductCount;
		return productCount;
	}
	
	public int makeStrength() {
		int max=-1,maxStrength=0;
		
		for(int i=0;i<employees.length;i++) {
			if(employees[i].isWork()) {
				
			}else {
				if(maxStrength<=employees[i].getStrength()) {
				maxStrength = employees[i].getStrength();
				max= i;
				}
				
			}
		}
		return max;
	}
	
	public int makeJob_score() {
		int max=-1,maxJob_score=0;
		
		for(int i=0;i<employees.length;i++) {
			if(employees[i].isWork()) {
				
			}else {
				if(maxJob_score<=employees[i].getJob_score()) {
				maxJob_score = employees[i].getJob_score();
				max= i;
				}
			}
		}
		return max;
	}
	
	public int makeCarefulness() {
		int max=-1,maxCarefulness=0;
		
		for(int i=0;i<employees.length;i++) {
			if(employees[i].isWork()) {
				
			}else {
				if(maxCarefulness<=employees[i].getCarefulness()) {
				maxCarefulness = employees[i].getCarefulness();
				max= i;
				}
			}
		}
		return max;
	}

}
