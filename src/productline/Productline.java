package productline;

public class Productline{
	empolyeeSystem empolyeeSystem;
	Simulator s;
	Factory_Sample Factory_Sample;
	AbstractPart[] chain;
	
	public Productline (employee[] employees){
		s = new Simulator();
		empolyeeSystem = new empolyeeSystem(employees);
		Factory_Sample = new Factory_Sample();
		
		s.makeProduct(Factory_Sample);
	}
	
	public class Simulator {
		void makeProduct(AbstractFactory f){
			chain = new AbstractPart[5];
			AbstractPart1_Sample part1  = f.createPart1();
			AbstractPart2_Sample part2  = f.createPart2();
			chain[0] = part1;
			chain[1] = part2;
			chain[2] = part1;
			chain[3] = part2;
			chain[4] = part1;
			
			System.out.println("There is Productline.");
		}
	}
	
	interface AbstractFactory {
		  public AbstractPart1_Sample createPart1();
		  public AbstractPart2_Sample createPart2();
	}
	
	class Factory_Sample implements AbstractFactory {
		  public AbstractPart1_Sample createPart1() {
		    return new Part1();
		  }
		  public AbstractPart2_Sample createPart2() {
			    return new Part2();
			  }
	}
	
	class AbstractPart{
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
	
	
	abstract class AbstractPart1_Sample extends AbstractPart {
		  //零件 A 需要履行的功能
		  public abstract void mackPart1();
		  
	}
	
	class Part1 extends AbstractPart1_Sample {
		
		public Part1() {
			condition = "Strength";
			position = "base";
		}
		
		  public void mackPart1() {
			// 系列A的實踐的方法
		  }
		  
	}
	
	abstract class AbstractPart2_Sample extends AbstractPart {
		  //零件 A 需要履行的功能
		  public abstract void mackPart2();
		  
	}
	
	class Part2 extends AbstractPart2_Sample {
		
		public Part2() {
			condition = "Job score";
			position = "top";
		}
		
		  public void mackPart2() {
			// 系列A的實踐的方法
		  }
		  
	}
	
	
	
	public employee[] assignWork() {
		return empolyeeSystem.assingWork(chain);
	}
	
	public int[] startSimulator() {
		return empolyeeSystem.startSimulator();
	}
}

class Productline_X extends Productline{

	public Productline_X(employee[] employees) {
		super(employees);
		// TODO Auto-generated constructor stub
		
		
	}
	
	
	public class Simulator {
		void makeProduct(AbstractFactory f){
			chain = new AbstractPart[5];
			AbstractPart1_Sample part1  = f.createPart1();
			AbstractPart2_Sample part2  = f.createPart2();
			AbstractPart3_Sample part3  = f.createPart3();
			chain[0] = part1;
			chain[1] = part2;
			chain[2] = part3;
			chain[3] = part2;
			chain[4] = part1;
			
			System.out.println("There is Productline_X.");
			
		}
	}
	
	interface AbstractFactory {
		  public AbstractPart1_Sample createPart1();
		  public AbstractPart2_Sample createPart2();
		  public AbstractPart3_Sample createPart3();
	}
	
	class Factory_Sample implements AbstractFactory {
		  public AbstractPart1_Sample createPart1() {
		    return new Part1();
		  }
		  public AbstractPart2_Sample createPart2() {
			    return new Part2();
		  }
		  public AbstractPart3_Sample createPart3() {
			    return new Part3();
		  }
	}
	
	abstract class AbstractPart3_Sample extends AbstractPart {
		  //零件 A 需要履行的功能
		  public abstract void mackPart3();
		  
	}
	
	class Part3 extends AbstractPart3_Sample {
		
		public Part3() {
			condition = "Carefulness";
			position = "data";
		}
		
		  public void mackPart3() {
			// 系列A的實踐的方法
		  }
		  
	}
	
	
}
