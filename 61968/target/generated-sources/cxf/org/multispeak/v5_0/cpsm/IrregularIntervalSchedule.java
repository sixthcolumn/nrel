
package org.multispeak.v5_0.cpsm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IrregularIntervalSchedule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IrregularIntervalSchedule">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/cpsm}BasicIntervalSchedule">
 *       &lt;sequence>
 *         &lt;element name="irregularTimePoints" type="{http://www.multispeak.org/V5.0/cpsm}IrregularTimePoints" minOccurs="0"/>
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
@XmlType(name = "IrregularIntervalSchedule", propOrder = {
    "irregularTimePoints"
})
public class IrregularIntervalSchedule
    extends BasicIntervalSchedule
{

    protected IrregularTimePoints irregularTimePoints;

    /**
     * Gets the value of the irregularTimePoints property.
     * 
     * @return
     *     possible object is
     *     {@link IrregularTimePoints }
     *     
     */
    public IrregularTimePoints getIrregularTimePoints() {
        return irregularTimePoints;
    }

    /**
     * Sets the value of the irregularTimePoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link IrregularTimePoints }
     *     
     */
    public void setIrregularTimePoints(IrregularTimePoints value) {
        this.irregularTimePoints = value;
    }

}
