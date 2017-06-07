// Abstract distance metric class

package com.appleframework.structure.kdtree;

public abstract class DistanceMetric {
    
    protected abstract double distance(double [] a, double [] b);
}
