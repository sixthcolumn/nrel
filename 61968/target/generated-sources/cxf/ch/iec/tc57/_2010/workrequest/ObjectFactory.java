
package ch.iec.tc57._2010.workrequest;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ch.iec.tc57._2010.workrequest package. 
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

    private final static QName _WorkRequest_QNAME = new QName("http://iec.ch/TC57/2010/WorkRequest#", "WorkRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ch.iec.tc57._2010.workrequest
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Asset.Names }
     * 
     */
    public Asset.Names createAssetNames() {
        return new Asset.Names();
    }

    /**
     * Create an instance of {@link WorkLocation.MainAddress.StreetDetail }
     * 
     */
    public WorkLocation.MainAddress.StreetDetail createWorkLocationMainAddressStreetDetail() {
        return new WorkLocation.MainAddress.StreetDetail();
    }

    /**
     * Create an instance of {@link ActivityRecord }
     * 
     */
    public ActivityRecord createActivityRecord() {
        return new ActivityRecord();
    }

    /**
     * Create an instance of {@link WorkRequest }
     * 
     */
    public WorkRequest createWorkRequest() {
        return new WorkRequest();
    }

    /**
     * Create an instance of {@link Work }
     * 
     */
    public Work createWork() {
        return new Work();
    }

    /**
     * Create an instance of {@link Crew.Names }
     * 
     */
    public Crew.Names createCrewNames() {
        return new Crew.Names();
    }

    /**
     * Create an instance of {@link WorkTimeSchedule }
     * 
     */
    public WorkTimeSchedule createWorkTimeSchedule() {
        return new WorkTimeSchedule();
    }

    /**
     * Create an instance of {@link Organisation.StreetAddress }
     * 
     */
    public Organisation.StreetAddress createOrganisationStreetAddress() {
        return new Organisation.StreetAddress();
    }

    /**
     * Create an instance of {@link Organisation.StreetAddress.TownDetail }
     * 
     */
    public Organisation.StreetAddress.TownDetail createOrganisationStreetAddressTownDetail() {
        return new Organisation.StreetAddress.TownDetail();
    }

    /**
     * Create an instance of {@link WorkTimeSchedule.ScheduleInterval }
     * 
     */
    public WorkTimeSchedule.ScheduleInterval createWorkTimeScheduleScheduleInterval() {
        return new WorkTimeSchedule.ScheduleInterval();
    }

    /**
     * Create an instance of {@link Asset.Names.NameType }
     * 
     */
    public Asset.Names.NameType createAssetNamesNameType() {
        return new Asset.Names.NameType();
    }

    /**
     * Create an instance of {@link WorkLocation.PositionPoints }
     * 
     */
    public WorkLocation.PositionPoints createWorkLocationPositionPoints() {
        return new WorkLocation.PositionPoints();
    }

    /**
     * Create an instance of {@link Crew.Names.NameType }
     * 
     */
    public Crew.Names.NameType createCrewNamesNameType() {
        return new Crew.Names.NameType();
    }

    /**
     * Create an instance of {@link Crew }
     * 
     */
    public Crew createCrew() {
        return new Crew();
    }

    /**
     * Create an instance of {@link Organisation.Names.NameType }
     * 
     */
    public Organisation.Names.NameType createOrganisationNamesNameType() {
        return new Organisation.Names.NameType();
    }

    /**
     * Create an instance of {@link WorkLocation.CoordinateSystem }
     * 
     */
    public WorkLocation.CoordinateSystem createWorkLocationCoordinateSystem() {
        return new WorkLocation.CoordinateSystem();
    }

    /**
     * Create an instance of {@link Work.WorkStatus.Status }
     * 
     */
    public Work.WorkStatus.Status createWorkWorkStatusStatus() {
        return new Work.WorkStatus.Status();
    }

    /**
     * Create an instance of {@link WorkLocation }
     * 
     */
    public WorkLocation createWorkLocation() {
        return new WorkLocation();
    }

    /**
     * Create an instance of {@link Organisation }
     * 
     */
    public Organisation createOrganisation() {
        return new Organisation();
    }

    /**
     * Create an instance of {@link Organisation.Names }
     * 
     */
    public Organisation.Names createOrganisationNames() {
        return new Organisation.Names();
    }

    /**
     * Create an instance of {@link WorkLocation.MainAddress.Status }
     * 
     */
    public WorkLocation.MainAddress.Status createWorkLocationMainAddressStatus() {
        return new WorkLocation.MainAddress.Status();
    }

    /**
     * Create an instance of {@link WorkLocation.MainAddress }
     * 
     */
    public WorkLocation.MainAddress createWorkLocationMainAddress() {
        return new WorkLocation.MainAddress();
    }

    /**
     * Create an instance of {@link Organisation.Phone1 }
     * 
     */
    public Organisation.Phone1 createOrganisationPhone1() {
        return new Organisation.Phone1();
    }

    /**
     * Create an instance of {@link Work.WorkStatus }
     * 
     */
    public Work.WorkStatus createWorkWorkStatus() {
        return new Work.WorkStatus();
    }

    /**
     * Create an instance of {@link WorkLocation.Hazards }
     * 
     */
    public WorkLocation.Hazards createWorkLocationHazards() {
        return new WorkLocation.Hazards();
    }

    /**
     * Create an instance of {@link Asset }
     * 
     */
    public Asset createAsset() {
        return new Asset();
    }

    /**
     * Create an instance of {@link WorkLocation.MainAddress.TownDetail }
     * 
     */
    public WorkLocation.MainAddress.TownDetail createWorkLocationMainAddressTownDetail() {
        return new WorkLocation.MainAddress.TownDetail();
    }

    /**
     * Create an instance of {@link WorkTask }
     * 
     */
    public WorkTask createWorkTask() {
        return new WorkTask();
    }

    /**
     * Create an instance of {@link Organisation.StreetAddress.StreetDetail }
     * 
     */
    public Organisation.StreetAddress.StreetDetail createOrganisationStreetAddressStreetDetail() {
        return new Organisation.StreetAddress.StreetDetail();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iec.ch/TC57/2010/WorkRequest#", name = "WorkRequest")
    public JAXBElement<WorkRequest> createWorkRequest(WorkRequest value) {
        return new JAXBElement<WorkRequest>(_WorkRequest_QNAME, WorkRequest.class, null, value);
    }

}
