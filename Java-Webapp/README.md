clone the restful source code into your local copy

Add one new environment variable 'JAVA_HOME' pointing to the jdk (not jre) folder and add the bin subfolder to the path variable like %JAVA_HOME%/bin

Download Apache Maven 3.6 from https://maven.apache.org/download.cgi and unzip the file.
Add one new environment variable 'M2_HOME' pointing to the the directory where the maven file has been unpacked and add the bin subfolder to the path like %M2_HOME%/bin.

Download Apache Tomcat 9 (currently the latest) from https://tomcat.apache.org/download-90.cgi and unzip the file.

Go to the root directory of the project file where there wi'll be a POM file. Open a cmd prompt at that location, run the command 'mvn clean install' and this will compile, build, test and install the source code into a war file that can be run in a web server. Copy the war file from the target folder into the webapps folder of Tomcat. Go to the bin directory of Tomcat and open a cmd promt and run the command 'catalina run'. If the server can deploy the war file successfully without any major error then you can access the web service at a location like <localhost>:<8080>/<war-file-name>/<rest>/<hello> which will print a dummy response 'You have successfully invoked the REST'




