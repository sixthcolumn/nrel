
package org.multispeak.v5;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.MspExtensible;
import org.multispeak.v5_0.enumerations.ConnectorStatus;


/**
 * <p>Java class for loadManagementDeviceRelay complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="loadManagementDeviceRelay">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="relayNumber" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="connectorStatus" type="{http://www.multispeak.org/V5.0/enumerations}connectorStatus" minOccurs="0"/>
 *         &lt;element name="demandResponseDeviceClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "loadManagementDeviceRelay", propOrder = {
    "relayNumber",
    "connectorStatus",
    "demandResponseDeviceClass"
})
public class LoadManagementDeviceRelay
    extends MspExtensible
{

    protected BigInteger relayNumber;
    protected ConnectorStatus connectorStatus;
    protected String demandResponseDeviceClass;

    /**
     * Gets the value of the relayNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRelayNumber() {
        return relayNumber;
    }

    /**
     * Sets the value of the relayNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRelayNumber(BigInteger value) {
        this.relayNumber = value;
    }

    /**
     * Gets the value of the connectorStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ConnectorStatus }
     *     
     */
    public ConnectorStatus getConnectorStatus() {
        return connectorStatus;
    }

    /**
     * Sets the value of the connectorStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectorStatus }
     *     
     */
    public void setConnectorStatus(ConnectorStatus value) {
        this.connectorStatus = value;
    }

    /**
     * Gets the value of the demandResponseDeviceClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDemandResponseDeviceClass() {
        return demandResponseDeviceClass;
    }

    /**
     * Sets the value of the demandResponseDeviceClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDemandResponseDeviceClass(String value) {
        this.demandResponseDeviceClass = value;
    }

}
