package abstract_factory;

public class ScHigherManagement implements HigherManagement {

	static final String DESCRIPTION = "This is the salary credit higher management employees!";

	@Override
	public String getDescription() {
		return DESCRIPTION;
	}
}
