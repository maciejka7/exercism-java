package com.exercism.learning.logLevel;

class FormatHelper {

    private String logLine;

    public FormatHelper(String longline) {
        this.logLine = longline;
    }

    public String getMessage() {
        return this.logLine.split(":")[1].trim().strip();
    }

    public String getLogLevel() {
        return this.logLine
                    .split(":")[0]
                    .trim()
                    .strip()
                    .toLowerCase()
                    .replace("[", "")
                    .replace("]", "");
    }

    
    public String getReformat() {
        return this.getMessage() + " " + this.getReformatLogLevel(); 
    } 
    
    private String getReformatLogLevel() {
        return this.logLine
                    .split(":")[0]
                    .trim()
                    .strip()
                    .toLowerCase()
                    .replace("[", "(")
                    .replace("]", ")");
    }
}

public class LogLevels {

    public static String message(String logLine) {

        FormatHelper formatHelper = new FormatHelper(logLine);
        return formatHelper.getMessage();
    }

    public static String logLevel(String logLine) {
        FormatHelper formatHelper = new FormatHelper(logLine);
        return formatHelper.getLogLevel();
    }

    public static String reformat(String logLine) {
        FormatHelper formatHelper = new FormatHelper(logLine);
        return formatHelper.getReformat();
     }
}
