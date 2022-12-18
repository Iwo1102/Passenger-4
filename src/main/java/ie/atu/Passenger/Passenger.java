package ie.atu.Passenger;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public class Passenger {
    String title;
    String name;
    String id;
    int phone;
    int age;

    public String title(String title) {
        char titleChar[] = title.toCharArray();
        if ("Mr".equalsIgnoreCase(title) || "Ms".equalsIgnoreCase(title) || "Mrs".equalsIgnoreCase(title)) {
            //make sure all chars are in correct cases
            titleChar[0] = 'M';
            title = String.valueOf(titleChar);
            return title;
        } else
            throw new IllegalArgumentException("Can only be Mr, Ms or Mrs");
    }

    public String name(String name) {
        if(name.length() < 3)
            throw new IllegalArgumentException("Name has to have a minimum of 3 characters");
        else
            return name;
    }

    public String id(String str) {
        int count = 0;
        double n;
        n = Double.parseDouble(str);
        while (n != 0)
        {
            n = n/10;
            count++;
        }
        if(count < 10)
            throw new IllegalArgumentException("ID has to have a minimum of 10 digits");
        else {
            return str;
        }
    }

    public  int phone(int s) {
        int count = 0;
        int n = s;
        while (n != 0)
        {
            n = n/10;
            count++;
        }
        if(count < 7)
            throw new IllegalArgumentException("Phone number has to have a minimum of 7 digits");
        else
            return s;
    }

    public int age(int i)
    {
        if (i < 16)
            throw new IllegalArgumentException("Must be at least 16 years of age to fly");
        else
            return i;
    }



}
