package productline;

abstract class Productline {
	empolyeeSystem empolyeeSystem;
	AbstractPart[] chain;
	
	public Productline(employee[] employees) {
		empolyeeSystem = new empolyeeSystem(employees);

		makeProduct();

	}
	
	public employee[] assignWork() {
		return empolyeeSystem.assingWork(chain);
	}

	public int[] startSimulator() {
		return empolyeeSystem.startSimulator();
	}
	
	abstract void makeProduct();
}

interface AbstractFactory {
	public AbstractPart createPart1();

	public AbstractPart createPart2();
}

class AbstractPart {
	protected String condition = "papa";
	protected String position = "papa";
	protected int effective;

	public void setEffective(int effective) {
		this.effective = effective;
	}

	public int getEffective() {
		return effective;
	}

	public String getCondition() {
		return condition;
	}

	public String getPosition() {
		return position;
	}
}