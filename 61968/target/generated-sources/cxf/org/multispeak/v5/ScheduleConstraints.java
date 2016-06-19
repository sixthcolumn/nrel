
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.multispeak.v5_0.commontypes.MspExtensible;


/**
 * These are constraints that the scheduler makes the work performer aware of.
 * 
 * <p>Java class for scheduleConstraints complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="scheduleConstraints">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="earliestStartTime" type="{http://www.multispeak.org/V5.0/primitives}mspDateTime" minOccurs="0"/>
 *         &lt;element name="mustFinishBy" type="{http://www.multispeak.org/V5.0/primitives}mspDateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "scheduleConstraints", propOrder = {
    "earliestStartTime",
    "mustFinishBy"
})
public class ScheduleConstraints
    extends MspExtensible
{

    protected XMLGregorianCalendar earliestStartTime;
    protected XMLGregorianCalendar mustFinishBy;

    /**
     * Gets the value of the earliestStartTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEarliestStartTime() {
        return earliestStartTime;
    }

    /**
     * Sets the value of the earliestStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEarliestStartTime(XMLGregorianCalendar value) {
        this.earliestStartTime = value;
    }

    /**
     * Gets the value of the mustFinishBy property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMustFinishBy() {
        return mustFinishBy;
    }

    /**
     * Sets the value of the mustFinishBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMustFinishBy(XMLGregorianCalendar value) {
        this.mustFinishBy = value;
    }

}
