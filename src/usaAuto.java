public class usaAuto {
   
   /* Scrivi un programma che:
      Crei alcune auto e stampi il loro numero di telaio e modello.
      Stampi il numero totale di auto create.
   */

   public static void main(String[] args) {
       Auto auto1=new Auto("Fiat");
       System.err.println("Auto1 è di modello " + auto1.getModello()
                           + " ,ha un telaio numero " + auto1.getNumeroTelaio()
                           + " e il totale finora delle auto create è di " + Auto.getContatoreAuto() + " auto.");
      
       Auto auto2=new Auto("BMW");
       System.err.println("Auto2 è di modello " + auto2.getModello()
                          + " ,ha un telaio numero " + auto2.getNumeroTelaio()
                          + " e il totale finora delle auto create è di " + Auto.getContatoreAuto()+ " auto.");

       Auto auto3=new Auto("Tesla");
       System.err.println("Auto3 è di modello "  + auto3.getModello()
                          + " ,ha un telaio numero " + auto3.getNumeroTelaio()
                          + " e il totale finora delle auto create è di " + Auto.getContatoreAuto()+ " auto.");

        
        System.out.println("In totale sono create " + Auto.getContatoreAuto() + " auto.");
       
   }
}
