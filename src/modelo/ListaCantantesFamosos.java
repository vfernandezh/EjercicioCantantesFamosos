package modelo;
import java.util.ArrayList;

public class ListaCantantesFamosos {
private ArrayList<CantanteFamoso> listaCantantesFamosos= new ArrayList<>();




public ArrayList<CantanteFamoso> getListaCantantesFamosos() {
	return listaCantantesFamosos;
}



public void setListaCantantesFamosos(ArrayList<CantanteFamoso> listaCantantesFamosos) {
	this.listaCantantesFamosos = listaCantantesFamosos;
}



public void AñadirCantante(String nombre,String disco) {
	this.listaCantantesFamosos.add(new CantanteFamoso(nombre, disco));
	
}
}
