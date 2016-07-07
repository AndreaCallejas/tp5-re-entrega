package ar.edu.unlam.basica2;

import java.util.Comparator;

public class ComparadorPorEdad implements Comparator<Cliente> {



	@Override
	public int compare(Cliente cliente , Cliente cliente1) {
	
		return cliente.getEdad() - cliente1.getEdad();
	 }
}
