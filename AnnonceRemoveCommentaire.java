import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

class AnnonceRemoveCommentaire {

	/**
	 * On ajoute une annonce et on la retire
	 */
	@Test
	void testTrue() {
		Annonce annonce=new Annonce(null,null,null,null);
		Commentaire com=new Commentaire("coucou",new Utilisateur(0, null, null, null, null, null, null));
		boolean test=true;
		annonce.addCommentaire(com);
		annonce.removeCommentaire(com);
		for(Commentaire i:annonce.getListeCommentaire()) {
			if(i.equals(com)) {
				test=false;
			}
		}
		assertTrue("Le commentaire a bien ete retire de la liste", test);
		
	}
	/**
	 * On ajoute une annonce sans la retirer apres
	 */
	@Test
	void testFalse() {
		Annonce annonce=new Annonce(null,null,null,null);
		Commentaire com=new Commentaire("coucou",new Utilisateur(0, null, null, null, null, null, null));
		boolean test=false;
		annonce.addCommentaire(com);
		for(Commentaire i:annonce.getListeCommentaire()) {
			if(i.equals(com)) {
				test=false;
			}
		}
		assertFalse("Le commentaire a bien ete retire de la liste", test);
		
	}

}