import hw.MyList;
import hw.View;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestView {
    View view;

    @BeforeEach
    public void setUp() {
        view = new View();
    }

    @Test
    public void testGetArray() {
        Integer[] array = new Integer[]{2, 5, 5};
        assertThat(view.getArray(new String[]{"2", "5", "5"})).isEqualTo(array);
    }


}
