//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-661 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.27 at 06:08:42 PM PDT 
//


package ebay.apis.eblbasecomponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MismatchTypeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MismatchTypeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="OverPayment"/>
 *     &lt;enumeration value="UnderPayment"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MismatchTypeCodeType")
@XmlEnum
public enum MismatchTypeCodeType {


    /**
     * 
     * 						This value indicates that the buyer paid more than the required amount.
     * 					
     * 
     */
    @XmlEnumValue("OverPayment")
    OVER_PAYMENT("OverPayment"),

    /**
     * 
     * 						This value indicates that the buyer paid less than the required amount.
     * 					
     * 
     */
    @XmlEnumValue("UnderPayment")
    UNDER_PAYMENT("UnderPayment"),

    /**
     * 
     * 						(out) Reserved for internal or future use
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    MismatchTypeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MismatchTypeCodeType fromValue(String v) {
        for (MismatchTypeCodeType c: MismatchTypeCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
