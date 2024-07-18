package vn.haons.springbootgithubaction;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SpringBootGithubActionApplicationTests {

    @Autowired
    private MathService mathService;

    @Test
    void testAdd() {
        assertEquals(5, mathService.add(2, 3));
        assertEquals(0, mathService.add(-1, 1));
    }

    @Test
    void testSubtract() {
        assertEquals(2, mathService.subtract(5, 3));
        assertEquals(0, mathService.subtract(1, 1));
    }

}
