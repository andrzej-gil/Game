package game;

import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.Test;

class GameTest {

@Test
void testName() throws Exception {
	//given
	String standortTitel = "Eingang Höllgrotte in Baar";
	String standortHauptbeschreibung = "Du stehst vor der Höllgrotte in Baar";

	//when
	String gameOut = 
			new Game().start();
	
	
	//then
	assertThat(gameOut, allOf(containsString(standortTitel), containsString(standortHauptbeschreibung)));
	
}
}
