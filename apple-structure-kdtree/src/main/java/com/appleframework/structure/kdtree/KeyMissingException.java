// Key-size mismatch exception supporting KDTree class

package com.appleframework.structure.kdtree;

public class KeyMissingException extends KDException { /* made public by MSL */

	private static final long serialVersionUID = 1L;

	public KeyMissingException() {
		super("Key not found");
	}

}
