
package org.multispeak.v5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.MspExtensible;


/**
 * These are vehicle device code types (aka modem code types) which are typically associated with events which require the immediate or near-immediate attention of an end user of the AVL system of record. This type of code is often, but not always, associated with a configurable threshold value relating to a particular vehicle condition. Examples of Alert Codes with no threshold configurable include “Vehicle Off-Route” and “Man Down” alert originating with a personal emergency pendant but delivered via the vehicle modem. Examples of alerts with a configured threshold are “Vehicle Speeding” and “Water Temperature”. It is the responsibility of the sending system to determine which type of codes received from the modem constitute “Alert” type codes.
 * 
 * <p>Java class for alertCodes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="alertCodes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="alertCode" type="{http://www.multispeak.org/V5.0}alertCode" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "alertCodes", propOrder = {
    "alertCode"
})
public class AlertCodes
    extends MspExtensible
{

    @XmlElement(required = true)
    protected List<AlertCode> alertCode;

    /**
     * Gets the value of the alertCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alertCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlertCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlertCode }
     * 
     * 
     */
    public List<AlertCode> getAlertCode() {
        if (alertCode == null) {
            alertCode = new ArrayList<AlertCode>();
        }
        return this.alertCode;
    }

}
