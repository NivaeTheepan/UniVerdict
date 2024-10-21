package lab3.Resource.helper;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import lab3.Resource.helper.ResourceHelper;

/**
 *
 * @author student
 */
@XmlRootElement(name = "resource")
@XmlAccessorType(XmlAccessType.FIELD)
public class ResourceXML {

    @XmlElement(name = "resource")
    private ArrayList<ResourceHelper> Resource;

    public List<ResourceHelper> getResource() {
        return Resource;

    }

    public ResourceXML() {

    }

    public void setResource(ArrayList<ResourceHelper> bs) {
        Resource = bs;

    }

}
