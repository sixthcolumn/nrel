
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.multispeak.v5_0.commontypes.ObjectID;


/**
 * This class represents a single instance of a status change for a DR event.
 * 
 * <p>Java class for demandResponseEventStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="demandResponseEventStatus">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspObject">
 *       &lt;sequence>
 *         &lt;element name="demandResponseEventID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID"/>
 *         &lt;element name="timeStamp" type="{http://www.multispeak.org/V5.0/primitives}mspDateTime"/>
 *         &lt;element name="DREventStatusOptions" type="{http://www.multispeak.org/V5.0}DREventStatusOptions"/>
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
@XmlType(name = "demandResponseEventStatus", propOrder = {
    "demandResponseEventID",
    "timeStamp",
    "drEventStatusOptions"
})
public class DemandResponseEventStatus
    extends MspObject
{

    @XmlElement(required = true)
    protected ObjectID demandResponseEventID;
    @XmlElement(required = true)
    protected XMLGregorianCalendar timeStamp;
    @XmlElement(name = "DREventStatusOptions", required = true)
    protected DREventStatusOptions drEventStatusOptions;

    /**
     * Gets the value of the demandResponseEventID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID }
     *     
     */
    public ObjectID getDemandResponseEventID() {
        return demandResponseEventID;
    }

    /**
     * Sets the value of the demandResponseEventID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID }
     *     
     */
    public void setDemandResponseEventID(ObjectID value) {
        this.demandResponseEventID = value;
    }

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
     * Gets the value of the drEventStatusOptions property.
     * 
     * @return
     *     possible object is
     *     {@link DREventStatusOptions }
     *     
     */
    public DREventStatusOptions getDREventStatusOptions() {
        return drEventStatusOptions;
    }

    /**
     * Sets the value of the drEventStatusOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link DREventStatusOptions }
     *     
     */
    public void setDREventStatusOptions(DREventStatusOptions value) {
        this.drEventStatusOptions = value;
    }

}
