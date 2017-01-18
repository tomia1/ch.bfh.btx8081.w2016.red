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
		
		
		ComboBox institution = new ComboBox();
		VerticalLayout vl1 = new VerticalLayout();
		vl1.addComponent(institution);
		institution.setImmediate(true);
		institution.setInputPrompt("Institution");
		
		GridLayout grid = new GridLayout(3, 1);
		
		VerticalLayout cbTreatments = new VerticalLayout();
		CheckBox cbAdvice = new CheckBox("Beratung/Begleitung/Therapie");
		CheckBox cbTherapy = new CheckBox("Suchttherapie und -rehabilitation");
		CheckBox cbPrevention = new CheckBox("Prävention und Gesundheitsförderung");
		CheckBox cbWithdrawal = new CheckBox("Entzug");
		CheckBox cbSubstitution = new CheckBox("Substitution/Heroinverschreibung");
		CheckBox cbDayClinic = new CheckBox("Tagesklinik");
		CheckBox cbFamilyplacing = new CheckBox("Familienplazierung");
		CheckBox cbAssistedLiving = new CheckBox("Begleitetes/Betreutes Wohnen");
		CheckBox cbLongLiving = new CheckBox("Langzeitwohnen");
		CheckBox cbWomenShelter = new CheckBox("Frauenhaus");
		CheckBox cbOccupation = new CheckBox("Beschäftigung/Arbeit");
		CheckBox cbContact = new CheckBox("Kontakt- & Anlaufstelle mit Konsumraum");
		CheckBox cbMeetingpoint = new CheckBox("Treffpunkt/Kontakt- & Anlaufstelle");
		CheckBox cbAlleywork = new CheckBox("Gassenarbeit/Aufsuchende Sozialarbeit");
		CheckBox cbEmergencyShelter = new CheckBox("Notschlafstelle");
		CheckBox cbSelfhelp = new CheckBox("Selbsthilfe/Elternvereinigung");
		CheckBox cbLawenforcement = new CheckBox("Straf- und Massnahmenvollzug");
		
		
		
		
		Label labAddiction = new Label("BEHANDLUNGSART");
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
		
		
		
		cbTreatments.addComponentAsFirst(labAddiction);
		cbTreatments.addComponents(mpx, cbAssistedLiving, cbDayClinic, cbSubstitution, cbAdvice, cbFamilyplacing, 
				cbPrevention, cbTherapy, cbWithdrawal, cbLawenforcement, cbSelfhelp, cbEmergencyShelter, 
				cbLongLiving, cbWomenShelter, cbOccupation, cbContact, cbMeetingpoint, cbAlleywork);
		cbTreatments.addComponents(mpx, labSort, mpx, cbsortPrice, cbsortFall, cbsortGeschlecht, cbsortAge, agesort, abs);
		cbTreatments.setMargin(new MarginInfo(true, false, false, true));
		grid.addComponent(cbTreatments, 1, 0);
		grid.addComponent(vl1, 0, 0);
		this.addComponent(grid);
		//grid.addComponent(component, column, row);
		//grid.addComponent(component, column, row);
	}
}
