package productline;

class Productline_X extends Productline{

	public Productline_X(Employee[] employees) {
		super(employees);
		empolyeeSystem = new EmpolyeeSystem_X(employees);
		
	}
	
	public void makeProduct() {
		worklist = new Component[5];
		Component part1 = createUpper();
		Component part2 = createOutsole();
		Component part3 = createLace();
		Component part4 = createOutsole();
		Component part5 = createLace();
		worklist[0] = part1;
		worklist[1] = part2;
		worklist[2] = part3;
		worklist[3] = part4;
		worklist[4] = part5;
	}

	public Component createUpper() {
		//製作鞋面
		return new Upper();
	}

	public Component createOutsole() {
		//製作鞋底
		return new Outsole();
	}

	public Component createLace() {
		//製作鞋帶
		return new Lace();
	}
}

class Upper extends Component {
	//鞋面實體
	public Upper() {
		condition = "Strength";
		position = "make Upper";
	}
}

class Outsole extends Component {
	//鞋底實體
	public Outsole() {
		condition = "Job score";
		position = "make Outsole";
	}
}

class Lace extends Component {
	//鞋帶實體
	public Lace() {
		condition = "Carefulness";
		position = "make Lace";
	}
}