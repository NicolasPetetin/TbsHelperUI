package controler;

import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;

import guiElements.TbsFrame;
import guiElements.parse.persist.TbsEditorPersist;
import guiElements.parse.persist.TbsPersistList;
import helpers.PersistHelper;
import model.TbsPersistence;

public class TbsEditorPersistListener implements CaretListener {
	private TbsFrame frame;
	
	public TbsEditorPersistListener(TbsFrame tbsFrame) {
		this.frame = tbsFrame;
	}

	@Override
	public void caretUpdate(CaretEvent e) {
		TbsEditorPersist editor = (TbsEditorPersist) e.getSource();
		String allPersists = editor.getText();
		TbsPersistence persist = PersistHelper.doParsePersistence(allPersists);
		TbsPersistList listPersist = frame.getListPersist();
		//listPersist.getModel().addElement("test NPN !");
	}

}
