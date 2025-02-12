

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
    
    switch (da) {
        case "EUR":
            switch (a) {
                    case "EUR":
                        tassoCambio=1;
                        break;
                    case "USD":
                        tassoCambio=1.04;
                        break;
                    case "GBP":
                        tassoCambio=0.83;
                        break;
                    case "JPY":
                        tassoCambio=160.41;
                        break;
                    default:
                        tassoCambio=0;
                        break;
                    }
                break;
        case "USD":
                switch (a) {
                    case "USD":
                        tassoCambio=1;
                        break;
                    case "EUR":
                        tassoCambio=0.96;
                        break;
                    case "GBP":
                        tassoCambio=0.80;
                        break;
                    case "JPY":
                        tassoCambio=154.35;
                        break;
                    default:
                        tassoCambio=0;
                    }
                break;
        case "GBP":
                switch (a) {
                    case "GBP":
                        tassoCambio=1;
                        break;
                    case "EUR":
                        tassoCambio=1.2;
                        break;
                    case "USD":
                        tassoCambio=1.25;
                        break;
                    case "JPY":
                        tassoCambio=192.15;
                        break;
                    default:
                        tassoCambio=0;
                        break;
                        }
                    break;
        case "JPY":
                    switch (a) {
                        case "JPY":
                            tassoCambio=1;
                            break;
                        case "EUR":
                            tassoCambio=0.0062;
                            break;
                        case "GBP":
                            tassoCambio=0.0052;
                            break;
                        case "USD":
                            tassoCambio=0.0065;
                            break;
                        default:
                            tassoCambio=0;
                            break;
                        }
                    break;
        default:
                    switch (a) {
                        case "EUR":
                            tassoCambio=0;
                            break;
                        case "GBP":
                            tassoCambio=0;
                            break;
                        case "JPY":
                            tassoCambio=0;
                            break;
                        default:
                            tassoCambio=0;
                            break;
                        }
                    break;

    }
    return tassoCambio; 
  }
}
