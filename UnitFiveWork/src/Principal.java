
public class Principal {

	public static void main(String[] args) {
		showWellcome();

		doOperationAdd();
		
		doMinus();
		
	}

	/**
	 * 
	 */
	private static void doMinus() {
		int a=1;
		int b=2;
		int result=a-b;
	}

	/**
	 * @return TODO
	 * 
	 */
	private static int doOperationAdd() {
		int a=1;
		int b=1;
		return a+b;
		//System.out.println("El resultado de la suma es"+result);
	}

	/**
	 * 
	 */
	private static void showWellcome() {
		System.out.println("*************************************");
		System.out.println("Bienvenido al supermercado El Caminas");
		System.out.println("*************************************");
	}

}
