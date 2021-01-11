/*
 * Copyright (C) 2020 <FacuFalcone - CaidevOficial>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package logic.abstractClass;

import java.text.DecimalFormat;

/**
 * @author <FacuFalcone - CaidevOficial>
 */
public abstract class Vehicle implements Comparable<Vehicle> {
    
    protected String brand;
    protected String model;
    protected double price;
    
    /**
     * Reserves space in memory for the entity.
     */
    public Vehicle() {
    
    }

    /**
     * Builds the vehicle with it's 3 parameters.
     * @param brand
     * @param model
     * @param price
     */
    public Vehicle(String brand, String model, double price) {
	this.brand = brand;
	this.model = model;
	this.price = price;
    }

    /**
     * Gets the brand of the vehicle.
     * @return the brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Gets the model of the vehicle.
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * Gets the price of the vehicle.
     * @return the price
     */
    public double getPrice() {
	return price;
    }

    /**
     * @param brand the brand to set
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * Sets the model of the vehicle.
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * Sets the price of the vehicle.
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int compareTo(Vehicle anotherVehicle) {
        if (price == anotherVehicle.price) {
            return 0;
        } else if (price < anotherVehicle.price) {
            return 1;
        } else {
            return -1;
        }
    }

    /**
     * Format the price as a string like xxx,xxx.xx
     * @param thisPrice Price to format.
     * @return the price formated.
     */
    public String FormatPriceToString(double thisPrice) {
	DecimalFormat df = new DecimalFormat("###,###.00");
	String thePrice = new String(df.format(thisPrice));
	thePrice = thePrice.replace('.', ',');
	thePrice = thePrice.replaceFirst(",", ".");
	
	return thePrice;
    }
}
