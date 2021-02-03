package com.MoodAnalyser;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest
{
	@Test
	public void print_Welcome_Message() {
		MoodAnalyser mood = new MoodAnalyser();
		mood.PrintWelcomeMessage();
	}
	@Test
	public void Given_Message_When_Sad_Should_Return_Sad() {
		MoodAnalyser moodAnalyser= new MoodAnalyser();
		String mood = moodAnalyser.AnalyseMood("This is a Sad Message");
		Assert.assertEquals("SAD", mood);
	}

	@Test
	public void Given_Message_When_Happy_Should_Return_Happy() {
		MoodAnalyser moodAnalyser= new MoodAnalyser();
		String mood = moodAnalyser.AnalyseMood("This is a Happy Message");
		Assert.assertEquals("HAPPY", mood);
	}

	@Test
	public void Given_Message_When_Null_Should_Return_Happy() {
		MoodAnalyser moodAnalyser= new MoodAnalyser();
		String mood = moodAnalyser.AnalyseMood(null);
		Assert.assertEquals("HAPPY", mood);
	}
}
