
package com.sixthc.request;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import ch.iec.tc57._2011.schema.message.FaultMessageType;
import ch.iec.tc57._2011.schema.message.ReplyType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sixthc.request package. 
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

    private final static QName _ResponseMessage_QNAME = new QName("http://sixthc.com/Request", "ResponseMessage");
    private final static QName _MeterReadSchedulePayloadMessage_QNAME = new QName("http://sixthc.com/Request", "MeterReadSchedulePayloadMessage");
    private final static QName _FaultMessage_QNAME = new QName("http://sixthc.com/Request", "FaultMessage");
    private final static QName _EndDeviceEventsPayloadMessage_QNAME = new QName("http://sixthc.com/Request", "EndDeviceEventsPayloadMessage");
    private final static QName _MeterReadingsPayloadMessage_QNAME = new QName("http://sixthc.com/Request", "MeterReadingsPayloadMessage");
    private final static QName _EndDeviceControlsPayloadMessage_QNAME = new QName("http://sixthc.com/Request", "EndDeviceControlsPayloadMessage");
    private final static QName _MeterServiceRequestsPayloadMessage_QNAME = new QName("http://sixthc.com/Request", "MeterServiceRequestsPayloadMessage");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sixthc.request
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EndDeviceEventsPayload }
     * 
     */
    public EndDeviceEventsPayload createEndDeviceEventsPayload() {
        return new EndDeviceEventsPayload();
    }

    /**
     * Create an instance of {@link MeterReadingsPayload }
     * 
     */
    public MeterReadingsPayload createMeterReadingsPayload() {
        return new MeterReadingsPayload();
    }

    /**
     * Create an instance of {@link EndDeviceControlsPayload }
     * 
     */
    public EndDeviceControlsPayload createEndDeviceControlsPayload() {
        return new EndDeviceControlsPayload();
    }

    /**
     * Create an instance of {@link MeterServiceRequestsPayload }
     * 
     */
    public MeterServiceRequestsPayload createMeterServiceRequestsPayload() {
        return new MeterServiceRequestsPayload();
    }

    /**
     * Create an instance of {@link MeterReadSchedulePayload }
     * 
     */
    public MeterReadSchedulePayload createMeterReadSchedulePayload() {
        return new MeterReadSchedulePayload();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReplyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sixthc.com/Request", name = "ResponseMessage")
    public JAXBElement<ReplyType> createResponseMessage(ReplyType value) {
        return new JAXBElement<ReplyType>(_ResponseMessage_QNAME, ReplyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeterReadSchedulePayload }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sixthc.com/Request", name = "MeterReadSchedulePayloadMessage")
    public JAXBElement<MeterReadSchedulePayload> createMeterReadSchedulePayloadMessage(MeterReadSchedulePayload value) {
        return new JAXBElement<MeterReadSchedulePayload>(_MeterReadSchedulePayloadMessage_QNAME, MeterReadSchedulePayload.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sixthc.com/Request", name = "FaultMessage")
    public JAXBElement<FaultMessageType> createFaultMessage(FaultMessageType value) {
        return new JAXBElement<FaultMessageType>(_FaultMessage_QNAME, FaultMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EndDeviceEventsPayload }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sixthc.com/Request", name = "EndDeviceEventsPayloadMessage")
    public JAXBElement<EndDeviceEventsPayload> createEndDeviceEventsPayloadMessage(EndDeviceEventsPayload value) {
        return new JAXBElement<EndDeviceEventsPayload>(_EndDeviceEventsPayloadMessage_QNAME, EndDeviceEventsPayload.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeterReadingsPayload }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sixthc.com/Request", name = "MeterReadingsPayloadMessage")
    public JAXBElement<MeterReadingsPayload> createMeterReadingsPayloadMessage(MeterReadingsPayload value) {
        return new JAXBElement<MeterReadingsPayload>(_MeterReadingsPayloadMessage_QNAME, MeterReadingsPayload.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EndDeviceControlsPayload }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sixthc.com/Request", name = "EndDeviceControlsPayloadMessage")
    public JAXBElement<EndDeviceControlsPayload> createEndDeviceControlsPayloadMessage(EndDeviceControlsPayload value) {
        return new JAXBElement<EndDeviceControlsPayload>(_EndDeviceControlsPayloadMessage_QNAME, EndDeviceControlsPayload.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeterServiceRequestsPayload }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sixthc.com/Request", name = "MeterServiceRequestsPayloadMessage")
    public JAXBElement<MeterServiceRequestsPayload> createMeterServiceRequestsPayloadMessage(MeterServiceRequestsPayload value) {
        return new JAXBElement<MeterServiceRequestsPayload>(_MeterServiceRequestsPayloadMessage_QNAME, MeterServiceRequestsPayload.class, null, value);
    }

}
