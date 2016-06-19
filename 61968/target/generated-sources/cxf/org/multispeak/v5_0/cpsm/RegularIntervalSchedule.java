
package org.multispeak.v5_0.cpsm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.multispeak.v5_0.commontypes.Seconds;


/**
 * The schedule has timePoints where the time between them is constant.  The schedules defined in the CPSM profile are: AreaLoadCurve, NonConformLoadSchedule, and RegulationSchedule.
 * 
 * <p>Java class for RegularIntervalSchedule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegularIntervalSchedule">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/cpsm}BasicIntervalSchedule">
 *       &lt;sequence>
 *         &lt;element name="timeStep" type="{http://www.multispeak.org/V5.0/commonTypes}seconds" minOccurs="0"/>
 *         &lt;element name="endTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="regularTimePoints" type="{http://www.multispeak.org/V5.0/cpsm}RegularTimePoints" minOccurs="0"/>
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
@XmlType(name = "RegularIntervalSchedule", propOrder = {
    "timeStep",
    "endTime",
    "regularTimePoints"
})
@XmlSeeAlso({
    RegulationSchedule.class,
    LoadCurve.class,
    SeasonDayTypeSchedule.class
})
public class RegularIntervalSchedule
    extends BasicIntervalSchedule
{

    protected Seconds timeStep;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endTime;
    protected RegularTimePoints regularTimePoints;

    /**
     * Gets the value of the timeStep property.
     * 
     * @return
     *     possible object is
     *     {@link Seconds }
     *     
     */
    public Seconds getTimeStep() {
        return timeStep;
    }

    /**
     * Sets the value of the timeStep property.
     * 
     * @param value
     *     allowed object is
     *     {@link Seconds }
     *     
     */
    public void setTimeStep(Seconds value) {
        this.timeStep = value;
    }

    /**
     * Gets the value of the endTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndTime() {
        return endTime;
    }

    /**
     * Sets the value of the endTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndTime(XMLGregorianCalendar value) {
        this.endTime = value;
    }

    /**
     * Gets the value of the regularTimePoints property.
     * 
     * @return
     *     possible object is
     *     {@link RegularTimePoints }
     *     
     */
    public RegularTimePoints getRegularTimePoints() {
        return regularTimePoints;
    }

    /**
     * Sets the value of the regularTimePoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegularTimePoints }
     *     
     */
    public void setRegularTimePoints(RegularTimePoints value) {
        this.regularTimePoints = value;
    }

}
