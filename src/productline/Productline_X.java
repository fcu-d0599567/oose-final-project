package productline;

class Productline_X extends Productline implements AbstractFactory{

	public Productline_X(employee[] employees) {
		super(employees);
		// TODO Auto-generated constructor stub
	}
	
	public void makeProduct() {
		System.out.println("PAPA");
		chain = new AbstractPart[5];
		AbstractPart part1 = createPart1();
		AbstractPart part2 = createPart2();
		AbstractPart part3 = createPart3();
		chain[0] = part1;
		chain[1] = part2;
		chain[2] = part3;
		chain[3] = part2;
		chain[4] = part1;
		
	}

	@Override
	public AbstractPart createPart1() {
		// TODO Auto-generated method stub
		return new Part1();
	}

	@Override
	public AbstractPart createPart2() {
		// TODO Auto-generated method stub
		return new Part2();
	}

	public AbstractPart createPart3() {
		// TODO Auto-generated method stub
		return new Part3();
	}
	
}

class Part1 extends AbstractPart {

	public Part1() {
		condition = "Strength";
		position = "base";
	}

	public void mackPart1() {
		// 系列A的實踐的方法
	}

}

class Part2 extends AbstractPart {

	public Part2() {
		condition = "Job score";
		position = "top";
	}

	public void mackPart2() {
		// 系列A的實踐的方法
	}
}

class Part3 extends AbstractPart {

	public Part3() {
		condition = "Carefulness";
		position = "data";
	}

	public void mackPart3() {
		// 系列A的實踐的方法
	}
}