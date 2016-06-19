
package org.multispeak.v5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.MspExtensible;


/**
 * <p>Java class for troubleCodes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="troubleCodes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="troubleCode" type="{http://www.multispeak.org/V5.0}troubleCode" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "troubleCodes", propOrder = {
    "troubleCode"
})
public class TroubleCodes
    extends MspExtensible
{

    @XmlElement(required = true)
    protected List<TroubleCode> troubleCode;

    /**
     * Gets the value of the troubleCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the troubleCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTroubleCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TroubleCode }
     * 
     * 
     */
    public List<TroubleCode> getTroubleCode() {
        if (troubleCode == null) {
            troubleCode = new ArrayList<TroubleCode>();
        }
        return this.troubleCode;
    }

}
