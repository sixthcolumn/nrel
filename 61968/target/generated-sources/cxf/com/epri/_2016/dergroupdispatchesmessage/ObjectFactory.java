
package com.epri._2016.dergroupdispatchesmessage;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.epri._2016.dergroupdispatchesmessage package. 
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

    private final static QName _DERGroupDispatchesFaultMessage_QNAME = new QName("http://www.epri.com/2016/DERGroupDispatchesMessage", "DERGroupDispatchesFaultMessage");
    private final static QName _CanceledDERGroupDispatches_QNAME = new QName("http://www.epri.com/2016/DERGroupDispatchesMessage", "CanceledDERGroupDispatches");
    private final static QName _ChangeDERGroupDispatches_QNAME = new QName("http://www.epri.com/2016/DERGroupDispatchesMessage", "ChangeDERGroupDispatches");
    private final static QName _CreatedDERGroupDispatches_QNAME = new QName("http://www.epri.com/2016/DERGroupDispatchesMessage", "CreatedDERGroupDispatches");
    private final static QName _ClosedDERGroupDispatches_QNAME = new QName("http://www.epri.com/2016/DERGroupDispatchesMessage", "ClosedDERGroupDispatches");
    private final static QName _DeletedDERGroupDispatches_QNAME = new QName("http://www.epri.com/2016/DERGroupDispatchesMessage", "DeletedDERGroupDispatches");
    private final static QName _CreateDERGroupDispatches_QNAME = new QName("http://www.epri.com/2016/DERGroupDispatchesMessage", "CreateDERGroupDispatches");
    private final static QName _CloseDERGroupDispatches_QNAME = new QName("http://www.epri.com/2016/DERGroupDispatchesMessage", "CloseDERGroupDispatches");
    private final static QName _DERGroupDispatchesResponseMessage_QNAME = new QName("http://www.epri.com/2016/DERGroupDispatchesMessage", "DERGroupDispatchesResponseMessage");
    private final static QName _DeleteDERGroupDispatches_QNAME = new QName("http://www.epri.com/2016/DERGroupDispatchesMessage", "DeleteDERGroupDispatches");
    private final static QName _CancelDERGroupDispatches_QNAME = new QName("http://www.epri.com/2016/DERGroupDispatchesMessage", "CancelDERGroupDispatches");
    private final static QName _ChangedDERGroupDispatches_QNAME = new QName("http://www.epri.com/2016/DERGroupDispatchesMessage", "ChangedDERGroupDispatches");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.epri._2016.dergroupdispatchesmessage
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DERGroupDispatchesFaultMessageType }
     * 
     */
    public DERGroupDispatchesFaultMessageType createDERGroupDispatchesFaultMessageType() {
        return new DERGroupDispatchesFaultMessageType();
    }

    /**
     * Create an instance of {@link DERGroupDispatchesResponseMessageType }
     * 
     */
    public DERGroupDispatchesResponseMessageType createDERGroupDispatchesResponseMessageType() {
        return new DERGroupDispatchesResponseMessageType();
    }

    /**
     * Create an instance of {@link DERGroupDispatchesRequestMessageType }
     * 
     */
    public DERGroupDispatchesRequestMessageType createDERGroupDispatchesRequestMessageType() {
        return new DERGroupDispatchesRequestMessageType();
    }

    /**
     * Create an instance of {@link DERGroupDispatchesPayloadType }
     * 
     */
    public DERGroupDispatchesPayloadType createDERGroupDispatchesPayloadType() {
        return new DERGroupDispatchesPayloadType();
    }

    /**
     * Create an instance of {@link DERGroupDispatchesEventMessageType }
     * 
     */
    public DERGroupDispatchesEventMessageType createDERGroupDispatchesEventMessageType() {
        return new DERGroupDispatchesEventMessageType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DERGroupDispatchesFaultMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epri.com/2016/DERGroupDispatchesMessage", name = "DERGroupDispatchesFaultMessage")
    public JAXBElement<DERGroupDispatchesFaultMessageType> createDERGroupDispatchesFaultMessage(DERGroupDispatchesFaultMessageType value) {
        return new JAXBElement<DERGroupDispatchesFaultMessageType>(_DERGroupDispatchesFaultMessage_QNAME, DERGroupDispatchesFaultMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DERGroupDispatchesEventMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epri.com/2016/DERGroupDispatchesMessage", name = "CanceledDERGroupDispatches")
    public JAXBElement<DERGroupDispatchesEventMessageType> createCanceledDERGroupDispatches(DERGroupDispatchesEventMessageType value) {
        return new JAXBElement<DERGroupDispatchesEventMessageType>(_CanceledDERGroupDispatches_QNAME, DERGroupDispatchesEventMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DERGroupDispatchesRequestMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epri.com/2016/DERGroupDispatchesMessage", name = "ChangeDERGroupDispatches")
    public JAXBElement<DERGroupDispatchesRequestMessageType> createChangeDERGroupDispatches(DERGroupDispatchesRequestMessageType value) {
        return new JAXBElement<DERGroupDispatchesRequestMessageType>(_ChangeDERGroupDispatches_QNAME, DERGroupDispatchesRequestMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DERGroupDispatchesEventMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epri.com/2016/DERGroupDispatchesMessage", name = "CreatedDERGroupDispatches")
    public JAXBElement<DERGroupDispatchesEventMessageType> createCreatedDERGroupDispatches(DERGroupDispatchesEventMessageType value) {
        return new JAXBElement<DERGroupDispatchesEventMessageType>(_CreatedDERGroupDispatches_QNAME, DERGroupDispatchesEventMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DERGroupDispatchesEventMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epri.com/2016/DERGroupDispatchesMessage", name = "ClosedDERGroupDispatches")
    public JAXBElement<DERGroupDispatchesEventMessageType> createClosedDERGroupDispatches(DERGroupDispatchesEventMessageType value) {
        return new JAXBElement<DERGroupDispatchesEventMessageType>(_ClosedDERGroupDispatches_QNAME, DERGroupDispatchesEventMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DERGroupDispatchesEventMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epri.com/2016/DERGroupDispatchesMessage", name = "DeletedDERGroupDispatches")
    public JAXBElement<DERGroupDispatchesEventMessageType> createDeletedDERGroupDispatches(DERGroupDispatchesEventMessageType value) {
        return new JAXBElement<DERGroupDispatchesEventMessageType>(_DeletedDERGroupDispatches_QNAME, DERGroupDispatchesEventMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DERGroupDispatchesRequestMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epri.com/2016/DERGroupDispatchesMessage", name = "CreateDERGroupDispatches")
    public JAXBElement<DERGroupDispatchesRequestMessageType> createCreateDERGroupDispatches(DERGroupDispatchesRequestMessageType value) {
        return new JAXBElement<DERGroupDispatchesRequestMessageType>(_CreateDERGroupDispatches_QNAME, DERGroupDispatchesRequestMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DERGroupDispatchesRequestMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epri.com/2016/DERGroupDispatchesMessage", name = "CloseDERGroupDispatches")
    public JAXBElement<DERGroupDispatchesRequestMessageType> createCloseDERGroupDispatches(DERGroupDispatchesRequestMessageType value) {
        return new JAXBElement<DERGroupDispatchesRequestMessageType>(_CloseDERGroupDispatches_QNAME, DERGroupDispatchesRequestMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DERGroupDispatchesResponseMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epri.com/2016/DERGroupDispatchesMessage", name = "DERGroupDispatchesResponseMessage")
    public JAXBElement<DERGroupDispatchesResponseMessageType> createDERGroupDispatchesResponseMessage(DERGroupDispatchesResponseMessageType value) {
        return new JAXBElement<DERGroupDispatchesResponseMessageType>(_DERGroupDispatchesResponseMessage_QNAME, DERGroupDispatchesResponseMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DERGroupDispatchesRequestMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epri.com/2016/DERGroupDispatchesMessage", name = "DeleteDERGroupDispatches")
    public JAXBElement<DERGroupDispatchesRequestMessageType> createDeleteDERGroupDispatches(DERGroupDispatchesRequestMessageType value) {
        return new JAXBElement<DERGroupDispatchesRequestMessageType>(_DeleteDERGroupDispatches_QNAME, DERGroupDispatchesRequestMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DERGroupDispatchesRequestMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epri.com/2016/DERGroupDispatchesMessage", name = "CancelDERGroupDispatches")
    public JAXBElement<DERGroupDispatchesRequestMessageType> createCancelDERGroupDispatches(DERGroupDispatchesRequestMessageType value) {
        return new JAXBElement<DERGroupDispatchesRequestMessageType>(_CancelDERGroupDispatches_QNAME, DERGroupDispatchesRequestMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DERGroupDispatchesEventMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epri.com/2016/DERGroupDispatchesMessage", name = "ChangedDERGroupDispatches")
    public JAXBElement<DERGroupDispatchesEventMessageType> createChangedDERGroupDispatches(DERGroupDispatchesEventMessageType value) {
        return new JAXBElement<DERGroupDispatchesEventMessageType>(_ChangedDERGroupDispatches_QNAME, DERGroupDispatchesEventMessageType.class, null, value);
    }

}
