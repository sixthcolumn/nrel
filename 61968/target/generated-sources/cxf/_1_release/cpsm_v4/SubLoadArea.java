
package _1_release.cpsm_v4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubLoadArea complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubLoadArea">
 *   &lt;complexContent>
 *     &lt;extension base="{cpsm_V4.1_Release}mspCIMObject">
 *       &lt;sequence>
 *         &lt;element name="loadAreaID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "SubLoadArea", propOrder = {
    "loadAreaID"
})
public class SubLoadArea
    extends MspCIMObject
{

    protected String loadAreaID;

    /**
     * Gets the value of the loadAreaID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoadAreaID() {
        return loadAreaID;
    }

    /**
     * Sets the value of the loadAreaID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoadAreaID(String value) {
        this.loadAreaID = value;
    }

}
