// This test class creates instances of `MSIFabrik` and `GigabyteFabrik`,
// and uses them to create objects of the different `Computerteil` subclasses.
// It then prints out information about each object using their
// `toString()` method.

public class ComputerfabrikTest {

    public static void main(String[] args) {

        // Create an instance of MSIFabrik
        Computerfabrik msiFabrik = new MSIFabrik();

        // Use the erstelleComputerTeil method to create instances of MSI Grafikkarte, Mainboard, and SSD
        Computerteil msiGrafikkarte = msiFabrik.erstelleComputerTeil("Grafikkarte");
        Computerteil msiMainboard = msiFabrik.erstelleComputerTeil("Mainboard");
        Computerteil msiSSD = msiFabrik.erstelleComputerTeil("SSD");


        // Print out information about each object using their toString() method
        System.out.println(msiGrafikkarte); // Ausgabe: MSI Geforce GTX 1080, MSI
        System.out.println(msiMainboard); // Ausgabe: MSI Z370 Gaming Pro Carbon, MSI
        System.out.println(msiSSD); // Ausgabe: MSI Optix AG32CQ, MSI


        // Create an instance of GigabyteFabrik
        Computerfabrik gigabyteFabrik = new GigabyteFabrik();


        // Use the erstelleComputerTeil method to create instances of Gigabyte Grafikkarte, Mainboard and SSD
        Computerteil gigabyteGrafikkarte = gigabyteFabrik.erstelleComputerTeil("Grafikkarte");
        Computerteil gigabyteMainboard = gigabyteFabrik.erstelleComputerTeil("Mainboard");
        Computerteil gigabyteSSD = gigabyteFabrik.erstelleComputerTeil("SSD");

        // Print out information about each object using their toString() method
        System.out.println(gigabyteGrafikkarte); // Ausgabe: Gigabyte AORUS GeForce RTX 2080 Ti Xtreme Waterforce WB 11GB GDDR6, Gigbyte
        System.out.println(gigabyteMainboard);//Ausgbe : Gigbyte X570 AORUS Master ATX AM4 Motherborad , Gigbyte
        System.out.println(gigabyteSSD);//Aorus RGB NVMe M.2 512GB Internal Gaming SSD ,gibyte

    }
}

