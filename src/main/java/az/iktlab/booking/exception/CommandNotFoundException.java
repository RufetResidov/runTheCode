package az.iktlab.booking.exception;

public class CommandNotFoundException extends Exception{
    @Override
    public String getMessage() {
        return "Command Not Found ";
    }
}
