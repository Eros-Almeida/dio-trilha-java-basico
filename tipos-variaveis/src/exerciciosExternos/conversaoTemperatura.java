package exerciciosExternos;

public class conversaoTemperatura {
    public static void main(String[] args) {
        double C, K, F, Re, Ra;
        C = 40.0;

        K = C + 273.15;
        F = C * 1.8 + 32.0;
        Re = C * 0.8;
        Ra = C * 1.8 + 32.0 + 459.67;

        System.out.println("Temperatura em Celsius: " + C);
        System.out.println("Temperatura em Kelvin: " + K);
        System.out.println("Temperatura em Fahrenheit: " + F);
        System.out.println("Temperatura em Réaumur: " + Re);
        System.out.println("Temperatura em Rankine: " + Ra);
    }
}