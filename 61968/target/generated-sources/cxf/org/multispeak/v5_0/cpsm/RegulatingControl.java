
package org.multispeak.v5_0.cpsm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.ObjectID;


/**
 * <p>Java class for RegulatingControl complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegulatingControl">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/cpsm}mspCIMObject">
 *       &lt;sequence>
 *         &lt;element name="regulationSchedule" type="{http://www.multispeak.org/V5.0/cpsm}RegulationSchedule" minOccurs="0"/>
 *         &lt;element name="terminalID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID" minOccurs="0"/>
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
@XmlType(name = "RegulatingControl", propOrder = {
    "regulationSchedule",
    "terminalID"
})
public class RegulatingControl
    extends MspCIMObject
{

    protected RegulationSchedule regulationSchedule;
    protected ObjectID terminalID;

    /**
     * Gets the value of the regulationSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link RegulationSchedule }
     *     
     */
    public RegulationSchedule getRegulationSchedule() {
        return regulationSchedule;
    }

    /**
     * Sets the value of the regulationSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegulationSchedule }
     *     
     */
    public void setRegulationSchedule(RegulationSchedule value) {
        this.regulationSchedule = value;
    }

    /**
     * Gets the value of the terminalID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID }
     *     
     */
    public ObjectID getTerminalID() {
        return terminalID;
    }

    /**
     * Sets the value of the terminalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID }
     *     
     */
    public void setTerminalID(ObjectID value) {
        this.terminalID = value;
    }

}
