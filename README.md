# java
My R&amp;D on java

# Running java-modules
1. Build project using "mvn clean install"
2. build custom jre using "jlink --module-path java-modules-service/target/classes;java-modules-controller/target/classes;"${JAVA_HOME}/jmods" --add-modules jk.demo.service,jk.demo.controller,java.base --output jk_jre"
3. Move to "jk_jre/bin" directory
4. Execute "java -m jk.demo.controller/org.jithintkuriakose.demo.jpms.controller.Test"
