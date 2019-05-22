package org.jithintkuriakose.demo.jpms.service.global;

/**
 * <p>
 *     Global utils class exposed to others as module
 * </p>
 * @author jithin.kuriakose
 * @since 1.0
 */
public class GlobalUtils {

    /**
     *
     * @param name
     * @return
     */
    public String sayHello (String name){
        return "Hello " + name;
    }
}
