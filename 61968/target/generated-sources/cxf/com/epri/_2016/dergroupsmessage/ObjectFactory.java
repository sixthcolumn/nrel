
package com.epri._2016.dergroupsmessage;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.epri._2016.dergroupsmessage package. 
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

    private final static QName _ChangeDERGroups_QNAME = new QName("http://www.epri.com/2016/DERGroupsMessage", "ChangeDERGroups");
    private final static QName _ClosedDERGroups_QNAME = new QName("http://www.epri.com/2016/DERGroupsMessage", "ClosedDERGroups");
    private final static QName _CreateDERGroups_QNAME = new QName("http://www.epri.com/2016/DERGroupsMessage", "CreateDERGroups");
    private final static QName _CanceledDERGroups_QNAME = new QName("http://www.epri.com/2016/DERGroupsMessage", "CanceledDERGroups");
    private final static QName _DeletedDERGroups_QNAME = new QName("http://www.epri.com/2016/DERGroupsMessage", "DeletedDERGroups");
    private final static QName _DERGroupsFaultMessage_QNAME = new QName("http://www.epri.com/2016/DERGroupsMessage", "DERGroupsFaultMessage");
    private final static QName _CloseDERGroups_QNAME = new QName("http://www.epri.com/2016/DERGroupsMessage", "CloseDERGroups");
    private final static QName _CancelDERGroups_QNAME = new QName("http://www.epri.com/2016/DERGroupsMessage", "CancelDERGroups");
    private final static QName _DeleteDERGroups_QNAME = new QName("http://www.epri.com/2016/DERGroupsMessage", "DeleteDERGroups");
    private final static QName _ChangedDERGroups_QNAME = new QName("http://www.epri.com/2016/DERGroupsMessage", "ChangedDERGroups");
    private final static QName _CreatedDERGroups_QNAME = new QName("http://www.epri.com/2016/DERGroupsMessage", "CreatedDERGroups");
    private final static QName _DERGroupsResponseMessage_QNAME = new QName("http://www.epri.com/2016/DERGroupsMessage", "DERGroupsResponseMessage");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.epri._2016.dergroupsmessage
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DERGroupsPayloadType }
     * 
     */
    public DERGroupsPayloadType createDERGroupsPayloadType() {
        return new DERGroupsPayloadType();
    }

    /**
     * Create an instance of {@link DERGroupsResponseMessageType }
     * 
     */
    public DERGroupsResponseMessageType createDERGroupsResponseMessageType() {
        return new DERGroupsResponseMessageType();
    }

    /**
     * Create an instance of {@link DERGroupsFaultMessageType }
     * 
     */
    public DERGroupsFaultMessageType createDERGroupsFaultMessageType() {
        return new DERGroupsFaultMessageType();
    }

    /**
     * Create an instance of {@link DERGroupsRequestMessageType }
     * 
     */
    public DERGroupsRequestMessageType createDERGroupsRequestMessageType() {
        return new DERGroupsRequestMessageType();
    }

    /**
     * Create an instance of {@link DERGroupsEventMessageType }
     * 
     */
    public DERGroupsEventMessageType createDERGroupsEventMessageType() {
        return new DERGroupsEventMessageType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DERGroupsRequestMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epri.com/2016/DERGroupsMessage", name = "ChangeDERGroups")
    public JAXBElement<DERGroupsRequestMessageType> createChangeDERGroups(DERGroupsRequestMessageType value) {
        return new JAXBElement<DERGroupsRequestMessageType>(_ChangeDERGroups_QNAME, DERGroupsRequestMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DERGroupsEventMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epri.com/2016/DERGroupsMessage", name = "ClosedDERGroups")
    public JAXBElement<DERGroupsEventMessageType> createClosedDERGroups(DERGroupsEventMessageType value) {
        return new JAXBElement<DERGroupsEventMessageType>(_ClosedDERGroups_QNAME, DERGroupsEventMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DERGroupsRequestMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epri.com/2016/DERGroupsMessage", name = "CreateDERGroups")
    public JAXBElement<DERGroupsRequestMessageType> createCreateDERGroups(DERGroupsRequestMessageType value) {
        return new JAXBElement<DERGroupsRequestMessageType>(_CreateDERGroups_QNAME, DERGroupsRequestMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DERGroupsEventMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epri.com/2016/DERGroupsMessage", name = "CanceledDERGroups")
    public JAXBElement<DERGroupsEventMessageType> createCanceledDERGroups(DERGroupsEventMessageType value) {
        return new JAXBElement<DERGroupsEventMessageType>(_CanceledDERGroups_QNAME, DERGroupsEventMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DERGroupsEventMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epri.com/2016/DERGroupsMessage", name = "DeletedDERGroups")
    public JAXBElement<DERGroupsEventMessageType> createDeletedDERGroups(DERGroupsEventMessageType value) {
        return new JAXBElement<DERGroupsEventMessageType>(_DeletedDERGroups_QNAME, DERGroupsEventMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DERGroupsFaultMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epri.com/2016/DERGroupsMessage", name = "DERGroupsFaultMessage")
    public JAXBElement<DERGroupsFaultMessageType> createDERGroupsFaultMessage(DERGroupsFaultMessageType value) {
        return new JAXBElement<DERGroupsFaultMessageType>(_DERGroupsFaultMessage_QNAME, DERGroupsFaultMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DERGroupsRequestMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epri.com/2016/DERGroupsMessage", name = "CloseDERGroups")
    public JAXBElement<DERGroupsRequestMessageType> createCloseDERGroups(DERGroupsRequestMessageType value) {
        return new JAXBElement<DERGroupsRequestMessageType>(_CloseDERGroups_QNAME, DERGroupsRequestMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DERGroupsRequestMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epri.com/2016/DERGroupsMessage", name = "CancelDERGroups")
    public JAXBElement<DERGroupsRequestMessageType> createCancelDERGroups(DERGroupsRequestMessageType value) {
        return new JAXBElement<DERGroupsRequestMessageType>(_CancelDERGroups_QNAME, DERGroupsRequestMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DERGroupsRequestMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epri.com/2016/DERGroupsMessage", name = "DeleteDERGroups")
    public JAXBElement<DERGroupsRequestMessageType> createDeleteDERGroups(DERGroupsRequestMessageType value) {
        return new JAXBElement<DERGroupsRequestMessageType>(_DeleteDERGroups_QNAME, DERGroupsRequestMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DERGroupsEventMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epri.com/2016/DERGroupsMessage", name = "ChangedDERGroups")
    public JAXBElement<DERGroupsEventMessageType> createChangedDERGroups(DERGroupsEventMessageType value) {
        return new JAXBElement<DERGroupsEventMessageType>(_ChangedDERGroups_QNAME, DERGroupsEventMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DERGroupsEventMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epri.com/2016/DERGroupsMessage", name = "CreatedDERGroups")
    public JAXBElement<DERGroupsEventMessageType> createCreatedDERGroups(DERGroupsEventMessageType value) {
        return new JAXBElement<DERGroupsEventMessageType>(_CreatedDERGroups_QNAME, DERGroupsEventMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DERGroupsResponseMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epri.com/2016/DERGroupsMessage", name = "DERGroupsResponseMessage")
    public JAXBElement<DERGroupsResponseMessageType> createDERGroupsResponseMessage(DERGroupsResponseMessageType value) {
        return new JAXBElement<DERGroupsResponseMessageType>(_DERGroupsResponseMessage_QNAME, DERGroupsResponseMessageType.class, null, value);
    }

}
