//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-792 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.11.09 at 05:33:49 PM MEZ 
//


package org.deegree.feature.persistence.postgis.jaxbconfig;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Definition of a simple property of a feature type.
 * 
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.deegree.org/feature/featuretype}AbstractPropertyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.deegree.org/feature/featuretype}SimplePropertyMapping"/>
 *       &lt;/sequence>
 *       &lt;attribute name="type" type="{http://www.deegree.org/feature/featuretype}PrimitiveType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "simplePropertyMapping"
})
public class SimplePropertyDecl
    extends AbstractPropertyDecl
{

    @XmlElement(name = "SimplePropertyMapping", required = true)
    protected SimplePropertyMappingType simplePropertyMapping;
    @XmlAttribute
    protected PrimitiveType type;

    /**
     * Gets the value of the simplePropertyMapping property.
     * 
     * @return
     *     possible object is
     *     {@link SimplePropertyMappingType }
     *     
     */
    public SimplePropertyMappingType getSimplePropertyMapping() {
        return simplePropertyMapping;
    }

    /**
     * Sets the value of the simplePropertyMapping property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimplePropertyMappingType }
     *     
     */
    public void setSimplePropertyMapping(SimplePropertyMappingType value) {
        this.simplePropertyMapping = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link PrimitiveType }
     *     
     */
    public PrimitiveType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrimitiveType }
     *     
     */
    public void setType(PrimitiveType value) {
        this.type = value;
    }

}
