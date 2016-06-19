
package org.multispeak.v5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.MspExtensible;


/**
 * These are all other codes received from the vehicle device (aka modem) which are configured as neither TroubleCodes nor AlertCodes. Examples may be any vehicle sensor data which the onboard computer makes available but which does not necessarily indicate a problem situation, such as, PTO status, engine RPM’s, engine temperature (when it has not exceeded the alert threshold), etc.
 * 
 * <p>Java class for otherCodes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="otherCodes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="otherCode" type="{http://www.multispeak.org/V5.0}otherCode" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "otherCodes", propOrder = {
    "otherCode"
})
public class OtherCodes
    extends MspExtensible
{

    @XmlElement(required = true)
    protected List<OtherCode> otherCode;

    /**
     * Gets the value of the otherCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherCode }
     * 
     * 
     */
    public List<OtherCode> getOtherCode() {
        if (otherCode == null) {
            otherCode = new ArrayList<OtherCode>();
        }
        return this.otherCode;
    }

}
