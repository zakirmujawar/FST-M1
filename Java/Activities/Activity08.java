package activities;

import java.beans.Customizer;

public class Activity08 {
    public static void main(String[] args){
        try {
            Activity08.exceptionTest("Will print to console");
            Activity08.exceptionTest(null);
            Activity08.exceptionTest("Won't execute");
        }catch (CustomException mae){
            System.out.println("Inside catch block : "+ mae.getMessage());
        }
    }
    static void exceptionTest(String str) throws CustomException{
        if (str == null) {
            throw new CustomException("String value is null");
        } else {
            System.out.println(str);
        }
    }
}

class CustomException extends Exception {
    private String message = null;

    public CustomException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}