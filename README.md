# java
My R&amp;D on java.
Build modular, highly scalable projects using java

# java-modules
Java Platform Module System(JPMS) is powerful adn much awaited tool to build modular loosely coupled systems. Together with jlink, jpms become more powerful and provide developer to have the flexibility in runtime dependencies. This project brefly demos how we can build a multi module maven project with jpms and build a custom jre to run the code using jlink

1. Build project using "mvn clean install"
2. build custom jre using "jlink --module-path java-modules-service/target/classes;java-modules-controller/target/classes;"${JAVA_HOME}/jmods" --add-modules jk.demo.service,jk.demo.controller,java.base --output jk_jre"
3. Move to "jk_jre/bin" directory
4. Execute "java -m jk.demo.controller/org.jithintkuriakose.demo.jpms.controller.Test"
