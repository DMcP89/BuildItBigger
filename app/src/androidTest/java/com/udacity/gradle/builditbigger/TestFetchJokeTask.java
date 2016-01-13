package com.udacity.gradle.builditbigger;

import android.test.InstrumentationTestCase;
import android.util.Log;

import com.davemcpherson.builditbigger.async.FetchJokesTask;

/**
 * Created by dave on 1/12/2016.
 */
public class TestFetchJokeTask extends InstrumentationTestCase {

    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public final void testSuccessfulFetch(){
        new FetchJokesTask(){
            @Override
            protected void onPostExecute(String result) {
                Log.d(this.getClass().getSimpleName(), result);
                assertNotNull(result);
                assertEquals(result.length()>0,true);
                //fail();
            }
        }.execute();
    }
}
