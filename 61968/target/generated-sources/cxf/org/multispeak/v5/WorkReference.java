
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.NounSpecifiedRef;


/**
 * This is an identifier for a workOrder, design or station to which the attachments should be associated.  A work order may be referred to using: (i) the workOrderID (objectID of a workOrder), (ii) the combination of work order number and job number, or (iii) an object reference.  A design or station is referred to using an object reference.
 * 
 * <p>Java class for workReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="workReference">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}nounSpecifiedRef">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "workReference")
public class WorkReference
    extends NounSpecifiedRef
{


}
