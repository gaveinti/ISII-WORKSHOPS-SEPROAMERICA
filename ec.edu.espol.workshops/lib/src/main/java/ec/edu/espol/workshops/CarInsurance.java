package ec.edu.espol.workshops;
import java.util.Scanner;
public class CarInsurance {
	
	static int base = 500;
	int result = 0;
	
	Cliente cliente = new Cliente();
	
	
	public static boolean haveLicense(char entrada) {
		return entrada == 's';
	}
	
	public static boolean haveValidEntry(char entrada) {
		return entrada == 's' || entrada == 'n';
	}
	
	public static boolean haveValidSexEntry(char entrada) {
		return entrada == 'F' || entrada == 'M';
	}
	
	public static boolean haveValidCivilStatus(String entrada) {
		return entrada.contentEquals("Single") || entrada.contentEquals("Married");
	}
	
	
	
	public static void getData(){
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese edad:");
		
	}
	
	
	public int calculate() {
		
		if (this.cliente.getSexo().equals(Sex.Male) && this.cliente.getEdad()<25 && !this.cliente.getMaritalStatus().equals(MaritalStatus.Single) ) {
			this.result = base+ 1500;
		}
		
		if (this.cliente.getSexo().equals(Sex.Female) || this.cliente.getMaritalStatus().equals(MaritalStatus.Married )) {
			this.result = base - 200;
		}
		if ( this.cliente.getEdad()>45 && this.cliente.getEdad()<65 ) {
			this.result = base - 100;
		}
		
		if (  this.cliente.getEdad()>80 ) {
			this.result = -1;
		} 
		
		return this.result;
	}
	
	public static void main(String []args){

		Scanner entry = new Scanner(System.in);
		boolean exit=false;
		
		
		System.out.println("Bienvenido al sistema de calculo de la prima del seguro");
		System.out.println("Tiene licencia valida de conducir?(s/n)");
		char license=entry.next().charAt(0);
		
		
	}
	
	
}
