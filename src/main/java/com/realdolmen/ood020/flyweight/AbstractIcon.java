package com.realdolmen.ood020.flyweight;

import java.awt.Graphics;

public abstract class AbstractIcon {

	public abstract void draw(Graphics g, int tx, int ty, String name,
			boolean selected);
}
