package com.kitchen.mel.ingredients;

import java.util.Date;

public class Recipe {

	int ingredientId;
	String ingredientFullName;
	String ingredientPreferedName;
	
	int ingredientTypeId;
	String ingredientTypeTxt; 

	int ingredientPreferedPurchaseBrandId;
	String ingredientPreferedPurchaseBrandTxt;
	int ingredientLastPurchaseBrandId;
	String ingredientLastPurchaseBrandTxt;
	int ingredientCheapestPurchaseBrandId;
	String ingredientCheapestPurchaseBrandTxt;

	int ingredientPresentationId;
	int ingredientPresentationTxt;

	boolean isIngredientSpicy;
	int ingredientSpicynessLvlId;
	int ingredientSpicynessLvlTxt;

	boolean isIngredientOrganic;

	double ingredientPurchasingUnitAmount;
	int ingredientPurchasingUnitTypeId;
	String ingredientPurchasingUnitTypeTxt;
	double ingredientPurchasingUnitPrice;
	
	int IngredientQualityRatingId;
	String IngredientQualityRatingTxt;
	
	int lastPurchaseLocationId;
	String lastPurchaseLocationTxt;
	int preferedPurchasingLocationId;
	String preferedPurchasingLocationTxt;
	int cheapestPurchasingLocationId;
	String cheapestPurchasingLocationTxt;
	
	double averageIngredientCost;
	double highIngredientCostRange;
	double lowIngredientCostRange;
	
	double ingredientLastPurchasedCost;	
	Date ingredientLastPurchaseDate;
	int ingredientLastPurchaseLocationId;
	String ingredientLastPurchaseLocationTxt;
	 	
	int ingredientRatingId;
	String ingredientRatingTxt;

	Double ingredientShelfLifeUnit;
	int ingredientShelfLifeTypeId;
	String ingredientShelfLifeTypeIdTxt;
	Date ingredientExpirationDate;
	
	public int getIngredientId() {
		return ingredientId;
	}
	public void setIngredientId(int ingredientId) {
		this.ingredientId = ingredientId;
	}
	public String getIngredientFullName() {
		return ingredientFullName;
	}
	public void setIngredientFullName(String ingredientFullName) {
		this.ingredientFullName = ingredientFullName;
	}
	public String getIngredientPreferedName() {
		return ingredientPreferedName;
	}
	public void setIngredientPreferedName(String ingredientPreferedName) {
		this.ingredientPreferedName = ingredientPreferedName;
	}
	public int getIngredientTypeId() {
		return ingredientTypeId;
	}
	public void setIngredientTypeId(int ingredientTypeId) {
		this.ingredientTypeId = ingredientTypeId;
	}
	public String getIngredientTypeTxt() {
		return ingredientTypeTxt;
	}
	public void setIngredientTypeTxt(String ingredientTypeTxt) {
		this.ingredientTypeTxt = ingredientTypeTxt;
	}
	public int getIngredientPreferedPurchaseBrandId() {
		return ingredientPreferedPurchaseBrandId;
	}
	public void setIngredientPreferedPurchaseBrandId(int ingredientPreferedPurchaseBrandId) {
		this.ingredientPreferedPurchaseBrandId = ingredientPreferedPurchaseBrandId;
	}
	public String getIngredientPreferedPurchaseBrandTxt() {
		return ingredientPreferedPurchaseBrandTxt;
	}
	public void setIngredientPreferedPurchaseBrandTxt(String ingredientPreferedPurchaseBrandTxt) {
		this.ingredientPreferedPurchaseBrandTxt = ingredientPreferedPurchaseBrandTxt;
	}
	public int getIngredientLastPurchaseBrandId() {
		return ingredientLastPurchaseBrandId;
	}
	public void setIngredientLastPurchaseBrandId(int ingredientLastPurchaseBrandId) {
		this.ingredientLastPurchaseBrandId = ingredientLastPurchaseBrandId;
	}
	public String getIngredientLastPurchaseBrandTxt() {
		return ingredientLastPurchaseBrandTxt;
	}
	public void setIngredientLastPurchaseBrandTxt(String ingredientLastPurchaseBrandTxt) {
		this.ingredientLastPurchaseBrandTxt = ingredientLastPurchaseBrandTxt;
	}
	public int getIngredientCheapestPurchaseBrandId() {
		return ingredientCheapestPurchaseBrandId;
	}
	public void setIngredientCheapestPurchaseBrandId(int ingredientCheapestPurchaseBrandId) {
		this.ingredientCheapestPurchaseBrandId = ingredientCheapestPurchaseBrandId;
	}
	public String getIngredientCheapestPurchaseBrandTxt() {
		return ingredientCheapestPurchaseBrandTxt;
	}
	public void setIngredientCheapestPurchaseBrandTxt(String ingredientCheapestPurchaseBrandTxt) {
		this.ingredientCheapestPurchaseBrandTxt = ingredientCheapestPurchaseBrandTxt;
	}
	public int getIngredientPresentationId() {
		return ingredientPresentationId;
	}
	public void setIngredientPresentationId(int ingredientPresentationId) {
		this.ingredientPresentationId = ingredientPresentationId;
	}
	public int getIngredientPresentationTxt() {
		return ingredientPresentationTxt;
	}
	public void setIngredientPresentationTxt(int ingredientPresentationTxt) {
		this.ingredientPresentationTxt = ingredientPresentationTxt;
	}
	public boolean isIngredientSpicy() {
		return isIngredientSpicy;
	}
	public void setIngredientSpicy(boolean isIngredientSpicy) {
		this.isIngredientSpicy = isIngredientSpicy;
	}
	public int getIngredientSpicynessLvlId() {
		return ingredientSpicynessLvlId;
	}
	public void setIngredientSpicynessLvlId(int ingredientSpicynessLvlId) {
		this.ingredientSpicynessLvlId = ingredientSpicynessLvlId;
	}
	public int getIngredientSpicynessLvlTxt() {
		return ingredientSpicynessLvlTxt;
	}
	public void setIngredientSpicynessLvlTxt(int ingredientSpicynessLvlTxt) {
		this.ingredientSpicynessLvlTxt = ingredientSpicynessLvlTxt;
	}
	public boolean isIngredientOrganic() {
		return isIngredientOrganic;
	}
	public void setIngredientOrganic(boolean isIngredientOrganic) {
		this.isIngredientOrganic = isIngredientOrganic;
	}
	public double getIngredientPurchasingUnitAmount() {
		return ingredientPurchasingUnitAmount;
	}
	public void setIngredientPurchasingUnitAmount(double ingredientPurchasingUnitAmount) {
		this.ingredientPurchasingUnitAmount = ingredientPurchasingUnitAmount;
	}
	public int getIngredientPurchasingUnitTypeId() {
		return ingredientPurchasingUnitTypeId;
	}
	public void setIngredientPurchasingUnitTypeId(int ingredientPurchasingUnitTypeId) {
		this.ingredientPurchasingUnitTypeId = ingredientPurchasingUnitTypeId;
	}
	public String getIngredientPurchasingUnitTypeTxt() {
		return ingredientPurchasingUnitTypeTxt;
	}
	public void setIngredientPurchasingUnitTypeTxt(String ingredientPurchasingUnitTypeTxt) {
		this.ingredientPurchasingUnitTypeTxt = ingredientPurchasingUnitTypeTxt;
	}
	public double getIngredientPurchasingUnitPrice() {
		return ingredientPurchasingUnitPrice;
	}
	public void setIngredientPurchasingUnitPrice(double ingredientPurchasingUnitPrice) {
		this.ingredientPurchasingUnitPrice = ingredientPurchasingUnitPrice;
	}
	public int getIngredientQualityRatingId() {
		return IngredientQualityRatingId;
	}
	public void setIngredientQualityRatingId(int ingredientQualityRatingId) {
		IngredientQualityRatingId = ingredientQualityRatingId;
	}
	public String getIngredientQualityRatingTxt() {
		return IngredientQualityRatingTxt;
	}
	public void setIngredientQualityRatingTxt(String ingredientQualityRatingTxt) {
		IngredientQualityRatingTxt = ingredientQualityRatingTxt;
	}
	public int getLastPurchaseLocationId() {
		return lastPurchaseLocationId;
	}
	public void setLastPurchaseLocationId(int lastPurchaseLocationId) {
		this.lastPurchaseLocationId = lastPurchaseLocationId;
	}
	public String getLastPurchaseLocationTxt() {
		return lastPurchaseLocationTxt;
	}
	public void setLastPurchaseLocationTxt(String lastPurchaseLocationTxt) {
		this.lastPurchaseLocationTxt = lastPurchaseLocationTxt;
	}
	public int getPreferedPurchasingLocationId() {
		return preferedPurchasingLocationId;
	}
	public void setPreferedPurchasingLocationId(int preferedPurchasingLocationId) {
		this.preferedPurchasingLocationId = preferedPurchasingLocationId;
	}
	public String getPreferedPurchasingLocationTxt() {
		return preferedPurchasingLocationTxt;
	}
	public void setPreferedPurchasingLocationTxt(String preferedPurchasingLocationTxt) {
		this.preferedPurchasingLocationTxt = preferedPurchasingLocationTxt;
	}
	public int getCheapestPurchasingLocationId() {
		return cheapestPurchasingLocationId;
	}
	public void setCheapestPurchasingLocationId(int cheapestPurchasingLocationId) {
		this.cheapestPurchasingLocationId = cheapestPurchasingLocationId;
	}
	public String getCheapestPurchasingLocationTxt() {
		return cheapestPurchasingLocationTxt;
	}
	public void setCheapestPurchasingLocationTxt(String cheapestPurchasingLocationTxt) {
		this.cheapestPurchasingLocationTxt = cheapestPurchasingLocationTxt;
	}
	public double getAverageIngredientCost() {
		return averageIngredientCost;
	}
	public void setAverageIngredientCost(double averageIngredientCost) {
		this.averageIngredientCost = averageIngredientCost;
	}
	public double getHighIngredientCostRange() {
		return highIngredientCostRange;
	}
	public void setHighIngredientCostRange(double highIngredientCostRange) {
		this.highIngredientCostRange = highIngredientCostRange;
	}
	public double getLowIngredientCostRange() {
		return lowIngredientCostRange;
	}
	public void setLowIngredientCostRange(double lowIngredientCostRange) {
		this.lowIngredientCostRange = lowIngredientCostRange;
	}
	public double getIngredientLastPurchasedCost() {
		return ingredientLastPurchasedCost;
	}
	public void setIngredientLastPurchasedCost(double ingredientLastPurchasedCost) {
		this.ingredientLastPurchasedCost = ingredientLastPurchasedCost;
	}
	public Date getIngredientLastPurchaseDate() {
		return ingredientLastPurchaseDate;
	}
	public void setIngredientLastPurchaseDate(Date ingredientLastPurchaseDate) {
		this.ingredientLastPurchaseDate = ingredientLastPurchaseDate;
	}
	public int getIngredientLastPurchaseLocationId() {
		return ingredientLastPurchaseLocationId;
	}
	public void setIngredientLastPurchaseLocationId(int ingredientLastPurchaseLocationId) {
		this.ingredientLastPurchaseLocationId = ingredientLastPurchaseLocationId;
	}
	public String getIngredientLastPurchaseLocationTxt() {
		return ingredientLastPurchaseLocationTxt;
	}
	public void setIngredientLastPurchaseLocationTxt(String ingredientLastPurchaseLocationTxt) {
		this.ingredientLastPurchaseLocationTxt = ingredientLastPurchaseLocationTxt;
	}
	public int getIngredientRatingId() {
		return ingredientRatingId;
	}
	public void setIngredientRatingId(int ingredientRatingId) {
		this.ingredientRatingId = ingredientRatingId;
	}
	public String getIngredientRatingTxt() {
		return ingredientRatingTxt;
	}
	public void setIngredientRatingTxt(String ingredientRatingTxt) {
		this.ingredientRatingTxt = ingredientRatingTxt;
	}
	public Double getIngredientShelfLifeUnit() {
		return ingredientShelfLifeUnit;
	}
	public void setIngredientShelfLifeUnit(Double ingredientShelfLifeUnit) {
		this.ingredientShelfLifeUnit = ingredientShelfLifeUnit;
	}
	public int getIngredientShelfLifeTypeId() {
		return ingredientShelfLifeTypeId;
	}
	public void setIngredientShelfLifeTypeId(int ingredientShelfLifeTypeId) {
		this.ingredientShelfLifeTypeId = ingredientShelfLifeTypeId;
	}
	public String getIngredientShelfLifeTypeIdTxt() {
		return ingredientShelfLifeTypeIdTxt;
	}
	public void setIngredientShelfLifeTypeIdTxt(String ingredientShelfLifeTypeIdTxt) {
		this.ingredientShelfLifeTypeIdTxt = ingredientShelfLifeTypeIdTxt;
	}
	public Date getIngredientExpirationDate() {
		return ingredientExpirationDate;
	}
	public void setIngredientExpirationDate(Date ingredientExpirationDate) {
		this.ingredientExpirationDate = ingredientExpirationDate;
	}
	

}
