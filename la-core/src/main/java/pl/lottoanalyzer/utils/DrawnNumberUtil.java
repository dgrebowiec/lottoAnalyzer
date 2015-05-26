package pl.lottoanalyzer.utils;

import java.util.ArrayList;

/**
 * User: mgalezewska
 * Date: 2015-05-26
 */
public class DrawnNumberUtil {
    public static final ArrayList<Integer> NUMBERS = new ArrayList<>();

    static{
        for(int i = 1; i < 50; i++){
            NUMBERS.add(i);
        }
    }

}
