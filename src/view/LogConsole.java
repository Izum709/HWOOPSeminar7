package view;

public class LogConsole implements  Logging{
    @Override
    public void writeMessage(String message) {
        System.out.println(message);
    }
}
