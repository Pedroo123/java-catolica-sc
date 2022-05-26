package temperaturas;

public class TestaTemperatura {

    public static void main(String[] args) {
        Temperatura temp = new Temperatura();

        System.out.println(temp.getCelsius() + "ºC");
        System.out.println(temp.getFahrenheit() + "ºF");
        System.out.println(temp.getKelvin() + "ºK");
    }
}
