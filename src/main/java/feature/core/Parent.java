//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.03.03 at 08:14:01 PM COT 
//


package feature.core;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for parent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="parent">
 *   &lt;complexContent>
 *     &lt;extension base="{}namedElement">
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *         &lt;choice>
 *           &lt;element ref="{}and"/>
 *           &lt;element ref="{}alt"/>
 *           &lt;element ref="{}or"/>
 *           &lt;element ref="{}feature"/>
 *           &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "parent", propOrder = {
    "andOrAltOrOr"
})
@XmlSeeAlso({
    Alt.class,
    Or.class,
    And.class
})
public class Parent extends NamedElement
{

    @XmlElements({
        @XmlElement(name = "and", type = And.class),
        @XmlElement(name = "alt", type = Alt.class),
        @XmlElement(name = "or", type = Or.class),
        @XmlElement(name = "feature", type = Feature.class),
        @XmlElement(name = "description", type = String.class)
    })
    protected List<Object> andOrAltOrOr;

    /**
     * Gets the value of the andOrAltOrOr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the andOrAltOrOr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAndOrAltOrOr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link And }
     * {@link Alt }
     * {@link Or }
     * {@link Feature }
     * {@link String }
     * 
     * 
     */
    public List<Object> getAndOrAltOrOr() {
        if (andOrAltOrOr == null) {
            andOrAltOrOr = new ArrayList<Object>();
        }
        return this.andOrAltOrOr;
    }

}
