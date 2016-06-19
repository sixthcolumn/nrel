
package _1_release.cpsm_v4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoadCurve complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoadCurve">
 *   &lt;complexContent>
 *     &lt;extension base="{cpsm_V4.1_Release}RegularIntervalSchedule">
 *       &lt;sequence>
 *         &lt;element name="subLoadAreaID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="season" type="{cpsm_V4.1_Release}Season" minOccurs="0"/>
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
@XmlType(name = "LoadCurve", propOrder = {
    "subLoadAreaID",
    "season"
})
public class LoadCurve
    extends RegularIntervalSchedule
{

    protected String subLoadAreaID;
    protected Season season;

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
     * Gets the value of the season property.
     * 
     * @return
     *     possible object is
     *     {@link Season }
     *     
     */
    public Season getSeason() {
        return season;
    }

    /**
     * Sets the value of the season property.
     * 
     * @param value
     *     allowed object is
     *     {@link Season }
     *     
     */
    public void setSeason(Season value) {
        this.season = value;
    }

}
