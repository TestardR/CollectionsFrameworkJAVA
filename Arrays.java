package com.romaintestard;

public class Arrays {
    public static void main(String[] args){
        String[] alphabet = {"a", "b", "c", "d", "e", "f", "g"};

        for(int i = 0; i < alphabet.length; i++) {
            System.out.println(alphabet[i]);
        }

        for (String letter : alphabet) {
            System.out.println(letter);
        }

        String[][] users = {
                {"John", "Williams", "jw@gmail.com", "0890438904"},
                {"Sarah", "Soso", "ss@gmail.com", "2132138904"},
                {"Milton", "Friedman", "mf@gmail.com", "8888438904"},
        };

        // Get the size of array
        int numOfUsers = users.length;
        int numOfFields = users[0].length;
        System.out.println("Number of users: " + numOfUsers);
        System.out.println("Number of fields " + numOfFields);

        // Traverse the double array, the old fashion way
        for (int i = 0; i<numOfUsers ; i++){
            for(int j=0; j<numOfFields; j++){
                System.out.println(users[i][j]);
            }
        }

        // Traverse the double array
        for (int i = 0; i<numOfUsers ; i++){
                String firstName = users[i][0];
                String lastName = users[i][1];
                String email = users[i][2];
                String phone = users[i][3];
            System.out.println(firstName + " " + lastName + " " + email + " " + phone);
        }

        // Traverse the double with foreach
        for (String[] user : users) {
            for (String field : user) {
                System.out.println(field);
            }
        }
    }

}

