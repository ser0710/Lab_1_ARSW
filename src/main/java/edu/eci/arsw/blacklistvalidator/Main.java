/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.blacklistvalidator;

import java.util.List;

import java.lang.Runtime;

/**
 *
 * @author hcadavid
 */
public class Main {

    private static Runtime runtime = Runtime.getRuntime();
    
    public static void main(String a[]){
        HostBlackListsValidator hblv=new HostBlackListsValidator();
        int procesadores = runtime.availableProcessors();
//        System.out.println(procesadores);
        List<Integer> blackListOcurrences=hblv.checkHost("202.24.34.55",24);
        System.out.println("The host was found in the following blacklists:"+blackListOcurrences);
        
    }
    
}

// Hola 
