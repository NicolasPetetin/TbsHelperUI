package abstractClasses;

import javax.swing.JEditorPane;
import javax.swing.text.Document;
import javax.swing.text.PlainDocument;

public class AbstractEditor extends JEditorPane {
	private static final long serialVersionUID = -5460897105259587688L;

	protected void setTabSize(int tabSize) {
		Document document = getDocument();
		if(document instanceof PlainDocument) {
			document.putProperty(PlainDocument.tabSizeAttribute, tabSize);
		}	
	}
}
