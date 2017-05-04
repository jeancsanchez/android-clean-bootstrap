package com.felipeporge.cleanbootstrap.domain.mappers;

import java.util.ArrayList;

/**
 * This class represents a data mapper.
 * @author Felipe Porge Xavier - <a href="http://www.felipeporge.com/">www.felipeporge.com</a>
 * @since 23/11/2016
 */
public abstract class DataMapper<FROM, TO> {


    /**
     * Transforms a mappable object to a transformed object.
     * @param object Mappable object.
     * @return Transformed object.
     */
    public abstract TO transform(FROM object);

    /**
     * Transforms a transformed object to mappable object.
     * @param object Transformed object.
     * @return Mappable object.
     */
    public abstract FROM parseBack(TO object);

    /**
     * Transforms a mappable object array to a transformed array.
     * @param array Array of mappable objects.
     * @return Array of transformed objects.
     */
    public ArrayList<TO> transform(ArrayList<FROM> array){
        if(array == null)
            return null;

        ArrayList<TO> result = new ArrayList<>();
        for(int i = 0; i < array.size(); i++){
            result.add(
                    transform(array.get(i))
            );
        }
        return result;
    }

    /**
     * Transforms a transformed object array to a mappable array.
     * @param array Array of transformed objects.
     * @return Array of mappable objects.
     */
    public ArrayList<FROM> parseBack(ArrayList<TO> array){
        if(array == null)
            return null;

        ArrayList<FROM> result = new ArrayList<>();
        for(int i = 0; i < array.size(); i++){
            result.add(
                    parseBack(array.get(i))
            );
        }
        return result;
    }
}
