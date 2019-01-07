package productline;

abstract class EmpolyeeSystem {
	Employee[] employee_list; //�Ҧ����u�C��
	Component[] worklist; //�u�@�C��
	Employee[] result; //�b�^��W�����u�C��
	
	public EmpolyeeSystem(Employee[] employees) {
		this.employee_list = employees;

	}

	abstract public Employee[] assingWork(Component[] worklist);

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
		int position_man1 = searchInTheList(result,man1);
		int position_man2 = searchInTheList(result,man2);
		
		if(position_man1 != -1 && position_man2 != -1){ //��ӬҦb�w���t�^��W�����u�C��  O|O 
			temp = result[position_man1];
			
			result[position_man1] = result[position_man2];  		//�Nman1 �ܦ��F man2
			resetEffective(position_man1,result[position_man2]); 	//���]���ܫ᪺ man1����
			
			result[position_man2] = temp;							//�Nman2 �ܦ��F man1
			resetEffective(position_man2,temp);						//���]�ܧ�᪺man2����
			
			
		}else if(searchInTheList(result,man1) != -1) {								  //man1�b�w���t�^��W�Aman2���O  O|X�A���ݭn����
			result[position_man1] = employee_list[position_man2];
			resetEffective(position_man1,employee_list[position_man2]);
			
		}else if(searchInTheList(result,man2) != -1) {								  //man2�b�w���t�^��W�Aman1���O  X|O�A���ݭn����
			result[position_man2] = employee_list[position_man1];
			resetEffective(position_man2,employee_list[position_man1]);
			
		}else {																		  //��ӳ����b�w���t�^��W
			System.out.println("�A���ƻ�n���L�N�q���Ʊ��H");
			return result;
		}
		return null;
	}
	
	public int searchInTheList(Employee[] list,String man) {						  //�ΨӧP�_�M��M�ӤH�O�b���ӦC�����Ӧ�m
		int position = -1;
		
		for(int x = 0;x < list.length ; x++) {
			if(list[x].getName().equals(man)) {
				position = x;
				break;
			}
		}
		
		return position;
	}
	
	public void resetEffective(int position,Employee man) {  							//���]�Ӥu�@�^��W���Ĳv��
		if (worklist[position].getCondition().equals("Strength")) {
			worklist[position].setEffective(man.getStrength());
			
		} else if (worklist[position].getCondition().equals("Job score")) {
			worklist[position].setEffective(man.getJob_score());
			
		} else if (worklist[position].getCondition().equals("Carefulness")) {
			worklist[position].setEffective(man.getCarefulness());
		}
	}
}
