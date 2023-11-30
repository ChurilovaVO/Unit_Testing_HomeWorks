import hw.MyList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMyList {
    MyList myList1;
    MyList myList2;

    @Test
    public void testCalculationAverageValue() {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        myList1 = new MyList(list1);
        assertEquals(2, myList1.calculationAverageValue());
    }
    @Test
    public void testGetAverageValue() {
        List<Integer> list1 = new ArrayList<>();
        myList1 = new MyList(list1);
        myList1.setAverageValue(5.0);
        assertThat(myList1.getAverageValue()).isEqualTo(5.0);
    }

    @BeforeEach
    public void setUp() {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        myList1 = new MyList(list1);
        List<Integer> list2 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(7);
        myList2 = new MyList(list2);
    }

    @Test
    public void testCompareAverageValueFirstValueMax() {
        assertThat(MyList.compareAverageValue(4.0, 2.0)).isEqualTo("Первый список имеет большее среднее значение");
    }
    @Test
    public void testCompareAverageValueSecondValueMax() {
        assertThat(MyList.compareAverageValue(-5.0, 3.0)).isEqualTo("Второй список имеет большее среднее значение");
    }
    @Test
    public void testCompareAverageValueAllValueEqualTo() {
        assertThat(MyList.compareAverageValue(1.0, 1.0)).isEqualTo("Средние значения равны");
    }

}
