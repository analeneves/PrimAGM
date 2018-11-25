/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prim;

import java.util.ArrayList;
import sun.security.provider.certpath.Vertex;

/**
 *
 * @author Ana Letícia
 */
public class Vertice {
    private int n;
    private int x;
    private int y;
    private int peso;
    public ArrayList<Aresta> vizinhos = new ArrayList();
    
    public Vertice(int x, int y, int peso, int n){
        this.x = x;
        this.y = y;
        this.peso = peso;
        this.n = n;
        
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
    
    public int getN(){
        return this.n;
    }
    
    public int setN(){
        return this.n;
    }

    Vertex returnStartingVertex() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
