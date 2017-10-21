package com.jf.cron;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {
	public static void main(String[] args) {
		initCustomLAF();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				new MainJFrame().setVisible(true);
			}
		});
	}

	public static void initCustomLAF() {
		Font font = new Font("Dialog", 0, 12);
		Color forecolor = new Color(5, 50, 156);

		Color backcolor = new Color(245, 245, 245);
		Border borderButton = BorderFactory.createEmptyBorder();

		UIManager.put("Button.font", font);
		UIManager.put("ToggleButton.font", font);
		UIManager.put("RadioButton.font", font);
		UIManager.put("CheckBox.font", font);
		UIManager.put("ColorChooser.font", font);
		UIManager.put("ToggleButton.font", font);
		UIManager.put("ComboBox.font", font);
		UIManager.put("ComboBoxItem.font", font);
		UIManager.put("InternalFrame.titleFont", font);
		UIManager.put("Label.font", font);
		UIManager.put("List.font", font);
		UIManager.put("MenuBar.font", font);
		UIManager.put("Menu.font", font);
		UIManager.put("MenuItem.font", font);
		UIManager.put("RadioButtonMenuItem.font", font);
		UIManager.put("CheckBoxMenuItem.font", font);
		UIManager.put("PopupMenu.font", font);
		UIManager.put("OptionPane.font", font);
		UIManager.put("Panel.font", font);
		UIManager.put("ProgressBar.font", font);
		UIManager.put("ScrollPane.font", font);
		UIManager.put("Viewport", font);
		UIManager.put("TabbedPane.font", font);
		UIManager.put("TableHeader.font", font);
		UIManager.put("TextField.font", font);
		UIManager.put("PasswordFiled.font", font);
		UIManager.put("TextArea.font", font);
		UIManager.put("TextPane.font", font);
		UIManager.put("EditorPane.font", font);
		UIManager.put("TitledBorder.font", font);
		UIManager.put("ToolBar.font", font);
		UIManager.put("ToolTip.font", font);
		UIManager.put("Tree.font", font);
		UIManager.put("Table.font", font);
		UIManager.put("Viewport.font", font);
		UIManager.put("Spinner.font", font);
		UIManager.put("PasswordField.font", font);
	}
}