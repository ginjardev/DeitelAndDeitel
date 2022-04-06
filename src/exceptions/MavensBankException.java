package exceptions;

public class MavensBankException extends Exception{

    public MavensBankException(){
        super();
    }

    public MavensBankException(String message){
        super(message);
    }

    public MavensBankException(String message, Throwable cause){
        super(message, cause);
    }

    public MavensBankException(Throwable cause){
        super(cause);
    }


}
