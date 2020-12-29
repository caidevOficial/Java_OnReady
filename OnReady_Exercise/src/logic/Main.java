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

package logic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import logic.abstractClass.Vehicle;
import logic.subClass.Car;
import logic.subClass.Motorcycle;

/**
 * @author <FacuFalcone - CaidevOficial>
 */
public class Main {

    /**
     * Loads 4 vehicles on the list and returns them (cars and motorcycles).
     * @return Returns a the list with the 4 vehicles.
     */
    public static List<Vehicle> LoadData() {
	List<Vehicle> vehicles = new ArrayList<Vehicle>();
	vehicles.add(new Car("Peugeot", "206", 4, 200000));
	vehicles.add(new Motorcycle("Honda", "Titán", 125, 60000));
	vehicles.add(new Car("Peugeot", "208", 5, 250000));
	vehicles.add(new Motorcycle("Yamaha", "YBR", 160, 80500.50));
	
	return vehicles;
    }
    
    /**
     * Prints in console the data of all vehicles inside the list.
     * @param vehicles List to iterate.
     */
    public static void PrintVehicles(List<Vehicle> vehicles) {
	for (Vehicle vehicle : vehicles) {
	    System.out.println(vehicle);
	}
	System.out.println("=============================");
    }
    
    /**
     * Prints in console the cheaper and expensive vehicle in the list and the vehicle with the letter 'letter' its the model.
     * @param vehicles List to iterate.
     * @param letter Letter to search in the model's name of the vehicles.
     */
    public static void PrintCheapAndExpensive(List<Vehicle> vehicles, char letter) {
	System.out.println("Vehículo más caro: " + vehicles.get(0).getBrand() + " " + vehicles.get(0).getModel());
	System.out.println("Vehículo más barato: " + vehicles.get(vehicles.size()-1).getBrand() + " " + vehicles.get(vehicles.size()-1).getModel());
	System.out.println("Vehículo que contiene en el modelo la letra ´Y´: " + FindNameWith(letter, vehicles));
	System.out.println("=============================");
    }
    
    public static void PrintOrderedByPrice(List<Vehicle> vehicles) {
	System.out.println("Vehículos ordenados por precio de mayor a menor:");
	for (Vehicle vehicle : vehicles) {
	    System.out.println(vehicle.getBrand() + " " + vehicle.getModel());
	}
    }
    
    /**
     * Searches in the list of vehicles the model that contains a specific letter in it's model.
     * @param theChar Letter to search in the model of the vehicles.
     * @param vehicles List of vehicles to iterate.
     * @return The brand & model of the vehicle with 'theChar' in it's model.
     */
    public static String FindNameWith(char theChar, List<Vehicle> vehicles) {
	String model;
	String data = "No hay modelos con " + theChar;
	char div = ' ';
	
	for (Vehicle vehicle : vehicles) {
	    model = vehicle.getModel();
	    for (int i = 0; i < model.length(); i++) {
		if(model.charAt(i)==theChar) {
		    data = vehicle.getBrand() + div + vehicle.getModel() + div + "$" + vehicle.FormatPriceToString(vehicle.getPrice());
		    break;
		}
	    }
	}
	return data;
    }
    
    /**
     * @param args
     */
    public static void main(String[] args) {
	List<Vehicle> vehicles = LoadData();
	PrintVehicles(vehicles);
	Collections.sort(vehicles);
	PrintCheapAndExpensive(vehicles, 'Y');
	PrintOrderedByPrice(vehicles);
    }
}
