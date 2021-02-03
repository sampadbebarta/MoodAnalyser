package com.MoodAnalyser;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.MoodAnalyser.MoodAnalysisException.ExceptionType;

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
		String mood = null;
		try {
			mood = moodAnalyser.AnalyseMood("This is a Sad Message");
			Assert.assertEquals("SAD", mood);
		} catch (MoodAnalysisException e) {
			e.printStackTrace();
		}

	}

	@Test
	public void Given_Message_When_Happy_Should_Return_Happy() {
		MoodAnalyser moodAnalyser= new MoodAnalyser();
		String mood = null;
		try {
			mood = moodAnalyser.AnalyseMood("This is a Happy Message");
			Assert.assertEquals("HAPPY", mood);
		} catch (MoodAnalysisException e) {
			e.printStackTrace();
		}

	}

	@Test
	public void Given_Message_When_Null_Should_throw_Exception() {
		MoodAnalyser moodAnalyser= new MoodAnalyser();
		String mood = null;
		try {
			mood = moodAnalyser.AnalyseMood(null);
		} catch (MoodAnalysisException e) {
			Assert.assertEquals(ExceptionType.ENTERED_NULL, e.type );
			Assert.assertEquals("Please Enter the Proper Mood", e.getMessage());
		}

	}

	@Test
	public void Given_Message_When_Empty_Should_throw_Exception() {
		MoodAnalyser moodAnalyser= new MoodAnalyser();
		String mood = null;
		try {
			mood = moodAnalyser.AnalyseMood("");
		} catch (MoodAnalysisException e) {
			Assert.assertEquals(ExceptionType.ENTERED_EMPTY, e.type );
			Assert.assertEquals("Please Enter Proper Non-Empty Mood", e.getMessage());
		}

	}




}
