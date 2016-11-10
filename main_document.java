/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestordocuments;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author 1195733
 */
public class main_document {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
   
        int num;
        System.out.println("Classe Document");
        while(true){                 
            
            Document d = new Document();
            System.out.println("Introdueix el títol del nou document");
            Scanner lector = new Scanner(System.in);
            String titol = lector.nextLine();
            d.set_titol_String(titol);
            System.out.println("Introdueix el nom de l'autor del nou document");
            String autor = lector.nextLine();
            d.set_autor_String(autor);
            System.out.println("Introdueix el tema del nou document");
            String tema = lector.nextLine();
            d.set_tema_String(tema);
            System.out.println("Introdueix el contingut del nou document");
            String contingut = lector.nextLine();
            d.set_contingut_String(contingut);            
            
            System.out.println("Escriu un numero del 1 al 5.");
            System.out.println("1. Imprimir atributs a partir dels getters.");
            System.out.println("2. Imprimir atributs per defecte.");
            System.out.println("3. Crear un document a partir d'un fitxer del disc.");
            System.out.println("4. Dividir el contingut del document en frases i paraules.");
            
            String opt = lector.nextLine();
            
            num = Integer.parseInt(opt);
            
            switch(num)
            {
                case 1: System.out.println("Títol: " + d.get_titol().get_frasestring());
                        System.out.println("Autor: " + d.get_autor().get_frasestring()); 
                        System.out.println("Tema: " + d.get_tema().get_p()); 
                        System.out.println("Contingut: " + d.get_contingut().get_textstring()); 
                        break;
                        
                case 2: d.imprimir(); break;
                        
                case 3: System.out.println("Introdueix el nom de l'arxiu ('arxiu.extensió')");
                        String file = lector.nextLine();
                        d.set_all_data(file);
                        d.imprimir(); break;
                        
                case 4: d.crear_divisions();
                        System.out.println("Comprovem si les frases s'han dividit correctament:");
                        d.get_contingut().imprimir_llista_frases(); break;
                        
                
                default: System.out.println("Error: Els numeros han de ser entre 1 i 4."); break;

            }
        }
        
        
        
        
        
    }
}