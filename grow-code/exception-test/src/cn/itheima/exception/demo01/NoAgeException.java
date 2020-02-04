package cn.itheima.exception.demo01;

public class NoAgeException extends RuntimeException {

    public NoAgeException() {
    }

    public NoAgeException(String message) {
        super(message);
    }

}
