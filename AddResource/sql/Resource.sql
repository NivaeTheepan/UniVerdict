
/**
 * Author:  student
 * Created: Feb 19, 2024
 */

-- CREATE DATABASE UniVerdict_Resources

CREATE TABLE Resources 
(
    resource_id int auto_increment,
    resourceName varchar(100) not null,
    resourceLink varchar(100) not null,
    primary key (resource_id)
);

-- DROP TABLE Resources;
