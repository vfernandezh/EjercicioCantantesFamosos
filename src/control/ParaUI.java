package control;

import java.awt.event.ActionEvent;
import java.util.Iterator;

import modelo.CantanteFamoso;
import modelo.ListaCantantesFamosos;
import vista.UI;

public class ParaUI extends UI {
	ListaCantantesFamosos lista = new ListaCantantesFamosos();
	private ActionBoton accion =new ActionBoton(this);
	private AccionIntroducirOtro accionIntroducirOtro = new AccionIntroducirOtro(this);
	
	public ParaUI() {
		setListener();
	}
	
	public void mostrarLista(){
		textLista.setText("");
		for (Iterator<CantanteFamoso> iterator =  lista.getListaCantantesFamosos().iterator();  iterator.hasNext();) {
			CantanteFamoso cantante = (CantanteFamoso)  iterator.next();
			textLista.setText(textLista.getText() + "	Nombre: "+cantante.getNombre() + " Disco: "+ cantante.getDiscoMasVendido()+ "\n");
		}
	}
	public boolean comprobarLista() {
		boolean condicion = true;
		if (getNombreCantante().getText().isEmpty()||getNombreDisco().getText().isEmpty()) {
			condicion= false;
		}
		return condicion;
	}

	
	public void AñadirCantante(String nombre, String disco) {
		lista.AñadirCantante(nombre, disco);
	}
	
	public void setListener() {
		botonIntroducir.addActionListener(accion);
	}
	public void setListenerSegundo() {
		btnIntorducirOtro.addActionListener(accionIntroducirOtro);
	}
}
