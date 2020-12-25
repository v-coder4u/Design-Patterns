package abstract_factory;

public class SncHigherManagement implements HigherManagement {

	static final String DESCRIPTION = "This is the salary not credit higher management employees!";

	@Override
	public String getDescription() {
		return DESCRIPTION;
	}
}
