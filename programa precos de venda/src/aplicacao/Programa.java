package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import classes.LocadoraCarros;

public class Programa {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner ent = new Scanner(System.in);

        LocadoraCarros lCarros = new LocadoraCarros();
        lCarros.portifolio();



    

        ent.close();
    }
}
