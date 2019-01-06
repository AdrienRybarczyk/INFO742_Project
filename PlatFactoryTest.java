import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PlatFactoryTest {
	protected PlatFactory platFactory;

	@BeforeEach
	void setUp() throws Exception {
		platFactory = new PlatFactory();
	}

	@Test
	void testCreatePlat() {
		String type = "";
		assertFalse("Erreur pas de type spécifié", platFactory.createPlat(type) instanceof Plat);
		type = "Francais";
		assertFalse("Mauvais type spécifié", platFactory.createPlat(type) instanceof Plat);
		type = "Americain";
		assertTrue("Plat Americain", platFactory.createPlat(type) instanceof Americain);
		type = "Italien";
		assertTrue("Plat Italien", platFactory.createPlat(type) instanceof Italien);
		type = "Vietnamien";
		assertTrue("Plat Vietnamien", platFactory.createPlat(type) instanceof Vietnamien);
	}
}
