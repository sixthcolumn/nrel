
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * This is a skill that a person can have.  Skills are used to determine which persons are qualified to perform what types of work.
 * 
 * <p>Java class for skill complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="skill">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}ability">
 *       &lt;sequence>
 *         &lt;element name="certifiedDate" type="{http://www.multispeak.org/V5.0/primitives}mspDateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "skill", propOrder = {
    "certifiedDate"
})
public class Skill
    extends Ability
{

    protected XMLGregorianCalendar certifiedDate;

    /**
     * Gets the value of the certifiedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCertifiedDate() {
        return certifiedDate;
    }

    /**
     * Sets the value of the certifiedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCertifiedDate(XMLGregorianCalendar value) {
        this.certifiedDate = value;
    }

}
