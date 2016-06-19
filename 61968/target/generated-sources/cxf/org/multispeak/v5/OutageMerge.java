
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * This is the payload of the OutagesMergedNotification.
 * 
 * <p>Java class for outageMerge complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="outageMerge">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspObject">
 *       &lt;sequence>
 *         &lt;element name="timeStamp" type="{http://www.multispeak.org/V5.0/primitives}mspDateTime"/>
 *         &lt;element name="deletedOutages" type="{http://www.multispeak.org/V5.0}deletedOutages"/>
 *         &lt;element name="mergeReason" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mergedOutage" type="{http://www.multispeak.org/V5.0}mergedOutage"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "outageMerge", propOrder = {
    "timeStamp",
    "deletedOutages",
    "mergeReason",
    "mergedOutage"
})
public class OutageMerge
    extends MspObject
{

    @XmlElement(required = true)
    protected XMLGregorianCalendar timeStamp;
    @XmlElement(required = true)
    protected DeletedOutages deletedOutages;
    @XmlElement(required = true)
    protected String mergeReason;
    @XmlElement(required = true)
    protected MergedOutage mergedOutage;

    /**
     * Gets the value of the timeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeStamp() {
        return timeStamp;
    }

    /**
     * Sets the value of the timeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeStamp(XMLGregorianCalendar value) {
        this.timeStamp = value;
    }

    /**
     * Gets the value of the deletedOutages property.
     * 
     * @return
     *     possible object is
     *     {@link DeletedOutages }
     *     
     */
    public DeletedOutages getDeletedOutages() {
        return deletedOutages;
    }

    /**
     * Sets the value of the deletedOutages property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeletedOutages }
     *     
     */
    public void setDeletedOutages(DeletedOutages value) {
        this.deletedOutages = value;
    }

    /**
     * Gets the value of the mergeReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMergeReason() {
        return mergeReason;
    }

    /**
     * Sets the value of the mergeReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMergeReason(String value) {
        this.mergeReason = value;
    }

    /**
     * Gets the value of the mergedOutage property.
     * 
     * @return
     *     possible object is
     *     {@link MergedOutage }
     *     
     */
    public MergedOutage getMergedOutage() {
        return mergedOutage;
    }

    /**
     * Sets the value of the mergedOutage property.
     * 
     * @param value
     *     allowed object is
     *     {@link MergedOutage }
     *     
     */
    public void setMergedOutage(MergedOutage value) {
        this.mergedOutage = value;
    }

}
