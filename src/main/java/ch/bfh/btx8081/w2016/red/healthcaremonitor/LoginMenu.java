package ch.bfh.btx8081.w2016.red.healthcaremonitor;

import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.google.gwt.dom.builder.shared.VideoBuilder;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.VerticalLayout;

public class LoginMenu extends VerticalLayout implements View {

	public LoginMenu() {
		Button button = new Button("Go to Main View", new Button.ClickListener() {

			@Override
			public void buttonClick(ClickEvent event) {
				

			}
		});
		addComponent(button);
		setComponentAlignment(button, Alignment.MIDDLE_CENTER);
	}

	

	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub

	}

}
