import java.util.Scanner;
class Employee{
	private String emp_name, designation;
	private float b_sal, g_sal, hra, da;
	private int emp_code;
	Scanner in = new Scanner(System.in);
	Employee(){
		emp_code = 101;
		emp_name = "nil";
		designation = "nil";
		b_sal= 40000.0f;
		g_sal= 40000.0f;
		hra= 0.0f;
		da= 0.0f;
	}
	void getData(){
		System.out.println("Enter Employee's Name:");
		emp_name = in.nextLine();

		System.out.println("Enter Employee code:");
		emp_code = in.nextInt();
		System.out.println("Enter Employee's Designation:");
		in.nextLine();
		designation = in.nextLine();
		System.out.println("Enter Basic Salary:");
		b_sal = in.nextFloat();
		System.out.println("Enter HRA:");
		hra = in.nextFloat();
		System.out.println("Enter Basic DA:");
		da = in.nextFloat();
	}
	void grossSalary(){
		System.out.println("Gross salary calculated succesfully!");
		g_sal = b_sal + hra + da;
	}
	void display(){
		System.out.println("Employee Name: " + emp_name);
		System.out.println("designation: " + designation);
		System.out.println("Employee Code: " + emp_code);
		System.out.println("Basic Salary: " + b_sal);
		System.out.println("HRA: " + hra + " DA: " + da);
		System.out.println("Gross Salary: " + g_sal);
	}
};
class test_employee{
	public static void main(String args[]){
		Employee E = new Employee();
		E.display();
		E.getData();
		E.grossSalary();
		E.display();
	}
}