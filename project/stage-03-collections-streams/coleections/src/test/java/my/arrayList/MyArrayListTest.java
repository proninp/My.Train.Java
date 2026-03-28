package my.arrayList;

import my.arraylist.MyArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class MyArrayListTest {
    private MyArrayList<String> list;
    
    @BeforeEach
    void setUp() {
        list = new MyArrayList<>();
    }
    
    @Test
    void add_shouldIncreaseSize() {
        list.add("a");
        list.add("b");
        
        assertThat(list.size()).isEqualTo(2);
    }

    @Test
    void get_shouldReturnCorrectElement() {
        list.add("hello");

        assertThat(list.get(0)).isEqualTo("hello");
    }
    
    @Test
    void get_withInvalidIndex_shouldThrow() {
        list.add("a");
        
        assertThatThrownBy(() -> list.get(5))
                .isInstanceOf(IndexOutOfBoundsException.class);
    }
    
    @Test
    void remove_shouldDecreaseSize() {
        list.add("a");
        list.add("b");
        list.add("c");
        
        list.remove(1);
        
        assertThat(list.size()).isEqualTo(2);
    }

    @Test
    void remove_shouldShiftElementsCorrectly() {
        list.add("a");
        list.add("b");
        list.add("c");

        list.remove(0);

        assertThat(list.get(0)).isEqualTo("b");
        assertThat(list.get(1)).isEqualTo("c");
    }

    @Test
    void add_beyondInitialCapacity_shouldGrowAndPreserveElements() {
        // начальная capacity = 10, добавим 15 элементов
        for (int i = 0; i < 15; i++) {
            list.add("item" + i);
        }

        assertThat(list.size()).isEqualTo(15);
        assertThat(list.get(14)).isEqualTo("item14");
    }
}
