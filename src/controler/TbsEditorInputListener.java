package controler;

import java.awt.Component;

import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;

import guiElements.TbsEditorInput;
import guiElements.TbsEditorOutput;
import guiElements.TbsFrame;

public class TbsEditorInputListener implements CaretListener {
	private TbsFrame tbsFrame;
	
	public TbsEditorInputListener(TbsFrame tbsFrame) {
		this.tbsFrame = tbsFrame;
	}

	@Override
	public void caretUpdate(CaretEvent arg0) {
		TbsEditorInput editorIn = (TbsEditorInput) arg0.getSource();
		Component[] components = tbsFrame.getRootPane().getComponents();
		for(Component component : components) {
			if(component instanceof TbsEditorOutput) {
				((TbsEditorOutput) component).setText(editorIn.getText());
				break;
			}
		}
	}

}
