/*
    * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prim;
/**
 *
 * @author Ana Letícia
 */
public class Aresta {
    private int x;
    private int y;
    private int peso;
    private Object grafo;
    
    public Aresta(int x, int y, int peso){
        this.peso = peso;
        this.y = y;
        this.x = x;
    }
    
        public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public void setPeso(int peso){
        this.peso = peso;
    }
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
    public int getPeso(){
        return this.peso;
    }
   
    
    
}
