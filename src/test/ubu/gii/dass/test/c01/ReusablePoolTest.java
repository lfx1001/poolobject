/**
 * 
 */
package ubu.gii.dass.test.c01;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import ubu.gii.dass.c01.DuplicatedInstanceException;
import ubu.gii.dass.c01.NotFreeInstanceException;
import ubu.gii.dass.c01.Reusable;
import ubu.gii.dass.c01.ReusablePool;

/**
 * @author L.Fernandez
 *
 */
public class ReusablePoolTest {

	static ReusablePool reusablePool = null;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		reusablePool = ReusablePool.getInstance();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link ubu.gii.dass.c01.ReusablePool#getInstance()}.
	 */
	@Test
	public void testGetInstance() {
		assertSame("debe recuperar la misma instancia", reusablePool, ReusablePool.getInstance());

	}

	/**
	 * Test method for {@link ubu.gii.dass.c01.ReusablePool#acquireReusable()}.
	 */
	@Test
	public void testAcquireReusable() {
		Reusable firstReusable = null, secondReusable = null;
		try {
			firstReusable = reusablePool.acquireReusable();
			secondReusable = reusablePool.acquireReusable();
			reusablePool.acquireReusable();
			fail("debe lanzar una excepcion cuando el pool está vacío");
		} catch (NotFreeInstanceException e) {
			assertNotNull("debe recuperar una instancia de objeto Reusable", firstReusable);
			assertNotNull("debe recuperar una instancia de objeto Reusable", secondReusable);
			// devolvemos al pool los dos objetos
			try {
				reusablePool.releaseReusable(firstReusable);
				reusablePool.releaseReusable(secondReusable);
			} catch (DuplicatedInstanceException e1) {
				fail("debe permitir devolver la instancia de Reusable");
			}

		}
	}

	/**
	 * Test method for
	 * {@link ubu.gii.dass.c01.ReusablePool#releaseReusable(ubu.gii.dass.c01.Reusable)}.
	 */
	@Test
	public void testReleaseReusable() {
		fail("Not yet implemented");
	}

}
