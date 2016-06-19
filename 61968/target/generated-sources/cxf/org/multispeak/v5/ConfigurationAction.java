
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * The configuration action (authorization, modification or cancellation).
 * 
 * <p>Java class for configurationAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="configurationAction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="authorizationAction" type="{http://www.multispeak.org/V5.0}authorizationAction"/>
 *         &lt;element name="modificationAction" type="{http://www.multispeak.org/V5.0}modificationAction"/>
 *         &lt;element name="cancellationAction" type="{http://www.multispeak.org/V5.0}cancellationAction"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "configurationAction", propOrder = {
    "authorizationAction",
    "modificationAction",
    "cancellationAction"
})
public class ConfigurationAction {

    protected AuthorizationAction authorizationAction;
    protected ModificationAction modificationAction;
    protected CancellationAction cancellationAction;

    /**
     * Gets the value of the authorizationAction property.
     * 
     * @return
     *     possible object is
     *     {@link AuthorizationAction }
     *     
     */
    public AuthorizationAction getAuthorizationAction() {
        return authorizationAction;
    }

    /**
     * Sets the value of the authorizationAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorizationAction }
     *     
     */
    public void setAuthorizationAction(AuthorizationAction value) {
        this.authorizationAction = value;
    }

    /**
     * Gets the value of the modificationAction property.
     * 
     * @return
     *     possible object is
     *     {@link ModificationAction }
     *     
     */
    public ModificationAction getModificationAction() {
        return modificationAction;
    }

    /**
     * Sets the value of the modificationAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModificationAction }
     *     
     */
    public void setModificationAction(ModificationAction value) {
        this.modificationAction = value;
    }

    /**
     * Gets the value of the cancellationAction property.
     * 
     * @return
     *     possible object is
     *     {@link CancellationAction }
     *     
     */
    public CancellationAction getCancellationAction() {
        return cancellationAction;
    }

    /**
     * Sets the value of the cancellationAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancellationAction }
     *     
     */
    public void setCancellationAction(CancellationAction value) {
        this.cancellationAction = value;
    }

}
