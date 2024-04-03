package com.divc.java8.samples.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Optional;

enum GooglePhones {
    Pixel8Pro(999), Pixel8(699), Pixel7a(499), PixelFold(1299), Pixel7Pro(899), Pixel7(599);
   
    int price;
    GooglePhones(int p) {
       price = p;
    }
    int showPrice() {
       return price;
    } 
}

public class Lambda1 {

    public static void main(String[] args) {

        Date cloudNextDate = new Date(2024, 03, 9); 
        
        List<String> presentors = Arrays.asList("Gabe", "Aja", "Aaron", "Ning");

        // Use List.sort with lambda expression
        presentors.sort((a, b) -> b.compareTo(a));

        // Use Comparator.reverseOrder() for concise reverse sorting
        presentors.sort(Comparator.naturalOrder());

        System.out.println("Presenters in natural order: " + presentors);
        
        System.out.println("Cloud Next '24 start on " + cloudNextDate);

        System.out.println("Additional information on Google phones:");
        for(GooglePhones m : GooglePhones.values()) {
            System.out.println(m + " costs " + m.showPrice() + "$");
        }
    }
}

