
package com.epri._2013.dergroups;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * DERGroup is a convention for a Distributed Energy Resource Management System (DERMS) to group DER devices to ease communication with other utility systems. Groups could be created with any organizing principle, by device type, by location, by nameplate characteristics, etc.
 * 
 * <p>Java class for EndDeviceGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EndDeviceGroup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mRID" type="{http://www.epri.com/2013/DERGroups#}mRID" minOccurs="0"/>
 *         &lt;element name="Names" type="{http://www.epri.com/2013/DERGroups#}Name" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CapabilityList" type="{http://www.epri.com/2013/DERGroups#}CapabilityList" minOccurs="0"/>
 *         &lt;element name="Version">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="major" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="minor" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="revision" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="versionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Status" type="{http://www.epri.com/2013/DERGroups#}Status" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EndDevice" type="{http://www.epri.com/2013/DERGroups#}DERMember" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="extensionsList" type="{http://www.epri.com/2013/DERGroups#}extensionsList" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="description" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="comment" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EndDeviceGroup", propOrder = {
    "mrid",
    "names",
    "capabilityList",
    "version",
    "status",
    "name",
    "endDevice",
    "extensionsList"
})
public class EndDeviceGroup {

    @XmlElement(name = "mRID")
    protected String mrid;
    @XmlElement(name = "Names")
    protected List<Name> names;
    @XmlElement(name = "CapabilityList")
    protected CapabilityList capabilityList;
    @XmlElement(name = "Version", required = true)
    protected EndDeviceGroup.Version version;
    @XmlElement(name = "Status")
    protected Status status;
    protected String name;
    @XmlElement(name = "EndDevice")
    protected List<DERMember> endDevice;
    protected ExtensionsList extensionsList;
    @XmlAttribute(name = "description")
    @XmlSchemaType(name = "anySimpleType")
    protected String description;
    @XmlAttribute(name = "comment")
    @XmlSchemaType(name = "anySimpleType")
    protected String comment;

    /**
     * Gets the value of the mrid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMRID() {
        return mrid;
    }

    /**
     * Sets the value of the mrid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMRID(String value) {
        this.mrid = value;
    }

    /**
     * Gets the value of the names property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the names property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNames().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Name }
     * 
     * 
     */
    public List<Name> getNames() {
        if (names == null) {
            names = new ArrayList<Name>();
        }
        return this.names;
    }

    /**
     * Gets the value of the capabilityList property.
     * 
     * @return
     *     possible object is
     *     {@link CapabilityList }
     *     
     */
    public CapabilityList getCapabilityList() {
        return capabilityList;
    }

    /**
     * Sets the value of the capabilityList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CapabilityList }
     *     
     */
    public void setCapabilityList(CapabilityList value) {
        this.capabilityList = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link EndDeviceGroup.Version }
     *     
     */
    public EndDeviceGroup.Version getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link EndDeviceGroup.Version }
     *     
     */
    public void setVersion(EndDeviceGroup.Version value) {
        this.version = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Status }
     *     
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Status }
     *     
     */
    public void setStatus(Status value) {
        this.status = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the endDevice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the endDevice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEndDevice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DERMember }
     * 
     * 
     */
    public List<DERMember> getEndDevice() {
        if (endDevice == null) {
            endDevice = new ArrayList<DERMember>();
        }
        return this.endDevice;
    }

    /**
     * Gets the value of the extensionsList property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionsList }
     *     
     */
    public ExtensionsList getExtensionsList() {
        return extensionsList;
    }

    /**
     * Sets the value of the extensionsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionsList }
     *     
     */
    public void setExtensionsList(ExtensionsList value) {
        this.extensionsList = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="major" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="minor" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="revision" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="versionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "major",
        "minor",
        "revision",
        "versionDate"
    })
    public static class Version {

        @XmlElement(required = true)
        protected BigInteger major;
        @XmlElement(required = true)
        protected BigInteger minor;
        @XmlElement(required = true)
        protected BigInteger revision;
        @XmlElement(required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar versionDate;

        /**
         * Gets the value of the major property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMajor() {
            return major;
        }

        /**
         * Sets the value of the major property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMajor(BigInteger value) {
            this.major = value;
        }

        /**
         * Gets the value of the minor property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMinor() {
            return minor;
        }

        /**
         * Sets the value of the minor property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMinor(BigInteger value) {
            this.minor = value;
        }

        /**
         * Gets the value of the revision property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getRevision() {
            return revision;
        }

        /**
         * Sets the value of the revision property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setRevision(BigInteger value) {
            this.revision = value;
        }

        /**
         * Gets the value of the versionDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getVersionDate() {
            return versionDate;
        }

        /**
         * Sets the value of the versionDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setVersionDate(XMLGregorianCalendar value) {
            this.versionDate = value;
        }

    }

}
