package controler;

import java.awt.Component;
import java.util.List;

import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;

import guiElements.TbsEditorInput;
import guiElements.TbsEditorOutput;
import guiElements.TbsFrame;
import helpers.ComponentHelper;

public class TbsEditorInputListener implements CaretListener {
	private TbsFrame tbsFrame;
	
	public TbsEditorInputListener(TbsFrame tbsFrame) {
		this.tbsFrame = tbsFrame;
	}

	@Override
	public void caretUpdate(CaretEvent arg0) {
		TbsEditorInput editorIn = (TbsEditorInput) arg0.getSource();
		List<Component> components = ComponentHelper.getAllComponents(tbsFrame);
		for(Component component : components) {
			if(component instanceof TbsEditorOutput) {
				((TbsEditorOutput) component).setText(editorIn.getText());
				break;
			}
		}
	}

}
