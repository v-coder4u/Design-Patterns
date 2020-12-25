package abstract_factory;

public class Company {

	private HigherManagement higherManagement;
	private MiddleManagement middleManagement;
	private LowerManagement lowerManagement;

	public HigherManagement getHigherManagement() {
		return higherManagement;
	}

	public void setHigherManagement(HigherManagement higherManagement) {
		this.higherManagement = higherManagement;
	}

	public MiddleManagement getMiddleManagement() {
		return middleManagement;
	}

	public void setMiddleManagement(MiddleManagement middleManagement) {
		this.middleManagement = middleManagement;
	}

	public LowerManagement getLowerManagement() {
		return lowerManagement;
	}

	public void setLowerManagement(LowerManagement lowerManagement) {
		this.lowerManagement = lowerManagement;
	}

	/**
	 * The factory of Company factories.
	 */
	public static class FactoryMaker {
		/**
		 * Enumeration for the different types of Employees.
		 */
		public enum CompanyEmployeeType {
			SC, SNC
		}

		/**
		 * The factory method to create CompanyFactory concrete objects.
		 */
		public static CompanyFactory makeFactory(CompanyEmployeeType type) {
			switch (type) {
			case SC:
				return new ScCompanyFactory();
			case SNC:
				return new SncCompanyFactory();
			default:
				throw new IllegalArgumentException("Company Employee Type not supported.");
			}
		}
	}
}
