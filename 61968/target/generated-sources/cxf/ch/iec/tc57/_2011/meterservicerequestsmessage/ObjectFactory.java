
package ch.iec.tc57._2011.meterservicerequestsmessage;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ch.iec.tc57._2011.meterservicerequestsmessage package. 
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

    private final static QName _DeletedMeterServiceRequests_QNAME = new QName("http://www.iec.ch/TC57/2011/MeterServiceRequestsMessage", "DeletedMeterServiceRequests");
    private final static QName _CloseMeterServiceRequests_QNAME = new QName("http://www.iec.ch/TC57/2011/MeterServiceRequestsMessage", "CloseMeterServiceRequests");
    private final static QName _CreateMeterServiceRequests_QNAME = new QName("http://www.iec.ch/TC57/2011/MeterServiceRequestsMessage", "CreateMeterServiceRequests");
    private final static QName _MeterServiceRequestsResponseMessage_QNAME = new QName("http://www.iec.ch/TC57/2011/MeterServiceRequestsMessage", "MeterServiceRequestsResponseMessage");
    private final static QName _CreatedMeterServiceRequests_QNAME = new QName("http://www.iec.ch/TC57/2011/MeterServiceRequestsMessage", "CreatedMeterServiceRequests");
    private final static QName _CanceledMeterServiceRequests_QNAME = new QName("http://www.iec.ch/TC57/2011/MeterServiceRequestsMessage", "CanceledMeterServiceRequests");
    private final static QName _MeterServiceRequestsRequestMessage_QNAME = new QName("http://www.iec.ch/TC57/2011/MeterServiceRequestsMessage", "MeterServiceRequestsRequestMessage");
    private final static QName _MeterServiceRequestsFaultMessage_QNAME = new QName("http://www.iec.ch/TC57/2011/MeterServiceRequestsMessage", "MeterServiceRequestsFaultMessage");
    private final static QName _CancelMeterServiceRequests_QNAME = new QName("http://www.iec.ch/TC57/2011/MeterServiceRequestsMessage", "CancelMeterServiceRequests");
    private final static QName _ClosedMeterServiceRequests_QNAME = new QName("http://www.iec.ch/TC57/2011/MeterServiceRequestsMessage", "ClosedMeterServiceRequests");
    private final static QName _ChangedMeterServiceRequests_QNAME = new QName("http://www.iec.ch/TC57/2011/MeterServiceRequestsMessage", "ChangedMeterServiceRequests");
    private final static QName _ChangeMeterServiceRequests_QNAME = new QName("http://www.iec.ch/TC57/2011/MeterServiceRequestsMessage", "ChangeMeterServiceRequests");
    private final static QName _DeleteMeterServiceRequests_QNAME = new QName("http://www.iec.ch/TC57/2011/MeterServiceRequestsMessage", "DeleteMeterServiceRequests");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ch.iec.tc57._2011.meterservicerequestsmessage
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MeterServiceRequestsEventMessageType }
     * 
     */
    public MeterServiceRequestsEventMessageType createMeterServiceRequestsEventMessageType() {
        return new MeterServiceRequestsEventMessageType();
    }

    /**
     * Create an instance of {@link MeterServiceRequestsFaultMessageType }
     * 
     */
    public MeterServiceRequestsFaultMessageType createMeterServiceRequestsFaultMessageType() {
        return new MeterServiceRequestsFaultMessageType();
    }

    /**
     * Create an instance of {@link MeterServiceRequestsResponseMessageType }
     * 
     */
    public MeterServiceRequestsResponseMessageType createMeterServiceRequestsResponseMessageType() {
        return new MeterServiceRequestsResponseMessageType();
    }

    /**
     * Create an instance of {@link MeterServiceRequestsRequestMessageType }
     * 
     */
    public MeterServiceRequestsRequestMessageType createMeterServiceRequestsRequestMessageType() {
        return new MeterServiceRequestsRequestMessageType();
    }

    /**
     * Create an instance of {@link MeterServiceRequestsPayloadType }
     * 
     */
    public MeterServiceRequestsPayloadType createMeterServiceRequestsPayloadType() {
        return new MeterServiceRequestsPayloadType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeterServiceRequestsEventMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iec.ch/TC57/2011/MeterServiceRequestsMessage", name = "DeletedMeterServiceRequests")
    public JAXBElement<MeterServiceRequestsEventMessageType> createDeletedMeterServiceRequests(MeterServiceRequestsEventMessageType value) {
        return new JAXBElement<MeterServiceRequestsEventMessageType>(_DeletedMeterServiceRequests_QNAME, MeterServiceRequestsEventMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeterServiceRequestsRequestMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iec.ch/TC57/2011/MeterServiceRequestsMessage", name = "CloseMeterServiceRequests")
    public JAXBElement<MeterServiceRequestsRequestMessageType> createCloseMeterServiceRequests(MeterServiceRequestsRequestMessageType value) {
        return new JAXBElement<MeterServiceRequestsRequestMessageType>(_CloseMeterServiceRequests_QNAME, MeterServiceRequestsRequestMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeterServiceRequestsRequestMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iec.ch/TC57/2011/MeterServiceRequestsMessage", name = "CreateMeterServiceRequests")
    public JAXBElement<MeterServiceRequestsRequestMessageType> createCreateMeterServiceRequests(MeterServiceRequestsRequestMessageType value) {
        return new JAXBElement<MeterServiceRequestsRequestMessageType>(_CreateMeterServiceRequests_QNAME, MeterServiceRequestsRequestMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeterServiceRequestsResponseMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iec.ch/TC57/2011/MeterServiceRequestsMessage", name = "MeterServiceRequestsResponseMessage")
    public JAXBElement<MeterServiceRequestsResponseMessageType> createMeterServiceRequestsResponseMessage(MeterServiceRequestsResponseMessageType value) {
        return new JAXBElement<MeterServiceRequestsResponseMessageType>(_MeterServiceRequestsResponseMessage_QNAME, MeterServiceRequestsResponseMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeterServiceRequestsEventMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iec.ch/TC57/2011/MeterServiceRequestsMessage", name = "CreatedMeterServiceRequests")
    public JAXBElement<MeterServiceRequestsEventMessageType> createCreatedMeterServiceRequests(MeterServiceRequestsEventMessageType value) {
        return new JAXBElement<MeterServiceRequestsEventMessageType>(_CreatedMeterServiceRequests_QNAME, MeterServiceRequestsEventMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeterServiceRequestsEventMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iec.ch/TC57/2011/MeterServiceRequestsMessage", name = "CanceledMeterServiceRequests")
    public JAXBElement<MeterServiceRequestsEventMessageType> createCanceledMeterServiceRequests(MeterServiceRequestsEventMessageType value) {
        return new JAXBElement<MeterServiceRequestsEventMessageType>(_CanceledMeterServiceRequests_QNAME, MeterServiceRequestsEventMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeterServiceRequestsRequestMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iec.ch/TC57/2011/MeterServiceRequestsMessage", name = "MeterServiceRequestsRequestMessage")
    public JAXBElement<MeterServiceRequestsRequestMessageType> createMeterServiceRequestsRequestMessage(MeterServiceRequestsRequestMessageType value) {
        return new JAXBElement<MeterServiceRequestsRequestMessageType>(_MeterServiceRequestsRequestMessage_QNAME, MeterServiceRequestsRequestMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeterServiceRequestsFaultMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iec.ch/TC57/2011/MeterServiceRequestsMessage", name = "MeterServiceRequestsFaultMessage")
    public JAXBElement<MeterServiceRequestsFaultMessageType> createMeterServiceRequestsFaultMessage(MeterServiceRequestsFaultMessageType value) {
        return new JAXBElement<MeterServiceRequestsFaultMessageType>(_MeterServiceRequestsFaultMessage_QNAME, MeterServiceRequestsFaultMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeterServiceRequestsRequestMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iec.ch/TC57/2011/MeterServiceRequestsMessage", name = "CancelMeterServiceRequests")
    public JAXBElement<MeterServiceRequestsRequestMessageType> createCancelMeterServiceRequests(MeterServiceRequestsRequestMessageType value) {
        return new JAXBElement<MeterServiceRequestsRequestMessageType>(_CancelMeterServiceRequests_QNAME, MeterServiceRequestsRequestMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeterServiceRequestsEventMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iec.ch/TC57/2011/MeterServiceRequestsMessage", name = "ClosedMeterServiceRequests")
    public JAXBElement<MeterServiceRequestsEventMessageType> createClosedMeterServiceRequests(MeterServiceRequestsEventMessageType value) {
        return new JAXBElement<MeterServiceRequestsEventMessageType>(_ClosedMeterServiceRequests_QNAME, MeterServiceRequestsEventMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeterServiceRequestsEventMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iec.ch/TC57/2011/MeterServiceRequestsMessage", name = "ChangedMeterServiceRequests")
    public JAXBElement<MeterServiceRequestsEventMessageType> createChangedMeterServiceRequests(MeterServiceRequestsEventMessageType value) {
        return new JAXBElement<MeterServiceRequestsEventMessageType>(_ChangedMeterServiceRequests_QNAME, MeterServiceRequestsEventMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeterServiceRequestsRequestMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iec.ch/TC57/2011/MeterServiceRequestsMessage", name = "ChangeMeterServiceRequests")
    public JAXBElement<MeterServiceRequestsRequestMessageType> createChangeMeterServiceRequests(MeterServiceRequestsRequestMessageType value) {
        return new JAXBElement<MeterServiceRequestsRequestMessageType>(_ChangeMeterServiceRequests_QNAME, MeterServiceRequestsRequestMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeterServiceRequestsRequestMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iec.ch/TC57/2011/MeterServiceRequestsMessage", name = "DeleteMeterServiceRequests")
    public JAXBElement<MeterServiceRequestsRequestMessageType> createDeleteMeterServiceRequests(MeterServiceRequestsRequestMessageType value) {
        return new JAXBElement<MeterServiceRequestsRequestMessageType>(_DeleteMeterServiceRequests_QNAME, MeterServiceRequestsRequestMessageType.class, null, value);
    }

}
