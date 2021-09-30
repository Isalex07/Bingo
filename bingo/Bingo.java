/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bingo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author novoa
 */
public class Bingo {
     
     ArrayList Nummern = new ArrayList();
     
     Karte karte = new Karte();
     ArrayList<int[][]> Speicherkarten = new ArrayList<int[][]>();
     
     
     
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int Spieleranzahl = 0;
        
        Scanner lea = new Scanner(System.in);        
        System.out.println("Geben Sie Spieleranzahl ein:");
        Spieleranzahl  = lea.nextInt();
        
        Bingo Spiel = new Bingo();
        Spiel.BingoSpiel(Spieleranzahl);
        
        
    }
    
    public  void BingoSpiel(int Spieleranzahl){
        
        Ziehungsgeraet ziehungsgeraet;
        for(int i=0;i<Spieleranzahl;i++){
            ziehungsgeraet = new Ziehungsgeraet();
           Speicherkarten.add(karte.Spielkarte);
        }
       Ziehungsgeraet.spielen(Speicherkarten);
        
    }
    
}
