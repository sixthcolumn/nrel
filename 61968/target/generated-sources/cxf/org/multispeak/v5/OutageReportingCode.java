
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * Reporting code as defined by the reporting body or utility.  This may be extended as defined by the reporting standard or utility.
 * 
 * <p>Java class for outageReportingCode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="outageReportingCode">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.multispeak.org/V5.0/primitives>stringType">
 *       &lt;attribute name="reportingBody" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="reportingGrouping" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "outageReportingCode", propOrder = {
    "value"
})
public class OutageReportingCode {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "reportingBody", required = true)
    protected String reportingBody;
    @XmlAttribute(name = "reportingGrouping")
    protected String reportingGrouping;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the reportingBody property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportingBody() {
        return reportingBody;
    }

    /**
     * Sets the value of the reportingBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportingBody(String value) {
        this.reportingBody = value;
    }

    /**
     * Gets the value of the reportingGrouping property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportingGrouping() {
        return reportingGrouping;
    }

    /**
     * Sets the value of the reportingGrouping property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportingGrouping(String value) {
        this.reportingGrouping = value;
    }

}
