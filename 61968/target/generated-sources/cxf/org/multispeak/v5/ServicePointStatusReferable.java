
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.ServicePointID;
import org.multispeak.v5_0.enumerations.AccountStatus;
import org.multispeak.v5_0.enumerations.ConnectivityStatus;
import org.multispeak.v5_0.enumerations.ServiceStatus;


/**
 * <p>Java class for servicePointStatusReferable complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="servicePointStatusReferable">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspReferable">
 *       &lt;sequence>
 *         &lt;element name="servicePointID" type="{http://www.multispeak.org/V5.0/commonTypes}servicePointID"/>
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
@XmlType(name = "servicePointStatusReferable", propOrder = {
    "servicePointID",
    "serviceStatus",
    "accountStatus",
    "connectivityStatus"
})
public class ServicePointStatusReferable
    extends MspReferable
{

    @XmlElement(required = true)
    protected ServicePointID servicePointID;
    @XmlElement(required = true)
    protected ServiceStatus serviceStatus;
    protected AccountStatus accountStatus;
    protected ConnectivityStatus connectivityStatus;

    /**
     * Gets the value of the servicePointID property.
     * 
     * @return
     *     possible object is
     *     {@link ServicePointID }
     *     
     */
    public ServicePointID getServicePointID() {
        return servicePointID;
    }

    /**
     * Sets the value of the servicePointID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServicePointID }
     *     
     */
    public void setServicePointID(ServicePointID value) {
        this.servicePointID = value;
    }

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
