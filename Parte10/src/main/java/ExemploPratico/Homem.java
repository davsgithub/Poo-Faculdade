/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExemploPratico;

/**
 *
 * @author Cakeb
 */
public class Homem extends Humano{
  boolean barba, bigode;
double peitoral;

public Homem(){
    this.sexo = "Masculino";
}

public void setBarba(boolean barba){
    this.barba = barba;
}
public boolean getBarba(){
    return barba;
}        

public void setBigode(boolean bigode){
    this.bigode = bigode;
}
public boolean getBigode(){
    return bigode;
}

public void setPeitoral(double peitoral){
    if(peitoral>0){
        this.peitoral = peitoral;
    }
}
public double getPeitoral(){
    return peitoral;
}    
    
    
    
    
    
    @Override
    public String amamentar(){
        return "Homens usam mamadeiras";
    }
}
