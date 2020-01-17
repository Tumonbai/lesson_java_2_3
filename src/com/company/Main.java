package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        User user = new User();
        for (int i = 0; ; i++) {
            try {
                user.setName();
                user.setAge();
            } catch (IllegalNameLengthException e) {
                System.out.println(e.getMessage());
            } catch (IllegalAgeException ia) {
                System.out.println(ia.getMessage());
            }
        }

    }

}
