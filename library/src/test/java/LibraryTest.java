
import org.gradle.example.api.Library;
import org.gradle.example.impl.LibraryImpl;
import org.junit.Assert;
import org.junit.Test;

public class LibraryTest {
    @Test
    public void shouldBeTrue() {
        Library classUnderTest = new LibraryImpl();
        Assert.assertTrue(classUnderTest.isTrue());
    }
}
