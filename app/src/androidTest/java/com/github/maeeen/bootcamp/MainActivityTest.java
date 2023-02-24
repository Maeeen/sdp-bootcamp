package com.github.maeeen.bootcamp;

import static androidx.test.espresso.intent.Intents.intended;

import static org.hamcrest.Matchers.allOf;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.ViewInteraction;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.intent.Intents;
import androidx.test.espresso.intent.matcher.IntentMatchers;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityScenarioRule<MainActivity> testRule = new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void clickingOnButtonTriggersIntent() {
        Intents.init();

        ViewInteraction interac = Espresso.onView(ViewMatchers.withId(R.id.button));
        interac.perform(ViewActions.click());
        intended(allOf(IntentMatchers.hasComponent(GreetActivity.class.getName()))); // too lazy to actually do everything

        Intents.release();
    }
}
