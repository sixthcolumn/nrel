
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * This is an object that is used to carry load profile data.  It was originally derived from the C12.19 data schema.  It is suggested that either the formattedBlock or intervalData objects be used instead for efficiency.  This object is DEPRECATED, its use is discouraged.
 * 
 * <p>Java class for profileObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="profileObject">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspReferable">
 *       &lt;sequence>
 *         &lt;element name="sourceList" type="{http://www.multispeak.org/V5.0}sourceList" minOccurs="0"/>
 *         &lt;element name="loadProfiles" type="{http://www.multispeak.org/V5.0}loadProfiles" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "profileObject", propOrder = {
    "sourceList",
    "loadProfiles"
})
public class ProfileObject
    extends MspReferable
{

    protected SourceList sourceList;
    protected LoadProfiles loadProfiles;

    /**
     * Gets the value of the sourceList property.
     * 
     * @return
     *     possible object is
     *     {@link SourceList }
     *     
     */
    public SourceList getSourceList() {
        return sourceList;
    }

    /**
     * Sets the value of the sourceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceList }
     *     
     */
    public void setSourceList(SourceList value) {
        this.sourceList = value;
    }

    /**
     * Gets the value of the loadProfiles property.
     * 
     * @return
     *     possible object is
     *     {@link LoadProfiles }
     *     
     */
    public LoadProfiles getLoadProfiles() {
        return loadProfiles;
    }

    /**
     * Sets the value of the loadProfiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadProfiles }
     *     
     */
    public void setLoadProfiles(LoadProfiles value) {
        this.loadProfiles = value;
    }

}
