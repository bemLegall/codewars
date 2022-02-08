public class MultiplyByNumberQueVemAfter {
	
	
	public  long MultiplyAfter(long y) { 
		long resultado = 1;
		while(resultado != 1 || resultado != 2 ||resultado!= 3 || resultado != 4|| resultado != 5 ||
				resultado!= 6 || resultado != 7 || resultado != 8|| resultado != 9|| resultado != 0	
				) {
			if(resultado == 1 || resultado == 2 ||resultado == 3 || resultado == 4|| resultado == 5 ||
				resultado==6 || resultado == 7 || resultado == 8|| resultado == 9|| resultado == 0) {
				break;
			}
			
			System.out.println("resultado: "+resultado);
		}
		return resultado;
	}
	public long digitoSeparado(long number1) {
	 String number = String.valueOf(number1);
	 long[]numeros = new long [10];
     char[] digits1 = number.toCharArray();

     for(int i = 0; i < digits1.length; i++) {
        numeros[i] = (digits1[i]);
        System.out.println(numeros[1]);
        System.out.println(numeros[0]);
     }
	return 1;
     
	}
 }
	
