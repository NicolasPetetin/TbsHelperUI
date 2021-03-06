package helpers;

import enums.ActionComboItems;
import guiElements.TbsBottomPanel;
import guiElements.TbsFrame;
import guiElements.parse.persist.TbsPersistParserPanel;
import guiElements.parse.statement.TbsStatementParserPanel;

public class TbsActionHandler {
	public static void doAction(ActionComboItems item, TbsFrame tbsFrame) {
		switch (item) {
		case PARSE_PERSIST:
			doParsePersistAction(tbsFrame);
			break;
		case PARSE_STATEMENT:
			doParseStatementAction(tbsFrame);
			break;
		}
	}

	private static void doParsePersistAction(TbsFrame tbsFrame) {
		TbsBottomPanel bottomPanel = tbsFrame.getMainPanel().getBottomPanel();
		bottomPanel.removeAll();
		bottomPanel.add(new TbsPersistParserPanel(tbsFrame));
		tbsFrame.revalidate();	
	}

	private static void doParseStatementAction(TbsFrame tbsFrame) {
		TbsBottomPanel bottomPanel = tbsFrame.getMainPanel().getBottomPanel();
		bottomPanel.removeAll();
		bottomPanel.add(new TbsStatementParserPanel(tbsFrame));
		tbsFrame.revalidate();
	}
}
