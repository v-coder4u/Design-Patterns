package abstract_factory;

public class ScMiddleManagement implements MiddleManagement {

	static final String DESCRIPTION = "This is the salary credit Middle management employees!";

	@Override
	public String getDescription() {
		return DESCRIPTION;
	}
}
