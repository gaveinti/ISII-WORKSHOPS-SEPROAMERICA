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
	
	
	
<<<<<<< HEAD
	/*public static void getData(){
		Scanner entrada = new Scanner(System.in);
=======
	public static void getData( ){
		int age ;
		char sex;
		String maritalStatus;
		Scanner sc = new Scanner(System.in);
>>>>>>> 26243e5c48bcb9a297460b8cc2d92d53ae7d025e
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
		
<<<<<<< HEAD
	}*/
	
	
	/*public int calculate() {
		
		if (this.cliente.getSexo().equals(Sex.Male) && this.cliente.getEdad()<25 && !this.cliente.getMaritalStatus().equals(MaritalStatus.Single) ) {
			this.result = base+ 1500;
=======
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
>>>>>>> 26243e5c48bcb9a297460b8cc2d92d53ae7d025e
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
<<<<<<< HEAD
		
		return this.result;
	}*/
=======
		System.out.println(result);
	}
>>>>>>> 26243e5c48bcb9a297460b8cc2d92d53ae7d025e
	
	public static void main(String []args){
		
		int base = 500;
		int result = 0;
		
		Cliente cliente = new Cliente();
		MaritalStatus maritalCliente = MaritalStatus.Married;
		Sex sexoCliente = Sex.Female;
		
		String m = "Married";
		String s = "Single";

		Scanner entry = new Scanner(System.in);
		boolean exit=false;
		int numeroValido = 1;
		
		while(exit == false) {
			System.out.println("Bienvenido al sistema de calculo de la prima del seguro");
			System.out.println("Tiene licencia valida de conducir?(s/n)");
			char license=entry.next().charAt(0);
			System.out.println("Ingrese edad:");
			int edad = entry.nextInt();
			System.out.println("Ingrese su sexo:(M para Masculino/F para femenino)");
			char sexo=entry.next().charAt(0);
			entry.nextLine();
			System.out.println("Ingrese su estado marital:(Married para casado o Single para soltero)");
			String estado = entry.nextLine();
			
			
			//Validaciones de entrada
			if(haveValidEntry(license) && haveValidSexEntry(sexo) && haveValidCivilStatus(estado) && haveLicense(license)) {
			
				//Validar si es single o married y crear el objeto
				if(estado.equals(m)) {
					maritalCliente = MaritalStatus.Married;
				}
				if(estado.equals(s)) {
					maritalCliente = MaritalStatus.Single;
				}
				
				//Validar si es male o female y crear el objeto
				if(sexo == 'M') {
					sexoCliente = Sex.Male;
				}
				if(sexo == 'F') {
					sexoCliente = Sex.Female;
				}
				
				
				cliente.setAge(edad);
				cliente.setEstadoCivil(maritalCliente);
				cliente.setSexo(sexoCliente);
				
				result = cliente.calculate(result, base);
				
				System.out.println(cliente.toString());
				
				System.out.println("El resultado es: " + result);
				
				exit = true;
			}else {
				System.out.println("Datos no válidos, intente de nuevo ");
			}
			
		}
		
		
		
<<<<<<< HEAD
		
		
=======
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
>>>>>>> 26243e5c48bcb9a297460b8cc2d92d53ae7d025e
	}
	
	
}
