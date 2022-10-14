package ec.edu.espol.workshops;
import java.util.Scanner;
public class CarInsurance {
	
	int age;
	double km;
	String maritalStatus;
	char sex;
	static int base = 500;
	int result = 0;
	
	
	public void getData(){
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese edad:");
		this.age=Integer.parseInt(maritalStatus.nextLine());
	}
	
	
	public int calculate() {
		
		if (this.sex=='M' && this.age<25 && !this.maritalStatus.equals("married") ) {
			this.result = base+ 1500;
		}
		
		if (this.sex=='F' || this.maritalStatus.equals("married") ) {
			this.result = base - 200;
		}
		if ( this.age>45 && this.age<65 ) {
			this.result = base - 100;
		}
		
		if (  this.age>80 ) {
			this.result = -1;
		} 
		
		return this.result;
	}
	
}
