
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for outageSplit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="outageSplit">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspObject">
 *       &lt;sequence>
 *         &lt;element name="timeStamp" type="{http://www.multispeak.org/V5.0/primitives}mspDateTime"/>
 *         &lt;element name="originalOutage" type="{http://www.multispeak.org/V5.0}originalOutage"/>
 *         &lt;element name="splitReason" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="resultingOutages" type="{http://www.multispeak.org/V5.0}resultingOutages"/>
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
@XmlType(name = "outageSplit", propOrder = {
    "timeStamp",
    "originalOutage",
    "splitReason",
    "resultingOutages"
})
public class OutageSplit
    extends MspObject
{

    @XmlElement(required = true)
    protected XMLGregorianCalendar timeStamp;
    @XmlElement(required = true)
    protected OriginalOutage originalOutage;
    @XmlElement(required = true)
    protected String splitReason;
    @XmlElement(required = true)
    protected ResultingOutages resultingOutages;

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
     * Gets the value of the originalOutage property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalOutage }
     *     
     */
    public OriginalOutage getOriginalOutage() {
        return originalOutage;
    }

    /**
     * Sets the value of the originalOutage property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalOutage }
     *     
     */
    public void setOriginalOutage(OriginalOutage value) {
        this.originalOutage = value;
    }

    /**
     * Gets the value of the splitReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSplitReason() {
        return splitReason;
    }

    /**
     * Sets the value of the splitReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSplitReason(String value) {
        this.splitReason = value;
    }

    /**
     * Gets the value of the resultingOutages property.
     * 
     * @return
     *     possible object is
     *     {@link ResultingOutages }
     *     
     */
    public ResultingOutages getResultingOutages() {
        return resultingOutages;
    }

    /**
     * Sets the value of the resultingOutages property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultingOutages }
     *     
     */
    public void setResultingOutages(ResultingOutages value) {
        this.resultingOutages = value;
    }

}
