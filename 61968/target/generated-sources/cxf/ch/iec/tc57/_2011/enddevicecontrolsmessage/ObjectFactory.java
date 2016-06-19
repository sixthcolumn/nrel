
package ch.iec.tc57._2011.enddevicecontrolsmessage;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ch.iec.tc57._2011.enddevicecontrolsmessage package. 
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

    private final static QName _EndDeviceControlsResponseMessage_QNAME = new QName("http://www.iec.ch/TC57/2011/EndDeviceControlsMessage", "EndDeviceControlsResponseMessage");
    private final static QName _EndDeviceControlsFaultMessage_QNAME = new QName("http://www.iec.ch/TC57/2011/EndDeviceControlsMessage", "EndDeviceControlsFaultMessage");
    private final static QName _ChangedEndDeviceControls_QNAME = new QName("http://www.iec.ch/TC57/2011/EndDeviceControlsMessage", "ChangedEndDeviceControls");
    private final static QName _CreatedEndDeviceControls_QNAME = new QName("http://www.iec.ch/TC57/2011/EndDeviceControlsMessage", "CreatedEndDeviceControls");
    private final static QName _DeletedEndDeviceControls_QNAME = new QName("http://www.iec.ch/TC57/2011/EndDeviceControlsMessage", "DeletedEndDeviceControls");
    private final static QName _CancelEndDeviceControls_QNAME = new QName("http://www.iec.ch/TC57/2011/EndDeviceControlsMessage", "CancelEndDeviceControls");
    private final static QName _DeleteEndDeviceControls_QNAME = new QName("http://www.iec.ch/TC57/2011/EndDeviceControlsMessage", "DeleteEndDeviceControls");
    private final static QName _ClosedEndDeviceControls_QNAME = new QName("http://www.iec.ch/TC57/2011/EndDeviceControlsMessage", "ClosedEndDeviceControls");
    private final static QName _CanceledEndDeviceControls_QNAME = new QName("http://www.iec.ch/TC57/2011/EndDeviceControlsMessage", "CanceledEndDeviceControls");
    private final static QName _ChangeEndDeviceControls_QNAME = new QName("http://www.iec.ch/TC57/2011/EndDeviceControlsMessage", "ChangeEndDeviceControls");
    private final static QName _EndDeviceControlsRequestMessage_QNAME = new QName("http://www.iec.ch/TC57/2011/EndDeviceControlsMessage", "EndDeviceControlsRequestMessage");
    private final static QName _CreateEndDeviceControls_QNAME = new QName("http://www.iec.ch/TC57/2011/EndDeviceControlsMessage", "CreateEndDeviceControls");
    private final static QName _CloseEndDeviceControls_QNAME = new QName("http://www.iec.ch/TC57/2011/EndDeviceControlsMessage", "CloseEndDeviceControls");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ch.iec.tc57._2011.enddevicecontrolsmessage
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EndDeviceControlsPayloadType }
     * 
     */
    public EndDeviceControlsPayloadType createEndDeviceControlsPayloadType() {
        return new EndDeviceControlsPayloadType();
    }

    /**
     * Create an instance of {@link EndDeviceControlsResponseMessageType }
     * 
     */
    public EndDeviceControlsResponseMessageType createEndDeviceControlsResponseMessageType() {
        return new EndDeviceControlsResponseMessageType();
    }

    /**
     * Create an instance of {@link EndDeviceControlsEventMessageType }
     * 
     */
    public EndDeviceControlsEventMessageType createEndDeviceControlsEventMessageType() {
        return new EndDeviceControlsEventMessageType();
    }

    /**
     * Create an instance of {@link EndDeviceControlsFaultMessageType }
     * 
     */
    public EndDeviceControlsFaultMessageType createEndDeviceControlsFaultMessageType() {
        return new EndDeviceControlsFaultMessageType();
    }

    /**
     * Create an instance of {@link EndDeviceControlsRequestMessageType }
     * 
     */
    public EndDeviceControlsRequestMessageType createEndDeviceControlsRequestMessageType() {
        return new EndDeviceControlsRequestMessageType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EndDeviceControlsResponseMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iec.ch/TC57/2011/EndDeviceControlsMessage", name = "EndDeviceControlsResponseMessage")
    public JAXBElement<EndDeviceControlsResponseMessageType> createEndDeviceControlsResponseMessage(EndDeviceControlsResponseMessageType value) {
        return new JAXBElement<EndDeviceControlsResponseMessageType>(_EndDeviceControlsResponseMessage_QNAME, EndDeviceControlsResponseMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EndDeviceControlsFaultMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iec.ch/TC57/2011/EndDeviceControlsMessage", name = "EndDeviceControlsFaultMessage")
    public JAXBElement<EndDeviceControlsFaultMessageType> createEndDeviceControlsFaultMessage(EndDeviceControlsFaultMessageType value) {
        return new JAXBElement<EndDeviceControlsFaultMessageType>(_EndDeviceControlsFaultMessage_QNAME, EndDeviceControlsFaultMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EndDeviceControlsEventMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iec.ch/TC57/2011/EndDeviceControlsMessage", name = "ChangedEndDeviceControls")
    public JAXBElement<EndDeviceControlsEventMessageType> createChangedEndDeviceControls(EndDeviceControlsEventMessageType value) {
        return new JAXBElement<EndDeviceControlsEventMessageType>(_ChangedEndDeviceControls_QNAME, EndDeviceControlsEventMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EndDeviceControlsEventMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iec.ch/TC57/2011/EndDeviceControlsMessage", name = "CreatedEndDeviceControls")
    public JAXBElement<EndDeviceControlsEventMessageType> createCreatedEndDeviceControls(EndDeviceControlsEventMessageType value) {
        return new JAXBElement<EndDeviceControlsEventMessageType>(_CreatedEndDeviceControls_QNAME, EndDeviceControlsEventMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EndDeviceControlsEventMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iec.ch/TC57/2011/EndDeviceControlsMessage", name = "DeletedEndDeviceControls")
    public JAXBElement<EndDeviceControlsEventMessageType> createDeletedEndDeviceControls(EndDeviceControlsEventMessageType value) {
        return new JAXBElement<EndDeviceControlsEventMessageType>(_DeletedEndDeviceControls_QNAME, EndDeviceControlsEventMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EndDeviceControlsRequestMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iec.ch/TC57/2011/EndDeviceControlsMessage", name = "CancelEndDeviceControls")
    public JAXBElement<EndDeviceControlsRequestMessageType> createCancelEndDeviceControls(EndDeviceControlsRequestMessageType value) {
        return new JAXBElement<EndDeviceControlsRequestMessageType>(_CancelEndDeviceControls_QNAME, EndDeviceControlsRequestMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EndDeviceControlsRequestMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iec.ch/TC57/2011/EndDeviceControlsMessage", name = "DeleteEndDeviceControls")
    public JAXBElement<EndDeviceControlsRequestMessageType> createDeleteEndDeviceControls(EndDeviceControlsRequestMessageType value) {
        return new JAXBElement<EndDeviceControlsRequestMessageType>(_DeleteEndDeviceControls_QNAME, EndDeviceControlsRequestMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EndDeviceControlsEventMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iec.ch/TC57/2011/EndDeviceControlsMessage", name = "ClosedEndDeviceControls")
    public JAXBElement<EndDeviceControlsEventMessageType> createClosedEndDeviceControls(EndDeviceControlsEventMessageType value) {
        return new JAXBElement<EndDeviceControlsEventMessageType>(_ClosedEndDeviceControls_QNAME, EndDeviceControlsEventMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EndDeviceControlsEventMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iec.ch/TC57/2011/EndDeviceControlsMessage", name = "CanceledEndDeviceControls")
    public JAXBElement<EndDeviceControlsEventMessageType> createCanceledEndDeviceControls(EndDeviceControlsEventMessageType value) {
        return new JAXBElement<EndDeviceControlsEventMessageType>(_CanceledEndDeviceControls_QNAME, EndDeviceControlsEventMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EndDeviceControlsRequestMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iec.ch/TC57/2011/EndDeviceControlsMessage", name = "ChangeEndDeviceControls")
    public JAXBElement<EndDeviceControlsRequestMessageType> createChangeEndDeviceControls(EndDeviceControlsRequestMessageType value) {
        return new JAXBElement<EndDeviceControlsRequestMessageType>(_ChangeEndDeviceControls_QNAME, EndDeviceControlsRequestMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EndDeviceControlsRequestMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iec.ch/TC57/2011/EndDeviceControlsMessage", name = "EndDeviceControlsRequestMessage")
    public JAXBElement<EndDeviceControlsRequestMessageType> createEndDeviceControlsRequestMessage(EndDeviceControlsRequestMessageType value) {
        return new JAXBElement<EndDeviceControlsRequestMessageType>(_EndDeviceControlsRequestMessage_QNAME, EndDeviceControlsRequestMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EndDeviceControlsRequestMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iec.ch/TC57/2011/EndDeviceControlsMessage", name = "CreateEndDeviceControls")
    public JAXBElement<EndDeviceControlsRequestMessageType> createCreateEndDeviceControls(EndDeviceControlsRequestMessageType value) {
        return new JAXBElement<EndDeviceControlsRequestMessageType>(_CreateEndDeviceControls_QNAME, EndDeviceControlsRequestMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EndDeviceControlsRequestMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iec.ch/TC57/2011/EndDeviceControlsMessage", name = "CloseEndDeviceControls")
    public JAXBElement<EndDeviceControlsRequestMessageType> createCloseEndDeviceControls(EndDeviceControlsRequestMessageType value) {
        return new JAXBElement<EndDeviceControlsRequestMessageType>(_CloseEndDeviceControls_QNAME, EndDeviceControlsRequestMessageType.class, null, value);
    }

}
