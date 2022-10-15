package ec.edu.espol.workshops;

public class Cliente {
	
	private int age;
	private Sex sex;
	private MaritalStatus maritalStatus;
	
	/**
	 * 
	 */
	public Cliente(){}
	
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
	
	public int getEdad() {
		return this.age;
	}
	public Sex getSexo() {
		return this.sex;
	}
	public MaritalStatus getMaritalStatus() {
		return this.maritalStatus;
	}

	public void setAge(int age) {
		this.age=age;
	}
	public void setSexo(Sex sex) {
		this.sex=sex;
	}
	public void setEstadoCivil(MaritalStatus maritalStatus) {
		this.maritalStatus=maritalStatus;
	}
	
public int calculate(int result, int base) {
		
		if (this.getSexo().equals(Sex.Male) && this.getEdad()<25 && !this.getMaritalStatus().equals(MaritalStatus.single) ) {
			result = base+ 1500;
		}
		
		if (this.getSexo().equals(Sex.Female) || this.getMaritalStatus().equals(MaritalStatus.married )) {
			result = base - 200;
		}
		if ( this.getEdad()>45 && this.getEdad()<65 ) {
			result = base - 100;
		}
		
		if (  this.getEdad()>80 ) {
			result = -1;
		} 
		
		return result;
	}

	@Override
	public String toString() {
		return  " with age " + age + " ages, sex " + sex + " and marital status " + maritalStatus + ".";
	}
}