# About this project

This project is a simple demo web application using Java annotations,
mimicikng an extremely basic online karaoke service. It runs on Java 8 (and
possibly also 7) and is run as a standalone program. All dependencies are met
by the standard Java installation.

The annotations used are defined in the
[JAX-WS API](https://en.wikipedia.org/wiki/Java_API_for_XML_Web_Services).

# How do I build this project?

You can easily build the code directly from within your IDE of choice (I'm
personally rather fond of [Eclipse](http://www.eclipse.org)), using its build
features (in Eclipse, right click the project and select *Run As* ->
*Java application*). This project uses Maven to handle its life cycle. Before
building, make sure to update your project dependencies (in Eclipse, hit
alt+F5). If you prefer doing stuff more old school, you can use the command
line to build the project as well. To do so, simply navigate to the source code
directory at src/main/java and type

    mvn clean compile

in your terminal. Your generated class files can be found in the target/classes
folder.

If you'd prefer to build a self-contained jar file, type

	mvn clean compile build

# How do I run this project?

Running Eclipse, just follow the steps described above. The application will
be run once the project has been built.

If you prefer the command line, just navigate to the target/classes folder and
type

    java se.idioti.example.jaxws.soap.server.KaraokePublisher

or, if you'd rather run the self-containing jar file, go to target and type 

	java -jar jaxws-soap-example-server-0.0.1-SNAPSHOT-jar-with-dependencies.jar

in your terminal. Kill the program by hitting ```ctrl+c```.

# How do I configure my application?

As this is a very simple example, all configuration is done directly in code.
The hostname, path and network port are all set in KaraokePublisher.java.

# Corresponding client

A corresponding client, which is if possible even simpler, has been developed
in conjunction with the web service. It can be found at
[koddas/jaxws-soap-example-client](http://github.com/koddas/jaxws-soap-example-client).
If you'd like to build and run this client, don't forget to add this artefact
to your Maven repository by running

	mvn install

after building it, or by running

	mvn clean compile install