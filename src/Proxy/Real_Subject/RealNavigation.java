package Proxy.Real_Subject;

import Proxy.Client.User;
import Proxy.Subject.Navigation;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * Lab Proxy Pattern
 * @author egs
 */
public class RealNavigation implements Navigation {

    @Override
    public void navigate(User user, String url) throws IOException, URISyntaxException {

        Desktop d = Desktop.getDesktop();

        d.browse(new URI(url));
    }
}

