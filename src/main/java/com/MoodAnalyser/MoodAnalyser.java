package com.MoodAnalyser;

public class MoodAnalyser {

	public void PrintWelcomeMessage() {
		System.out.println("Welcome to the Mood Analyser Problem");
	}

	public String AnalyseMood(String message) {
		try{
			if(message.contains("Sad"))
				return "SAD";
			else
				return "HAPPY";
		} catch(Exception e) {
			return "HAPPY";
		}
	}

}
