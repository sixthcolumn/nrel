
package org.multispeak.v5_0.commontypes;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MultiSpeakVersion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MultiSpeakVersion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MajorVersion" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="MinorVersion" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="Build" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="Branch" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="BuildString" type="{http://www.multispeak.org/V5.0/commonTypes}BuildDescriptor"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultiSpeakVersion", propOrder = {
    "majorVersion",
    "minorVersion",
    "build",
    "branch",
    "buildString"
})
public class MultiSpeakVersion {

    @XmlElement(name = "MajorVersion", required = true)
    protected BigInteger majorVersion;
    @XmlElement(name = "MinorVersion", required = true)
    protected BigInteger minorVersion;
    @XmlElement(name = "Build", required = true)
    protected BigInteger build;
    @XmlElement(name = "Branch")
    protected BigInteger branch;
    @XmlElement(name = "BuildString", required = true)
    protected BuildDescriptor buildString;

    /**
     * Gets the value of the majorVersion property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMajorVersion() {
        return majorVersion;
    }

    /**
     * Sets the value of the majorVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMajorVersion(BigInteger value) {
        this.majorVersion = value;
    }

    /**
     * Gets the value of the minorVersion property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinorVersion() {
        return minorVersion;
    }

    /**
     * Sets the value of the minorVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinorVersion(BigInteger value) {
        this.minorVersion = value;
    }

    /**
     * Gets the value of the build property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBuild() {
        return build;
    }

    /**
     * Sets the value of the build property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBuild(BigInteger value) {
        this.build = value;
    }

    /**
     * Gets the value of the branch property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBranch() {
        return branch;
    }

    /**
     * Sets the value of the branch property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBranch(BigInteger value) {
        this.branch = value;
    }

    /**
     * Gets the value of the buildString property.
     * 
     * @return
     *     possible object is
     *     {@link BuildDescriptor }
     *     
     */
    public BuildDescriptor getBuildString() {
        return buildString;
    }

    /**
     * Sets the value of the buildString property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuildDescriptor }
     *     
     */
    public void setBuildString(BuildDescriptor value) {
        this.buildString = value;
    }

}
