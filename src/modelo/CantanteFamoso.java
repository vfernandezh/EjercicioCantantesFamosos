package modelo;

public class CantanteFamoso {
private String nombre;
private String discoMasVendido;

public CantanteFamoso(String nombre, String discoMasVendido) {
	this.nombre = nombre;
	this.discoMasVendido = discoMasVendido;
}

public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getDiscoMasVendido() {
	return discoMasVendido;
}
public void setDiscoMasVendido(String discoMasVendido) {
	this.discoMasVendido = discoMasVendido;
}


}
