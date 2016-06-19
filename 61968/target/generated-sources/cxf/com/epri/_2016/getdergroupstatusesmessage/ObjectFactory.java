
package com.epri._2016.getdergroupstatusesmessage;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.epri._2016.getdergroupstatusesmessage package. 
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

    private final static QName _GetDERGroupStatusesResponseMessage_QNAME = new QName("http://www.epri.com/2016/GetDERGroupStatusesMessage", "GetDERGroupStatusesResponseMessage");
    private final static QName _GetDERGroupStatusesFaultMessage_QNAME = new QName("http://www.epri.com/2016/GetDERGroupStatusesMessage", "GetDERGroupStatusesFaultMessage");
    private final static QName _GetDERGroupStatusesRequestMessage_QNAME = new QName("http://www.epri.com/2016/GetDERGroupStatusesMessage", "GetDERGroupStatusesRequestMessage");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.epri._2016.getdergroupstatusesmessage
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetDERGroupStatusesRequestMessageType }
     * 
     */
    public GetDERGroupStatusesRequestMessageType createGetDERGroupStatusesRequestMessageType() {
        return new GetDERGroupStatusesRequestMessageType();
    }

    /**
     * Create an instance of {@link DERGroupStatusesPayloadType }
     * 
     */
    public DERGroupStatusesPayloadType createDERGroupStatusesPayloadType() {
        return new DERGroupStatusesPayloadType();
    }

    /**
     * Create an instance of {@link GetDERGroupStatusesFaultMessageType }
     * 
     */
    public GetDERGroupStatusesFaultMessageType createGetDERGroupStatusesFaultMessageType() {
        return new GetDERGroupStatusesFaultMessageType();
    }

    /**
     * Create an instance of {@link GetDERGroupStatusesResponseType }
     * 
     */
    public GetDERGroupStatusesResponseType createGetDERGroupStatusesResponseType() {
        return new GetDERGroupStatusesResponseType();
    }

    /**
     * Create an instance of {@link GetDERGroupStatusesResponseMessageType }
     * 
     */
    public GetDERGroupStatusesResponseMessageType createGetDERGroupStatusesResponseMessageType() {
        return new GetDERGroupStatusesResponseMessageType();
    }

    /**
     * Create an instance of {@link GetDERGroupStatusesRequestType }
     * 
     */
    public GetDERGroupStatusesRequestType createGetDERGroupStatusesRequestType() {
        return new GetDERGroupStatusesRequestType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDERGroupStatusesResponseMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epri.com/2016/GetDERGroupStatusesMessage", name = "GetDERGroupStatusesResponseMessage")
    public JAXBElement<GetDERGroupStatusesResponseMessageType> createGetDERGroupStatusesResponseMessage(GetDERGroupStatusesResponseMessageType value) {
        return new JAXBElement<GetDERGroupStatusesResponseMessageType>(_GetDERGroupStatusesResponseMessage_QNAME, GetDERGroupStatusesResponseMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDERGroupStatusesFaultMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epri.com/2016/GetDERGroupStatusesMessage", name = "GetDERGroupStatusesFaultMessage")
    public JAXBElement<GetDERGroupStatusesFaultMessageType> createGetDERGroupStatusesFaultMessage(GetDERGroupStatusesFaultMessageType value) {
        return new JAXBElement<GetDERGroupStatusesFaultMessageType>(_GetDERGroupStatusesFaultMessage_QNAME, GetDERGroupStatusesFaultMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDERGroupStatusesRequestMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epri.com/2016/GetDERGroupStatusesMessage", name = "GetDERGroupStatusesRequestMessage")
    public JAXBElement<GetDERGroupStatusesRequestMessageType> createGetDERGroupStatusesRequestMessage(GetDERGroupStatusesRequestMessageType value) {
        return new JAXBElement<GetDERGroupStatusesRequestMessageType>(_GetDERGroupStatusesRequestMessage_QNAME, GetDERGroupStatusesRequestMessageType.class, null, value);
    }

}
