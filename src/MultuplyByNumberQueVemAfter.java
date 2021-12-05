import java.util.ArrayList;
import java.util.List;

public class MultuplyByNumberQueVemAfter {
	
	
	
//	public  long recursion(long x) {
//		long res = 1;
//		long res2 = 1;
//		int n = 10;
//		int cont = 0;
//		long [] arrayNum  = new long[n];
//			if(x > 0) {
//				recursion(x/10);
//				arrayNum[cont] = (x%10);
//				if(cont > 0) {
//					arrayNum[1] = res;
//				}
//				System.out.println("num 0 : "+arrayNum[0]);
//				System.out.println("num 1 : "+arrayNum[1]);
//				System.out.println("num 2 : "+arrayNum[2]);
//				System.out.println("num 3 : "+arrayNum[3]);
//				System.out.println("num 4 : "+arrayNum[4]);
//				System.out.println("num 5 : "+arrayNum[5]);
//				System.out.println("num 6 : "+arrayNum[6]);
//				System.out.println("num 7 : "+arrayNum[7]);
//				System.out.println("num 8 : "+arrayNum[8]);
//				System.out.println("num 9 : "+arrayNum[9]);
//			}cont+=1;
//			return arrayNum[cont];
//			
//		}
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
	
