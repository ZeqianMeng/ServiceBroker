
package uk.ac.ucl.chem.ccs.AHECore.API.Rest.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 3.0.4
 * Tue Apr 14 15:23:54 BST 2015
 * Generated source version: 3.0.4
 */

@XmlRootElement(name = "createServer", namespace = "http://Rest.API.AHECore.ccs.chem.ucl.ac.uk/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createServer", namespace = "http://Rest.API.AHECore.ccs.chem.ucl.ac.uk/")

public class CreateServer {

    @XmlElement(name = "arg0")
    private int arg0;

    public int getArg0() {
        return this.arg0;
    }

    public void setArg0(int newArg0)  {
        this.arg0 = newArg0;
    }

}

