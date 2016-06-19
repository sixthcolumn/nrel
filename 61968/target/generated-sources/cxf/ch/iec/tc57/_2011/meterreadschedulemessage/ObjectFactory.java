
package ch.iec.tc57._2011.meterreadschedulemessage;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ch.iec.tc57._2011.meterreadschedulemessage package. 
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

    private final static QName _CreateMeterReadSchedule_QNAME = new QName("http://www.iec.ch/TC57/2011/MeterReadScheduleMessage", "CreateMeterReadSchedule");
    private final static QName _CancelMeterReadSchedule_QNAME = new QName("http://www.iec.ch/TC57/2011/MeterReadScheduleMessage", "CancelMeterReadSchedule");
    private final static QName _ChangedMeterReadSchedule_QNAME = new QName("http://www.iec.ch/TC57/2011/MeterReadScheduleMessage", "ChangedMeterReadSchedule");
    private final static QName _CanceledMeterReadSchedule_QNAME = new QName("http://www.iec.ch/TC57/2011/MeterReadScheduleMessage", "CanceledMeterReadSchedule");
    private final static QName _CloseMeterReadSchedule_QNAME = new QName("http://www.iec.ch/TC57/2011/MeterReadScheduleMessage", "CloseMeterReadSchedule");
    private final static QName _ClosedMeterReadSchedule_QNAME = new QName("http://www.iec.ch/TC57/2011/MeterReadScheduleMessage", "ClosedMeterReadSchedule");
    private final static QName _MeterReadScheduleResponseMessage_QNAME = new QName("http://www.iec.ch/TC57/2011/MeterReadScheduleMessage", "MeterReadScheduleResponseMessage");
    private final static QName _DeletedMeterReadSchedule_QNAME = new QName("http://www.iec.ch/TC57/2011/MeterReadScheduleMessage", "DeletedMeterReadSchedule");
    private final static QName _DeleteMeterReadSchedule_QNAME = new QName("http://www.iec.ch/TC57/2011/MeterReadScheduleMessage", "DeleteMeterReadSchedule");
    private final static QName _MeterReadScheduleFaultMessage_QNAME = new QName("http://www.iec.ch/TC57/2011/MeterReadScheduleMessage", "MeterReadScheduleFaultMessage");
    private final static QName _ChangeMeterReadSchedule_QNAME = new QName("http://www.iec.ch/TC57/2011/MeterReadScheduleMessage", "ChangeMeterReadSchedule");
    private final static QName _CreatedMeterReadSchedule_QNAME = new QName("http://www.iec.ch/TC57/2011/MeterReadScheduleMessage", "CreatedMeterReadSchedule");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ch.iec.tc57._2011.meterreadschedulemessage
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MeterReadScheduleFaultMessageType }
     * 
     */
    public MeterReadScheduleFaultMessageType createMeterReadScheduleFaultMessageType() {
        return new MeterReadScheduleFaultMessageType();
    }

    /**
     * Create an instance of {@link MeterReadScheduleResponseMessageType }
     * 
     */
    public MeterReadScheduleResponseMessageType createMeterReadScheduleResponseMessageType() {
        return new MeterReadScheduleResponseMessageType();
    }

    /**
     * Create an instance of {@link MeterReadScheduleEventMessageType }
     * 
     */
    public MeterReadScheduleEventMessageType createMeterReadScheduleEventMessageType() {
        return new MeterReadScheduleEventMessageType();
    }

    /**
     * Create an instance of {@link MeterReadScheduleRequestMessageType }
     * 
     */
    public MeterReadScheduleRequestMessageType createMeterReadScheduleRequestMessageType() {
        return new MeterReadScheduleRequestMessageType();
    }

    /**
     * Create an instance of {@link MeterReadSchedulePayloadType }
     * 
     */
    public MeterReadSchedulePayloadType createMeterReadSchedulePayloadType() {
        return new MeterReadSchedulePayloadType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeterReadScheduleRequestMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iec.ch/TC57/2011/MeterReadScheduleMessage", name = "CreateMeterReadSchedule")
    public JAXBElement<MeterReadScheduleRequestMessageType> createCreateMeterReadSchedule(MeterReadScheduleRequestMessageType value) {
        return new JAXBElement<MeterReadScheduleRequestMessageType>(_CreateMeterReadSchedule_QNAME, MeterReadScheduleRequestMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeterReadScheduleRequestMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iec.ch/TC57/2011/MeterReadScheduleMessage", name = "CancelMeterReadSchedule")
    public JAXBElement<MeterReadScheduleRequestMessageType> createCancelMeterReadSchedule(MeterReadScheduleRequestMessageType value) {
        return new JAXBElement<MeterReadScheduleRequestMessageType>(_CancelMeterReadSchedule_QNAME, MeterReadScheduleRequestMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeterReadScheduleEventMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iec.ch/TC57/2011/MeterReadScheduleMessage", name = "ChangedMeterReadSchedule")
    public JAXBElement<MeterReadScheduleEventMessageType> createChangedMeterReadSchedule(MeterReadScheduleEventMessageType value) {
        return new JAXBElement<MeterReadScheduleEventMessageType>(_ChangedMeterReadSchedule_QNAME, MeterReadScheduleEventMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeterReadScheduleEventMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iec.ch/TC57/2011/MeterReadScheduleMessage", name = "CanceledMeterReadSchedule")
    public JAXBElement<MeterReadScheduleEventMessageType> createCanceledMeterReadSchedule(MeterReadScheduleEventMessageType value) {
        return new JAXBElement<MeterReadScheduleEventMessageType>(_CanceledMeterReadSchedule_QNAME, MeterReadScheduleEventMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeterReadScheduleRequestMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iec.ch/TC57/2011/MeterReadScheduleMessage", name = "CloseMeterReadSchedule")
    public JAXBElement<MeterReadScheduleRequestMessageType> createCloseMeterReadSchedule(MeterReadScheduleRequestMessageType value) {
        return new JAXBElement<MeterReadScheduleRequestMessageType>(_CloseMeterReadSchedule_QNAME, MeterReadScheduleRequestMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeterReadScheduleEventMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iec.ch/TC57/2011/MeterReadScheduleMessage", name = "ClosedMeterReadSchedule")
    public JAXBElement<MeterReadScheduleEventMessageType> createClosedMeterReadSchedule(MeterReadScheduleEventMessageType value) {
        return new JAXBElement<MeterReadScheduleEventMessageType>(_ClosedMeterReadSchedule_QNAME, MeterReadScheduleEventMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeterReadScheduleResponseMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iec.ch/TC57/2011/MeterReadScheduleMessage", name = "MeterReadScheduleResponseMessage")
    public JAXBElement<MeterReadScheduleResponseMessageType> createMeterReadScheduleResponseMessage(MeterReadScheduleResponseMessageType value) {
        return new JAXBElement<MeterReadScheduleResponseMessageType>(_MeterReadScheduleResponseMessage_QNAME, MeterReadScheduleResponseMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeterReadScheduleEventMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iec.ch/TC57/2011/MeterReadScheduleMessage", name = "DeletedMeterReadSchedule")
    public JAXBElement<MeterReadScheduleEventMessageType> createDeletedMeterReadSchedule(MeterReadScheduleEventMessageType value) {
        return new JAXBElement<MeterReadScheduleEventMessageType>(_DeletedMeterReadSchedule_QNAME, MeterReadScheduleEventMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeterReadScheduleRequestMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iec.ch/TC57/2011/MeterReadScheduleMessage", name = "DeleteMeterReadSchedule")
    public JAXBElement<MeterReadScheduleRequestMessageType> createDeleteMeterReadSchedule(MeterReadScheduleRequestMessageType value) {
        return new JAXBElement<MeterReadScheduleRequestMessageType>(_DeleteMeterReadSchedule_QNAME, MeterReadScheduleRequestMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeterReadScheduleFaultMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iec.ch/TC57/2011/MeterReadScheduleMessage", name = "MeterReadScheduleFaultMessage")
    public JAXBElement<MeterReadScheduleFaultMessageType> createMeterReadScheduleFaultMessage(MeterReadScheduleFaultMessageType value) {
        return new JAXBElement<MeterReadScheduleFaultMessageType>(_MeterReadScheduleFaultMessage_QNAME, MeterReadScheduleFaultMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeterReadScheduleRequestMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iec.ch/TC57/2011/MeterReadScheduleMessage", name = "ChangeMeterReadSchedule")
    public JAXBElement<MeterReadScheduleRequestMessageType> createChangeMeterReadSchedule(MeterReadScheduleRequestMessageType value) {
        return new JAXBElement<MeterReadScheduleRequestMessageType>(_ChangeMeterReadSchedule_QNAME, MeterReadScheduleRequestMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeterReadScheduleEventMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iec.ch/TC57/2011/MeterReadScheduleMessage", name = "CreatedMeterReadSchedule")
    public JAXBElement<MeterReadScheduleEventMessageType> createCreatedMeterReadSchedule(MeterReadScheduleEventMessageType value) {
        return new JAXBElement<MeterReadScheduleEventMessageType>(_CreatedMeterReadSchedule_QNAME, MeterReadScheduleEventMessageType.class, null, value);
    }

}
