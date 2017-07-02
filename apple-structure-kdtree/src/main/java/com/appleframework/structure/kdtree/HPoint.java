// Hyper-Point class supporting KDTree class

package com.appleframework.structure.kdtree;

import java.io.Serializable;

public class HPoint implements Serializable {
	
	private static final long serialVersionUID = 1L;

	protected double[] coord;

	protected HPoint(int n) {
		coord = new double[n];
	}

	protected HPoint(double[] x) {

		coord = new double[x.length];
		for (int i = 0; i < x.length; ++i)
			coord[i] = x[i];
	}

	protected Object clone() {

		return new HPoint(coord);
	}

	protected boolean equals(HPoint p) {

		// seems faster than java.util.Arrays.equals(), which is not
		// currently supported by Matlab anyway
		for (int i = 0; i < coord.length; ++i)
			if (coord[i] != p.coord[i])
				return false;

		return true;
	}

	protected static double sqrdist(HPoint x, HPoint y) {
		return EuclideanDistance.sqrdist(x.coord, y.coord);
	}

	public String toString() {
		String s = "";
		for (int i = 0; i < coord.length; ++i) {
			s = s + coord[i] + " ";
		}
		return s;
	}

}
