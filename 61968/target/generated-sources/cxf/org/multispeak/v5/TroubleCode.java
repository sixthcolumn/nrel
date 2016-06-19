
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * These are vehicle device code types (aka modem code types) which are typically associated with the warning lights displayed on most vehicle instrument clusters, for example “Water Temperature”, “Oil Pressure”, generic “Check Engine”. It is the responsibility of the sending system to determine which type of codes received from the modem constitute “Trouble” type codes. Current on-board vehicle computer systems will support one of 2 possible standards for the representation of Trouble Codes: J1939 or ODBII. Which format will be used is a function of the specific vehicle where the code originated.
 * 
 * <p>Java class for troubleCode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="troubleCode">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="J1939TroubleCode" type="{http://www.multispeak.org/V5.0}J1939TroubleCode"/>
 *         &lt;element name="ODBIITroubleCode" type="{http://www.multispeak.org/V5.0}ODBIITroubleCode"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "troubleCode", propOrder = {
    "j1939TroubleCode",
    "odbiiTroubleCode"
})
public class TroubleCode {

    @XmlElement(name = "J1939TroubleCode")
    protected J1939TroubleCode j1939TroubleCode;
    @XmlElement(name = "ODBIITroubleCode")
    protected ODBIITroubleCode odbiiTroubleCode;

    /**
     * Gets the value of the j1939TroubleCode property.
     * 
     * @return
     *     possible object is
     *     {@link J1939TroubleCode }
     *     
     */
    public J1939TroubleCode getJ1939TroubleCode() {
        return j1939TroubleCode;
    }

    /**
     * Sets the value of the j1939TroubleCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link J1939TroubleCode }
     *     
     */
    public void setJ1939TroubleCode(J1939TroubleCode value) {
        this.j1939TroubleCode = value;
    }

    /**
     * Gets the value of the odbiiTroubleCode property.
     * 
     * @return
     *     possible object is
     *     {@link ODBIITroubleCode }
     *     
     */
    public ODBIITroubleCode getODBIITroubleCode() {
        return odbiiTroubleCode;
    }

    /**
     * Sets the value of the odbiiTroubleCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODBIITroubleCode }
     *     
     */
    public void setODBIITroubleCode(ODBIITroubleCode value) {
        this.odbiiTroubleCode = value;
    }

}
