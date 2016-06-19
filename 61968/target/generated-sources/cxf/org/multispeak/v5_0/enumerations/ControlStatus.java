
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * These are the control status indications.  The equivalent DNP 3.0 status codes are:             
 * Control accepted = 0                                 
 * Operate message received after arm timer timed out (Select timeout)= 1 Point not operated because point not selected before operation (Point not selected)= 2 Control request not accepted; formatting errors in control action (Formatting errors in control request)= 3                                                                  
 * Control operation not supported for this point (Control not supported) = 4 Control queue is full = 5                              
 * Control request not accepted, control hardware problems (Hardware failure)= 6 Point already selected - undefined in DNP 3.0               
 * 
 * <p>Java class for controlStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="controlStatus">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.multispeak.org/V5.0/enumerations>controlStatusKind">
 *       &lt;attribute name="otherKind" type="{http://www.multispeak.org/V5.0/enumerations}otherKind" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "controlStatus", propOrder = {
    "value"
})
public class ControlStatus {

    @XmlValue
    protected ControlStatusKind value;
    @XmlAttribute(name = "otherKind")
    protected String otherKind;

    /**
     * These are the control status indications.  The equivalent DNP 3.0 status codes are:             
     * Control accepted = 0                                 
     * Operate message received after arm timer timed out (Select timeout)= 1 Point not operated because point not selected before operation (Point not selected)= 2 Control request not accepted; formatting errors in control action (Formatting errors in control request)= 3                                                                  
     * Control operation not supported for this point (Control not supported) = 4 Control queue is full = 5                              
     * Control request not accepted, control hardware problems (Hardware failure)= 6 Point already selected - undefined in DNP 3.0               
     * 
     * @return
     *     possible object is
     *     {@link ControlStatusKind }
     *     
     */
    public ControlStatusKind getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link ControlStatusKind }
     *     
     */
    public void setValue(ControlStatusKind value) {
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
