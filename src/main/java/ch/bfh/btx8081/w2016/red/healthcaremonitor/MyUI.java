package ch.bfh.btx8081.w2016.red.healthcaremonitor;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.navigator.Navigator;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.PasswordField;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

/**
 * This UI is the application entry point. A UI may either represent a browser window 
 * (or tab) or some part of a html page where a Vaadin application is embedded.
 * <p>
 * The UI is initialized using {@link #init(VaadinRequest)}. This method is intended to be 
 * overridden to add component to the user interface and initialize non-component functionality.
 */
@Theme("mytheme")
public class MyUI extends UI {
	
	private Navigator navigator;
    protected static final String MAINVIEW = "main";

    @Override
    protected void init(VaadinRequest vaadinRequest) {
       
    	
    	
    	getPage().setTitle("Navigation Example");

        // Create a navigator to control the views
        navigator = new Navigator(this, this);

        // Create and register the views
       // navigator.addView("", new StartView());
        navigator.addView(MAINVIEW, new LoginMenu());
        
        /*final VerticalLayout layout = new VerticalLayout();
        final Label label = new Label();
        final TextField name = new TextField();
        name.setCaption("Username");
        final PasswordField password = new PasswordField();
        password.setCaption("Password");

        Button button = new Button("Click Me");
        button.addClickListener( e -> {
        	if(name.getValue().equals("usr") && password.getValue().equals("123")){
        		layout.removeAllComponents();
            	layout.addComponent(new MainMenu());
        	} else{
        		
        	}
        });
        
        layout.addComponents(label, name, password, button);
        layout.setMargin(true);
        layout.setSpacing(true);
        
        setContent(layout);*/
    }

    @WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = MyUI.class, productionMode = false)
    public static class MyUIServlet extends VaadinServlet {
    }
}
