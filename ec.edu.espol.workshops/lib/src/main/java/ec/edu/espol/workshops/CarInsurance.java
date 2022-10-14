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
	
	
	
	/*public static void getData(){
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese edad:");
		
	}*/
	
	
	/*public int calculate() {
		
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
	}*/
	
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
		
		
		
		
		
	}
	
	
}
