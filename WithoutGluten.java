
public class WithoutGluten extends PlatDecorator{

	public WithoutGluten(Plat p) {
		super(p);
	}

	@Override
	public void getIngredients() {
		super.getIngredients();
		Logger logger = Logger.getInstance();
		logger.info(", sans gluten");
	}


}
