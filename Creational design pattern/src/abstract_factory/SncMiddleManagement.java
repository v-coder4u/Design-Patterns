package abstract_factory;

public class SncMiddleManagement implements MiddleManagement {

	static final String DESCRIPTION = "This is the salary not credit middle management employees!";

	@Override
	public String getDescription() {
		return DESCRIPTION;
	}
}
