# Flight-Management-System-in-Java

## Overview
Flight Management System(FMS) is a Java-based application designed to manage flight records and employee details related to flight. It provides a user-friendly GUI along with necessary CRUD operations for employee, manager and administrator.

## Technologies Used
1. Java Swing
2. Java AWT
3. [JDBC](https://www.oracle.com/database/technologies/appdev/jdbc-downloads.html)
4. [Intellij IDEA Community Edition](www.jetbrains.com/idea/download/)
5. [MySQL database](https://dev.mysql.com/downloads/installer/)
6. [mysql-connector-j-8.3.0](https://dev.mysql.com/downloads/connector/j/)

## Setup Instruction
1. Clone the Repository.
2. Open the Repository in Intellij.
3. Download MySQL, JDBC and mysql-jdbc-connector, set the JDBC path as an environment variable on your pc.
4. Setup the Intellij IDE :
4.1. Click on hamburger menu icon on the top left > File > Project Structure > Libraries > Click on "+" to add library > Add the path of mysql-jdbc- 
     connector.
4.2. Again click on hamburger menu icon > Go to File > Settings > Plugins > Search for "Database Navigator" Plugin and install it.
4.3. Connect the local MySQL database with Database Navigator Plugin and check if the connection is successful.
5. Add all the tables in the MySQL database which are present in database.txt file.
6. Go to JdbcConnector.java file and set your jdbc url, username and password of MySQL.
7. Go to FlightManagementSystem.java file and click on the Run button or press ctrl+F5.


