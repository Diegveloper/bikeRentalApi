package com.ozomahtli.bikerental.business;

import java.util.Collection;

public interface BikeOperations {
    void createBike();
    void getBike(int id);
    void updateBike();
    void deleteBike(int id);
    void replaceBike();
    Collection<Object> getBikes();
}
