package io.github.retropiler.test;

import org.junit.Test;
import org.junit.runner.RunWith;

import android.annotation.SuppressLint;
import android.support.test.runner.AndroidJUnit4;

import java.util.Optional;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

@RunWith(AndroidJUnit4.class)
@SuppressLint("NewApi")
public class OptionalTest {

    @Test
    public void optional() throws Exception {
        Optional<String> s = Optional.of("foo");

        assertThat(s.get(), is("foo"));
    }
}