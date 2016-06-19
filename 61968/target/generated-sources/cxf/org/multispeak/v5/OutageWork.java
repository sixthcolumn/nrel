
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * This represents the field work associated with the restoration of this outage. This work may be related to other workItems that were generated in the course of the outage restoration, such as vegetation management or follow-up inspection work. This association is constructed using objectRefs contained in the workItemRelationships element of this outageWork, each of which points to a related work item.
 * 
 * <p>Java class for outageWork complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="outageWork">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspWork">
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "outageWork")
public class OutageWork
    extends MspWork
{


}
