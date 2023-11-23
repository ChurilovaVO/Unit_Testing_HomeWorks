/* Задание 1. Ответьте письменно на вопросы:
        1)  Почему использование тестовых заглушек может быть полезным при написании модульных тестов?
            - Чтобы максимально изолировать тест от лишних зависимостей, упростить и ускорить выполнение теста

        2) Какой тип тестовой заглушки следует использовать, если вам нужно проверить, что метод был вызван
        с определенными аргументами?
            - Stub заглушки, в них нет логики, но они возвращают предопределённое значение

        3) Какой тип тестовой заглушки следует использовать, если вам просто нужно вернуть определенное
        значение или исключение в ответ на вызов метода?
            - mock заглушки, они могут выдавать исключения на вызов, которого не ожидают, а также проверяют
            выходные значения

        4) Какой тип тестовой заглушки вы бы использовали для имитации  взаимодействия с внешним API
        или базой данных?
            - mock заглушки, так как с их помощью можно эмулировать работу классов, от которых зависит
            проверяемый тестом класс
 */

/* Задание 2. У вас есть класс BookService, который использует интерфейс BookRepository для получения
 информации о книгах из базы данных. Ваша задача написать unit-тесты для BookService, используя Mockito
 для создания мок-объекта BookRepository
 */

import hw.Book;
import hw.BookRepository;
import hw.BookService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class TestBookService {
    Map<String, Book> books;
    BookRepository bookRepository;
    BookService bookService;

    @BeforeEach
    void setUp() {
        books = new HashMap<>();
        books.put("1", new Book("1", "Book1", "Author1"));
        books.put("2", new Book("2", "Book2", "Author2"));

        bookRepository = mock(BookRepository.class);
        bookService = new BookService(bookRepository);
    }

    @Test
    void testFindBookById() {
        when(bookRepository.findById("1")).thenReturn(books.get("1"));
        assertEquals(books.get("1"), bookService.findBookById("1"));
        verify(bookRepository, times(1)).findById("1");
    }

    @Test
    void testFindAllBooks() {
        List book2 = new ArrayList<>(books.values());
        when(bookRepository.findAll()).thenReturn(book2);
        assertEquals(book2, bookService.findAllBooks());
        verify(bookRepository, times(1)).findAll();
    }

}
