
package com.epri._2013.dergroupdispatches;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.epri._2013.dergroupdispatches package. 
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

    private final static QName _DERGroupDispatches_QNAME = new QName("http://www.epri.com/2013/DERGroupDispatches#", "DERGroupDispatches");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.epri._2013.dergroupdispatches
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DERGroupDispatch }
     * 
     */
    public DERGroupDispatch createDERGroupDispatch() {
        return new DERGroupDispatch();
    }

    /**
     * Create an instance of {@link ExtensionsItem }
     * 
     */
    public ExtensionsItem createExtensionsItem() {
        return new ExtensionsItem();
    }

    /**
     * Create an instance of {@link Name }
     * 
     */
    public Name createName() {
        return new Name();
    }

    /**
     * Create an instance of {@link DERGroup }
     * 
     */
    public DERGroup createDERGroup() {
        return new DERGroup();
    }

    /**
     * Create an instance of {@link RequestedCapability }
     * 
     */
    public RequestedCapability createRequestedCapability() {
        return new RequestedCapability();
    }

    /**
     * Create an instance of {@link DERGroupDispatches }
     * 
     */
    public DERGroupDispatches createDERGroupDispatches() {
        return new DERGroupDispatches();
    }

    /**
     * Create an instance of {@link ExtensionsList }
     * 
     */
    public ExtensionsList createExtensionsList() {
        return new ExtensionsList();
    }

    /**
     * Create an instance of {@link ExtValue }
     * 
     */
    public ExtValue createExtValue() {
        return new ExtValue();
    }

    /**
     * Create an instance of {@link NameType }
     * 
     */
    public NameType createNameType() {
        return new NameType();
    }

    /**
     * Create an instance of {@link OtherCapability }
     * 
     */
    public OtherCapability createOtherCapability() {
        return new OtherCapability();
    }

    /**
     * Create an instance of {@link NameTypeAuthority }
     * 
     */
    public NameTypeAuthority createNameTypeAuthority() {
        return new NameTypeAuthority();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DERGroupDispatches }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.epri.com/2013/DERGroupDispatches#", name = "DERGroupDispatches")
    public JAXBElement<DERGroupDispatches> createDERGroupDispatches(DERGroupDispatches value) {
        return new JAXBElement<DERGroupDispatches>(_DERGroupDispatches_QNAME, DERGroupDispatches.class, null, value);
    }

}
