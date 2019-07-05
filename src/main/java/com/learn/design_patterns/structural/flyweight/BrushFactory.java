package com.learn.design_patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class BrushFactory {
	private static final Map<Color, Brush> map = new HashMap<>();
	
	public static Brush getBrush(Color color) {
		if(map.containsKey(color)) {
			return map.get(color);
		}
		else {
			Brush b = new Brush(color);
			map.put(color, b);
			return b;
		}
	}
}
