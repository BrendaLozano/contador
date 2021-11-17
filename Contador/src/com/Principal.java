package com;

public class Principal {
	public static void main(String[] args) {
		
		
		Principal p  = new Principal();
		contadorRecursivo(1000);
	}
	
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        int contador = 0;
        for (int i = (int) Math.sqrt(numero); i > 1; i--) {
            if (numero % i == 0) {
                contador++;
            }
        }
        return contador < 1;
    }
    
    
    public static void contadorRecursivo(int x) {
    	
    	if(x>0) {
    		if(x%2==0) {
				System.out.println(x+" es par");
			}
			if(esPrimo(x)) {
				System.out.println(x+" es primo");
			}
			if(x%5==0 && (x%2!=0)) {
				System.out.println(x+" numero ordinal");
			}
			contadorRecursivo(x-1);
    		
    	}
    	
    }

}
