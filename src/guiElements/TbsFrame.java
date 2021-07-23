package guiElements;

import java.awt.Component;
import java.util.List;
import java.util.Optional;

import javax.swing.JFrame;

import guiElements.menu.TbsMenuBar;
import guiElements.parse.persist.TbsEditorPersist;
import guiElements.parse.persist.TbsPersistList;
import guiElements.parse.persist.TbsPersistTable;
import guiElements.popupmenu.TbsPopupMenu;
import helpers.ComponentHelper;

public class TbsFrame extends JFrame {
	private static final long serialVersionUID = -7003371634572107802L;
	private TbsMainPanel mainPanel;
	private TbsMenuBar menuBar;
	private TbsPopupMenu popupMenu;
	
	public TbsFrame() {
		super();
		
		this.popupMenu = new TbsPopupMenu();
		
		this.menuBar = new TbsMenuBar(this);
		setJMenuBar(menuBar);

		this.mainPanel = new TbsMainPanel(this);
		add(mainPanel);

		setTitle("TBS UI Helper");
		setSize(1000, 540);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public TbsMainPanel getMainPanel() {
		return mainPanel;
	}

	public void afterInit() {
		getMainPanel().getBottomPanel().setDefaultBottomPanel();
	}

	public TbsPopupMenu getPopupMenu() {
		return popupMenu;
	}
	
	public TbsEditorPersist getEditorPersist() {
		List<Component> allComponents = ComponentHelper.getAllComponents(this);
		Optional<Component> editorPersist = allComponents.stream().filter(comp -> (comp != null && comp.getClass().equals(TbsEditorPersist.class))).findFirst();
		return (TbsEditorPersist) editorPersist.get();
	}
	
	public TbsPersistList getListPersist() {
		List<Component> allComponents = ComponentHelper.getAllComponents(this);
		Optional<Component> editorPersist = allComponents.stream().filter(comp -> (comp != null && comp.getClass().equals(TbsPersistList.class))).findFirst();
		return (TbsPersistList) editorPersist.get();
	}
	
	public TbsPersistTable getTablePersist() {
		List<Component> allComponents = ComponentHelper.getAllComponents(this);
		Optional<Component> editorPersist = allComponents.stream().filter(comp -> (comp != null && comp.getClass().equals(TbsPersistTable.class))).findFirst();
		return (TbsPersistTable) editorPersist.get();
	}
}
