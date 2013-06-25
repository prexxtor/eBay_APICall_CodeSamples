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
 * <p>Java class for SellerGuaranteeLevelCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SellerGuaranteeLevelCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="NotEligible"/>
 *     &lt;enumeration value="Regular"/>
 *     &lt;enumeration value="Premium"/>
 *     &lt;enumeration value="Ultra"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SellerGuaranteeLevelCodeType")
@XmlEnum
public enum SellerGuaranteeLevelCodeType {


    /**
     * 
     * 						(out) Not eligible for Seller Level Guarantee
     * 					
     * 
     */
    @XmlEnumValue("NotEligible")
    NOT_ELIGIBLE("NotEligible"),

    /**
     * 
     * 						(out) Regular eligibility level
     * 					
     * 
     */
    @XmlEnumValue("Regular")
    REGULAR("Regular"),

    /**
     * 
     * 						(out) Premium eligibility level
     * 					
     * 
     */
    @XmlEnumValue("Premium")
    PREMIUM("Premium"),

    /**
     * 
     * 						(out) Ultra eligibility level
     * 					
     * 
     */
    @XmlEnumValue("Ultra")
    ULTRA("Ultra"),

    /**
     * 
     * 						(out) Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    SellerGuaranteeLevelCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SellerGuaranteeLevelCodeType fromValue(String v) {
        for (SellerGuaranteeLevelCodeType c: SellerGuaranteeLevelCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
