package pl.lottoanalyzer.utils;

import pl.lottoanalyzer.model.Result;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * User: mgalezewska
 * Date: 2015-05-09
 */
public class ImportUtil {

    public static Result resulMapping(String line){
        Result result = new Result();
        String[] data = line.split(";");

        result.setNumber1(Integer.valueOf(data[2]));
        result.setNumber2(Integer.valueOf(data[3]));
        result.setNumber3(Integer.valueOf(data[4]));
        result.setNumber4(Integer.valueOf(data[5]));
        result.setNumber5(Integer.valueOf(data[6]));
        result.setNumber6(Integer.valueOf(data[7]));

        result.setLotDate(stringToDate(data[1]));

//        System.out.println(result);
        return result;
    }

    public static Date stringToDate(String dateString){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date date = null;

        try {
            date = simpleDateFormat.parse(dateString.replace(".","-"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
}
