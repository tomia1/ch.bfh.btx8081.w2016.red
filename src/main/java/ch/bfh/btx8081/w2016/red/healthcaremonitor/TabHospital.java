package ch.bfh.btx8081.w2016.red.healthcaremonitor;

import com.vaadin.ui.Button;
import com.vaadin.ui.CheckBox;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.Grid;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.ListSelect;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.VerticalSplitPanel;

public class TabHospital extends VerticalLayout {
	
	
	public TabHospital(MainMenu mmenu) {
		
		ComboBox canton = new ComboBox();
		VerticalLayout vl1 = new VerticalLayout();
		vl1.addComponent(canton);
		canton.setImmediate(true);
		canton.setInputPrompt("Kanton");
		
		GridLayout grid = new GridLayout(3, 1);
		ListSelect hospitals = new ListSelect();
		hospitals.setImmediate(true);
		VerticalLayout cbAddiction = new VerticalLayout();
		CheckBox cbCanabis = new CheckBox("Canabis");
		CheckBox cbOpioide = new CheckBox("Opïoide");
		CheckBox cbKokain = new CheckBox("Kokain");
		CheckBox cbSchlafmittel = new CheckBox("Schlafmittel");
		CheckBox cbBeruhigungsmittel = new CheckBox("Beruhigungsmittel");
		CheckBox cbAmphetamin = new CheckBox("Amphetamin");
		CheckBox cbHaluzinogen = new CheckBox("Haluzinogen");
		CheckBox cbAlkohol = new CheckBox("Alkohol");
		CheckBox cbTabak = new CheckBox("Tabak");
		cbAddiction.addComponents(cbAlkohol, cbAmphetamin, cbBeruhigungsmittel, cbCanabis, cbHaluzinogen, cbKokain, cbOpioide, cbSchlafmittel, cbTabak);
		grid.addComponent(cbAddiction, 1, 0);
		grid.addComponent(hospitals, 0, 0);
		this.addComponent(grid);
		//grid.addComponent(component, column, row);
		//grid.addComponent(component, column, row);
	}
}
