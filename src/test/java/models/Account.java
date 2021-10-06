package models;

//POJO (plain old Java object)
public class Account<accountName, phone> {

    String accountName;
    String phone;
    String fax;
    String webSite;
    String option;
    String option1;
    String employees;
    String annualRevenue;
    String description;
    String billingStreet;
    String billingCity;
    String billingStateProvince;
    String billingZipPostalCode;
    String billingCountry;
    String shippingStreet;
    String shippingCity;
    String shippingStateProvince;
    String shippingZipPostalCode;
    String shippingCountry;

    public Account(String accountName, String phone, String fax, String webSite, String option, String option1, String employees,
                   String annualRevenue, String description, String billingStreet, String billingCity, String billingStateProvince,
                   String billingZipPostalCode, String billingCountry, String shippingStreet, String shippingCity, String shippingStateProvince,
                   String shippingZipPostalCode, String shippingCountry) {
        this.accountName = accountName;
        this.phone = phone;
        this.fax = fax;
        this.webSite = webSite;
        this.option = option;
        this.option1 = option1;
        this.employees = employees;
        this.annualRevenue = annualRevenue;
        this.description = description;
        this.billingStreet = billingStreet;
        this.billingCity = billingCity;
        this.billingStateProvince = billingStateProvince;
        this.billingZipPostalCode = billingZipPostalCode;
        this.billingCountry = billingCountry;
        this.shippingStreet = shippingStreet;
        this.shippingCity = shippingCity;
        this.shippingStateProvince = shippingStateProvince;
        this.shippingZipPostalCode = shippingZipPostalCode;
        this.shippingCountry = shippingCountry;
    }

    public Account(String accountName) {
        this.accountName = accountName;
    }

    public Account(String accountName, String phone, String fax, String webSite, String option, String option1, String employees,
                   String annualRevenue, String description, String billingStreet, String billingCity, String billingStateProvince,
                   String billingZipPostalCode, String billingCountry) {
        this.accountName = accountName;
        this.phone = phone;
        this.fax = fax;
        this.webSite = webSite;
        this.option = option;
        this.option1 = option1;
        this.employees = employees;
        this.annualRevenue = annualRevenue;
        this.description = description;
        this.billingStreet = billingStreet;
        this.billingCity = billingCity;
        this.billingStateProvince = billingStateProvince;
        this.billingZipPostalCode = billingZipPostalCode;
        this.billingCountry = billingCountry;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getWebSite() {
        return webSite;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }

    public String getOption1() {
        return option1;
    }

    public void setOption1(String option1) {
        this.option1 = option1;
    }

    public String getEmployees() {
        return employees;
    }

    public void setEmployees(String employees) {
        this.employees = employees;
    }

    public String getAnnualRevenue() {
        return annualRevenue;
    }

    public void setAnnualRevenue(String annualRevenue) {
        this.annualRevenue = annualRevenue;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBillingStreet() {
        return billingStreet;
    }

    public void setBillingStreet(String billingStreet) {
        this.billingStreet = billingStreet;
    }

    public String getBillingCity() {
        return billingCity;
    }

    public void setBillingCity(String billingCity) {
        this.billingCity = billingCity;
    }

    public String getBillingStateProvince() {
        return billingStateProvince;
    }

    public void setBillingStateProvince(String billingStateProvince) {
        this.billingStateProvince = billingStateProvince;
    }

    public String getBillingZipPostalCode() {
        return billingZipPostalCode;
    }

    public void setBillingZipPostalCode(String billingZipPostalCode) {
        this.billingZipPostalCode = billingZipPostalCode;
    }

    public String getBillingCountry() {
        return billingCountry;
    }

    public void setBillingCountry(String billingCountry) {
        this.billingCountry = billingCountry;
    }

    public String getShippingStreet() {
        return shippingStreet;
    }

    public void setShippingStreet(String shippingStreet) {
        this.shippingStreet = shippingStreet;
    }

    public String getShippingCity() {
        return shippingCity;
    }

    public void setShippingCity(String shippingCity) {
        this.shippingCity = shippingCity;
    }

    public String getShippingStateProvince() {
        return shippingStateProvince;
    }

    public void setShippingStateProvince(String shippingStateProvince) {
        this.shippingStateProvince = shippingStateProvince;
    }

    public String getShippingZipPostalCode() {
        return shippingZipPostalCode;
    }

    public void setShippingZipPostalCode(String shippingZipPostalCode) {
        this.shippingZipPostalCode = shippingZipPostalCode;
    }

    public String getShippingCountry() {
        return shippingCountry;
    }

    public void setShippingCountry(String shippingCountry) {
        this.shippingCountry = shippingCountry;
    }
}
