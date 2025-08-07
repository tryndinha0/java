package dio.my_first_web_api.handler;

public class BusinessException extends RuntimeException {
    public BusinessException(String message){
        super(message);
    }
    // public BusinessException(String message){
    //     super(message);
    // }
}
