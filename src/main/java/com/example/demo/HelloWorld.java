
package com.example.demo;

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
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "HelloWorld", targetNamespace = "http://example/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface HelloWorld {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "sayHelloWorldFrom", targetNamespace = "http://example/", className = "com.example.demo.SayHelloWorldFrom")
    @ResponseWrapper(localName = "sayHelloWorldFromResponse", targetNamespace = "http://example/", className = "com.example.demo.SayHelloWorldFromResponse")
    @Action(input = "http://example/HelloWorld/sayHelloWorldFromRequest", output = "http://example/HelloWorld/sayHelloWorldFromResponse")
    public String sayHelloWorldFrom(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "totalValue", targetNamespace = "http://example/", className = "com.example.demo.TotalValue")
    @ResponseWrapper(localName = "totalValueResponse", targetNamespace = "http://example/", className = "com.example.demo.TotalValueResponse")
    @Action(input = "http://example/HelloWorld/totalValueRequest", output = "http://example/HelloWorld/totalValueResponse")
    public int totalValue(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1);

    /**
     * 
     * @return
     *     returns java.util.List<com.example.demo.Room>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllRooms", targetNamespace = "http://example/", className = "com.example.demo.GetAllRooms")
    @ResponseWrapper(localName = "getAllRoomsResponse", targetNamespace = "http://example/", className = "com.example.demo.GetAllRoomsResponse")
    @Action(input = "http://example/HelloWorld/getAllRoomsRequest", output = "http://example/HelloWorld/getAllRoomsResponse")
    public List<Room> getAllRooms();

}
