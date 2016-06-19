
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.NounUnspecifiedRef;


/**
 * Identifier for a design.  The use of an objectID with GUID is preferable whenever machine-to-machine communication is involved.  It is suggested that human-readable identifiers are only used in circumstances where human input is necessary. 
 * 
 * <p>Java class for designReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="designReference">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}nounUnspecifiedRef">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "designReference")
public class DesignReference
    extends NounUnspecifiedRef
{


}
