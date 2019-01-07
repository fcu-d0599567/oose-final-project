package productline;

class Productline{
	public Productline (){
		
	}
	
	
	interface AbstractFactory {
		  public AbstractPart1_Sample createShoesBody();
		}
	
	class Factory_Sample implements AbstractFactory {
		  public AbstractPart1_Sample createShoesBody() {
		    return new Part1();
		  }
		}
	
	abstract class AbstractPart1_Sample {
		  //零件 A 需要履行的功能
		  public abstract void mackPart1(); 
		}
	
	class Part1 extends AbstractPart1_Sample {
		  public void mackPart1() {
			// 系列A的實踐的方法
		  }
		  public String toString() {
			  return "Part1";
		  }
		}
	
}

class Productline_X extends Productline{
	interface AbstractFactory {
		  public AbstractPart1_Sample createShoesBody();
		  
		}
}
