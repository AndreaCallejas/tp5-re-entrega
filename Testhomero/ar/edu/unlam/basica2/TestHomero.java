package ar.edu.unlam.basica2;

import static org.junit.Assert.*;
import java.util.TreeSet;
import org.junit.Test;

public class TestHomero {
		@Test
		public void elBarSeAbreSinClientes(){
			Bar barNoHomeros= new Bar();
			assertEquals(0, barNoHomeros.getClientes().size(),0.01);
		}
	
		@Test
		public void probarQueSeAgreguenClientes(){
			Bar barNoHomeros= new Bar();
			
			Cliente clientePablo= new Cliente("Pablo", 25);
			Cliente clienteAndrea= new Cliente("Andrea", 24);
			
			barNoHomeros.agregarCliente(clientePablo);
			barNoHomeros.agregarCliente(clienteAndrea);
			
			assertEquals(2, barNoHomeros.getClientes().size(),0.01);
		}
		
		@Test
		public void compararALosClientesIguales(){
			Bar barNoHomeros= new Bar();
			
			Cliente clienteUno= new Cliente("Laura", 30);
			Cliente clienteDos= new Cliente("Laura", 30);
			
			barNoHomeros.agregarCliente(clienteUno);
			barNoHomeros.agregarCliente(clienteDos);
			
			assertEquals(0, clienteUno.compareTo(clienteDos));
		}
		
		@Test
		public void probarQueLosClientesSeMuestrenOrdenadosPorNombre(){
			Bar barNoHomeros = new Bar();
			
			Cliente clienteUno= new Cliente("Claudia", 20);
			Cliente clienteDos= new Cliente("Romina", 40);
			Cliente clienteTres= new Cliente("Leticia", 25);
			
			barNoHomeros.agregarCliente(clienteUno);	
			barNoHomeros.agregarCliente(clienteDos);
			barNoHomeros.agregarCliente(clienteTres);
			
			for(Cliente lista: barNoHomeros.getClientes()){
				System.out.println(lista.getNombre());
			}
			
			assertEquals(3, barNoHomeros.getClientes().size(),0.01);
		}
		
		@Test
		public void probarQueLosClientesSeMuestrenOrdenadosPorEdad(){
			
			ComparadorPorEdad ComparadorPorEdad= new ComparadorPorEdad();
			Bar barNoHomeros = new Bar();
			
			Cliente clienteUno= new Cliente("Claudia", 30);
			Cliente clienteDos= new Cliente("Romina", 40);
			Cliente clienteTres= new Cliente("Leticia", 25);
			
			barNoHomeros.agregarCliente(clienteUno);	
			barNoHomeros.agregarCliente(clienteDos);
			barNoHomeros.agregarCliente(clienteTres);
			
			TreeSet<Cliente> clientesOrdenEdad= new TreeSet<Cliente>(ComparadorPorEdad);
			clientesOrdenEdad.addAll(barNoHomeros.getClientes());
			barNoHomeros.setClientes(clientesOrdenEdad);
			
			for(Cliente lista: barNoHomeros.getClientes()){
				System.out.println(lista.getEdad());
			}
			
			assertEquals("Leticia", barNoHomeros.getClientes().first().getNombre());
		}
		
	}


