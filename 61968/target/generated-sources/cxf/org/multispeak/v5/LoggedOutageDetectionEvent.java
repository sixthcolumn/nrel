
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.ObjectRef;
import org.multispeak.v5_0.enumerations.CallType;


/**
 * <p>Java class for loggedOutageDetectionEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="loggedOutageDetectionEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}outageDetectionEvent">
 *       &lt;sequence>
 *         &lt;element name="outageDetectionRecordRef" type="{http://www.multispeak.org/V5.0/commonTypes}objectRef" minOccurs="0"/>
 *         &lt;element name="takenBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="callType" type="{http://www.multispeak.org/V5.0/enumerations}callType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "loggedOutageDetectionEvent", propOrder = {
    "outageDetectionRecordRef",
    "takenBy",
    "callType"
})
public class LoggedOutageDetectionEvent
    extends OutageDetectionEvent
{

    protected ObjectRef outageDetectionRecordRef;
    protected String takenBy;
    protected CallType callType;

    /**
     * Gets the value of the outageDetectionRecordRef property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectRef }
     *     
     */
    public ObjectRef getOutageDetectionRecordRef() {
        return outageDetectionRecordRef;
    }

    /**
     * Sets the value of the outageDetectionRecordRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectRef }
     *     
     */
    public void setOutageDetectionRecordRef(ObjectRef value) {
        this.outageDetectionRecordRef = value;
    }

    /**
     * Gets the value of the takenBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTakenBy() {
        return takenBy;
    }

    /**
     * Sets the value of the takenBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTakenBy(String value) {
        this.takenBy = value;
    }

    /**
     * Gets the value of the callType property.
     * 
     * @return
     *     possible object is
     *     {@link CallType }
     *     
     */
    public CallType getCallType() {
        return callType;
    }

    /**
     * Sets the value of the callType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CallType }
     *     
     */
    public void setCallType(CallType value) {
        this.callType = value;
    }

}
