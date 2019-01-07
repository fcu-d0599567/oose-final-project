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
		worklist[0] = part1;
		worklist[1] = part2;
		worklist[2] = part3;
		worklist[3] = part2;
		worklist[4] = part1;
	}

	public Component createUpper() {
		//�s�@�c��
		return new Upper();
	}

	public Component createOutsole() {
		//�s�@�c��
		return new Outsole();
	}

	public Component createLace() {
		//�s�@�c�a
		return new Lace();
	}
}

class Upper extends Component {
	//�c������
	public Upper() {
		condition = "Strength";
		position = "make Upper";
	}
}

class Outsole extends Component {
	//�c������
	public Outsole() {
		condition = "Job score";
		position = "make Outsole";
	}
}

class Lace extends Component {
	//�c�a����
	public Lace() {
		condition = "Carefulness";
		position = "make Lace";
	}
}