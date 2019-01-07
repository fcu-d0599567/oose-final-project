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
		//衝壓工程
		return new Stamping();
	}

	public Component createWelding() {
		//焊接工程
		return new Welding();
	}

	public Component createPainting() {
		//塗裝工程
		return new Painting();
	}
	
	public Component createTCF() {
		//TCF工程 (Trim Chassis Final)
		return new TCF();
	}
	
	public Component createInspection() {
		//檢測工程
		return new Inspection();
	}
}

class Stamping extends Component {
	//衝壓工程實體
	public Stamping() {
		condition = "Job score";
		position = "Stamping";
	}
}

class Welding extends Component {
	//焊接工程實體
	public Welding() {
		condition = "Strength";
		position = "Welding";
	}
}

class Painting extends Component {
	//塗裝工程實體
	public Painting() {
		condition = "Carefulness";
		position = "Painting";
	}
}

class TCF extends Component {
	//TCF工程實體
	public TCF() {
		condition = "Strength";
		position = "TCF";
	}
}

class Inspection extends Component {
	//塗裝工程實體
	public Inspection() {
		condition = "Carefulness";
		position = "Inspection";
	}
}
