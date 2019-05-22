package org.jithintkuriakose.demo.jpms.controller;

import org.jithintkuriakose.demo.jpms.service.global.GlobalUtils;


/**
 * <p>
 *     Main class for the program
 * </p>
 */
public class Test {
    public static void main (String[] args){
        GlobalUtils globalUtils = new GlobalUtils();
        if (args.length > 0) {
            System.out.println(globalUtils.sayHello(args[0]));
        }else{
            System.out.println(globalUtils.sayHello("there..."));
        }
    }
}
