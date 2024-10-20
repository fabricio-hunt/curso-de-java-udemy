public class ExercicioSaidaDeDados {
    public static void main(String[] args) {

        String product1 = "Computer";
        String product2 = "Office Desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double prince1 = 2100.0;
        double prince2 = 650.0;
        double measure =  53.234567;


        /* OutPut */
        // Configura a formatação numérica para ponto decimal
        /*NumberFormat numberFormat = NumberFormat.getInstance(Locale.US);*/

        // Configura a formatação de moeda para BRL
        // NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

        System.out.println("Products: ");
        System.out.println( product1 + ", which price is $" + prince1);
        System.out.println( product2 +", which price is " + prince2);
        System.out.println("Record" + age + "years old is " + code + "and gender: " + gender);
        System.out.println(" Measure with eight decimal places: " + measure);
        System.out.printf("US decimal: %.2f", measure);

    }
}
