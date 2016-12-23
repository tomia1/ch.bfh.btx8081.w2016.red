package ch.bfh.btx8081.w2016.red.healthcaremonitor;

import com.vaadin.shared.ui.MarginInfo;
import com.vaadin.ui.CheckBox;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.ListSelect;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

public class TabTreatments extends VerticalLayout {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TabTreatments(MainMenu mmenu) {
		
		ComboBox canton = new ComboBox();
		ComboBox institution = new ComboBox();
		VerticalLayout vl1 = new VerticalLayout();
		vl1.addComponent(canton);
		vl1.addComponent(institution);
		canton.setImmediate(true);
		canton.setInputPrompt("Kanton");
		institution.setImmediate(true);
		institution.setInputPrompt("Institution");
		
		GridLayout grid = new GridLayout(3, 1);
		
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
		Label labAddiction = new Label("ADDICTION");
		Label mpx = new Label();
		Label labSort = new Label("Sortieren nach");
		CheckBox cbsortPrice = new CheckBox("Preis");
		CheckBox cbsortFall = new CheckBox("Fallrichtung");
		CheckBox cbsortGeschlecht = new CheckBox("Geschlecht");
		CheckBox cbsortAge = new CheckBox("Alter");
		HorizontalLayout agesort = new HorizontalLayout();
		TextField fromA = new TextField("Von");
		TextField toA = new TextField("bis");
		TextField abs = new TextField("Altergruppe");
		agesort.addComponents(fromA, toA);
		
		
		
		cbAddiction.addComponentAsFirst(labAddiction);
		cbAddiction.addComponents(mpx, cbAlkohol, cbAmphetamin, cbBeruhigungsmittel, cbCanabis, cbHaluzinogen, cbKokain, cbOpioide, cbSchlafmittel, cbTabak);
		cbAddiction.addComponents(mpx, labSort, mpx, cbsortPrice, cbsortFall, cbsortGeschlecht, cbsortAge, agesort, abs);
		cbAddiction.setMargin(new MarginInfo(true, false, false, true));
		grid.addComponent(cbAddiction, 1, 0);
		grid.addComponent(vl1, 0, 0);
		this.addComponent(grid);
		//grid.addComponent(component, column, row);
		//grid.addComponent(component, column, row);
	}
}
