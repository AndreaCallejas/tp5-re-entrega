package ar.edu.unlam.basica2;

public class Cliente implements Comparable<Cliente> {
	
	private String nombre;
	private Integer edad;
	
	public Cliente(String nombre,Integer edad){
		
		this.nombre=nombre;
		this.edad=edad;
		
	}

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	
	public int hasCode(){
		return 1;
	}
	
	public boolean equals(Object obj) {
		if (obj instanceof Cliente){
			Cliente otro = (Cliente) obj;
			if(this.nombre.equalsIgnoreCase(otro.getNombre())){
				return true;
			}else{
				return false;
			}
		}else{
			return	false;
		}
	}
	
	public int compareTo(Cliente otro) {
		return this.nombre.compareTo(otro.getNombre());
	}




}
