package testing.testing1;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;

public class Junit {
		
		@Mock
		private Regex rg = new Regex();
		/**
		 * testing first name
		 */
		@Test
		public void fname() {
			assertTrue(Regex.firstname("Siva"));
		}
		/**
		 * testing last name
		 */
		@Test
		public void lname() {
			assertTrue(Regex.lastname("Karthi"));
		}
		/**
		 * testing password
		 */
		@Test
		public void pass() {
			assertTrue(Regex.password("asdfghjkS$"));
		}
		/**
		 * testing email
		 */
		@Test
		public void email() {
			assertTrue(Regex.email("karthikeyan26@gmail.com"));
		}

}
