package abstract_factory;

public interface CompanyFactory {

	HigherManagement createHigherManagement();

	MiddleManagement createMiddleManagement();

	LowerManagement createLowerManagement();
}
