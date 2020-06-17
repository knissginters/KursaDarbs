package utils;

public class User {

    public static String name(){
        return RandomHelper.generateRandomString(8, true, false);
    }

    public static String lastName(){
        return RandomHelper.generateRandomString(8, true, false);
    }

    public static String email(){
        return RandomHelper.randomEmail();
    }

    public static String passw() {
        return RandomHelper.generateRandomString(8, true, true);
    }
}
