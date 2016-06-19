
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.NounUnspecifiedRef;


/**
 * <p>Java class for workOrderSelection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="workOrderSelection">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspReferable">
 *       &lt;sequence>
 *         &lt;element name="workOrderReference" type="{http://www.multispeak.org/V5.0/commonTypes}nounUnspecifiedRef" minOccurs="0"/>
 *         &lt;element name="jobDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="statusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "workOrderSelection", propOrder = {
    "workOrderReference",
    "jobDescription",
    "statusCode"
})
public class WorkOrderSelection
    extends MspReferable
{

    protected NounUnspecifiedRef workOrderReference;
    protected String jobDescription;
    protected String statusCode;

    /**
     * Gets the value of the workOrderReference property.
     * 
     * @return
     *     possible object is
     *     {@link NounUnspecifiedRef }
     *     
     */
    public NounUnspecifiedRef getWorkOrderReference() {
        return workOrderReference;
    }

    /**
     * Sets the value of the workOrderReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link NounUnspecifiedRef }
     *     
     */
    public void setWorkOrderReference(NounUnspecifiedRef value) {
        this.workOrderReference = value;
    }

    /**
     * Gets the value of the jobDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobDescription() {
        return jobDescription;
    }

    /**
     * Sets the value of the jobDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobDescription(String value) {
        this.jobDescription = value;
    }

    /**
     * Gets the value of the statusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusCode(String value) {
        this.statusCode = value;
    }

}
