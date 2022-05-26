package temperaturas;

public class Temperatura {

    public static int celsius = 15;

    public int getCelsius() {
        return celsius;
    }

    public int getFahrenheit() {
        return (int) (1.8 * celsius + 32);
    }

    public int getKelvin() {
        return celsius + 273;
    }
}
