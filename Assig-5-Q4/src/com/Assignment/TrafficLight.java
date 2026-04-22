package com.Assignment;
enum Light{
	RED(30),
	YELLOW(5),
	GREEN(40);
	int duration;
	
	Light(int duration){
		this.duration=duration;
	}
}
public class TrafficLight {
public static void main(String[] args) {
	for (Light t: Light.values()) {
		System.out.println(t+ " = "+t.duration+" seconds");
	}
}
}
