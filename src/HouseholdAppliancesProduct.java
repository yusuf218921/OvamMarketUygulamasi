public class HouseholdAppliancesProduct extends BaseProduct{
    HouseholdAppliancesProduct() {
        setCatagoryId(3);
    }

    HouseholdAppliancesProduct(int price, String productCompany, String productName) {
        setCatagoryId(3);
        this.price = price;
        this.productCompany = productCompany;
        this.productName = productName;
    }
}
