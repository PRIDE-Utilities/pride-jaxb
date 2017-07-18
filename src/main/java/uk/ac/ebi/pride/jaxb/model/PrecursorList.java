
package uk.ac.ebi.pride.jaxb.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for precursorListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="precursorListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="precursor" type="{}precursorType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="count" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "precursorListType", propOrder = {
    "precursor"
})
public class PrecursorList
    implements Serializable, PrideXmlObject
{

    private final static long serialVersionUID = 100L;
    @XmlElement(required = true)
    private List<Precursor> precursor;
    @XmlAttribute(required = true)
    private int count;

    /**
     * Gets the value of the precursor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the precursor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrecursor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Precursor }
     * 
     * 
     */
    public List<Precursor> getPrecursor() {
        if (precursor == null) {
            precursor = new ArrayList<>();
        }
        return this.precursor;
    }

    /**
     * Gets the value of the count property.
     * 
     */
    public int getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     */
    public void setCount(int value) {
        this.count = value;
    }

}
