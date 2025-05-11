package decorator;

public class Main {
    public static void main(String[] args) {
        // Гадание на Таро
        Service taro = new Divination("Таро", 1000);
        Service chakra = new Chakra(taro);
        Service aura = new Aura(chakra);

        // И общая стоимость
        System.out.println(aura.getPrice());
    }
}
