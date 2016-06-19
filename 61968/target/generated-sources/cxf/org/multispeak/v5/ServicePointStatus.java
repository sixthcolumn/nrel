
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.MspExtensible;
import org.multispeak.v5_0.enumerations.AccountStatus;
import org.multispeak.v5_0.enumerations.ConnectivityStatus;
import org.multispeak.v5_0.enumerations.ServiceStatus;


/**
 * This is the status of a utility service point
 * 
 * <p>Java class for servicePointStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="servicePointStatus">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="serviceStatus" type="{http://www.multispeak.org/V5.0/enumerations}serviceStatus"/>
 *         &lt;element name="accountStatus" type="{http://www.multispeak.org/V5.0/enumerations}accountStatus" minOccurs="0"/>
 *         &lt;element name="connectivityStatus" type="{http://www.multispeak.org/V5.0/enumerations}connectivityStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "servicePointStatus", propOrder = {
    "serviceStatus",
    "accountStatus",
    "connectivityStatus"
})
public class ServicePointStatus
    extends MspExtensible
{

    @XmlElement(required = true)
    protected ServiceStatus serviceStatus;
    protected AccountStatus accountStatus;
    protected ConnectivityStatus connectivityStatus;

    /**
     * Gets the value of the serviceStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceStatus }
     *     
     */
    public ServiceStatus getServiceStatus() {
        return serviceStatus;
    }

    /**
     * Sets the value of the serviceStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceStatus }
     *     
     */
    public void setServiceStatus(ServiceStatus value) {
        this.serviceStatus = value;
    }

    /**
     * Gets the value of the accountStatus property.
     * 
     * @return
     *     possible object is
     *     {@link AccountStatus }
     *     
     */
    public AccountStatus getAccountStatus() {
        return accountStatus;
    }

    /**
     * Sets the value of the accountStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountStatus }
     *     
     */
    public void setAccountStatus(AccountStatus value) {
        this.accountStatus = value;
    }

    /**
     * Gets the value of the connectivityStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ConnectivityStatus }
     *     
     */
    public ConnectivityStatus getConnectivityStatus() {
        return connectivityStatus;
    }

    /**
     * Sets the value of the connectivityStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectivityStatus }
     *     
     */
    public void setConnectivityStatus(ConnectivityStatus value) {
        this.connectivityStatus = value;
    }

}
