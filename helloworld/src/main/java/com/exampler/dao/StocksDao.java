
package com.exampler.dao;



public class StocksDao {

	private double initialQuantityOfStocksPurchased;
	private double initialPriceInDollars;
	private double updatedPriceInDollars;
	private double averagePriceInDollarsPlanningToUpdateCloseToDropedPrice;
	
	/**
	 * @return the initialQuantityOfStocksPurchased
	 */
	public double getInitialQuantityOfStocksPurchased() {
		return initialQuantityOfStocksPurchased;
	}
	/**
	 * @param initialQuantityOfStocksPurchased the initialQuantityOfStocksPurchased to set
	 */
	public void setInitialQuantityOfStocksPurchased(double initialQuantityOfStocksPurchased) {
		this.initialQuantityOfStocksPurchased = initialQuantityOfStocksPurchased;
	}
	/**
	 * @return the initialPriceInDollars
	 */
	public double getInitialPriceInDollars() {
		return initialPriceInDollars;
	}
	/**
	 * @param initialPriceInDollars the initialPriceInDollars to set
	 */
	public void setInitialPriceInDollars(double initialPriceInDollars) {
		this.initialPriceInDollars = initialPriceInDollars;
	}
	/**
	 * @return the updatedPriceInDollars
	 */
	public double getUpdatedPriceInDollars() {
		return updatedPriceInDollars;
	}
	/**
	 * @param updatedPriceInDollars the updatedPriceInDollars to set
	 */
	public void setUpdatedPriceInDollars(double updatedPriceInDollars) {
		this.updatedPriceInDollars = updatedPriceInDollars;
	}
	/**
	 * @return the averagePriceInDollarsPlanningToUpdateCloseToDropedPrice
	 */
	public double getAveragePriceInDollarsPlanningToUpdateCloseToDropedPrice() {
		return averagePriceInDollarsPlanningToUpdateCloseToDropedPrice;
	}
	/**
	 * @param averagePriceInDollarsPlanningToUpdateCloseToDropedPrice the averagePriceInDollarsPlanningToUpdateCloseToDropedPrice to set
	 */
	public void setAveragePriceInDollarsPlanningToUpdateCloseToDropedPrice(
			double averagePriceInDollarsPlanningToUpdateCloseToDropedPrice) {
		this.averagePriceInDollarsPlanningToUpdateCloseToDropedPrice = averagePriceInDollarsPlanningToUpdateCloseToDropedPrice;
	}
	
}
