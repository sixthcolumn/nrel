
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * This is the commodity flow status for a customer service point.  FOr instance for tan electric service point, this enumeration establishes whether or not the service is connected so that electric power can flow to the service.
 * 
 * <p>Java class for connectivityStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="connectivityStatus">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.multispeak.org/V5.0/enumerations>connectivityStatusKind">
 *       &lt;attribute name="otherKind" type="{http://www.multispeak.org/V5.0/enumerations}otherKind" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "connectivityStatus", propOrder = {
    "value"
})
public class ConnectivityStatus {

    @XmlValue
    protected ConnectivityStatusKind value;
    @XmlAttribute(name = "otherKind")
    protected String otherKind;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link ConnectivityStatusKind }
     *     
     */
    public ConnectivityStatusKind getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectivityStatusKind }
     *     
     */
    public void setValue(ConnectivityStatusKind value) {
        this.value = value;
    }

    /**
     * Gets the value of the otherKind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherKind() {
        return otherKind;
    }

    /**
     * Sets the value of the otherKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherKind(String value) {
        this.otherKind = value;
    }

}
