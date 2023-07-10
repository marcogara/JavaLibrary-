/*
    This is an open.source code meant for educational purposes only not intended
    for production use and may contain errors or bugs.
    Feel free to modify and use it for personal learning or teaching purposes.
    Not intended for distribution as a commercial product.
    Thanks.
*/

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Rechner rechner = new Rechner();

        rechner.frageUserFuerGrundrechenoperationen();

        Scanner scanner = new Scanner(System.in);

        rechner.frageUserFuerZahlen();
        
        // perform Operation
        System.out.println(rechner.rechnen());

    }


}





























