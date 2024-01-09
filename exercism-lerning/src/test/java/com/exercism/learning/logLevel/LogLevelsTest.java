package com.exercism.learning.logLevel;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class LogLevelsTest {
    @Test
    void error_message() {
        assertEquals("Stack overflow", LogLevels.message("[ERROR]: Stack overflow"));
    }

    @Test
    void warning_message() {
        assertEquals("Disk almost full", LogLevels.message("[WARNING]: Disk almost full"));
    }

    @Test
    void info_message() {
        assertEquals("File moved", LogLevels.message("[INFO]: File moved"));
    }

    @Test
    void message_with_leading_and_trailing_white_space() {
        assertEquals("Timezone not set", LogLevels.message("[WARNING]:   \tTimezone not set  \r\n"));
    }

    @Test
    void error_log_level() {
        assertEquals("error", LogLevels.logLevel("[ERROR]: Disk full"));
    }

    @Test
    void warning_log_level() {
        assertEquals("warning", LogLevels.logLevel("[WARNING]: Unsafe password"));
    }

    @Test
    void info_log_level() {
        assertEquals("info", LogLevels.logLevel("[INFO]: Timezone changed"));
    }

    @Test
    void error_reformat() {
        assertEquals("Segmentation fault (error)", LogLevels.reformat("[ERROR]: Segmentation fault"));
    }

    @Test
    void warning_reformat() {
        assertEquals("Decreased performance (warning)", LogLevels.reformat("[WARNING]: Decreased performance"));
    }

    @Test
    void info_reformat() {
        assertEquals("Disk defragmented (info)", LogLevels.reformat("[INFO]: Disk defragmented"));
    }

    @Test
    void reformat_with_leading_and_trailing_white_space() {
        assertEquals("Corrupt disk (error)", LogLevels.reformat("[ERROR]: \t Corrupt disk\t \t \r\n"));
    }
}