import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class PDFTest {
    private String FILE_PATH = "/Users/yasirudahanayake/IdeaProjects/test2/src/main/resources/33364.txt.utf-8.pdf";
    private PDF pdf = new PDF(FILE_PATH);

    @Test
    public void getFileContentsAsStringTest() {
        boolean isEmpty = pdf.getFileContentAsString().isEmpty();
        assertFalse(isEmpty);
    }

    @Test
    public void getWordCountTest() {
        int expected = 4998;
        int actual = pdf.getWordCount();
        assertEquals(expected,actual);
    }

    @Test
    public void getSpecificWordCount() {
        int expectedNumber = 0;
        String wordToSearch = "Project";
        int actualNumber = pdf.getSpecificWordCount(wordToSearch);
        assertEquals(expectedNumber,actualNumber);
    }
}
