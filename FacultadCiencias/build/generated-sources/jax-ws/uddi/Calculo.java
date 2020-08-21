
package uddi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para calculo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="calculo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dia1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="dia2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="dia3" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="dia4" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="dia5" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="dia6" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "calculo", propOrder = {
    "dia1",
    "dia2",
    "dia3",
    "dia4",
    "dia5",
    "dia6"
})
public class Calculo {

    protected int dia1;
    protected int dia2;
    protected int dia3;
    protected int dia4;
    protected int dia5;
    protected int dia6;

    /**
     * Obtiene el valor de la propiedad dia1.
     * 
     */
    public int getDia1() {
        return dia1;
    }

    /**
     * Define el valor de la propiedad dia1.
     * 
     */
    public void setDia1(int value) {
        this.dia1 = value;
    }

    /**
     * Obtiene el valor de la propiedad dia2.
     * 
     */
    public int getDia2() {
        return dia2;
    }

    /**
     * Define el valor de la propiedad dia2.
     * 
     */
    public void setDia2(int value) {
        this.dia2 = value;
    }

    /**
     * Obtiene el valor de la propiedad dia3.
     * 
     */
    public int getDia3() {
        return dia3;
    }

    /**
     * Define el valor de la propiedad dia3.
     * 
     */
    public void setDia3(int value) {
        this.dia3 = value;
    }

    /**
     * Obtiene el valor de la propiedad dia4.
     * 
     */
    public int getDia4() {
        return dia4;
    }

    /**
     * Define el valor de la propiedad dia4.
     * 
     */
    public void setDia4(int value) {
        this.dia4 = value;
    }

    /**
     * Obtiene el valor de la propiedad dia5.
     * 
     */
    public int getDia5() {
        return dia5;
    }

    /**
     * Define el valor de la propiedad dia5.
     * 
     */
    public void setDia5(int value) {
        this.dia5 = value;
    }

    /**
     * Obtiene el valor de la propiedad dia6.
     * 
     */
    public int getDia6() {
        return dia6;
    }

    /**
     * Define el valor de la propiedad dia6.
     * 
     */
    public void setDia6(int value) {
        this.dia6 = value;
    }

}
