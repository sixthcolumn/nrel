
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * The permissible values of DRProgramEnrollmentStatus are: 'Active', 'Inactive', 'Pending', 'Other' and 'Unknown'. Active status means that the DRProgramEnrollment has a participation start date in the past and a participation end date in the future, even if control is not currently active. A status of Inactive implies that the DRProgramEnrollment has a participation start date in the future or a participation end date in the past. A status of Pending means that the DRProgramEnrollDate is in the past, but that the DRProgramEnrollment has a participation start date in the future. The Other and Unknown statuses are included for extensibility, but their use is discouraged. If the DRProgramEnrollmentStatus is set to be Other, the DR Program Enrollment Agent should populate the OtherDRProgramEnrollmentStatus element with the non-standard status value.
 * 
 * <p>Java class for DRProgramEnrollmentStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DRProgramEnrollmentStatus">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.multispeak.org/V5.0/enumerations>DRProgramEnrollmentStatusKind">
 *       &lt;attribute name="otherKind" type="{http://www.multispeak.org/V5.0/enumerations}otherKind" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DRProgramEnrollmentStatus", propOrder = {
    "value"
})
public class DRProgramEnrollmentStatus {

    @XmlValue
    protected DRProgramEnrollmentStatusKind value;
    @XmlAttribute(name = "otherKind")
    protected String otherKind;

    /**
     * The permissible values of DRProgramEnrollmentStatus are: 'Active', 'Inactive', 'Pending', 'Other' and 'Unknown'. Active status means that the DRProgramEnrollment has a participation start date in the past and a participation end date in the future, even if control is not currently active. A status of Inactive implies that the DRProgramEnrollment has a participation start date in the future or a participation end date in the past. A status of Pending means that the DRProgramEnrollDate is in the past, but that the DRProgramEnrollment has a participation start date in the future. The Other and Unknown statuses are included for extensibility, but their use is discouraged. If the DRProgramEnrollmentStatus is set to be Other, the DR Program Enrollment Agent should populate the OtherDRProgramEnrollmentStatus element with the non-standard status value.
     * 
     * @return
     *     possible object is
     *     {@link DRProgramEnrollmentStatusKind }
     *     
     */
    public DRProgramEnrollmentStatusKind getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link DRProgramEnrollmentStatusKind }
     *     
     */
    public void setValue(DRProgramEnrollmentStatusKind value) {
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
