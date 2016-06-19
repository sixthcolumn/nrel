
package ch.iec.tc57._2011.enddeviceevents;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ch.iec.tc57._2011.enddeviceevents package. 
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

    private final static QName _EndDeviceEvents_QNAME = new QName("http://iec.ch/TC57/2011/EndDeviceEvents#", "EndDeviceEvents");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ch.iec.tc57._2011.enddeviceevents
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EndDeviceEvents }
     * 
     */
    public EndDeviceEvents createEndDeviceEvents() {
        return new EndDeviceEvents();
    }

    /**
     * Create an instance of {@link ch.iec.tc57._2011.enddeviceevents.EndDeviceEventType }
     * 
     */
    public ch.iec.tc57._2011.enddeviceevents.EndDeviceEventType createEndDeviceEventType() {
        return new ch.iec.tc57._2011.enddeviceevents.EndDeviceEventType();
    }

    /**
     * Create an instance of {@link ch.iec.tc57._2011.enddeviceevents.UsagePoint }
     * 
     */
    public ch.iec.tc57._2011.enddeviceevents.UsagePoint createUsagePoint() {
        return new ch.iec.tc57._2011.enddeviceevents.UsagePoint();
    }

    /**
     * Create an instance of {@link EndDeviceEvent.UsagePoint.Names.NameType.NameTypeAuthority }
     * 
     */
    public EndDeviceEvent.UsagePoint.Names.NameType.NameTypeAuthority createEndDeviceEventUsagePointNamesNameTypeNameTypeAuthority() {
        return new EndDeviceEvent.UsagePoint.Names.NameType.NameTypeAuthority();
    }

    /**
     * Create an instance of {@link ch.iec.tc57._2011.enddeviceevents.NameTypeAuthority }
     * 
     */
    public ch.iec.tc57._2011.enddeviceevents.NameTypeAuthority createNameTypeAuthority() {
        return new ch.iec.tc57._2011.enddeviceevents.NameTypeAuthority();
    }

    /**
     * Create an instance of {@link EndDeviceEvent.EndDeviceEventType }
     * 
     */
    public EndDeviceEvent.EndDeviceEventType createEndDeviceEventEndDeviceEventType() {
        return new EndDeviceEvent.EndDeviceEventType();
    }

    /**
     * Create an instance of {@link EndDeviceEvent.EndDeviceEventDetails }
     * 
     */
    public EndDeviceEvent.EndDeviceEventDetails createEndDeviceEventEndDeviceEventDetails() {
        return new EndDeviceEvent.EndDeviceEventDetails();
    }

    /**
     * Create an instance of {@link EndDeviceEvent.Status }
     * 
     */
    public EndDeviceEvent.Status createEndDeviceEventStatus() {
        return new EndDeviceEvent.Status();
    }

    /**
     * Create an instance of {@link EndDeviceEvent.UsagePoint.Names.NameType }
     * 
     */
    public EndDeviceEvent.UsagePoint.Names.NameType createEndDeviceEventUsagePointNamesNameType() {
        return new EndDeviceEvent.UsagePoint.Names.NameType();
    }

    /**
     * Create an instance of {@link EndDeviceEvent.UsagePoint }
     * 
     */
    public EndDeviceEvent.UsagePoint createEndDeviceEventUsagePoint() {
        return new EndDeviceEvent.UsagePoint();
    }

    /**
     * Create an instance of {@link Name }
     * 
     */
    public Name createName() {
        return new Name();
    }

    /**
     * Create an instance of {@link EndDeviceEvent }
     * 
     */
    public EndDeviceEvent createEndDeviceEvent() {
        return new EndDeviceEvent();
    }

    /**
     * Create an instance of {@link ch.iec.tc57._2011.enddeviceevents.NameType }
     * 
     */
    public ch.iec.tc57._2011.enddeviceevents.NameType createNameType() {
        return new ch.iec.tc57._2011.enddeviceevents.NameType();
    }

    /**
     * Create an instance of {@link Asset }
     * 
     */
    public Asset createAsset() {
        return new Asset();
    }

    /**
     * Create an instance of {@link EndDeviceEvent.UsagePoint.Names }
     * 
     */
    public EndDeviceEvent.UsagePoint.Names createEndDeviceEventUsagePointNames() {
        return new EndDeviceEvent.UsagePoint.Names();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EndDeviceEvents }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iec.ch/TC57/2011/EndDeviceEvents#", name = "EndDeviceEvents")
    public JAXBElement<EndDeviceEvents> createEndDeviceEvents(EndDeviceEvents value) {
        return new JAXBElement<EndDeviceEvents>(_EndDeviceEvents_QNAME, EndDeviceEvents.class, null, value);
    }

}
