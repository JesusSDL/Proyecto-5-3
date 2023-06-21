import java.util.ArrayList;

public class General {

	public static void main(String[] args) {
	//	Integer promedio = 1;
		Integer x = 0;
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(5);
		numeros.add(10);
		numeros.add(20);

		for (Integer a : numeros) {
			x += a;
			
		}
		System.out.println(x);
	}
	

}