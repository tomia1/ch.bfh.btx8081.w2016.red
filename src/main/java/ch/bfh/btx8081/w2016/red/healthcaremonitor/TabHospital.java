package ch.bfh.btx8081.w2016.red.healthcaremonitor;

import java.io.File;

import com.vaadin.server.FileResource;
import com.vaadin.server.VaadinService;
import com.vaadin.shared.ui.MarginInfo;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.CheckBox;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Image;
import com.vaadin.ui.Label;
import com.vaadin.ui.ListSelect;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

public class TabHospital extends VerticalLayout {
	
	
	/**
	 * Variable that where used for the layout
	 */
	private static final long serialVersionUID = 1L;
	private Image mainImage;
	private int key = 1;
	private CheckBox cbsortAge;
	private HorizontalLayout agesort;
	private TextField abs;
	
	
	public TabHospital(MainMenu mmenu) {
		
		ComboBox canton = new ComboBox();
		VerticalLayout vl1 = new VerticalLayout();
		vl1.addComponent(canton);
		canton.setImmediate(true);
		canton.setInputPrompt("Kanton");
		canton.addItem("Alle");
		canton.addItem("Freibung");
		canton.addItem("Bern");
		canton.addItem("Waadt");
		
		GridLayout grid = new GridLayout(3, 2);
		ListSelect hospitals = new ListSelect();
		hospitals.addItem("Kantonspital Freiburg");
		hospitals.addItem("Inselspital");
		hospitals.addItem("Klinik Höheweg");
		hospitals.addItem("CHUV");
		hospitals.setImmediate(true);
		vl1.addComponent(hospitals);
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
		cbsortAge = new CheckBox("Alter");
		
		agesort = new HorizontalLayout();
		TextField fromA = new TextField("Von");
		TextField toA = new TextField("bis");
		abs = new TextField("Altergruppe");
		abs.setVisible(false);
		agesort.setVisible(false);
		agesort.addComponents(fromA, toA);
		
		cbsortAge.addValueChangeListener(e -> {
			if(cbsortAge.getValue() == true){
				agesort.setVisible(true);
				abs.setVisible(true);
			} else{
				agesort.setVisible(false);
				abs.setVisible(false);
			}
		});
		
		Button showgraph = new Button("Calculate");
		String basepath = VaadinService.getCurrent().getBaseDirectory().getAbsolutePath();
		
		basepath = basepath.substring(0, basepath.length()-6);
		System.out.println(basepath);
		FileResource resourceA = new FileResource(new File(basepath +"resources\\META-INF\\images\\chart1.png"));
		FileResource resourceB = new FileResource(new File(basepath +"resources\\META-INF\\images\\chart2.png"));
		Image graphA = new Image(null, resourceA);
		Image graphB = new Image(null, resourceB);
		mainImage = graphA;
		graphB.setImmediate(true);
		graphB.setVisible(false);
		mainImage.setImmediate(true);
		mainImage.setVisible(false);
		VerticalLayout vtr12 = new VerticalLayout();
		vtr12.addComponent(mainImage);
		vtr12.addComponent(graphB);
		grid.addComponent(vtr12, 2, 0);
		grid.setComponentAlignment(vtr12, Alignment.MIDDLE_LEFT);
		/**Embedded imageComponent = new Embedded(null, new StreamResource(new MyImageSource(), "aaa.png", application));

		imageComponent.setType(Embedded.TYPE_IMAGE);
		imageComponent.setImmediate(true);
		*/
		showgraph.addClickListener(e -> {
			switch (key) {
			case 1:
				mainImage.setVisible(true);
				graphB.setVisible(false);
				key = 2;
				break;
			case 2:
				mainImage.setVisible(false);
				graphB.setVisible(true);
				key = 3;
				break;
			case 3:
				mainImage.setVisible(false);
				graphB.setVisible(false);
				key = 1;
				break;
			default:
				break;
			}
			
		});
		cbAddiction.addComponentAsFirst(labAddiction);
		cbAddiction.addComponents(mpx, cbAlkohol, cbAmphetamin, cbBeruhigungsmittel, cbCanabis, cbHaluzinogen, cbKokain, cbOpioide, cbSchlafmittel, cbTabak);
		cbAddiction.addComponents(mpx, labSort, mpx, cbsortPrice, cbsortFall, cbsortGeschlecht, cbsortAge, agesort, abs, showgraph);
		cbAddiction.setMargin(new MarginInfo(true, false, false, true));
		grid.addComponent(cbAddiction, 1, 0);
		grid.addComponent(vl1, 0, 0);
		
		this.addComponent(grid);
		//grid.addComponent(component, column, row);
		//grid.addComponent(component, column, row);
	}
}
