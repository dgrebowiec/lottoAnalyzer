package pl.lottoanalyzer.utils;

import pl.lottoanalyzer.dto.DrawnNumberDto;
import pl.lottoanalyzer.dto.LotDto;
import pl.lottoanalyzer.dto.ResultDto;
import pl.lottoanalyzer.model.Result;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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

    public static ResultDto resultMapping(String line){
        ResultDto resultDto = new ResultDto();
        String[] data = line.split(";");
        List<DrawnNumberDto> drawnNumbers  = new ArrayList<>();

        resultDto.setLotDto(new LotDto(Long.valueOf(data[0]), stringToDate(data[1]) ));

        drawnNumbers.add(new DrawnNumberDto(Long.valueOf(data[2])));
        drawnNumbers.add(new DrawnNumberDto(Long.valueOf(data[3])));
        drawnNumbers.add(new DrawnNumberDto(Long.valueOf(data[4])));
        drawnNumbers.add(new DrawnNumberDto(Long.valueOf(data[5])));
        drawnNumbers.add(new DrawnNumberDto(Long.valueOf(data[6])));
        drawnNumbers.add(new DrawnNumberDto(Long.valueOf(data[7])));
        resultDto.setDrawnNumbersDto(drawnNumbers);


        return resultDto;
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
