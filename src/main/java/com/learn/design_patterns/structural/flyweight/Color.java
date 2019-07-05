package com.learn.design_patterns.structural.flyweight;

public class Color {
	private final int red;
	private final int blue;
	private final int green;
	
	public Color(ColorPallete cp) {
		switch (cp) {
		case RED:
			red = 255;
			blue = 0;
			green = 0;
			break;
		case BLUE:
			red = 0;
			blue = 255;
			green = 0;
			break;
		case GREEN:
			red = 0;
			blue = 0;
			green = 255;
			break;
		case BLACK:
		default:
			red = 0;
			blue = 0;
			green = 0;
			break;
		}
	}
	
	public Color(int red, int blue, int green) {
		super();
		this.red = red;
		this.blue = blue;
		this.green = green;
	}

	public int getRed() {
		return red;
	}

	public int getBlue() {
		return blue;
	}

	public int getGreen() {
		return green;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + blue;
		result = prime * result + green;
		result = prime * result + red;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Color other = (Color) obj;
		if (blue != other.blue)
			return false;
		if (green != other.green)
			return false;
		if (red != other.red)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Color [red=" + red + ", blue=" + blue + ", green=" + green + "]";
	}
	
}
