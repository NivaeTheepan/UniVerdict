package lab3.Resource.helper;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author student
 */
@XmlRootElement(name = "resource")
@XmlAccessorType(XmlAccessType.FIELD)
public class ResourceHelper {
    
    private String resourceName; 
    private String resourceLink;

    public ResourceHelper(){
        
    }
    public ResourceHelper(String resourceName, String resourceLink ) {
        this.resourceName = resourceName;
        this.resourceLink = resourceLink;
    }

    public String getResourceName() {
        return resourceName;
    }

    public String getResourceLink() {
        return resourceLink;
    }

    /*@Override
    public int hashCode() {
        return (Objects.hash(isbn));
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final ResourceHelper other = (ResourceHelper) obj;
        if (resourceName.equals(other.resourceName))
            return true;
        else return (false);
        
    }*/
    
}