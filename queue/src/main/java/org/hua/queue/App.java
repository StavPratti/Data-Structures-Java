/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.hua.queue;

/**
 *Demo app
 * @author Rafail Ntymenos
 */
public class App {
    
    public static void main(String args[]){
        
        Queue<Integer> q = new LinkedQueue<>();
        
        for(int i = 0;i < 100; i++){
            System.out.println("Adding element "+ i + "to queue");
            q.push(i);
        }
        
        while(!q.isEmpty()){
            System.out.println("Next element served from queue: " + q.pop());
        }
    }
}
