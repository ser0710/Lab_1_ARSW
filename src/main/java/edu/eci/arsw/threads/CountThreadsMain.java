/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.threads;

/**
 *
 * @author hcadavid
 */
public class CountThreadsMain {
    
    public static void main(String a[]){
        CountThread obj = new CountThread(0, 99);
        CountThread obj1 = new CountThread(99, 199);
        CountThread obj2 = new CountThread(199, 299);
        obj.start();
        obj1.start();
        obj2.start();
        
    }
    
}
