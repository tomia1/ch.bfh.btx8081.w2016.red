package ch.bfh.btx8081.w2016.red.healthcaremonitor;

import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.Widget;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.server.FontAwesome;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.TabSheet;
import com.vaadin.ui.VerticalLayout;

public class MainMenu extends HorizontalLayout implements View{

	
	
	public MainMenu(MyUI myui) {
		
		TabSheet tabsheet = new TabSheet();
		this.setSizeFull();
		tabsheet.setSizeFull();

		VerticalLayout tabCostumers = new TabHospital(this);
		VerticalLayout tabCalendar = new VerticalLayout();
		VerticalLayout tabStorage = new VerticalLayout();
		VerticalLayout tabRental = new VerticalLayout();

		tabsheet.addTab(tabCostumers, "INSTITUTION", FontAwesome.HOSPITAL_O);
		tabsheet.addTab(tabCalendar, "PATIENT", FontAwesome.USER);
		tabsheet.addTab(tabStorage, "ADDICTIONS", FontAwesome.MEDKIT );
		tabsheet.addTab(tabRental, "TREATMENT", FontAwesome.STETHOSCOPE);
		
		this.addComponent(tabsheet);
		
		//bt1.addClickListener(e -> {
		//	myui.getNavigator().navigateTo("");
		//});
	}

	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub
		
	}
}
