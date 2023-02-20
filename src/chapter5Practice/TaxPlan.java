package chapter5Practice;
/*5.32 (Tax Plan Alternatives; The “FairTax”) There are many proposals to make taxation fairer.
Check out the FairTax initiative in the United States at http://www.fairtax.org. Research how
the proposed FairTax works. One suggestion is to eliminate income taxes and most other taxes in
favor of a 23% consumption tax on all products and services that you buy. Some FairTax opponents
question the 23% figure and say that because of the way the tax is calculated, it would be more
accurate to say the rate is 30%—check this carefully. Write a program that prompts the user to enter
expenses in various expense categories they have (e.g., housing, food, clothing, transportation, education,
 health care, vacations), then prints the estimated FairTax that person would p*/

public class TaxPlan {

    private int housingExpenses;
    private int foodExpenses;
    private int clothingExpenses;
    private int transportationExpenses;
    private int educationExpenses;
    private int healthCareExpenses;
    private int vacationExpenses;

    public static double thirtyPercent = 0.30;

    public TaxPlan(int housingExpenses,int foodExpenses,int clothingExpenses,int transportationExpenses,int educationExpenses,int healthCareExpenses,int vacationExpenses){
        this.housingExpenses = housingExpenses;
        this.clothingExpenses = clothingExpenses;
        this.transportationExpenses = transportationExpenses;
        this.educationExpenses = educationExpenses;
        this.healthCareExpenses = healthCareExpenses;
        this.vacationExpenses = vacationExpenses;
    }

    public TaxPlan() {

    }

    public int getHousingExpenses() {
        return housingExpenses;
    }

    public void setHousingExpenses(int housingExpenses) {
        this.housingExpenses = housingExpenses;
    }

    public int getFoodExpenses() {
        return foodExpenses;
    }

    public void setFoodExpenses(int foodExpenses) {
        this.foodExpenses = foodExpenses;
    }

    public int getClothingExpenses() {
        return clothingExpenses;
    }

    public void setClothingExpenses(int clothingExpenses) {
        this.clothingExpenses = clothingExpenses;
    }

    public int getTransportationExpenses() {
        return transportationExpenses;
    }

    public void setTransportationExpenses(int transportationExpenses) {
        this.transportationExpenses = transportationExpenses;
    }

    public int getEducationExpenses() {
        return educationExpenses;
    }

    public void setEducationExpenses(int educationExpenses) {
        this.educationExpenses = educationExpenses;
    }

    public int getHealthCareExpenses() {
        return healthCareExpenses;
    }

    public void setHealthCareExpenses(int healthCareExpenses) {
        this.healthCareExpenses = healthCareExpenses;
    }

    public int getVacationExpenses() {
        return vacationExpenses;
    }

    public void setVacationExpenses(int vacationExpenses) {
        this.vacationExpenses = vacationExpenses;
    }

    public int calculateHousingTaxRate(int housingExpenses){
          int minusThirtyPercent = (int) (housingExpenses * thirtyPercent);
        return housingExpenses - minusThirtyPercent;
    }
    public int calculateFoodTaxRate(int foodExpenses){
        int minusThirtyPercent = (int) (foodExpenses * thirtyPercent);
        return foodExpenses - minusThirtyPercent;
    }
    public int calculateClothingTaxRate(int clothingExpenses){
        int minusThirtyPercent = (int) (clothingExpenses * thirtyPercent);
        return clothingExpenses - minusThirtyPercent;
    }
    public int calculateTransportationTaxRate(int transportationExpenses){
        int minusThirtyPercent = (int) (transportationExpenses * thirtyPercent);
        return transportationExpenses - minusThirtyPercent;
    }
    public int calculateEducationTaxRate(int educationExpenses){
        int minusThirtyPercent = (int) (educationExpenses * thirtyPercent);
        return educationExpenses - minusThirtyPercent;
    }
    public int calculateHealthCareTaxRate(int healthCareExpenses){
        int minusThirtyPercent = (int) (healthCareExpenses * thirtyPercent);
        return healthCareExpenses - minusThirtyPercent;
    }
    public int calculateVacationTaxRate(int vacationExpenses){
        int minusThirtyPercent = (int) (vacationExpenses * thirtyPercent);
        return vacationExpenses - minusThirtyPercent;
    }

}
