
package service;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "VoitureService", targetNamespace = "http://service/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface VoitureService {


    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "delete", targetNamespace = "http://service/", className = "service.Delete")
    @ResponseWrapper(localName = "deleteResponse", targetNamespace = "http://service/", className = "service.DeleteResponse")
    @Action(input = "http://service/VoitureService/deleteRequest", output = "http://service/VoitureService/deleteResponse")
    public boolean delete(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param v
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "modifier", targetNamespace = "http://service/", className = "service.Modifier")
    @ResponseWrapper(localName = "modifierResponse", targetNamespace = "http://service/", className = "service.ModifierResponse")
    @Action(input = "http://service/VoitureService/modifierRequest", output = "http://service/VoitureService/modifierResponse")
    public boolean modifier(
        @WebParam(name = "v", targetNamespace = "")
        Voiture v);

    /**
     * 
     * @return
     *     returns java.util.List<service.Voiture>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "afficher", targetNamespace = "http://service/", className = "service.Afficher")
    @ResponseWrapper(localName = "afficherResponse", targetNamespace = "http://service/", className = "service.AfficherResponse")
    @Action(input = "http://service/VoitureService/afficherRequest", output = "http://service/VoitureService/afficherResponse")
    public List<Voiture> afficher();

    /**
     * 
     * @param arg0
     * @return
     *     returns service.Voiture
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getSingledem", targetNamespace = "http://service/", className = "service.GetSingledem")
    @ResponseWrapper(localName = "getSingledemResponse", targetNamespace = "http://service/", className = "service.GetSingledemResponse")
    @Action(input = "http://service/VoitureService/getSingledemRequest", output = "http://service/VoitureService/getSingledemResponse")
    public Voiture getSingledem(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod(operationName = "AjouterV")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "AjouterV", targetNamespace = "http://service/", className = "service.AjouterV")
    @ResponseWrapper(localName = "AjouterVResponse", targetNamespace = "http://service/", className = "service.AjouterVResponse")
    @Action(input = "http://service/VoitureService/AjouterVRequest", output = "http://service/VoitureService/AjouterVResponse")
    public boolean ajouterV(
        @WebParam(name = "arg0", targetNamespace = "")
        Voiture arg0);

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg5
     * @param arg4
     * @param arg1
     * @param arg0
     * @param arg7
     * @param arg6
     * @param arg8
     * @return
     *     returns service.Voiture
     */
    @WebMethod(operationName = "AjouterVoiture")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "AjouterVoiture", targetNamespace = "http://service/", className = "service.AjouterVoiture")
    @ResponseWrapper(localName = "AjouterVoitureResponse", targetNamespace = "http://service/", className = "service.AjouterVoitureResponse")
    @Action(input = "http://service/VoitureService/AjouterVoitureRequest", output = "http://service/VoitureService/AjouterVoitureResponse")
    public Voiture ajouterVoiture(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        String arg3,
        @WebParam(name = "arg4", targetNamespace = "")
        int arg4,
        @WebParam(name = "arg5", targetNamespace = "")
        int arg5,
        @WebParam(name = "arg6", targetNamespace = "")
        String arg6,
        @WebParam(name = "arg7", targetNamespace = "")
        String arg7,
        @WebParam(name = "arg8", targetNamespace = "")
        String arg8);

}