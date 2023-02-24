package com.github.maeeen.bootcamp;

import android.content.Intent;

import androidx.test.core.app.ActivityScenario;
import androidx.test.core.app.ApplicationProvider;
import androidx.test.espresso.Espresso;
import androidx.test.espresso.ViewInteraction;
import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class GreetingActivityTest {

    @Test
    public void textIsCorrect() {
        Intent intent = new Intent(ApplicationProvider.getApplicationContext(), GreetActivity.class);
        intent.putExtra("name", "dsq");
        try (ActivityScenario scen = ActivityScenario.launch(intent)) {
            ViewInteraction interac = Espresso.onView(ViewMatchers.withId(R.id.hiText));
            interac.check(ViewAssertions.matches(ViewMatchers.withText("Sheesh my dsq")));
        }
    }
}
