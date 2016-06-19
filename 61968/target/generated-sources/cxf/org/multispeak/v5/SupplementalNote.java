
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.MspExtensible;


/**
 * A supplementalNote is a means to provide self-describing supplemental information about another class. 
 * 
 * <p>Java class for supplementalNote complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="supplementalNote">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="noteType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="noteSubtype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="noteValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "supplementalNote", propOrder = {
    "noteType",
    "noteSubtype",
    "noteValue"
})
public class SupplementalNote
    extends MspExtensible
{

    @XmlElement(required = true)
    protected String noteType;
    protected String noteSubtype;
    @XmlElement(required = true)
    protected String noteValue;

    /**
     * Gets the value of the noteType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoteType() {
        return noteType;
    }

    /**
     * Sets the value of the noteType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoteType(String value) {
        this.noteType = value;
    }

    /**
     * Gets the value of the noteSubtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoteSubtype() {
        return noteSubtype;
    }

    /**
     * Sets the value of the noteSubtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoteSubtype(String value) {
        this.noteSubtype = value;
    }

    /**
     * Gets the value of the noteValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoteValue() {
        return noteValue;
    }

    /**
     * Sets the value of the noteValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoteValue(String value) {
        this.noteValue = value;
    }

}
