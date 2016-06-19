
package ch.iec.tc57._2010.schema.message;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * From CIM
 * 
 * <p>Java class for NameType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NameType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="NameTypeAuthority" type="{http://www.iec.ch/TC57/2010/schema/message}NameTypeAuthority" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NameType", propOrder = {
    "name",
    "description",
    "nameTypeAuthority"
})
public class NameType {

    @XmlElement(required = true)
    protected Object name;
    protected Object description;
    @XmlElement(name = "NameTypeAuthority")
    protected NameTypeAuthority nameTypeAuthority;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setName(Object value) {
        this.name = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDescription(Object value) {
        this.description = value;
    }

    /**
     * Gets the value of the nameTypeAuthority property.
     * 
     * @return
     *     possible object is
     *     {@link NameTypeAuthority }
     *     
     */
    public NameTypeAuthority getNameTypeAuthority() {
        return nameTypeAuthority;
    }

    /**
     * Sets the value of the nameTypeAuthority property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameTypeAuthority }
     *     
     */
    public void setNameTypeAuthority(NameTypeAuthority value) {
        this.nameTypeAuthority = value;
    }

}
