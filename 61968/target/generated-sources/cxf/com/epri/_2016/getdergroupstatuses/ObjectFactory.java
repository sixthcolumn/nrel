
package com.epri._2016.getdergroupstatuses;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.epri._2016.getdergroupstatuses package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetDERGroupStatuses_QNAME = new QName("http://www.epri.com/2016/GetDERGroupStatuses#", "GetDERGroupStatuses");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.epri._2016.getdergroupstatuses
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ApparentPower }
     * 
     */
    public ApparentPower createApparentPower() {
        return new ApparentPower();
    }

    /**
     * Create an instance of {@link NameType }
     * 
     */
    public NameType createNameType() {
        return new NameType();
    }

    /**
     * Create an instance of {@link ActivePower }
     * 
     */
    public ActivePower createActivePower() {
        return new ActivePower();
    }

    /**
     * Create an instance of {@link ExtValue }
     * 
     */
    public ExtValue createExtValue() {
        return new ExtValue();
    }

    /**
     * Create an instance of {@link DERGroupStatus }
     * 
     */
    public DERGroupStatus createDERGroupStatus() {
        return new DERGroupStatus();
    }

    /**
     * Create an instance of {@link ExtensionsItem }
     * 
     */
    public ExtensionsItem createExtensionsItem() {
        return new ExtensionsItem();
    }

    /**
     * Create an instance of {@link ExtensionsList }
     * 
     */
    public ExtensionsList createExtensionsList() {
        return new ExtensionsList();
    }

    /**
     * Create an instance of {@link Status }
     * 
     */
    public Status createStatus() {
        return new Status();
    }

    /**
     * Create an instance of {@link EndDeviceGroup }
     * 
     */
    public EndDeviceGroup createEndDeviceGroup() {
        return new EndDeviceGroup();
    }

    /**
     * Create an instance of {@link NameTypeAuthority }
     * 
     */
    public NameTypeAuthority createNameTypeAuthority() {
        return new NameTypeAuthority();
    }

    /**
     * Create an instance of {@link Name }
     * 
     */
    public Name createName() {
        return new Name();
    }

    /**
     * Create an instance of {@link DERGroupStatuses }
     * 
     */
    public DERGroupStatuses createDERGroupStatuses() {
        return new DERGroupStatuses();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DERGroupStatuses }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epri.com/2016/GetDERGroupStatuses#", name = "GetDERGroupStatuses")
    public JAXBElement<DERGroupStatuses> createGetDERGroupStatuses(DERGroupStatuses value) {
        return new JAXBElement<DERGroupStatuses>(_GetDERGroupStatuses_QNAME, DERGroupStatuses.class, null, value);
    }

}
