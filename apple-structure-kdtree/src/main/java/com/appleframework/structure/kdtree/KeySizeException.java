package com.appleframework.structure.kdtree;

/**
 * KeySizeException is thrown when a KDTree method is invoked on a key whose
 * size (array length) mismatches the one used in the that KDTree's constructor.
 *
 * @author Simon Levy
 * @version %I%, %G%
 * @since JDK1.2
 */

public class KeySizeException extends KDException {

	private static final long serialVersionUID = 1L;

	protected KeySizeException() {
		super("Key size mismatch");
	}

}
