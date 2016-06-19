
package ch.iec.tc57._2011.meterreadingsmessage;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ch.iec.tc57._2011.meterreadingsmessage package. 
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

    private final static QName _ClosedMeterReadings_QNAME = new QName("http://www.iec.ch/TC57/2011/MeterReadingsMessage", "ClosedMeterReadings");
    private final static QName _CanceledMeterReadings_QNAME = new QName("http://www.iec.ch/TC57/2011/MeterReadingsMessage", "CanceledMeterReadings");
    private final static QName _CloseMeterReadings_QNAME = new QName("http://www.iec.ch/TC57/2011/MeterReadingsMessage", "CloseMeterReadings");
    private final static QName _DeletedMeterReadings_QNAME = new QName("http://www.iec.ch/TC57/2011/MeterReadingsMessage", "DeletedMeterReadings");
    private final static QName _DeleteMeterReadings_QNAME = new QName("http://www.iec.ch/TC57/2011/MeterReadingsMessage", "DeleteMeterReadings");
    private final static QName _ChangedMeterReadings_QNAME = new QName("http://www.iec.ch/TC57/2011/MeterReadingsMessage", "ChangedMeterReadings");
    private final static QName _MeterReadingsFaultMessage_QNAME = new QName("http://www.iec.ch/TC57/2011/MeterReadingsMessage", "MeterReadingsFaultMessage");
    private final static QName _MeterReadingsRequestMessage_QNAME = new QName("http://www.iec.ch/TC57/2011/MeterReadingsMessage", "MeterReadingsRequestMessage");
    private final static QName _ChangeMeterReadings_QNAME = new QName("http://www.iec.ch/TC57/2011/MeterReadingsMessage", "ChangeMeterReadings");
    private final static QName _MeterReadingsResponseMessage_QNAME = new QName("http://www.iec.ch/TC57/2011/MeterReadingsMessage", "MeterReadingsResponseMessage");
    private final static QName _CreateMeterReadings_QNAME = new QName("http://www.iec.ch/TC57/2011/MeterReadingsMessage", "CreateMeterReadings");
    private final static QName _CreatedMeterReadings_QNAME = new QName("http://www.iec.ch/TC57/2011/MeterReadingsMessage", "CreatedMeterReadings");
    private final static QName _CancelMeterReadings_QNAME = new QName("http://www.iec.ch/TC57/2011/MeterReadingsMessage", "CancelMeterReadings");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ch.iec.tc57._2011.meterreadingsmessage
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MeterReadingsEventMessageType }
     * 
     */
    public MeterReadingsEventMessageType createMeterReadingsEventMessageType() {
        return new MeterReadingsEventMessageType();
    }

    /**
     * Create an instance of {@link MeterReadingsPayloadType }
     * 
     */
    public MeterReadingsPayloadType createMeterReadingsPayloadType() {
        return new MeterReadingsPayloadType();
    }

    /**
     * Create an instance of {@link MeterReadingsResponseMessageType }
     * 
     */
    public MeterReadingsResponseMessageType createMeterReadingsResponseMessageType() {
        return new MeterReadingsResponseMessageType();
    }

    /**
     * Create an instance of {@link MeterReadingsRequestMessageType }
     * 
     */
    public MeterReadingsRequestMessageType createMeterReadingsRequestMessageType() {
        return new MeterReadingsRequestMessageType();
    }

    /**
     * Create an instance of {@link MeterReadingsFaultMessageType }
     * 
     */
    public MeterReadingsFaultMessageType createMeterReadingsFaultMessageType() {
        return new MeterReadingsFaultMessageType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeterReadingsEventMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iec.ch/TC57/2011/MeterReadingsMessage", name = "ClosedMeterReadings")
    public JAXBElement<MeterReadingsEventMessageType> createClosedMeterReadings(MeterReadingsEventMessageType value) {
        return new JAXBElement<MeterReadingsEventMessageType>(_ClosedMeterReadings_QNAME, MeterReadingsEventMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeterReadingsEventMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iec.ch/TC57/2011/MeterReadingsMessage", name = "CanceledMeterReadings")
    public JAXBElement<MeterReadingsEventMessageType> createCanceledMeterReadings(MeterReadingsEventMessageType value) {
        return new JAXBElement<MeterReadingsEventMessageType>(_CanceledMeterReadings_QNAME, MeterReadingsEventMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeterReadingsRequestMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iec.ch/TC57/2011/MeterReadingsMessage", name = "CloseMeterReadings")
    public JAXBElement<MeterReadingsRequestMessageType> createCloseMeterReadings(MeterReadingsRequestMessageType value) {
        return new JAXBElement<MeterReadingsRequestMessageType>(_CloseMeterReadings_QNAME, MeterReadingsRequestMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeterReadingsEventMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iec.ch/TC57/2011/MeterReadingsMessage", name = "DeletedMeterReadings")
    public JAXBElement<MeterReadingsEventMessageType> createDeletedMeterReadings(MeterReadingsEventMessageType value) {
        return new JAXBElement<MeterReadingsEventMessageType>(_DeletedMeterReadings_QNAME, MeterReadingsEventMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeterReadingsRequestMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iec.ch/TC57/2011/MeterReadingsMessage", name = "DeleteMeterReadings")
    public JAXBElement<MeterReadingsRequestMessageType> createDeleteMeterReadings(MeterReadingsRequestMessageType value) {
        return new JAXBElement<MeterReadingsRequestMessageType>(_DeleteMeterReadings_QNAME, MeterReadingsRequestMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeterReadingsEventMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iec.ch/TC57/2011/MeterReadingsMessage", name = "ChangedMeterReadings")
    public JAXBElement<MeterReadingsEventMessageType> createChangedMeterReadings(MeterReadingsEventMessageType value) {
        return new JAXBElement<MeterReadingsEventMessageType>(_ChangedMeterReadings_QNAME, MeterReadingsEventMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeterReadingsFaultMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iec.ch/TC57/2011/MeterReadingsMessage", name = "MeterReadingsFaultMessage")
    public JAXBElement<MeterReadingsFaultMessageType> createMeterReadingsFaultMessage(MeterReadingsFaultMessageType value) {
        return new JAXBElement<MeterReadingsFaultMessageType>(_MeterReadingsFaultMessage_QNAME, MeterReadingsFaultMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeterReadingsRequestMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iec.ch/TC57/2011/MeterReadingsMessage", name = "MeterReadingsRequestMessage")
    public JAXBElement<MeterReadingsRequestMessageType> createMeterReadingsRequestMessage(MeterReadingsRequestMessageType value) {
        return new JAXBElement<MeterReadingsRequestMessageType>(_MeterReadingsRequestMessage_QNAME, MeterReadingsRequestMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeterReadingsRequestMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iec.ch/TC57/2011/MeterReadingsMessage", name = "ChangeMeterReadings")
    public JAXBElement<MeterReadingsRequestMessageType> createChangeMeterReadings(MeterReadingsRequestMessageType value) {
        return new JAXBElement<MeterReadingsRequestMessageType>(_ChangeMeterReadings_QNAME, MeterReadingsRequestMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeterReadingsResponseMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iec.ch/TC57/2011/MeterReadingsMessage", name = "MeterReadingsResponseMessage")
    public JAXBElement<MeterReadingsResponseMessageType> createMeterReadingsResponseMessage(MeterReadingsResponseMessageType value) {
        return new JAXBElement<MeterReadingsResponseMessageType>(_MeterReadingsResponseMessage_QNAME, MeterReadingsResponseMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeterReadingsRequestMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iec.ch/TC57/2011/MeterReadingsMessage", name = "CreateMeterReadings")
    public JAXBElement<MeterReadingsRequestMessageType> createCreateMeterReadings(MeterReadingsRequestMessageType value) {
        return new JAXBElement<MeterReadingsRequestMessageType>(_CreateMeterReadings_QNAME, MeterReadingsRequestMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeterReadingsEventMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iec.ch/TC57/2011/MeterReadingsMessage", name = "CreatedMeterReadings")
    public JAXBElement<MeterReadingsEventMessageType> createCreatedMeterReadings(MeterReadingsEventMessageType value) {
        return new JAXBElement<MeterReadingsEventMessageType>(_CreatedMeterReadings_QNAME, MeterReadingsEventMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeterReadingsRequestMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iec.ch/TC57/2011/MeterReadingsMessage", name = "CancelMeterReadings")
    public JAXBElement<MeterReadingsRequestMessageType> createCancelMeterReadings(MeterReadingsRequestMessageType value) {
        return new JAXBElement<MeterReadingsRequestMessageType>(_CancelMeterReadings_QNAME, MeterReadingsRequestMessageType.class, null, value);
    }

}
