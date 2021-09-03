package JunitTests;
import org.junit.Assert;
import org.junit.Test;
import java.awt.print.Book;


public class PrototypeTest {


    @Test
    public void testPrototype() {
        Book book = new Book();
        Assert.assertNotNull(book);

    }
}