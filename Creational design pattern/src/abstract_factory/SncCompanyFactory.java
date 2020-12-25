package abstract_factory;

public class SncCompanyFactory implements CompanyFactory {

	@Override
	public HigherManagement createHigherManagement() {
		return new SncHigherManagement();
	}

	@Override
	public MiddleManagement createMiddleManagement() {
		return new SncMiddleManagement();
	}

	@Override
	public LowerManagement createLowerManagement() {
		return new SncLowerManagement();
	}
}
