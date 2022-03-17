/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import Models.User;
import javax.ws.rs.ClientErrorException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.WebTarget;

/**
 * Jersey REST client generated for REST resource:Tp1Rest [tp1rest]<br>
 * USAGE:
 * <pre>
 *        JerseyClient client = new JerseyClient();
 *        Object response = client.XXX(...);
 *        // do whatever with response
 *        client.close();
 * </pre>
 *
 * @author Lenovo
 */
public class JerseyClient {

    private WebTarget webTarget;
    private Client client;
    private static final String BASE_URI = "http://localhost:8080/TP1Rest/webresources";

    public JerseyClient() {
        client = javax.ws.rs.client.ClientBuilder.newClient();
        webTarget = client.target(BASE_URI).path("tp1rest");
    }

    public boolean ajouter(User user) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path("ajouter");
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(boolean.class);
    }

    public String getDivision(String a, String b) throws ClientErrorException {
        WebTarget resource = webTarget;
        if (a != null) {
            resource = resource.queryParam("a", a);
        }
        if (b != null) {
            resource = resource.queryParam("b", b);
        }
        resource = resource.path("division");
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(String.class);
    }

    public String getSomme() throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path("somme");
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(String.class);
    }

    public String getXml() throws ClientErrorException {
        WebTarget resource = webTarget;
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(String.class);
    }

    public void close() {
        client.close();
    }
    
}
