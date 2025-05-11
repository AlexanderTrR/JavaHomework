package chainOfResponsibility;

public class AdvancedSupportHandler extends SupportHandler {
    @Override
    protected boolean canHandle(SupportLevel level) {
        return level == SupportLevel.ADVANCED;
    }

    @Override
    protected void processRequest() {
        System.out.println("Обработка запроса поддержкой высшего уровня.");
    }
}
