import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

class AnnonceAddCommentaire {

	/**
	 * On ajoute un commentaire a une annonce
	 */
	@Test
	void testTrue() {
		Annonce annonce=new Annonce(null,null,null,null);
		Commentaire com=new Commentaire("yo les reubs",new Utilisateur(0, null, null, null, null, null, null));
		boolean test=false;
		annonce.addCommentaire(com);
		for(Commentaire i:annonce.getListeCommentaire()) {
			if(i.equals(com)) {
				test=true;
			}
		}
		assertTrue("Le commentaire a bien ete rajoute a la liste", test);
		
	}
	/**
	 * On ajoute un commentaire qui n'est pas semblable au commentaire avec lequel on le compare
	 */
	@Test
	void testFalse() {
		Annonce annonce=new Annonce(null,null,null,null);
		Commentaire com=new Commentaire("yo les reubs",new Utilisateur(0, null, null, null, null, null, null));
		boolean test=false;
		annonce.addCommentaire(new Commentaire("yo les couz",new Utilisateur(0, null, null, null, null, null, null)));
		for(Commentaire i:annonce.getListeCommentaire()) {
			if(i.equals(com)) {
				test=true;
			}
		}
		assertFalse("Le commentaire a bien ete rajoute a la liste", test);
		
	}

}
