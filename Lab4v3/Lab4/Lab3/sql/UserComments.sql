/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  student
 * Created: Feb 19, 2024
 */

CREATE TABLE UserComments
(

     likeComment INT (10), 
     userName VARCHAR(50),
     dislikeComment INT(10), 
     userComment VARCHAR(200), 
     FOREIGN KEY (userName) REFERENCES UserCred(userName)
);
