/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bingo;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author novoa
 */
public class Ziehungsgeraet {
    public static int randomB,randomI,randomN,randomG,randomO,j;
    public static int[] Arrayrandoms = new int[5];
    
    Kugel kugel = new Kugel();
    Karte karte = new Karte();
    Bingo bingo = new Bingo();   
    
    public Ziehungsgeraet(){
      
      // random  = ((max-min) + 1 ) + min;
      j = 0;
      erzeugen();
      Kartefuellen();
    }
    
    public void Kartefuellen(){
    
      
      for(int i=0;i<karte.Spielkarte.length;i++){
          while(j < karte.Spielkarte[i].length){ 
              if(istLeer(i,j)){
                  switch(i){
                      case 0:
                        if(Tafelcontains(randomB) == false){ 
                            kugel.Buchstabe = 'B';
                            kugel.Nummer    = randomB;
                            bingo.Nummern.add(randomB);
                            karte.eintragen(kugel,j);
                            j = j + 1;
                            
                        }else{
                            erzeugen();
                        }    
                       break;
                      case 1:
                         if(Tafelcontains(randomI) == false){
                            kugel.Buchstabe = 'I';
                            kugel.Nummer    = randomI;
                            bingo.Nummern.add(randomI);                            
                            karte.eintragen(kugel,j);
                            j = j + 1;
                         }else{
                            erzeugen();
                        } 
                       break;   
                      case 2:
                        if(Tafelcontains(randomN) == false){
                          kugel.Buchstabe = 'N';
                          kugel.Nummer    = randomN;
                          bingo.Nummern.add(randomN);
                          karte.eintragen(kugel,j);
                          j = j + 1;                          
                        }else{
                            erzeugen();
                        }
                       break;
                       
                      case 3:
                         if(Tafelcontains(randomG) == false){
                          kugel.Buchstabe = 'G';
                          kugel.Nummer    = randomG;
                          bingo.Nummern.add(randomG);                          
                          karte.eintragen(kugel,j);
                          j = j + 1;
                        }else{
                            erzeugen();
                        }                           
                          break;
                     
                      case 4:
                         if(Tafelcontains(randomO) == false){
                          kugel.Buchstabe = 'O';
                          kugel.Nummer    = randomO;
                          bingo.Nummern.add(randomO);                          
                          karte.eintragen(kugel,j);
                          j = j + 1;
                        }else{
                            erzeugen();
                        }
                         break;                         
                  }
                  erzeugen();
               }
           }
          j = 0;
       }
      karte.ausgeben();
   }
    
    public boolean istLeer(int col,int row){
        
        if(karte.Spielkarte[col][row] == 0){
            return true;
        }
        
      return false;
    }
    
    public static void erzeugen(){
    
      randomB = new Random().nextInt( (15 - 1 ) + 1) + 1; 
      randomI = new Random().nextInt( (30 - 16) + 1) + 16;
      randomN = new Random().nextInt( (45 - 31) + 1) + 31;
      randomG = new Random().nextInt( (60 - 46) + 1) + 46;
      randomO = new Random().nextInt( (75 - 61) + 1) + 61;          
    }
    
    public boolean Tafelcontains(int Nummer){
        
        if(bingo.Nummern.contains(Nummer)){
           return true;
        }
    return false;
    }
    
    public static void spielen(ArrayList<int[][]> Daten){
        
        erzeugen();
        Arrayrandoms[0] = randomB;
        Arrayrandoms[1] = randomB;
        Arrayrandoms[2] = randomB;
        Arrayrandoms[3] = randomB;
        Arrayrandoms[4] = randomB;
        
       if(!Karte.isBingo(Daten,Arrayrandoms)){
          erzeugen();
       }
       else{
                
       }    
    }
        
        
}
    

