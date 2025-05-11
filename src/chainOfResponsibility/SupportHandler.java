package chainOfResponsibility;

abstract class SupportHandler {
    private SupportHandler nextHandler;

    // Метод для установки следующего обработчика в цепочке
    public SupportHandler setNext(SupportHandler nextHandler) {
        this.nextHandler = nextHandler;
        return nextHandler;
    }

    // Метод для обработки запроса
    public void handleRequest(SupportLevel level) {
        if (canHandle(level)) {
            processRequest();
        } else if (nextHandler != null) {
            System.out.println("Запрос был передан.");
            nextHandler.handleRequest(level);
        } else {
            System.out.println("Запрос не может быть обработан.");
        }
    }

    // Абстрактные методы, которые должны быть реализованы в подклассах
    protected abstract boolean canHandle(SupportLevel level);
    protected abstract void processRequest();
}

