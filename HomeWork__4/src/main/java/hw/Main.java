package hw;

import java.util.List;
import static org.mockito.Mockito.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        List mockedList = mock(List.class);
        mockedList.add("one");
        mockedList.clear();
    }

  }