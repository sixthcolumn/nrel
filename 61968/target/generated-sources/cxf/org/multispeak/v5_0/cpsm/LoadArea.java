
package org.multispeak.v5_0.cpsm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Group of loads (i.e., energy consumers).  This is the highest level of consolidation of load modeling in CPSM.  SubLoadAreas are grouped intoLoadAreas and one or more LoadGroups are contained in SubLoadArea.
 * 
 * <p>Java class for LoadArea complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoadArea">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/cpsm}PowerSystemResource">
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoadArea")
public class LoadArea
    extends PowerSystemResource
{


}
