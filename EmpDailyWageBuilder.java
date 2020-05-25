public class EmpWageBuilderFor {

// constants

         public static final int IS_PART_TIME = 1;
         public static final int IS_FULL_TIME = 2;
        public static final int EMP_WAGE_PER_HOUR = 20;
			public static final int NUM_WORKING_DAYS = 2;

	public static void main(String args[]) {
			// constants

		   
			int empHrs = 0;
			int empWage = 0;
			int dailyEmpWage=0;
			// computation

				for (int day=0; day<NUM_WORKING_DAYS; day++) {
					int empCheck =(int) Math.floor(Math.random() * 10) % 3;

			  	switch (empCheck) {
				case IS_FULL_TIME:
					empHrs = 8;
					break;
				case IS_PART_TIME:
					empHrs = 4;
					break; 
			  default:
					empHrs = 0;
					break;
			}	
			empWage = empHrs * EMP_WAGE_PER_HOUR;
			dailyEmpWage += empWage;
            System.out.println(" Emp Wage:" + empWage);
			}

							System.out.println("Daily EMP WAGE: " + dailyEmpWage);
		}
}





