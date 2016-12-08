package ch.bfh.btx8081.w2016.red.healthcaremonitor;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.annotations.Widgetset;
import com.vaadin.data.Property;
import com.vaadin.data.Property.ValueChangeEvent;
import com.vaadin.server.FontAwesome;
import com.vaadin.server.Sizeable;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.shared.ui.MarginInfo;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Calendar;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.DateField;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.HorizontalSplitPanel;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.Label;
import com.vaadin.ui.LoginForm;
import com.vaadin.ui.PasswordField;
import com.vaadin.ui.TabSheet;
import com.vaadin.ui.Table;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

/**
 *
 */
@Theme("mytheme")
@Widgetset("ch.bfh.btx8081.w2016.red.healthcaremonitor.MyAppWidgetset")
public class MyUI extends UI {

	VerticalLayout layout = new VerticalLayout();
	TextField userName = new TextField("Username :");
	PasswordField password = new PasswordField("Password :");
	Button loginBt = new Button("Login");
	Label lab = new Label();
	
	@Override
	protected void init(VaadinRequest vaadinRequest) {
		
		
		layout.setSpacing(true);
        layout.setMargin(true);
        layout.addComponent(lab);
        layout.addComponent(userName);
        layout.addComponent(password);
        layout.addComponent(loginBt);
        layout.setComponentAlignment(loginBt, Alignment.BOTTOM_LEFT);
        
        loginBt.addListener(new ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				login();
				
			}
		});
	}

	protected void login() {
		// TODO Auto-generated method stub
		if(userName.getValue().equals("usr") && password.getValue().equals("pw")){
			lab.setValue("OK");
		} else{
			lab.setValue("NOK");
		}
	}

	@WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
	@VaadinServletConfiguration(ui = MyUI.class, productionMode = false)
	public static class MyUIServlet extends VaadinServlet {
	}
}