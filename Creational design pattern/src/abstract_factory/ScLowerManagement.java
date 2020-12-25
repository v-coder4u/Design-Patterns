package abstract_factory;

public class ScLowerManagement implements LowerManagement {

	static final String DESCRIPTION = "This is the salary credit lower management employees!";

	@Override
	public String getDescription() {
		return DESCRIPTION;
	}
}
