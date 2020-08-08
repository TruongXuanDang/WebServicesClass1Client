
package com.example.demo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.demo package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _TotalValue_QNAME = new QName("http://example/", "totalValue");
    private final static QName _TotalValueResponse_QNAME = new QName("http://example/", "totalValueResponse");
    private final static QName _GetAllRoomsResponse_QNAME = new QName("http://example/", "getAllRoomsResponse");
    private final static QName _SayHelloWorldFrom_QNAME = new QName("http://example/", "sayHelloWorldFrom");
    private final static QName _GetAllRooms_QNAME = new QName("http://example/", "getAllRooms");
    private final static QName _SayHelloWorldFromResponse_QNAME = new QName("http://example/", "sayHelloWorldFromResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.demo
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TotalValue }
     * 
     */
    public TotalValue createTotalValue() {
        return new TotalValue();
    }

    /**
     * Create an instance of {@link TotalValueResponse }
     * 
     */
    public TotalValueResponse createTotalValueResponse() {
        return new TotalValueResponse();
    }

    /**
     * Create an instance of {@link GetAllRoomsResponse }
     * 
     */
    public GetAllRoomsResponse createGetAllRoomsResponse() {
        return new GetAllRoomsResponse();
    }

    /**
     * Create an instance of {@link SayHelloWorldFromResponse }
     * 
     */
    public SayHelloWorldFromResponse createSayHelloWorldFromResponse() {
        return new SayHelloWorldFromResponse();
    }

    /**
     * Create an instance of {@link SayHelloWorldFrom }
     * 
     */
    public SayHelloWorldFrom createSayHelloWorldFrom() {
        return new SayHelloWorldFrom();
    }

    /**
     * Create an instance of {@link GetAllRooms }
     * 
     */
    public GetAllRooms createGetAllRooms() {
        return new GetAllRooms();
    }

    /**
     * Create an instance of {@link Room }
     * 
     */
    public Room createRoom() {
        return new Room();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TotalValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://example/", name = "totalValue")
    public JAXBElement<TotalValue> createTotalValue(TotalValue value) {
        return new JAXBElement<TotalValue>(_TotalValue_QNAME, TotalValue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TotalValueResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://example/", name = "totalValueResponse")
    public JAXBElement<TotalValueResponse> createTotalValueResponse(TotalValueResponse value) {
        return new JAXBElement<TotalValueResponse>(_TotalValueResponse_QNAME, TotalValueResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllRoomsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://example/", name = "getAllRoomsResponse")
    public JAXBElement<GetAllRoomsResponse> createGetAllRoomsResponse(GetAllRoomsResponse value) {
        return new JAXBElement<GetAllRoomsResponse>(_GetAllRoomsResponse_QNAME, GetAllRoomsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHelloWorldFrom }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://example/", name = "sayHelloWorldFrom")
    public JAXBElement<SayHelloWorldFrom> createSayHelloWorldFrom(SayHelloWorldFrom value) {
        return new JAXBElement<SayHelloWorldFrom>(_SayHelloWorldFrom_QNAME, SayHelloWorldFrom.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllRooms }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://example/", name = "getAllRooms")
    public JAXBElement<GetAllRooms> createGetAllRooms(GetAllRooms value) {
        return new JAXBElement<GetAllRooms>(_GetAllRooms_QNAME, GetAllRooms.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHelloWorldFromResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://example/", name = "sayHelloWorldFromResponse")
    public JAXBElement<SayHelloWorldFromResponse> createSayHelloWorldFromResponse(SayHelloWorldFromResponse value) {
        return new JAXBElement<SayHelloWorldFromResponse>(_SayHelloWorldFromResponse_QNAME, SayHelloWorldFromResponse.class, null, value);
    }

}
