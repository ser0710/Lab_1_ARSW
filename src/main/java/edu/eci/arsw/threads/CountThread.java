/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.threads;

import java.util.Objects;

/**
 *
 * @author hcadavid
 */
public class CountThread extends Thread {

    private int in;
    private int fi;

    public CountThread(int ini, int fin){

        this.in = ini;
        this.fi = fin;
    }
    public void run(){
        for(int i = in; i < fi; i++){
            System.out.println(i);
            try {
                sleep(2);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public int getIn() {
        return in;
    }

    public int getFi() {
        return fi;
    }
}
