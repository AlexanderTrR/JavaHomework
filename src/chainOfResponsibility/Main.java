package chainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        // Создаем обработчики
        // Первый обработчик
        SupportHandler basicSupport = new BasicSupportHandler();
        // Второй обработчик
        SupportHandler intermediateSupport = new IntermediateSupportHandler();
        // Третий обработчик
        SupportHandler advancedSupport = new AdvancedSupportHandler();

        // Строим цепочку обязанностей 1->2->3
        basicSupport.setNext(intermediateSupport).setNext(advancedSupport);

        // Создаем запросы
        System.out.println("Отправляем запрос на базовую поддержку первому обработчику:");
        basicSupport.handleRequest(SupportLevel.BASIC);

        System.out.println("\nОтправляем запрос на поддержку среднего уровня первому обработчику:");
        basicSupport.handleRequest(SupportLevel.INTERMEDIATE);

        System.out.println("\nОтправляем запрос на поддержку высшего уровня первому обработчику:");
        basicSupport.handleRequest(SupportLevel.ADVANCED);

        System.out.println("\nОтправляем запрос на поддержку профессионального уровня первому обработчику:");
        basicSupport.handleRequest(SupportLevel.PROFESSIONAL);
    }
}
