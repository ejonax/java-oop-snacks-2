

public class ConvertitoreValute {
  final static String[]  arrayTassi=new String[] {"EUR", "USD", "GBP", "JPY"};
  

   // se la valuta inserita dall'utente  fa parte della nostra lista di valute
    public static boolean  checkValuta(String va){
        boolean isIncluded=false;

        for (int i = 0; i < arrayTassi.length; i++) {
            // se l'utente inserisce eur al posto di EUR la valuta è valida
            if (arrayTassi[i].equalsIgnoreCase(va)){ 
                isIncluded= true; 
                break;  
            } else {
                isIncluded =false;
            }
        }

        return isIncluded;
    }


    //metodo che contiene la logica per la conversione valute
  static double converti(String da, String a, double importo){
    
    double tasso=0;
    double soldiConverti=0;
    
    // se le valute inserite non fanno parte della nostra lista allora il cambi non si fa
    if (!checkValuta(da)|| !checkValuta(a)) {
        System.out.println("Per le valute scegli uno tra le opsioni EUR , USD , GPB oppure JPY");
    }
    else {
        // se importo inserito <0 allora non si fa la conversione
        if (importo<=0){
           System.out.println("Inserite un importo maggiore di 0 per calcolare l'importo convertito!");
        }else {
            tasso=tassoDiCambio(da, a);
            soldiConverti=importo*tasso;
        }
    }
    return soldiConverti;
  }


  public static double tassoDiCambio(String da, String a){
    double tassoCambio;
    da=da.toUpperCase(); // la formato upperCase siccome ho usato upperCase format per il switch 
    a=a.toUpperCase();
    
    tassoCambio = switch (da) {
          case "EUR" -> switch (a) {
              case "EUR" -> 1;
              case "USD" -> 1.04;
              case "GBP" -> 0.83;
              case "JPY" -> 160.41;
              default -> 0;
          };
          case "USD" -> switch (a) {
              case "USD" -> 1;
              case "EUR" -> 0.96;
              case "GBP" -> 0.80;
              case "JPY" -> 154.35;
              default -> 0;
          };
          case "GBP" -> switch (a) {
              case "GBP" -> 1;
              case "EUR" -> 1.2;
              case "USD" -> 1.25;
              case "JPY" -> 192.15;
              default -> 0;
          };
          case "JPY" -> switch (a) {
              case "JPY" -> 1;
              case "EUR" -> 0.0062;
              case "GBP" -> 0.0052;
              case "USD" -> 0.0065;
              default -> 0;
          };
          default -> switch (a) {
              case "EUR" -> 0;
              case "GBP" -> 0;
              case "JPY" -> 0;
              default -> 0;
          };
      };
    return tassoCambio; 
  }
}
