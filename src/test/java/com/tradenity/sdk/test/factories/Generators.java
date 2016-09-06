package com.tradenity.sdk.test.factories;

import java.util.Random;

/**
 * Created by joseph
 * on 1/11/16.
 */
public class Generators {
    static Random random = new Random();

    public static int integer(int limit){
        return random.nextInt(limit);
    }
    public static int integer(){
        return random(Integer.class);
    }

    public static String word(){
        return random(Lipsum.words);
    }

    public static String statement(){
        return random(Lipsum.titles);
    }

    public static String paragraph(){
        return random(Lipsum.paragraphs);
    }

    public static <T> T random(T[] array){
        if(array != null && array.length > 0){
            return array[random.nextInt(array.length)];
        }
        return null;
    }

    public static <T> T random(Class<T> type){
        if(type.equals(Integer.class)){
            return ((T)Integer.valueOf(random.nextInt()));
        }

        if(type.equals(Long.class)){
            return ((T)Long.valueOf(random.nextLong()));
        }

        if(type.equals(Float.class)){
            return ((T)Float.valueOf(random.nextFloat()));
        }

        if(type.equals(Double.class)){
            return ((T)Double.valueOf(random.nextDouble()));
        }

        return null;
    }
}
