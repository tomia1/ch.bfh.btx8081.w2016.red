package ch.bfh.btx8081.w2016.red.healthcaremonitor;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.google.gwt.dom.builder.shared.VideoBuilder;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.PasswordField;
import com.vaadin.ui.TextField;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.VerticalLayout;

public class LoginMenu extends VerticalLayout implements View {

	public LoginMenu(MyUI myui) {

		final VerticalLayout layout = new VerticalLayout();
		final Label label = new Label();
		final TextField name = new TextField();
		name.setCaption("Username");
		final PasswordField password = new PasswordField();
		password.setCaption("Password");

		Button button = new Button("Log-in");
		button.addClickListener(e -> {
			if (name.getValue().equals("usr") && password.getValue().equals("123")) {
				// layout.removeAllComponents();
				// this.addComponent(new MainMenu());
				label.setValue("PASSWORD OK");
				myui.getNavigator().navigateTo(myui.MAINVIEW);
			} else {
				label.setValue("WRONG USERNAME & PASSWORD");
			}
		});

		this.addComponents(label, name, password, button);
		this.setMargin(true);
		this.setSpacing(true);
		this.setComponentAlignment(label, Alignment.MIDDLE_CENTER );
		this.setComponentAlignment(name, Alignment.MIDDLE_CENTER );
		this.setComponentAlignment(password, Alignment.MIDDLE_CENTER );
		this.setComponentAlignment(button, Alignment.MIDDLE_CENTER );
		

		/*
		 * Button button = new Button("Go to Main View", new
		 * Button.ClickListener() {
		 * 
		 * @Override public void buttonClick(ClickEvent event) {
		 * myui.getNavigator().navigateTo(myui.MAINVIEW);
		 * 
		 * } }); addComponent(button); setComponentAlignment(button,
		 * Alignment.MIDDLE_CENTER);
		 */
	}

	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub

	}

}
