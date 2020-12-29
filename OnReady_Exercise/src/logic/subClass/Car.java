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

package logic.subClass;

import logic.abstractClass.Vehicle;

/**
 * @author <FacuFalcone - CaidevOficial>
 */
public class Car extends Vehicle {

    int doors;

    /**
     * Reserves space in memory to build the car.
     */
    public Car() {
	super();
    }

    /**
     * Builds the car with it's 4 parameters.
     * @param brand The brand of the car.
     * @param model The model of the car.
     * @param doors The door's quantity of the car.
     * @param price The price of the car.
     */
    public Car(String brand, String model, int doors, double price) {
	super(brand, model, price);
	this.doors = doors;
    }

    @Override
    public String getBrand() {
	return super.getBrand();
    }

    @Override
    public String getModel() {
	return super.getModel();
    }

    @Override
    public double getPrice() {
	return super.getPrice();
    }

    /**
     * Gets the door's quantity of the car.
     * @return the doors
     */
    public int getDoors() {
        return doors;
    }

    @Override
    public void setBrand(String brand) {
	super.setBrand(brand);
    }

    @Override
    public void setModel(String model) {
	super.setModel(model);
    }

    @Override
    public void setPrice(double price) {
	super.setPrice(price);
    }

    /**
     * Sets the door's quantity of the car.
     * @param doors the doors to set
     */
    public void setDoors(int doors) {
        this.doors = doors;
    }

    @Override
    public String toString() {
	StringBuffer sb = new StringBuffer();
	String div = " // ";
	String thePrice = super.FormatPriceToString(getPrice());
        
	sb.append("Marca: " + super.getBrand() + div);
	sb.append("Modelo: " + super.getModel() + div);
	sb.append("Puertas: " + this.getDoors() + div);
	sb.append("Precio: $" + thePrice);
	return sb.toString();
    }
}
