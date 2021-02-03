package com.MoodAnalyser;

public class MoodAnalyser {

	public void PrintWelcomeMessage() {
		System.out.println("Welcome to the Mood Analyser Problem");
	}

	public String AnalyseMood(String message) throws MoodAnalysisException {
		try {
			if(message.length() == 0)
				throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_EMPTY,"Please Enter Proper Non-Empty Mood");
			if(message.contains("Sad"))
				return "SAD";
			else
				return "HAPPY";
		} catch(NullPointerException e) {
			throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_NULL,"Please Enter the Proper Mood");
		} catch(IllegalArgumentException e) {
			throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_NULL,"Please Enter the Proper Mood");
		}
	}

}
