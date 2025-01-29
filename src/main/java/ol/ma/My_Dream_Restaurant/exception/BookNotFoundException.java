package ol.ma.My_Dream_Restaurant.exception;


public class BookNotFoundException extends RuntimeException {

  public BookNotFoundException(String message, Throwable cause) {
      super(message, cause);
  }
  // ...
}