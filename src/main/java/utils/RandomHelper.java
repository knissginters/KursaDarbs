package utils;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomHelper {

    public static String generateRandomString(int count, boolean leters, boolean numbers) {
        return RandomStringUtils.random(count, leters, numbers);
    }

    public static String randomEmail(){
        return generateRandomString(8,true,false) + "@" + generateRandomString(8,true,false) + ".com";
    }


    }
