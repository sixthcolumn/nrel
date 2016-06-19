
package ch.iec.tc57._2011.meterservicerequests;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ch.iec.tc57._2011.schema.message.HeaderType;


/**
 * <p>Java class for MeterServiceRequests complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MeterServiceRequests">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Header" type="{http://www.iec.ch/TC57/2011/schema/message}HeaderType"/>
 *         &lt;element name="MeterServiceWork" type="{http://iec.ch/TC57/2011/MeterServiceRequests#}MeterServiceWork" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ReadingQualityType" type="{http://iec.ch/TC57/2011/MeterServiceRequests#}ReadingQualityType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ReadingType" type="{http://iec.ch/TC57/2011/MeterServiceRequests#}ReadingType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeterServiceRequests", propOrder = {
    "header",
    "meterServiceWork",
    "readingQualityType",
    "readingType"
})
public class MeterServiceRequests {

    @XmlElement(name = "Header", required = true)
    protected HeaderType header;
    @XmlElement(name = "MeterServiceWork")
    protected List<MeterServiceWork> meterServiceWork;
    @XmlElement(name = "ReadingQualityType")
    protected List<ReadingQualityType> readingQualityType;
    @XmlElement(name = "ReadingType")
    protected List<ReadingType> readingType;

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link HeaderType }
     *     
     */
    public HeaderType getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link HeaderType }
     *     
     */
    public void setHeader(HeaderType value) {
        this.header = value;
    }

    /**
     * Gets the value of the meterServiceWork property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the meterServiceWork property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeterServiceWork().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeterServiceWork }
     * 
     * 
     */
    public List<MeterServiceWork> getMeterServiceWork() {
        if (meterServiceWork == null) {
            meterServiceWork = new ArrayList<MeterServiceWork>();
        }
        return this.meterServiceWork;
    }

    /**
     * Gets the value of the readingQualityType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the readingQualityType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReadingQualityType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReadingQualityType }
     * 
     * 
     */
    public List<ReadingQualityType> getReadingQualityType() {
        if (readingQualityType == null) {
            readingQualityType = new ArrayList<ReadingQualityType>();
        }
        return this.readingQualityType;
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

}
