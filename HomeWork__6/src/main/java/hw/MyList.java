package hw;

import java.util.List;

public class MyList {
    private List<Integer> myList;
    private Double averageValue;

    public MyList(List<Integer> list) {
        this.myList=list;
    }

    public Double calculationAverageValue() {
        Double result = 0.0;
        for (Integer value : this.myList) {
            result += value;
        }
        return (result / this.myList.size());
    }

    public static String compareAverageValue(Double avg1, Double avg2){
        if (avg1>avg2){
            return "Первый список имеет большее среднее значение";
        }
        if (avg1<avg2){
            return "Второй список имеет большее среднее значение";
        }
        else {
            return "Средние значения равны";
        }
    }

    public Double getAverageValue() {
        return averageValue;
    }

    public void setAverageValue(Double averageValue) {
        this.averageValue = averageValue;
    }

}
