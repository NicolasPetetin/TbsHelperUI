package controler;

import java.util.List;

import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;

import guiElements.TbsFrame;
import guiElements.parse.persist.TbsEditorPersist;
import guiElements.parse.persist.TbsPersistList;
import guiElements.parse.persist.TbsPersistListModel;
import guiElements.parse.persist.TbsPersistTable;
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
		String rawPersists = editor.getText();
		TbsPersistence allPersists = PersistHelper.doParsePersistence(rawPersists);
		setListPersists(frame, allPersists);
		setTablePersists(frame, allPersists);
	}

	private void setTablePersists(TbsFrame frame2, TbsPersistence allPersists) {
		TbsPersistTable tablePersist = frame.getTablePersist();
		//TODO
	}

	private void setListPersists(TbsFrame frame2, TbsPersistence allPersists) {
		TbsPersistList listPersist = frame.getListPersist();
		List<String> distinctPersists = PersistHelper.getDistinctPersists(allPersists);
		TbsPersistListModel listModel = listPersist.getModel();
		listModel.clear();
		listModel.addAll(distinctPersists);
	}

}
