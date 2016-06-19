
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.enumerations.DayLabel;


/**
 * <p>Java class for dayOfWeek complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dayOfWeek">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dayLabel" type="{http://www.multispeak.org/V5.0/enumerations}dayLabel"/>
 *         &lt;element name="bins" type="{http://www.multispeak.org/V5.0}bins"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dayOfWeek", propOrder = {
    "dayLabel",
    "bins"
})
public class DayOfWeek {

    @XmlElement(required = true)
    protected DayLabel dayLabel;
    @XmlElement(required = true)
    protected Bins bins;

    /**
     * Gets the value of the dayLabel property.
     * 
     * @return
     *     possible object is
     *     {@link DayLabel }
     *     
     */
    public DayLabel getDayLabel() {
        return dayLabel;
    }

    /**
     * Sets the value of the dayLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link DayLabel }
     *     
     */
    public void setDayLabel(DayLabel value) {
        this.dayLabel = value;
    }

    /**
     * Gets the value of the bins property.
     * 
     * @return
     *     possible object is
     *     {@link Bins }
     *     
     */
    public Bins getBins() {
        return bins;
    }

    /**
     * Sets the value of the bins property.
     * 
     * @param value
     *     allowed object is
     *     {@link Bins }
     *     
     */
    public void setBins(Bins value) {
        this.bins = value;
    }

}
