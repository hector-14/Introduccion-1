/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplotipolist;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author chelis
 */
public class EjemploTipoList {
    
    public EjemploTipoList(){
    
    List<Datos> lista = new ArrayList<>();
    Datos datos = new Datos();
    datos.setNombre("Héctor ");
    datos.setEdad(19);
    
    lista.add(datos);
    
    datos = new Datos();
    
    datos.setNombre("Luis");
    datos.setEdad(24);
    
    lista.add(datos);
    
    datos = new Datos();
    
    datos.setNombre("Juan");
    datos.setEdad(18);
    
    lista.add(datos);
    
    lista.forEach(elemento ->{
        System.out.println("Nombre " + elemento.getNombre());
        System.out.println("Edad " + elemento.getEdad());
    });
    System.out.println("\n\n Otra forma de recorrer los datos ");
    
    for(Datos contenido : lista){
        System.out.println("Nombre " + contenido.getNombre());
         System.out.println("Edad " + contenido.getEdad());
         
    }
    datos = new Datos();
    
    datos.setNombre("carlos");
    datos.setEdad(27);
    
    lista.add(datos);
    
    System.out.println("\n\n tercer forma de ver el contenido");
    
    lista.stream().forEach((valores) ->{
    System.out.println("Nombre" + valores.getNombre());
    System.out.println("Edad" + valores.getEdad());
    
    if(valores.getNombre().equals("fernando")){
    System.out.println("se encontro el dato...");
    
    }
    
    });
    }

    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new EjemploTipoList();

    }
    
}
