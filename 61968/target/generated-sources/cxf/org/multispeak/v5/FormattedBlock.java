
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This structure is used to send  data in separated values blocks.  This means is more efficient than sending large amounts of data using XML tag sets.  For instance, if the separator chosen is a comma, this would be a CSV data block.
 * 
 * <p>Java class for formattedBlock complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="formattedBlock">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="separator" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="contentModelGroup" type="{http://www.multispeak.org/V5.0}contentModelGroup" minOccurs="0"/>
 *         &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valSyntax" type="{http://www.multispeak.org/V5.0}valSyntax"/>
 *         &lt;element name="valueList" type="{http://www.multispeak.org/V5.0}valueList"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "formattedBlock", propOrder = {
    "separator",
    "contentModelGroup",
    "comment",
    "valSyntax",
    "valueList"
})
public class FormattedBlock {

    @XmlElement(required = true)
    protected String separator;
    protected ContentModelGroup contentModelGroup;
    protected String comment;
    @XmlElement(required = true)
    protected ValSyntax valSyntax;
    @XmlElement(required = true)
    protected ValueList valueList;

    /**
     * Gets the value of the separator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeparator() {
        return separator;
    }

    /**
     * Sets the value of the separator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeparator(String value) {
        this.separator = value;
    }

    /**
     * Gets the value of the contentModelGroup property.
     * 
     * @return
     *     possible object is
     *     {@link ContentModelGroup }
     *     
     */
    public ContentModelGroup getContentModelGroup() {
        return contentModelGroup;
    }

    /**
     * Sets the value of the contentModelGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentModelGroup }
     *     
     */
    public void setContentModelGroup(ContentModelGroup value) {
        this.contentModelGroup = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the valSyntax property.
     * 
     * @return
     *     possible object is
     *     {@link ValSyntax }
     *     
     */
    public ValSyntax getValSyntax() {
        return valSyntax;
    }

    /**
     * Sets the value of the valSyntax property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValSyntax }
     *     
     */
    public void setValSyntax(ValSyntax value) {
        this.valSyntax = value;
    }

    /**
     * Gets the value of the valueList property.
     * 
     * @return
     *     possible object is
     *     {@link ValueList }
     *     
     */
    public ValueList getValueList() {
        return valueList;
    }

    /**
     * Sets the value of the valueList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueList }
     *     
     */
    public void setValueList(ValueList value) {
        this.valueList = value;
    }

}
