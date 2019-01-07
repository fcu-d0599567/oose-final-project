package productline;

class Productline_Y extends Productline{

	public Productline_Y(Employee[] employees) {
		super(employees);
		empolyeeSystem = new EmpolyeeSystem_Y(employees);
		
	}
	
	public void makeProduct() {
		worklist = new Component[5];
		Component part1 = createStamping();
		Component part2 = createWelding();
		Component part3 = createPainting();
		Component part4 = createTCF();
		Component part5 = createInspection();
		worklist[0] = part1;
		worklist[1] = part2;
		worklist[2] = part3;
		worklist[3] = part4;
		worklist[4] = part5;
	}

	public Component createStamping() {
		//�����u�{
		return new Stamping();
	}

	public Component createWelding() {
		//�k���u�{
		return new Welding();
	}

	public Component createPainting() {
		//��ˤu�{
		return new Painting();
	}
	
	public Component createTCF() {
		//TCF�u�{ (Trim Chassis Final)
		return new TCF();
	}
	
	public Component createInspection() {
		//�˴��u�{
		return new Inspection();
	}
}

class Stamping extends Component {
	//�����u�{����
	public Stamping() {
		condition = "Job score";
		position = "Stamping";
	}
}

class Welding extends Component {
	//�k���u�{����
	public Welding() {
		condition = "Strength";
		position = "Welding";
	}
}

class Painting extends Component {
	//��ˤu�{����
	public Painting() {
		condition = "Carefulness";
		position = "Painting";
	}
}

class TCF extends Component {
	//TCF�u�{����
	public TCF() {
		condition = "Strength";
		position = "TCF";
	}
}

class Inspection extends Component {
	//��ˤu�{����
	public Inspection() {
		condition = "Carefulness";
		position = "Inspection";
	}
}
