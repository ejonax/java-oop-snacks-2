
import java.util.Random;

public class Auto {
   /*  
   Crea una classe Auto con:
        - Un numero di telaio (final int numeroTelaio) univoco assegnato automaticamente alla creazione.
        - Una variabile static int contatoreAuto per tenere traccia del numero totale di auto create.
        - Un modello (final String modello) assegnato al momento della creazione e non modificabile.
          Ogni volta che viene creata una nuova Auto, il contatore deve aumentare e il numero di telaio deve essere assegnato in modo incrementale.

        - Implementa un metodo static int getNumeroTotaleAuto() che restituisca il numero totale di auto create.
   */
private final int numeroTelaio;
private static int currentNumeroTelaio;
private static int contatoreAuto;
private final String modello;


public Auto(String modello){
   this.modello=modello;
   Random random=new Random();
   if (currentNumeroTelaio==0){
       currentNumeroTelaio=random.nextInt();
   }
   numeroTelaio=currentNumeroTelaio++ ;
   contatoreAuto=contatoreAuto+1;
}

public int getNumeroTelaio() {
    return numeroTelaio;
}

public String getModello() {
    return modello;
}

public static  int getContatoreAuto() {
    return contatoreAuto;
}



}
