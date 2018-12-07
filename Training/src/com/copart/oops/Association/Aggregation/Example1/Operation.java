package com.copart.oops.Association.Aggregation.Example1;

/** Aggregation : If a class have entity reference, it is known as Aggregation. Aggregation represents
 * HAS-A relationship.
 * Employee object contains many informations such as id, name, emailId etc. it contains one more object named as
 * Address, which contains its own informations such as city, state, country, zipcode etc.
 * Employee Has an entity reference address, So relationship is Employee HAS-A address.
 */
public class Operation {
    int square(int n) {
        return n*n;
    }

}
