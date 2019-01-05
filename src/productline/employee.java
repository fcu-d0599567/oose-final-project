package productline;

public class employee {
	private String name;
	private int strength;
	private int job_score;
	private int carefulness;
	private int position=0;
	private boolean isWork=false;
	
	public employee(String name,int strength,int job_score,int carefuless) {
		this.name = name;
		this.strength = strength;
		this.job_score = job_score;
		this.carefulness = carefulness;
	}

	public String getName() {
		return name;
	}

	public int getStrength() {
		return strength;
	}


	public int getJob_score() {
		return job_score;
	}

	public int getCarefulness() {
		return carefulness;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public boolean isWork() {
		return isWork;
	}

	public void setWork(boolean isWork) {
		this.isWork = isWork;
	}
	
}