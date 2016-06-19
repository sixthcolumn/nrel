
package ch.iec.tc57._2010.workrequestmessage;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ch.iec.tc57._2010.workrequestmessage package. 
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

    private final static QName _WorkRequestFaultMessage_QNAME = new QName("http://www.iec.ch/TC57/2010/WorkRequestMessage", "WorkRequestFaultMessage");
    private final static QName _WorkRequestResponseMessage_QNAME = new QName("http://www.iec.ch/TC57/2010/WorkRequestMessage", "WorkRequestResponseMessage");
    private final static QName _ChangedWorkRequest_QNAME = new QName("http://www.iec.ch/TC57/2010/WorkRequestMessage", "ChangedWorkRequest");
    private final static QName _ClosedWorkRequest_QNAME = new QName("http://www.iec.ch/TC57/2010/WorkRequestMessage", "ClosedWorkRequest");
    private final static QName _ChangeWorkRequest_QNAME = new QName("http://www.iec.ch/TC57/2010/WorkRequestMessage", "ChangeWorkRequest");
    private final static QName _CanceledWorkRequest_QNAME = new QName("http://www.iec.ch/TC57/2010/WorkRequestMessage", "CanceledWorkRequest");
    private final static QName _CancelWorkRequest_QNAME = new QName("http://www.iec.ch/TC57/2010/WorkRequestMessage", "CancelWorkRequest");
    private final static QName _DeleteWorkRequest_QNAME = new QName("http://www.iec.ch/TC57/2010/WorkRequestMessage", "DeleteWorkRequest");
    private final static QName _CreatedWorkRequest_QNAME = new QName("http://www.iec.ch/TC57/2010/WorkRequestMessage", "CreatedWorkRequest");
    private final static QName _CreateWorkRequest_QNAME = new QName("http://www.iec.ch/TC57/2010/WorkRequestMessage", "CreateWorkRequest");
    private final static QName _DeletedWorkRequest_QNAME = new QName("http://www.iec.ch/TC57/2010/WorkRequestMessage", "DeletedWorkRequest");
    private final static QName _CloseWorkRequest_QNAME = new QName("http://www.iec.ch/TC57/2010/WorkRequestMessage", "CloseWorkRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ch.iec.tc57._2010.workrequestmessage
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link WorkRequestPayloadType }
     * 
     */
    public WorkRequestPayloadType createWorkRequestPayloadType() {
        return new WorkRequestPayloadType();
    }

    /**
     * Create an instance of {@link WorkRequestFaultMessageType }
     * 
     */
    public WorkRequestFaultMessageType createWorkRequestFaultMessageType() {
        return new WorkRequestFaultMessageType();
    }

    /**
     * Create an instance of {@link WorkRequestRequestMessageType }
     * 
     */
    public WorkRequestRequestMessageType createWorkRequestRequestMessageType() {
        return new WorkRequestRequestMessageType();
    }

    /**
     * Create an instance of {@link WorkRequestResponseMessageType }
     * 
     */
    public WorkRequestResponseMessageType createWorkRequestResponseMessageType() {
        return new WorkRequestResponseMessageType();
    }

    /**
     * Create an instance of {@link WorkRequestEventMessageType }
     * 
     */
    public WorkRequestEventMessageType createWorkRequestEventMessageType() {
        return new WorkRequestEventMessageType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkRequestFaultMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iec.ch/TC57/2010/WorkRequestMessage", name = "WorkRequestFaultMessage")
    public JAXBElement<WorkRequestFaultMessageType> createWorkRequestFaultMessage(WorkRequestFaultMessageType value) {
        return new JAXBElement<WorkRequestFaultMessageType>(_WorkRequestFaultMessage_QNAME, WorkRequestFaultMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkRequestResponseMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iec.ch/TC57/2010/WorkRequestMessage", name = "WorkRequestResponseMessage")
    public JAXBElement<WorkRequestResponseMessageType> createWorkRequestResponseMessage(WorkRequestResponseMessageType value) {
        return new JAXBElement<WorkRequestResponseMessageType>(_WorkRequestResponseMessage_QNAME, WorkRequestResponseMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkRequestEventMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iec.ch/TC57/2010/WorkRequestMessage", name = "ChangedWorkRequest")
    public JAXBElement<WorkRequestEventMessageType> createChangedWorkRequest(WorkRequestEventMessageType value) {
        return new JAXBElement<WorkRequestEventMessageType>(_ChangedWorkRequest_QNAME, WorkRequestEventMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkRequestEventMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iec.ch/TC57/2010/WorkRequestMessage", name = "ClosedWorkRequest")
    public JAXBElement<WorkRequestEventMessageType> createClosedWorkRequest(WorkRequestEventMessageType value) {
        return new JAXBElement<WorkRequestEventMessageType>(_ClosedWorkRequest_QNAME, WorkRequestEventMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkRequestRequestMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iec.ch/TC57/2010/WorkRequestMessage", name = "ChangeWorkRequest")
    public JAXBElement<WorkRequestRequestMessageType> createChangeWorkRequest(WorkRequestRequestMessageType value) {
        return new JAXBElement<WorkRequestRequestMessageType>(_ChangeWorkRequest_QNAME, WorkRequestRequestMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkRequestEventMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iec.ch/TC57/2010/WorkRequestMessage", name = "CanceledWorkRequest")
    public JAXBElement<WorkRequestEventMessageType> createCanceledWorkRequest(WorkRequestEventMessageType value) {
        return new JAXBElement<WorkRequestEventMessageType>(_CanceledWorkRequest_QNAME, WorkRequestEventMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkRequestRequestMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iec.ch/TC57/2010/WorkRequestMessage", name = "CancelWorkRequest")
    public JAXBElement<WorkRequestRequestMessageType> createCancelWorkRequest(WorkRequestRequestMessageType value) {
        return new JAXBElement<WorkRequestRequestMessageType>(_CancelWorkRequest_QNAME, WorkRequestRequestMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkRequestRequestMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iec.ch/TC57/2010/WorkRequestMessage", name = "DeleteWorkRequest")
    public JAXBElement<WorkRequestRequestMessageType> createDeleteWorkRequest(WorkRequestRequestMessageType value) {
        return new JAXBElement<WorkRequestRequestMessageType>(_DeleteWorkRequest_QNAME, WorkRequestRequestMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkRequestEventMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iec.ch/TC57/2010/WorkRequestMessage", name = "CreatedWorkRequest")
    public JAXBElement<WorkRequestEventMessageType> createCreatedWorkRequest(WorkRequestEventMessageType value) {
        return new JAXBElement<WorkRequestEventMessageType>(_CreatedWorkRequest_QNAME, WorkRequestEventMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkRequestRequestMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iec.ch/TC57/2010/WorkRequestMessage", name = "CreateWorkRequest")
    public JAXBElement<WorkRequestRequestMessageType> createCreateWorkRequest(WorkRequestRequestMessageType value) {
        return new JAXBElement<WorkRequestRequestMessageType>(_CreateWorkRequest_QNAME, WorkRequestRequestMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkRequestEventMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iec.ch/TC57/2010/WorkRequestMessage", name = "DeletedWorkRequest")
    public JAXBElement<WorkRequestEventMessageType> createDeletedWorkRequest(WorkRequestEventMessageType value) {
        return new JAXBElement<WorkRequestEventMessageType>(_DeletedWorkRequest_QNAME, WorkRequestEventMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkRequestRequestMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iec.ch/TC57/2010/WorkRequestMessage", name = "CloseWorkRequest")
    public JAXBElement<WorkRequestRequestMessageType> createCloseWorkRequest(WorkRequestRequestMessageType value) {
        return new JAXBElement<WorkRequestRequestMessageType>(_CloseWorkRequest_QNAME, WorkRequestRequestMessageType.class, null, value);
    }

}
