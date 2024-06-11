package exercicios;

public class ConversaoDeTemperaturas {
    public static void main(String[] args) {
        double temperaturaCelsius = 18.97;
        int temperaturaFahrenheit = (int) (temperaturaCelsius * 1.8) + 32;
        System.out.println(temperaturaFahrenheit);
    }
}
