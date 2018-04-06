package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.CantanteFamoso;

public class ActionBoton implements ActionListener {
	private ParaUI paraUi;


	public ActionBoton(ParaUI paraUi) {
		this.paraUi = paraUi;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(paraUi.comprobarLista()) {
			paraUi.AñadirCantante(paraUi.getNombreCantante().getText(), paraUi.getNombreDisco().getText());
		}
		
		paraUi.VisualizarLista();
		
		paraUi.mostrarLista();
		
		paraUi.setListenerSegundo();
	}
}
