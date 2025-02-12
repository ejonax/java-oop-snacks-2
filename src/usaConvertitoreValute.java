
import java.util.Scanner;

public class usaConvertitoreValute {
    public static void main(String[] args) {
        
        Scanner userInput=new Scanner(System.in);
        System.out.println("Inserici la valuta di partenza, valuta di destinazione, importo");
        System.out.println("Per le valute scegli uno tra le opsioni EUR , USD , GPB oppure JPY");

        String valPartenza=userInput.nextLine();
        String valDestinazione=userInput.nextLine();
        double importo=userInput.nextDouble();

    
        //double tassoC=ConvertitoreValute.tassoDiCambio(valPartenza, valDestinazione);
        //System.out.println("il tasso di cambio è "+ tassoC);
        double importoNew=ConvertitoreValute.converti(valPartenza, valDestinazione, importo);
        System.out.println("Il valore di importo è " + importoNew + " " + valDestinazione.toUpperCase());

        // importNew la formato per avere solo 4 digits dopo .
        String importoNewFormated = String.format ("%.4f", importoNew);
        System.out.println("Il valore di importo è " + importoNewFormated + " " + valDestinazione.toUpperCase());

    }
}
