
package org.multispeak.v5_0.commontypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Reference to an instance of an object. When used to describe an engineering line section, this object must contain a section name and may also contain a noun/objectID pair that will uniquely identify the MultiSpeak noun (element) and instance of that noun that is contained in the named section.  In Versions 3.0 and 4.1 this was called eaLoc.
 * 
 * <p>Java class for networkModelRef complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="networkModelRef">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.multispeak.org/V5.0/commonTypes>objectRef">
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "networkModelRef")
public class NetworkModelRef
    extends ObjectRef
{


}
