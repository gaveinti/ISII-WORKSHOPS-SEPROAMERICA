package ec.edu.espol.workshops;
import java.util.Scanner;


public class CarInsurance {
	
	
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
	

	public static boolean isInteger(String cadena) {
	    int v;
	    try {
	      v=Integer.parseInt(cadena);
	      return true;
	    } catch (NumberFormatException ex) {
	       return false;
	    }
	}
	
	
	public static void main(String []args){
		
		int base = 500;
		int result = 0;
		
		Cliente cliente = new Cliente();
		MaritalStatus maritalCliente = MaritalStatus.married;
		Sex sexoCliente = Sex.Female;
		
		String m = "Married";
		String s = "Single";

		Scanner entry = new Scanner(System.in);
		boolean exit=false;
		int numeroinValido = -1;
		
		while(exit == false) {
			System.out.println("Bienvenido al sistema de calculo de la prima del seguro");
			System.out.println("Tiene licencia valida de conducir?(s/n)");
			char license=entry.next().charAt(0);
			System.out.println("Ingrese edad:");
			String ingresoEdad = entry.nextLine();
			
			while (isInteger(ingresoEdad) == false) {
                System.out.println (" Age is wrong.");
                System.out.println("Ingrese edad:");
    			ingresoEdad = entry.nextLine();
			}
			
			int edad = Integer.parseInt(ingresoEdad);
			System.out.println("Ingrese su sexo:(M para Masculino/F para femenino)");
			char sexo=entry.next().charAt(0);
			entry.nextLine();
			System.out.println("Ingrese su estado marital:(Married para casado o Single para soltero)");
			String estado = entry.nextLine();
			
			
			//Validaciones de entrada
			if(haveValidEntry(license) && haveValidSexEntry(sexo) && haveValidCivilStatus(estado) 
					&& haveLicense(license)) {
			
				//Validar si es single o married y crear el objeto
				if(estado.equals(m)) {
					maritalCliente = MaritalStatus.married;
				}
				if(estado.equals(s)) {
					maritalCliente = MaritalStatus.single;
				}
				
				//Validar si es male o female y crear el objeto
				if(sexo == 'M' || sexo=='m') {
					sexoCliente = Sex.Male;
				}
				if(sexo == 'F' || sexo == 'f') {
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
				System.out.println(numeroinValido);
			}
		}
	}	
	
	int calcular_Car_Insurance(String licencia, int edad, char sexo, String estado_Marital){
		int base = 500;
		int result = 0;
		Cliente cliente = new Cliente();
		MaritalStatus maritalCliente = MaritalStatus.married;
		Sex sexoCliente = Sex.Female;
		if(licencia == "s") {
			cliente.setAge(edad);
			
			//Validar si es male o female y crear el objeto
			if(sexo == 'M' || sexo=='m') {
				sexoCliente = Sex.Male;
			}
			if(sexo == 'F' || sexo == 'f') {
				sexoCliente = Sex.Female;	
			}
			
			if(estado_Marital.equals("m")) {
				maritalCliente = MaritalStatus.married;
			}
			if(estado_Marital.equals("s")) {
				maritalCliente = MaritalStatus.single;
			}
			cliente.setEstadoCivil(maritalCliente);
			cliente.setSexo(sexoCliente);
			result = cliente.calculate(result, base);
			return result;
		}else {
			result = -1;
			return result;
		}
	
	}
	
	
	
}