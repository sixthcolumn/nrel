
package ch.iec.tc57._2011.meterreadschedule;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MeterReadSchedule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MeterReadSchedule">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomerAccount" type="{http://iec.ch/TC57/2011/MeterReadSchedule#}CustomerAccount" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CustomerAgreement" type="{http://iec.ch/TC57/2011/MeterReadSchedule#}CustomerAgreement" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EndDevice" type="{http://iec.ch/TC57/2011/MeterReadSchedule#}EndDevice" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EndDeviceGroup" type="{http://iec.ch/TC57/2011/MeterReadSchedule#}EndDeviceGroup" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ReadingType" type="{http://iec.ch/TC57/2011/MeterReadSchedule#}ReadingType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TimeSchedule" type="{http://iec.ch/TC57/2011/MeterReadSchedule#}TimeSchedule" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="UsagePoint" type="{http://iec.ch/TC57/2011/MeterReadSchedule#}UsagePoint" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="UsagePointGroup" type="{http://iec.ch/TC57/2011/MeterReadSchedule#}UsagePointGroup" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeterReadSchedule", propOrder = {
    "customerAccount",
    "customerAgreement",
    "endDevice",
    "endDeviceGroup",
    "readingType",
    "timeSchedule",
    "usagePoint",
    "usagePointGroup"
})
public class MeterReadSchedule {

    @XmlElement(name = "CustomerAccount")
    protected List<CustomerAccount> customerAccount;
    @XmlElement(name = "CustomerAgreement")
    protected List<CustomerAgreement> customerAgreement;
    @XmlElement(name = "EndDevice")
    protected List<EndDevice> endDevice;
    @XmlElement(name = "EndDeviceGroup")
    protected List<EndDeviceGroup> endDeviceGroup;
    @XmlElement(name = "ReadingType")
    protected List<ReadingType> readingType;
    @XmlElement(name = "TimeSchedule")
    protected List<TimeSchedule> timeSchedule;
    @XmlElement(name = "UsagePoint")
    protected List<UsagePoint> usagePoint;
    @XmlElement(name = "UsagePointGroup")
    protected List<UsagePointGroup> usagePointGroup;

    /**
     * Gets the value of the customerAccount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customerAccount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomerAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerAccount }
     * 
     * 
     */
    public List<CustomerAccount> getCustomerAccount() {
        if (customerAccount == null) {
            customerAccount = new ArrayList<CustomerAccount>();
        }
        return this.customerAccount;
    }

    /**
     * Gets the value of the customerAgreement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customerAgreement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomerAgreement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerAgreement }
     * 
     * 
     */
    public List<CustomerAgreement> getCustomerAgreement() {
        if (customerAgreement == null) {
            customerAgreement = new ArrayList<CustomerAgreement>();
        }
        return this.customerAgreement;
    }

    /**
     * Gets the value of the endDevice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the endDevice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEndDevice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EndDevice }
     * 
     * 
     */
    public List<EndDevice> getEndDevice() {
        if (endDevice == null) {
            endDevice = new ArrayList<EndDevice>();
        }
        return this.endDevice;
    }

    /**
     * Gets the value of the endDeviceGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the endDeviceGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEndDeviceGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EndDeviceGroup }
     * 
     * 
     */
    public List<EndDeviceGroup> getEndDeviceGroup() {
        if (endDeviceGroup == null) {
            endDeviceGroup = new ArrayList<EndDeviceGroup>();
        }
        return this.endDeviceGroup;
    }

    /**
     * Gets the value of the readingType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the readingType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReadingType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReadingType }
     * 
     * 
     */
    public List<ReadingType> getReadingType() {
        if (readingType == null) {
            readingType = new ArrayList<ReadingType>();
        }
        return this.readingType;
    }

    /**
     * Gets the value of the timeSchedule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the timeSchedule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimeSchedule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimeSchedule }
     * 
     * 
     */
    public List<TimeSchedule> getTimeSchedule() {
        if (timeSchedule == null) {
            timeSchedule = new ArrayList<TimeSchedule>();
        }
        return this.timeSchedule;
    }

    /**
     * Gets the value of the usagePoint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the usagePoint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUsagePoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UsagePoint }
     * 
     * 
     */
    public List<UsagePoint> getUsagePoint() {
        if (usagePoint == null) {
            usagePoint = new ArrayList<UsagePoint>();
        }
        return this.usagePoint;
    }

    /**
     * Gets the value of the usagePointGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the usagePointGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUsagePointGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UsagePointGroup }
     * 
     * 
     */
    public List<UsagePointGroup> getUsagePointGroup() {
        if (usagePointGroup == null) {
            usagePointGroup = new ArrayList<UsagePointGroup>();
        }
        return this.usagePointGroup;
    }

}
