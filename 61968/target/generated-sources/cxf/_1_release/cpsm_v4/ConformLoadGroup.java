
package _1_release.cpsm_v4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConformLoadGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConformLoadGroup">
 *   &lt;complexContent>
 *     &lt;extension base="{cpsm_V4.1_Release}mspCIMObject">
 *       &lt;sequence>
 *         &lt;element name="subLoadAreaID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="conformLoadSchedule" type="{cpsm_V4.1_Release}ConformLoadSchedule" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConformLoadGroup", propOrder = {
    "subLoadAreaID",
    "conformLoadSchedule"
})
public class ConformLoadGroup
    extends MspCIMObject
{

    protected String subLoadAreaID;
    protected ConformLoadSchedule conformLoadSchedule;

    /**
     * Gets the value of the subLoadAreaID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubLoadAreaID() {
        return subLoadAreaID;
    }

    /**
     * Sets the value of the subLoadAreaID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubLoadAreaID(String value) {
        this.subLoadAreaID = value;
    }

    /**
     * Gets the value of the conformLoadSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link ConformLoadSchedule }
     *     
     */
    public ConformLoadSchedule getConformLoadSchedule() {
        return conformLoadSchedule;
    }

    /**
     * Sets the value of the conformLoadSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConformLoadSchedule }
     *     
     */
    public void setConformLoadSchedule(ConformLoadSchedule value) {
        this.conformLoadSchedule = value;
    }

}
