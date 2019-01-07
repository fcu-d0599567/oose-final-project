package productline;

public class Employee {
	private String name;
	private int strength;
	private int job_score;
	private int carefulness;
	private String position = null;
	private boolean isWork = false;

	public Employee(String name, int strength, int job_score, int carefulness) {
		this.name = name;
		this.strength = strength;
		this.job_score = job_score;
		this.carefulness = carefulness;
	}

	public String getName() {
		return this.name;
	}

	public int getStrength() {
		return this.strength;
	}

	public int getJob_score() {
		return this.job_score;
	}

	public int getCarefulness() {
		return this.carefulness;
	}

	public String getPosition() {
		return this.position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public boolean isWork() {
		return this.isWork;
	}

	public void setWork(boolean isWork) {
		this.isWork = isWork;
	}
	
	public void reWork() {
		this.isWork=false;
	}

}