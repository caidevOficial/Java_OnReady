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
public class Motorcycle extends Vehicle {

    private int displacement;
    
    /**
     * Reserves space in memory to build the motorcycle.
     */
    public Motorcycle() {

    }

    /**
     * Builds the motorcycle with it's 4 parameters.
     * @param brand The brand of the motorcycle.
     * @param model The model of the motorcycle.
     * @param displacement The displacement of the motorcycle.
     * @param price The price of the motorcycle.
     */
    public Motorcycle(String brand, String model, int displacement, double price) {
	super(brand, model, price);
	this.displacement = displacement;
    }

    /**
     * Gets the displacement of the motorcycle.
     * @return the displacement
     */
    public int getDisplacement() {
        return displacement;
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
     * Sets the displacement of the motorcycle.
     * @param displacement the displacement to set
     */
    public void setDisplacement(int displacement) {
        this.displacement = displacement;
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

    @Override
    public String toString() {
	StringBuffer sb = new StringBuffer();
	String div = " // ";
	String thePrice = super.FormatPriceToString(getPrice());
	
	sb.append("Marca: " + super.getBrand() + div);
	sb.append("Modelo: " + super.getModel() + div);
	sb.append("Cilindradas: " + this.getDisplacement() + "cc" + div);
	sb.append("Precio: $" + thePrice);
	return sb.toString();
    }
}
