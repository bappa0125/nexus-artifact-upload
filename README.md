# nexus-repository-artifact-upload-sample
This project is a sample which uploads the artifact to the nexus. Cahnge the url of the nexus repository and password in settings.xml [comments are written] and pom.xml according to your nexus url No need to change the server id. put the settings.xml as per below Maven always uses either one or two settings files. The global settings defined in (${M2_HOME}/conf/settings.xml) is always required. The user settings file (defined in ${user.home}/.m2/settings.xml) is optional. Any settings defined in the user settings take precedence over the corresponding global settings.

You can override the location of the global and user settings from the command line, the following example will set the global settings to c:\global\settings.xml and the user settings to c:\user\settings.xml:

mvn install --settings c:\user\settings.xml --global-settings c:\global\settings.xml (as per your operating system location)