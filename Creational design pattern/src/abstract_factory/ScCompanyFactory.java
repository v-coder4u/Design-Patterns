package abstract_factory;

public class ScCompanyFactory implements CompanyFactory {

	@Override
	public HigherManagement createHigherManagement() {
		return new ScHigherManagement();
	}

	@Override
	public MiddleManagement createMiddleManagement() {
		return new ScMiddleManagement();
	}

	@Override
	public LowerManagement createLowerManagement() {
		return new ScLowerManagement();
	}
}
