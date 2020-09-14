package com.vigenere.service;

import java.util.ArrayList;

public class CircularList<E> extends ArrayList<E> {


//    @Override
//    public E get(int index) {
//        return super.get(index % size());
//    }

    public E get(int index)
    {
        if (index < 0)
        {
            index = size()-index;
        }

        else if (index == size())
        {
            index = 0;
        }

        return super.get(index);
    }
}