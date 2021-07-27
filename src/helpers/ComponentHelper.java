package helpers;

import java.awt.Component;
import java.awt.Container;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import guiElements.TbsFrame;

public class ComponentHelper {
	public static List<Component> getAllComponents(final Container c) {
	    Component[] comps = c.getComponents();
	    List<Component> compList = new ArrayList<Component>();
	    for (Component comp : comps) {
	        compList.add(comp);
	        if (comp instanceof Container)
	            compList.addAll(getAllComponents((Container) comp));
	    }
	    return compList;
	}
	
	public static Component getComponentByClass(TbsFrame frame, Class<?> clazz) {
		List<Component> allComponents = ComponentHelper.getAllComponents(frame);
		Optional<Component> component = allComponents.stream().filter(comp -> (comp != null && comp.getClass().equals(clazz))).findFirst();
		return (Component) component.get();
	}
}
