package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AccionIntroducirOtro implements ActionListener{

	private ParaUI paraUi;
	
	
	public AccionIntroducirOtro(ParaUI paraUi) {
		this.paraUi = paraUi;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		paraUi.VisualizarPanelPrincipal();
		paraUi.setListener();
	}

}
