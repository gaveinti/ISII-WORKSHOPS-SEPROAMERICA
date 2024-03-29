package ec.edu.espol.workshops;

public class Cliente {
	
	private  int age;
	private  Sex sex;
	private  MaritalStatus maritalStatus;
	
	//Default constructor
	public Cliente(){}
	
	//Object constructor
	public Cliente(Cliente cliente) {
		this.age= cliente.age;
		this.sex= cliente.sex;
		this.maritalStatus= cliente.maritalStatus;
	  }
	
	public Cliente(int age , Sex sex , MaritalStatus status)
	{
		this.age=age;
		this.sex=sex;
		this.maritalStatus=status;
	}
	//
	public int getEdad() {
		return this.age;
	}
	public Sex getSexo() {
		return this.sex;
	}
	public MaritalStatus getMaritalStatus() {
		return this.maritalStatus;
	}
/*
 * setter 
 * @autor Bryan Loor
*/
	public void setAge(int age) {
		this.age=age;
	}
	public void setSexo(Sex sex) {
		this.sex=sex;
	}
public void setEstadoCivil (MaritalStatus maritalStatus) {
		this.maritalStatus=maritalStatus;
	}
	
	public int calculate(int result, int base) {
		result=base;
		
		if (this.getMaritalStatus().equals(MaritalStatus.married ) && this.getEdad()>30 && this.getEdad()<60) {
			result -= 100;
			System.out.println("opcion 1");
		}
		
		if (this.getMaritalStatus().equals(MaritalStatus.single) && this.getSexo().equals(Sex.Female) && this.getEdad()>60) {
			result -= 50;
			System.out.println("opcion 2");
		}
		
		if (this.getSexo().equals(Sex.Male) && this.getEdad()<25 && this.getMaritalStatus().equals(MaritalStatus.single) ) {
			result += 1500;
			System.out.println("opcion 3");
		}
		
		if (this.getSexo().equals(Sex.Female) || this.getMaritalStatus().equals(MaritalStatus.married )) {
			result -= 200;
			System.out.println("opcion 4");
		}
		if ( this.getEdad()>=45 && this.getEdad()<65 ) {
			result -= 100;
			System.out.println("opcion 5");
		}
		
		if (this.getEdad()>80 || this.getEdad()<=0 || this.getEdad()<18 ) {
			result = -1;
			System.out.println("opcion 6");
		} 
		
		return result;
	}

	@Override
	public String toString() {
		return  " with age " + age + " ages, sex " + sex + " and marital status " + maritalStatus + ".";
	}
}