/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bingo;

import java.util.ArrayList;

/**
 *
 * @author novoa
 */

public class Karte {
    
    int[][] Spielkarte;
   
    public Karte(){
           
         Spielkarte = new int[5][5];
        
                
    } 
    
    public void ausgeben(){
        System.out.print( "-------Karte------------------- ");
        System.out.println();
         for(int i = 0 ; i < Spielkarte.length;i++ ){
             for(int j = 0 ; j < Spielkarte[i].length ; j++){
                 System.out.print( " " + Spielkarte[j][i]);
             }
                  System.out.println();
         
         }
    
    }
    
    public void eintragen(Kugel kugel,int Zeile){
    
        switch(kugel.Buchstabe){
            case 'B':
                Spielkarte[0][Zeile] = kugel.Nummer;
                break;
             case 'I':
                Spielkarte[1][Zeile] = kugel.Nummer;
                break;
              case 'N':
                Spielkarte[2][Zeile] = kugel.Nummer;
                break;
              case 'G':
                Spielkarte[3][Zeile] = kugel.Nummer;
                break;
              case 'O':
                Spielkarte[4][Zeile] = kugel.Nummer;
                break;                    
        }
                
    }
    
    public static boolean isBingo(ArrayList<int[][]> Karten,int[] Nummern){
        int[][] Karte; 
        
        for(int i=0;i<Karten.size();i++){
            Karte = Karten.get(i);
           // finden? 
          // markieren?  
        }
        
        
        
        
        
        return false;
    }
    
    
    
}
