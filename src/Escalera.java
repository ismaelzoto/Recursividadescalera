
public class Escalera {
	

	public int escalerarecursiva(int n){
		
		if (n==0){	
			//Caso base 
			 System.out.println("Has terminado de bajar las escaleras");
			 return n;
		}else{
			//Dominio
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Bajando escalon " + n);		
		}
		//uso de la recursividad
		return escalerarecursiva(n-1); 
	  }
}

