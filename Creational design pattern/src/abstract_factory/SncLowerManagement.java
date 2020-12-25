package abstract_factory;

public class SncLowerManagement implements LowerManagement {

	static final String DESCRIPTION = "This is the salary not credit lower management employees!";

	@Override
	public String getDescription() {
		return DESCRIPTION;
	}
}
