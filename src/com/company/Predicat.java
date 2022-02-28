package com.company;
@FunctionalInterface
public interface Predicat<T> {
   Boolean test(T t);
   public boolean equals(Object obj);
}
