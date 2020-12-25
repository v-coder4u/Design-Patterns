package abstract_factory;

public class AbstractFactoryMain implements Runnable {

	private final Company company = new Company();

	private Company getCompany() {
		return company;
	}

	public static void main(String[] args) {
		AbstractFactoryMain abstractFactoryMain = new AbstractFactoryMain();
		abstractFactoryMain.run();
	}

	@Override
	public void run() {
		System.out.println("Salary Credit Company Employee! ");
		createCompany(Company.FactoryMaker.CompanyEmployeeType.SC);
		System.out.println(company.getHigherManagement().getDescription());
		System.out.println(company.getMiddleManagement().getDescription());
		System.out.println(company.getLowerManagement().getDescription());

		System.out.println("Salary Not Credit Company Employee! ");
		createCompany(Company.FactoryMaker.CompanyEmployeeType.SNC);
		System.out.println(company.getHigherManagement().getDescription());
		System.out.println(company.getMiddleManagement().getDescription());
		System.out.println(company.getLowerManagement().getDescription());

	}

	public void createCompany(final Company.FactoryMaker.CompanyEmployeeType type) {
		final CompanyFactory companyFactory = Company.FactoryMaker.makeFactory(type);
		company.setHigherManagement(companyFactory.createHigherManagement());
		company.setMiddleManagement(companyFactory.createMiddleManagement());
		company.setLowerManagement(companyFactory.createLowerManagement());
	}
}
