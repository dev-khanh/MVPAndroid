package khanh.mvpandroid.Model.Entity;

public class Demo {
    private String message;

    public Demo(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return  message;
    }
}
