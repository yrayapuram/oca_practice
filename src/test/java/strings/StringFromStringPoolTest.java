package strings;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class StringFromStringPoolTest {

    @Test
    public void shouldPrintExpectedStringPoolAndImmutabilityOutput() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;

        try {
            System.setOut(new PrintStream(outputStream));

            StringFromStringPool.main();

            String[] lines = new String(outputStream.toByteArray(), StandardCharsets.UTF_8).trim().split("\\R");
            Assert.assertEquals("true", lines[0]);
            Assert.assertEquals("true", lines[1]);
            Assert.assertEquals("false", lines[2]);
            Assert.assertEquals("string pool", lines[6]);
            Assert.assertEquals("string pool added string value", lines[7]);
            Assert.assertEquals(lines[3], lines[4]);
            Assert.assertEquals(lines[4], lines[5]);
        } finally {
            System.setOut(originalOut);
        }
    }
}