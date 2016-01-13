/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.xlkidd.networkmanager;

import java.net.URL;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
/**
 *
 * @author xlkidd
 */
public class main {
    public static void main(String[] args){
        String path = System.getProperty("java.class.path");
        PropertyConfigurator.configure("resourse/log4j.properties");
        Logger log=Logger.getLogger(main.class);
        log.debug("abc");
    }
}
