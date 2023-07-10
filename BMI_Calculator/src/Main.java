import com.BmiCalculator.view.BodyMassGUI;

import javax.swing.*;

public class Main {

    /*
            System.out.println("Hello and welcome!");

            System.out.println("Please enter your size in meter: (format ->  #,##) ...  ");
            Scanner scanner = new Scanner(System.in);
            double size = scanner.nextDouble();

            System.out.println("Please enter your weight in Kg: (format ->  ##,#) ...  ");

            double weight = scanner.nextDouble();

            com.BmiCalculator.model.BodyMassCalculator bmi = new com.BmiCalculator.model.BodyMassCalculator(size,weight);

            System.out.println("your BMI is: "+ bmi.getBmi());

     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                BodyMassGUI frame=new BodyMassGUI();
                frame.setVisible(true);
            }
        });
    }
}








