package lab3.Course.helper;
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
@XmlRootElement(name = "course")
@XmlAccessorType(XmlAccessType.FIELD)
public class CourseHelper {
    
    private String courseName; 
    private String courseDescription;
    private String courseRating;

    public CourseHelper(){
        
    }
    public CourseHelper(String courseName, String courseDescription, String courseRating ) {
        this.courseName = courseName;
        this.courseDescription = courseDescription;
        this.courseRating = courseRating;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseDescription() {
        return courseDescription;
    }
    
    public String getCourseRating() {
        return courseRating;
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
        final CourseHelper other = (CourseHelper) obj;
        if (courseName.equals(other.courseName))
            return true;
        else return (false);
        
    }*/
    
}