/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interviewkickstart;

/**
 *
 * @author nandini
 */
public class TowerofHanoi {
    public static void towerOfhanoi(int nOfDisks , char firstRod, char secondRod, char tempRod) {
        if(nOfDisks == 0){
            return;
        }
        if(nOfDisks == 1){
            System.out.println("move disk " + firstRod + " to " + secondRod);
        } 
        towerOfhanoi(nOfDisks-1, firstRod, tempRod, secondRod);
        System.out.println("move disk " + nOfDisks + " first disk " + firstRod + " to " + tempRod);
        towerOfhanoi(nOfDisks-1, tempRod, secondRod, firstRod);
        System.out.println("move disk " + nOfDisks + "temprod" +  tempRod + " to " + secondRod);
        
    }
    public static void main(String[] args){
        int disks = 3;
        towerOfhanoi(3, 'a', 'b','c');
    }
    
}
