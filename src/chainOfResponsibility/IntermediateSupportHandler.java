package chainOfResponsibility;

public class IntermediateSupportHandler extends SupportHandler {
    @Override
    protected boolean canHandle(SupportLevel level) {
        return level == SupportLevel.INTERMEDIATE;
    }

    @Override
    protected void processRequest() {
        System.out.println("Обработка запроса поддержкой среднего уровня.");
    }
}
