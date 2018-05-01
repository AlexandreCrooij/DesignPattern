package Proxy.Subject;

import Proxy.Client.User;

import java.io.IOException;
import java.net.URISyntaxException;

/**
 * Lab Proxy Pattern
 * @author egs
 */
public interface Navigation {
    void navigate(User user, String url) throws IOException, URISyntaxException;
}
