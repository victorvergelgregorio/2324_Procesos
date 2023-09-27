
public class AplicacionContadorMultiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ProcesoContador pContador=new ProcesoContador("primer hijo");
		pContador.start();
		ProcesoContador pContador2=new ProcesoContador("segundo hijo");
		pContador2.start();
		ProcesoContador pContador3=new ProcesoContador("tercer hijo");
		pContador3.start();
		ProcesoContador pContador4=new ProcesoContador("cuarto hijo");
		pContador4.start();
		
		
		for (int i = 0; i < 10000; i++) {
			System.out.println("Proceso padre: "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

}
