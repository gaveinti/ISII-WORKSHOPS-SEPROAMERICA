package ec.edu.espol.workshops;
import java.util.Scanner;
public class CarInsurance {
	
	static int base = 500;
	
	
	static Cliente cliente = new Cliente();
	
	
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
		return entrada.contentEquals("single") || entrada.contentEquals("married");
	}
	
	
	
	public static void getData( ){
		int age ;
		char sex;
		String maritalStatus;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese edad:");
		do {
		    System.out.println("Please enter a positive number!");
		    while (!sc.hasNextInt()) {
		        System.out.println("That's not a number!");
		        sc.next(); // this is important!
		    }
		    age = sc.nextInt();
		    
		} while (age <= 0);
		cliente.setAge(age);
		
		do {
		    System.out.println("Please enter F to Female or M to Male");
		    sex = Character.toUpperCase(sc.next().charAt(0)); 
		    
		} while (!haveValidSexEntry(sex));
		if (sex =='F') {cliente.setSexo(Sex.Female);}
		if (sex =='M') {cliente.setSexo(Sex.Male);}
		do {
		    System.out.println("Please enter Marital status, married or single");
		    maritalStatus = sc.nextLine().toLowerCase(); 
		   
		} while (!haveValidCivilStatus(maritalStatus));
		
		if (maritalStatus.equals("married")) {cliente.setEstadoCivil(MaritalStatus.married);}
		if (maritalStatus.equals("single")) {cliente.setEstadoCivil(MaritalStatus.single);}
	}
	
	
	public static void  calculate() {
		int result = base;
		if (cliente.getSexo().equals(Sex.Male) &&cliente.getEdad()<25 && !cliente.getMaritalStatus().equals(MaritalStatus.single) ) {
			result += 1500;
		}
		
		if (cliente.getSexo().equals(Sex.Female) || cliente.getMaritalStatus().equals(MaritalStatus.married )) {
			result -= 200;
		}
		if ( cliente.getEdad()>45 && cliente.getEdad()<65 ) {
			result -= 100;
		}
		
		if ( cliente.getEdad()>80 ) {
			result = -1;
		} 
		System.out.println(result);
	}
	
	public static void main(String []args){

		Scanner entry = new Scanner(System.in);
		boolean exit=false;
		
		
		System.out.println("Bienvenido al sistema de calculo de la prima del seguro");
		System.out.println("Tiene licencia valida de conducir?(s/n)");
		char license=entry.next().charAt(0);
		if(license == 'n') {
			System.out.println("No podemos otorgar un seguro, gracias por su preferencia!");
			return;
		}
		getData();
		System.out.println(cliente);
		System.out.println("El costo del seguro seria de: ");
		calculate();
	}
	
	
}
