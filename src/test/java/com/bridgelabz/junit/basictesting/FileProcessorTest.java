package com.bridgelabz.junit.basictesting;

import com.bridgelabz.junit.basic.FileProcessor;
import org.junit.jupiter.api.*;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;


public class FileProcessorTest {
    private static final String TEST_FILE = "testfile.txt";
    private FileProcessor fileProcessor;


    @BeforeEach
    void setUp() {
        fileProcessor = new FileProcessor();
    }

    @AfterEach
    void tearDown() {
        File file = new File(TEST_FILE);
        if (file.exists()) {
            file.delete();
        }
    }

    @Test
    void testWriteAndReadFile() throws IOException {
        String content = "Hello, this is a test!";
        fileProcessor.writeToFile(TEST_FILE, content);

        String readContent = fileProcessor.readFromFile(TEST_FILE);
        assertEquals(content, readContent, "File content should match written content");
    }

    @Test
    void testFileExistsAfterWrite() throws IOException {
        fileProcessor.writeToFile(TEST_FILE, "Test content");

        File file = new File(TEST_FILE);
        assertTrue(file.exists(), "File should exist after writing");
    }

    @Test
    void testReadNonExistentFileThrowsIOException() {
        assertThrows(IOException.class, () -> fileProcessor.readFromFile("nonexistent.txt"),
                "Reading a non-existent file should throw IOException");
    }

}
