package rigo.works.playground;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import rigo.works.playground.scores.ScoreCollection;

public class ScoreCollectionTest {

    @Test
    public void test() {
    }

    @Test
    public void answersArithmeticMeanOfTwoNumbers(){
        ScoreCollection collection = new ScoreCollection();
        collection.add( () -> 5 );
        collection.add( () -> 7 );
        int actualResult = collection.arithmeticMean();
        assertThat(actualResult, equalTo(6));
    }
}
