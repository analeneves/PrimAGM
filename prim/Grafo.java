/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prim;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author Ana Letícia
 */
public class Grafo {
    public ArrayList<Vertice> grafo = new ArrayList();
    
    public Grafo() throws IOException{
        lerVertice();
        printGrafo();
    }
    
    void lerVertice() throws FileNotFoundException, IOException{
    File dir = new File("C:\\Users\\Ana Letícia\\Documents\\NetBeansProjects\\Prim\\src");
    File arq = new File(dir, "entrada.dat");
    
    
 

    try {
        //Indicamos o arquivo que será lido
        FileReader fileReader = new FileReader(arq);

        //Criamos o objeto bufferReader que nos
        // oferece o método de leitura readLine()
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        //String que irá receber cada linha do arquivo
        String linha = "";
        linha = bufferedReader.readLine();
        linha = bufferedReader.readLine();
        //Fazemos um loop linha a linha no arquivo,
        // enquanto ele seja diferente de null.
        //O método readLine() devolve a linha na
        // posicao do loop para a variavel linha.
     
        int cont = 0;
        while ( ( linha = bufferedReader.readLine() ) != null) {
            
            //Aqui imprimimos a linha
            //System.out.println(linha);
            if(linha.equals("-1")){
                break;
            }
            String [] aux = linha.split(Pattern.quote (" "));
            this.grafo.add(new Vertice(Integer.parseInt(aux[0]), Integer.parseInt(aux[1]), Integer.parseInt(aux[2]), cont++));
            //System.out.print(cont-1 + "->" + aux[0] + " " + aux[1] + " " + aux[2] + "\n");
        }
        //liberamos o fluxo dos objetos ou fechamos o arquivo
        
        while ( ( linha = bufferedReader.readLine() ) != null) {
        //Aqui imprimimos a linha
            //System.out.println(linha);
            
        String [] aux = linha.split(Pattern.quote (" "));
        Aresta a = new Aresta(Integer.parseInt(aux[0]), Integer.parseInt(aux[1]), Integer.parseInt(aux[2]));
        
        
        for(int i = 0; i < this.grafo.size(); i++){
            if(this.grafo.get(i).getN() == Integer.parseInt(aux[0])){
                this.grafo.get(i).vizinhos.add(a);            
            }
        }
        //this.grafo.add(new Aresta(Integer.parseInt(aux[0]), Integer.parseInt(aux[1]), Integer.parseInt(aux[2])));
        //System.out.print(aux[0] + " " + aux[1] + " " + aux[2] + "\n");
    }
        
        fileReader.close();
        bufferedReader.close();
    } catch (IOException e) {
    	e.printStackTrace();
    }		
}
    
    void printGrafo(){
        
        for(int i = 0; i < this.grafo.size(); i++){
            System.out.print(this.grafo.get(i).getN() + " -> ");
            for(int j = 0; j < this.grafo.get(i).vizinhos.size(); j++){
                System.out.print(this.grafo.get(i).vizinhos.get(j).getY() + " | ");
            }
            System.out.print("\n");
        }        
    }
}