/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  student
 * Created: Feb 19, 2024
 */

-- Modify this table so it works currently it gives this error "[Exception, Error code 1,005, SQLState HY000] Can't create table `UniVerdict`.`Courses` (errno: 150 "Foreign key constraint is incorrectly formed")"
CREATE TABLE Courses
(

    courseName VARCHAR(50), 
    adminUser VARCHAR(50), 
    courseDescription VARCHAR(200), 
    courseRating INT(10),
    FOREIGN KEY (adminUser) REFERENCES AdminCred(adminUser)
);