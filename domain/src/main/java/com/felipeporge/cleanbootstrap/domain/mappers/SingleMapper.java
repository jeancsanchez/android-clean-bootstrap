package com.felipeporge.cleanbootstrap.domain.mappers;

import java.util.ArrayList;
import java.util.List;

/**
 * This class represents a data mapper.
 * @author Felipe Porge Xavier - <a href="http://www.felipeporge.com/">www.felipeporge.com</a>
 * @since 23/11/2016
 */
public abstract class SingleMapper<FROM, TO> {

    /**
     * Transforms a mappable object to a transformed object.
     * @param object Mappable object.
     * @return Transformed object.
     */
    public abstract TO transform(FROM object);

    /**
     * Transforms a mappable object array to a transformed array.
     * @param array Array of mappable objects.
     * @return Array of transformed objects.
     */
    public List<TO> transform(List<FROM> array){
        if(array == null)
            return null;

        ArrayList<TO> result = new ArrayList<>();
        for(int i = 0; i < array.size(); i++){
            result.add(transform(array.get(i)));
        }
        return result;
    }
}
