package testing.testing1;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;

public class Junit {
		
		@Mock
		private Regex rg = new Regex();
		
		@Test
		public void fname() {
			assertTrue(Regex.firstname("Siva"));
		}

		@Test
		public void lname() {
			assertTrue(Regex.lastname("Karthi"));
		}
		
		@Test
		public void pass() {
			assertTrue(Regex.password("asdfghjkS$"));
		}
		
		@Test
		public void email() {
			assertTrue(Regex.email("karthikeyan26@gmail.com"));
		}

}
