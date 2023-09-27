
public class ProcesoContador extends Thread {

	public ProcesoContador(String nombre) {
		// TODO Auto-generated constructor stub
		setName(nombre);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Proceso "+this.getName()+": "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	
}
