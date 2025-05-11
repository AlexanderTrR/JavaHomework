package chainOfResponsibility;

public class BasicSupportHandler extends SupportHandler {
    @Override
    protected boolean canHandle(SupportLevel level) {
        return level == SupportLevel.BASIC;
    }

    @Override
    protected void processRequest() {
        System.out.println("Обработка запроса базовой поддержкой.");
    }
}

