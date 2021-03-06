package productline;

abstract class EmpolyeeSystem {
	Employee[] employee_list; //所有員工列表
	Component[] worklist; //工作列表
	Employee[] result; //在崗位上的員工列表
	
	public EmpolyeeSystem(Employee[] employees) {
		this.employee_list = employees;

	}

	abstract public Employee[] assignWork(Component[] worklist);

	abstract public int[] startSimulator();

	public int findBestStrength() {
		int max = -1, maxStrength = 0;

		for (int i = 0; i < employee_list.length; i++) {
			if (employee_list[i].isWork()) {

			} else {
				if (maxStrength <= employee_list[i].getStrength()) {
					maxStrength = employee_list[i].getStrength();
					max = i;
				}

			}
		}
		return max;
	}

	public int findBestJob_score() {
		int max = -1, maxJob_score = 0;

		for (int i = 0; i < employee_list.length; i++) {
			if (employee_list[i].isWork()) {

			} else {
				if (maxJob_score <= employee_list[i].getJob_score()) {
					maxJob_score = employee_list[i].getJob_score();
					max = i;
				}
			}
		}
		return max;
	}

	public int findBestCarefulness() {
		int max = -1, maxCarefulness = 0;

		for (int i = 0; i < employee_list.length; i++) {
			if (employee_list[i].isWork()) {

			} else {
				if (maxCarefulness <= employee_list[i].getCarefulness()) {
					maxCarefulness = employee_list[i].getCarefulness();
					max = i;
				}
			}
		}
		return max;
	}
	
	public Employee[] changeEmpollyee(String man1,String man2){
		Employee temp;
		String positionTemp;
		int position_man1 = searchInTheList(result,man1);
		int position_man2 = searchInTheList(result,man2);
		System.out.println(position_man1);
		System.out.println(position_man2);
		
		if(position_man1 != -1 && position_man2 != -1){ //兩個皆在已分配崗位上的員工列表  O|O 
			positionTemp = result[position_man1].getPosition();
			result[position_man1].setPosition(result[position_man2].getPosition());
			result[position_man2].setPosition(positionTemp);
			
			temp = result[position_man1];
			result[position_man1] = result[position_man2];  		//將man1 變成了 man2
			result[position_man2] = temp;							//將man2 變成了 man1
			
			this.worklist = resetEffective(result,worklist);					//重設
			
		}else if(searchInTheList(result,man1) != -1) {								  //man1在已分配崗位上，man2不是  O|X，不需要互換
			position_man2 = searchInTheList(employee_list,man2);
			   positionTemp = result[position_man1].getPosition();
			   employee_list[position_man2].setPosition(positionTemp);
			   result[position_man1].setPosition(null);
			   result[position_man1] = employee_list[position_man2];
			   this.worklist = resetEffective(result,worklist);
			
		}else if(searchInTheList(result,man2) != -1) {								  //man2在已分配崗位上，man1不是  X|O，不需要互換
			position_man1 = searchInTheList(employee_list,man1);
			   positionTemp = result[position_man2].getPosition();
			   employee_list[position_man1].setPosition(positionTemp);
			   result[position_man2].setPosition(null);
			   result[position_man2] = employee_list[position_man1];
			   this.worklist = resetEffective(result,worklist);
			
		}else {																		  //兩個都不在已分配崗位上
			System.out.println("你為甚麼要做無意義的事情？");
			return result;
		}
		return result;
	}
	
	public int searchInTheList(Employee[] list,String man) {						  //用來判斷和找尋該人是在哪個列表的哪個位置
		int position = -1;
		
		for(int x = 0;x < list.length ; x++) {
			if(list[x].getName().equalsIgnoreCase(man)) {
				position = x;
				break;
			}
		}
		
		return position;
	}
	
	abstract public Component[] resetEffective(Employee[] result,Component[] worklist);  //重設該工作崗位上的效率值
		
		
	
}
