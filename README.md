# java
My R&amp;D on java.
Build modular, highly scalable projects using java

# java-modules
Java Platform Module System(JPMS) is powerful adn much awaited tool for building modular, loosely coupled software systems. Together with jlink, jpms becomes more powerful and let developer to have the flexibility controlling in runtime behaviour of the jvm and the dependencies. This project briefly demo how we can build a multi module maven project with jpms and build a custom jre to run the code using jlink tool.

1. Build project using "mvn clean install"
2. build custom jre using "jlink --module-path java-modules-service/target/classes;java-modules-controller/target/classes;"${JAVA_HOME}/jmods" --add-modules jk.demo.service,jk.demo.controller,java.base --output jk_jre"
3. Move to "jk_jre/bin" directory
4. Execute "java -m jk.demo.controller/org.jithintkuriakose.demo.jpms.controller.Test"
