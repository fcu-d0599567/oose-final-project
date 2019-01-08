package productline;

abstract class Productline{
	EmpolyeeSystem empolyeeSystem;
	Component[] worklist;
	
	public Productline(Employee[] employees) {
		makeProduct();

	}
	abstract void makeProduct();
	
	public Employee[] assignWork() {
		return empolyeeSystem.assignWork(worklist);
	}

	public int[] startSimulator() {
		return empolyeeSystem.startSimulator();
	}
	
	public Employee[] changeEmpollyee(String man1,String man2) {
		return empolyeeSystem.changeEmpollyee(man1,man2);
	}
}

class Component {
	protected String condition = "Sample";
	protected String position = "Sample";
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