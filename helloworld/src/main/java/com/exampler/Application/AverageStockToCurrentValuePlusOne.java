package com.exampler.Application;

import java.util.Scanner;

import com.exampler.dao.StocksDao;

/**
 * Based on Website:
 *         https://www.quora.com/How-can-I-calculate-how-much-stock-to-buy-to-
 *         get-the-average-price-down-to-a-certain-level
 * 
 *         Let’s say you buy 10 shares of A for $10.00 each. Then, the stock
 *         falls to $7.00 per share. You want to reduce your average cost by
 *         buying more shares. Let’s say you want your average to be $8.00.
 * 
 *         ($10 x 10 + n x 7)/(n + 10) = 8
 * 
 *         100 + 7n = 8n + 80
 * 
 *         n = 20
 * 
 *         This formula suggests that you should buy 20 additional shares at
 *         $7.00 per share to get average of $8.00.
 * 
 */
public class AverageStockToCurrentValuePlusOne {

	//
	public static StocksDao stocksDao = new StocksDao();

	public static void main(String[] args) {

		// To Read Input from System/User
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter quantity of stocks purchased : ");
		stocksDao.setInitialQuantityOfStocksPurchased(scanner.nextDouble());

		System.out.println("Enter Dollar Amount of stock: ");
		stocksDao.setInitialPriceInDollars(scanner.nextDouble());

		System.out.println("Enter DropDown Dollar Amount of stock : ");
		stocksDao.setUpdatedPriceInDollars(scanner.nextDouble());

		System.out.println("Enter Average Price of Stock : ");
		stocksDao.setAveragePriceInDollarsPlanningToUpdateCloseToDropedPrice(scanner.nextDouble());

		// Calculate the price for Average Investment
		double investInDollars = noOfStocksToBuy() * stocksDao.getUpdatedPriceInDollars();

		System.out.println("based on dropped stock price " + stocksDao.getUpdatedPriceInDollars() + "$, need to buy "
				+ noOfStocksToBuy()
				+ " Stocks to drop average stock value to current dropped stock price. so you need to invest "
				+ investInDollars + "$");

	}

	public static double noOfStocksToBuy() {
		double noOfStocksToBuy = ((stocksDao.getInitialQuantityOfStocksPurchased()
				* stocksDao.getAveragePriceInDollarsPlanningToUpdateCloseToDropedPrice())
				- (stocksDao.getInitialPriceInDollars() * stocksDao.getInitialQuantityOfStocksPurchased()))
				/ (stocksDao.getUpdatedPriceInDollars()
						- stocksDao.getAveragePriceInDollarsPlanningToUpdateCloseToDropedPrice());

		return noOfStocksToBuy;
	}

}
