package controler;

import java.awt.Color;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import guiElements.TbsFrame;
import guiElements.parse.persist.TbsEditorPersist;
import guiElements.parse.persist.TbsPersistList;
import guiElements.parse.persist.TbsPersistTable;
import guiElements.parse.persist.TbsPersistTableModel;
import helpers.PersistHelper;
import model.TbsPersistence;

public class TbsPersistListListener implements ListSelectionListener{
	private TbsFrame frame;
	
	public TbsPersistListListener(TbsFrame frame) {
		this.frame = frame;
	}
	
	@Override
	public void valueChanged(ListSelectionEvent e) {
		TbsEditorPersist editor = frame.getEditorPersist();
		TbsPersistence persist = PersistHelper.doParsePersistence(editor.getText());
		TbsPersistList list = (TbsPersistList) e.getSource();
		String selectedValue = list.getSelectedValue();
		if(PersistHelper.isTableauPersist(persist, selectedValue)) {
			handleTablePersist(persist, selectedValue);
		}else {
			//TODO
		}
	}

	private void handleTablePersist(TbsPersistence persist, String selectedValue) {
		TbsPersistTable table = frame.getTablePersist();
		TbsPersistTableModel tableModel = table.getModel();
		String[] columns = PersistHelper.getTableColumns(persist, selectedValue);
		tableModel.setColumnIdentifiers(columns);
		String[][] data = PersistHelper.getTableData(persist, columns, selectedValue);
		tableModel.setDataVector(data, columns);
		table.setBackground(Color.WHITE);
	}
}
