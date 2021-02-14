package mx.com.gamasoft.main;

import java.util.ArrayList;

/**
 * @author Cesar
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Integer> lista = new ArrayList<>();
		
		lista.add(2);
		lista.add(4);
		
		for(int i=0; i<lista.size(); i++){
			System.out.println(lista.get(i));
		}
	}
}