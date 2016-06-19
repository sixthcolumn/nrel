
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.enumerations.SubmissionPurpose;


/**
 * <p>Java class for designSubmission complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="designSubmission">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspReferable">
 *       &lt;sequence>
 *         &lt;element name="submissionPurpose" type="{http://www.multispeak.org/V5.0/enumerations}submissionPurpose"/>
 *         &lt;element name="design" type="{http://www.multispeak.org/V5.0}design"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "designSubmission", propOrder = {
    "submissionPurpose",
    "design"
})
public class DesignSubmission
    extends MspReferable
{

    @XmlElement(required = true)
    protected SubmissionPurpose submissionPurpose;
    @XmlElement(required = true)
    protected Design design;

    /**
     * Gets the value of the submissionPurpose property.
     * 
     * @return
     *     possible object is
     *     {@link SubmissionPurpose }
     *     
     */
    public SubmissionPurpose getSubmissionPurpose() {
        return submissionPurpose;
    }

    /**
     * Sets the value of the submissionPurpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubmissionPurpose }
     *     
     */
    public void setSubmissionPurpose(SubmissionPurpose value) {
        this.submissionPurpose = value;
    }

    /**
     * Gets the value of the design property.
     * 
     * @return
     *     possible object is
     *     {@link Design }
     *     
     */
    public Design getDesign() {
        return design;
    }

    /**
     * Sets the value of the design property.
     * 
     * @param value
     *     allowed object is
     *     {@link Design }
     *     
     */
    public void setDesign(Design value) {
        this.design = value;
    }

}
