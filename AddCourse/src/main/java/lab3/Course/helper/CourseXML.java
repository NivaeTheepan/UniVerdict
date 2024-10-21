package lab3.Course.helper;

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
import lab3.Course.helper.CourseHelper;

/**
 *
 * @author student
 */
@XmlRootElement(name = "course")
@XmlAccessorType(XmlAccessType.FIELD)
public class CourseXML {

    @XmlElement(name = "course")
    private ArrayList<CourseHelper> Resource;

    public List<CourseHelper> getResource() {
        return Resource;

    }

    public CourseXML() {

    }

    public void setResource(ArrayList<CourseHelper> bs) {
        Resource = bs;

    }

}
