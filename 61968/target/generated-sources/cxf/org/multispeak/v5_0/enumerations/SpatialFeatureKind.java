
package org.multispeak.v5_0.enumerations;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for spatialFeatureKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="spatialFeatureKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="ACLineSegment"/>
 *     &lt;enumeration value="anchor"/>
 *     &lt;enumeration value="breaker"/>
 *     &lt;enumeration value="capacitor"/>
 *     &lt;enumeration value="capacitorBank"/>
 *     &lt;enumeration value="capacitorBankSwitch"/>
 *     &lt;enumeration value="CDDevice"/>
 *     &lt;enumeration value="conduit"/>
 *     &lt;enumeration value="cut"/>
 *     &lt;enumeration value="elbow"/>
 *     &lt;enumeration value="electricMeter"/>
 *     &lt;enumeration value="fuse"/>
 *     &lt;enumeration value="gasMeter"/>
 *     &lt;enumeration value="guy"/>
 *     &lt;enumeration value="inductionMachine"/>
 *     &lt;enumeration value="jumper"/>
 *     &lt;enumeration value="loadManagementDevice"/>
 *     &lt;enumeration value="measurementDevice"/>
 *     &lt;enumeration value="meterBase"/>
 *     &lt;enumeration value="module"/>
 *     &lt;enumeration value="otherSpatialFeature"/>
 *     &lt;enumeration value="outageDetectionDevice"/>
 *     &lt;enumeration value="overcurrentDeviceBank"/>
 *     &lt;enumeration value="parcel"/>
 *     &lt;enumeration value="pole"/>
 *     &lt;enumeration value="powerMonitor"/>
 *     &lt;enumeration value="powerSystemDevice"/>
 *     &lt;enumeration value="premises"/>
 *     &lt;enumeration value="premisesDisplay"/>
 *     &lt;enumeration value="primaryCabinet"/>
 *     &lt;enumeration value="propaneMeter"/>
 *     &lt;enumeration value="recloser"/>
 *     &lt;enumeration value="regulator"/>
 *     &lt;enumeration value="regulatorBank"/>
 *     &lt;enumeration value="riser"/>
 *     &lt;enumeration value="secondaryJunctionBox"/>
 *     &lt;enumeration value="sectionalizer"/>
 *     &lt;enumeration value="securityLight"/>
 *     &lt;enumeration value="serviceLocation"/>
 *     &lt;enumeration value="streetLight"/>
 *     &lt;enumeration value="substation"/>
 *     &lt;enumeration value="surgeArrestor"/>
 *     &lt;enumeration value="switch"/>
 *     &lt;enumeration value="switchingDeviceBank"/>
 *     &lt;enumeration value="synchronousMachine"/>
 *     &lt;enumeration value="trafficLight"/>
 *     &lt;enumeration value="transformer"/>
 *     &lt;enumeration value="transformerBank"/>
 *     &lt;enumeration value="waterMeter"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "spatialFeatureKind")
@XmlEnum
public enum SpatialFeatureKind {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("ACLineSegment")
    AC_LINE_SEGMENT("ACLineSegment"),
    @XmlEnumValue("anchor")
    ANCHOR("anchor"),
    @XmlEnumValue("breaker")
    BREAKER("breaker"),
    @XmlEnumValue("capacitor")
    CAPACITOR("capacitor"),
    @XmlEnumValue("capacitorBank")
    CAPACITOR_BANK("capacitorBank"),
    @XmlEnumValue("capacitorBankSwitch")
    CAPACITOR_BANK_SWITCH("capacitorBankSwitch"),
    @XmlEnumValue("CDDevice")
    CD_DEVICE("CDDevice"),
    @XmlEnumValue("conduit")
    CONDUIT("conduit"),
    @XmlEnumValue("cut")
    CUT("cut"),
    @XmlEnumValue("elbow")
    ELBOW("elbow"),
    @XmlEnumValue("electricMeter")
    ELECTRIC_METER("electricMeter"),
    @XmlEnumValue("fuse")
    FUSE("fuse"),
    @XmlEnumValue("gasMeter")
    GAS_METER("gasMeter"),
    @XmlEnumValue("guy")
    GUY("guy"),
    @XmlEnumValue("inductionMachine")
    INDUCTION_MACHINE("inductionMachine"),
    @XmlEnumValue("jumper")
    JUMPER("jumper"),
    @XmlEnumValue("loadManagementDevice")
    LOAD_MANAGEMENT_DEVICE("loadManagementDevice"),
    @XmlEnumValue("measurementDevice")
    MEASUREMENT_DEVICE("measurementDevice"),
    @XmlEnumValue("meterBase")
    METER_BASE("meterBase"),
    @XmlEnumValue("module")
    MODULE("module"),

    /**
     * These are what was called "backgroundGraphics" in Versions 3.0 and 4.1.
     * 
     */
    @XmlEnumValue("otherSpatialFeature")
    OTHER_SPATIAL_FEATURE("otherSpatialFeature"),
    @XmlEnumValue("outageDetectionDevice")
    OUTAGE_DETECTION_DEVICE("outageDetectionDevice"),
    @XmlEnumValue("overcurrentDeviceBank")
    OVERCURRENT_DEVICE_BANK("overcurrentDeviceBank"),
    @XmlEnumValue("parcel")
    PARCEL("parcel"),
    @XmlEnumValue("pole")
    POLE("pole"),
    @XmlEnumValue("powerMonitor")
    POWER_MONITOR("powerMonitor"),
    @XmlEnumValue("powerSystemDevice")
    POWER_SYSTEM_DEVICE("powerSystemDevice"),
    @XmlEnumValue("premises")
    PREMISES("premises"),
    @XmlEnumValue("premisesDisplay")
    PREMISES_DISPLAY("premisesDisplay"),
    @XmlEnumValue("primaryCabinet")
    PRIMARY_CABINET("primaryCabinet"),
    @XmlEnumValue("propaneMeter")
    PROPANE_METER("propaneMeter"),
    @XmlEnumValue("recloser")
    RECLOSER("recloser"),
    @XmlEnumValue("regulator")
    REGULATOR("regulator"),
    @XmlEnumValue("regulatorBank")
    REGULATOR_BANK("regulatorBank"),
    @XmlEnumValue("riser")
    RISER("riser"),
    @XmlEnumValue("secondaryJunctionBox")
    SECONDARY_JUNCTION_BOX("secondaryJunctionBox"),
    @XmlEnumValue("sectionalizer")
    SECTIONALIZER("sectionalizer"),
    @XmlEnumValue("securityLight")
    SECURITY_LIGHT("securityLight"),
    @XmlEnumValue("serviceLocation")
    SERVICE_LOCATION("serviceLocation"),
    @XmlEnumValue("streetLight")
    STREET_LIGHT("streetLight"),
    @XmlEnumValue("substation")
    SUBSTATION("substation"),
    @XmlEnumValue("surgeArrestor")
    SURGE_ARRESTOR("surgeArrestor"),
    @XmlEnumValue("switch")
    SWITCH("switch"),
    @XmlEnumValue("switchingDeviceBank")
    SWITCHING_DEVICE_BANK("switchingDeviceBank"),
    @XmlEnumValue("synchronousMachine")
    SYNCHRONOUS_MACHINE("synchronousMachine"),
    @XmlEnumValue("trafficLight")
    TRAFFIC_LIGHT("trafficLight"),
    @XmlEnumValue("transformer")
    TRANSFORMER("transformer"),
    @XmlEnumValue("transformerBank")
    TRANSFORMER_BANK("transformerBank"),
    @XmlEnumValue("waterMeter")
    WATER_METER("waterMeter"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    SpatialFeatureKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SpatialFeatureKind fromValue(String v) {
        for (SpatialFeatureKind c: SpatialFeatureKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
