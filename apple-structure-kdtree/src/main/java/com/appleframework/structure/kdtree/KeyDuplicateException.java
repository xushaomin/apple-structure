package com.appleframework.structure.kdtree;

/**
 * KeyDuplicateException is thrown when the <TT>KDTree.insert</TT> method is
 * invoked on a key already in the KDTree.
 *
 * @author Simon Levy
 * @version %I%, %G%
 * @since JDK1.2
 */

public class KeyDuplicateException extends KDException {
	
	private static final long serialVersionUID = 1L;

	protected KeyDuplicateException() {
		super("Key already in tree");
	}
}
