Partially implemented task "Delivery app" of ElifTech School.

As the first step the creation of a database is recommended. MySQL was used for it. The details about the
name of a database, username and password to access the database you can find in the application.properties
file in the onlinebookstore folder. Your should change them according to your local settings.

After creation of the database open onlinebookstore folder in your IDE. IntelliJ Idea Ultimate Edition with 
Spring Boot 2.1 was used, but you can also use IntelliJ Community Edition or any other IDE of your choice. 
Run 2 sql scripts (queries-1.sql and queries-2.sql) to populate your database with data. In case you have
changed the name of the database, change it in the scripts accordingly (change 'sprinbootapps' in the 
scripts to the database name you are using for this project). After the scripts were run start the 
springboot application.

The front end part of the app was tested with node 16.20.0 (if your version is higher, you probably
need to downgrade it), npm 9.6.2, Angular CLI 15.2.4 in Visual Studio Code 1.78.
 
Before you start it, you should have the back end part of the app already running (see above). Open angular-
bookstore folder in VSC and in its terminal run the command npm start. The compilation process should start
and after the message about successfull compilation appeared in the terminal open your browser and enter 
http://localhost:4200 in navigation bar.  

 