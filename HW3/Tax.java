//Adriana Alva
//CS 2336.0U1
public class Tax {
	public static void main(String[] args) {
		int [][] brackets2001 = new int[][] {{27050, 6550, 136750, 297350},{45200, 109250, 166500, 297350},{22600, 54625, 83250, 148675},{36250, 93650, 151650, 297350}};
		int[][] brackets2009 = new int[][] {{ 8350, 33950, 82250, 171550, 372950 },{ 16700, 67900, 137050, 208850, 372950 },{ 8350, 33950, 68525, 104425, 186475 },{ 11950, 45500, 117450, 190200, 372950 } };
        //single , married jointly/widow, married seperate, head of house
		double[] rates2001 = new double[] { 0.15, 0.275, 0.305, 0.355, 0.391 };
		double[] rates2009 = new double[] { 0.10, 0.15, 0.25, 0.28, 0.33, 0.35 };
        // display titles for tax tables
		String title1 = "Tax Rate ";
		String title2 = "Single";
		String title3 = "Married Joint";
		String title4 = "Married Separate";
		String title5 = "Head of house";
        // Print out tax tables for taxable income from 
		System.out.println("Tax Tables for 2001");
		System.out.print(title1+"        "+title2+"       "+title3+"     "+title4+"     "+title5);
		System.out.println(" ");
		//make tax tables for taxable income from 2001
		//$50,000 -$60,000 with intervals of $1,000
		for (int t = 50000; t <= 60000; t += 1000) {
			System.out.printf("%4d%19.0f%16.0f%16.0f%20.0f\n", t, new Tax(Tax.SINGLE_FILER, brackets2001, rates2001, t).getTax(),
			new Tax(Tax.MARRIED_JOINTLY_OR_QUALIFYING_WIDOW, brackets2001, rates2001, t).getTax(),new Tax(Tax.MARRIED_SEPARATELY, brackets2001, rates2001, t).getTax(),
			new Tax(Tax.HEAD_OF_HOUSEHOLD, brackets2001, rates2001, t).getTax());
		}
		System.out.println("Tax Tables for 2009");
		System.out.print(title1+"        "+title2+"       "+title3+"     "+title4+"     "+title5);
		System.out.println(" ");
		//make tax tables for taxable income from 2009
		//$50,000 -$60,000 with intervals of $1,000
		for (int tt = 50000; tt <= 60000; tt += 1000) {
			System.out.printf("%4d%19.0f%16.0f%16.0f%20.0f\n", tt, new Tax(Tax.SINGLE_FILER, brackets2009, rates2009, tt).getTax(),
			new Tax(Tax.MARRIED_JOINTLY_OR_QUALIFYING_WIDOW, brackets2009, rates2009, tt).getTax(),new Tax(Tax.MARRIED_SEPARATELY, brackets2009, rates2009, tt).getTax(),
			new Tax(Tax.HEAD_OF_HOUSEHOLD, brackets2009, rates2009, tt).getTax());
		}
	}
// 4 -Necessary public static constants to represents the statuses
public static final int SINGLE_FILER = 0;
public static final int MARRIED_JOINTLY_OR_QUALIFYING_WIDOW = 1;
public static final int MARRIED_SEPARATELY = 2;
public static final int HEAD_OF_HOUSEHOLD = 3;

private int filingStatus; //1 of 4 tax filing statuses
private int[][] brackets; //stores the tax brackets for each filing status
private double[] rates;   //stores the tax rates for each bracket
private double taxableIncome; //stores the taxable income
   //no-arg constructor
   public Tax() {
	   this.filingStatus = 0;
   }   

// constructor for Tax(filingStatus,brackets,rates,taxableIncome)
	public Tax(int filingStatus, int[][] brackets, double[] rates, double taxableIncome) {
		this.filingStatus = filingStatus;
		this.brackets = brackets;
		this.rates = rates;
		this.taxableIncome = taxableIncome;

	}
	//provide getter & setter methods for each data field
	//getter for filingStatus
	public int getFilingStatus() {
		return filingStatus;
	}
	//setter for filingStatus
	public void setFilingStatus(int filingStatus) {
		this.filingStatus = filingStatus;
	}
	//getter for brackets
	public int[][] getBrackets() {
		return brackets;
	}
	//setter for brackets
	public void setBrackets(int[][] brackets) {
		this.brackets = brackets;
	}
    // getter for rates
	public double[] getRates() {
		return rates;
	}
    //setter for rates
	public void setRates(double[] rates) {
		this.rates = rates;
	}
    //getter for TaxableIncome
	public double getTaxableIncome() {
		return taxableIncome;
	}
	//setter for TaxableIncome
	public void setTaxableIncome(double taxableIncome) {
		this.taxableIncome = taxableIncome;
	}
    //getTax() method that returns the tax
	public double getTax() {
		double taxes;
		//get tax according to filing status
		if (taxableIncome <= brackets[filingStatus][0])
			return Math.round(taxableIncome * rates[0]);

		taxes = brackets[filingStatus][0] * rates[0];
        double bracksize = brackets[filingStatus].length ;
		// calculate tax from each bracket
        for (int t = 1; t < bracksize; t++) {

			if (taxableIncome > brackets[filingStatus][t]) {
				taxes += (brackets[filingStatus][t] - brackets[filingStatus][t - 1]) * rates[t];
			} 
			else {
				return Math.round(taxes + (taxableIncome - brackets[filingStatus][t - 1]) * rates[t]);
			}
		}
		return Math.round(taxes + (taxableIncome - brackets[filingStatus][4]) * rates[5]);
	}
}
