import java.util.Scanner;

public class Driver {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("Test all?: Y/N");
    String answer = input.next();

    //Test all
    if( answer.equals("Y")) {
      MyLinkedList L1 = new MyLinkedList(); //constructing MyLinkedList

      if( L1.size() != 0 ) {
        System.out.println("constructor doesn't properly construct");
      }

      for(int i = 0; i < 10; i++) { //adding values 0-9 to the list
        L1.add((Integer)i);
      }

      System.out.println(L1); //Should be[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
      System.out.println(L1.size()); //Should be 10

      for(int i = 0; i < 10; i++) {
        L1.add(i, (Integer)(10+i)); // adding using( index, value)
      }

      System.out.println(L1); //Should be [10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
      System.out.println(L1.size()); //Should be 20

      try {  //testing add to see if throws proper exception
        L1.add(-1, (Integer)(10));
      } catch( IndexOutOfBoundsException e) {
        System.out.println("your add properly throws IndexOutOfBoundsException for a negative index \n");
      }
      try {
        L1.add(21, (Integer)(10));
      } catch( IndexOutOfBoundsException e) {
        System.out.println("your add properly throws IndexOutOfBoundsException for a big index \n");
        }

      String getTest = ""; //testing get to see if you get the right numbers
      for(int i = 0; i<L1.size(); i++) {
        getTest += L1.get(i) + " ";
      }
      System.out.println(getTest); //should be 10 11 12 13 14 15 16 17 18 19 0 1 2 3 4 5 6 7 8 9

      try { //testing get methods to see if they throw exception
        L1.get(-1);
      } catch(IndexOutOfBoundsException e) {
        System.out.println("your get properly throws IndexOutOfBoundsException for a negative index \n");
      }
      try {
        L1.get(20);
      } catch(IndexOutOfBoundsException e) {
        System.out.println("your get properly throws IndexOutOfBoundsException for a big index\n");
        }

      for(int i = 0; i< L1.size();i++) {
        L1.set(i, (Integer)i);
      }
      System.out.println(L1); // should be [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]

      boolean indexOfTest = true; //testing to see if your indexOf works
      for(int i =0; i< L1.size(); i++){
        if(i != L1.indexOf(i))
        indexOfTest = false;
      }
      if(indexOfTest){
        System.out.println("Your indexOf works, good job comrade \n");
      } else {
        System.out.println("You done f_cked up, comrade");
        System.out.println("say goodbye to your family, son");
      }

      boolean containsTest = true; // testing to see if your contains works
      for(int i=0; i< L1.size(); i++) {
        if(!(L1.contains(i))) {
          containsTest = false;
        }
      }
      if(containsTest) {
        System.out.println("your contain works despite expectations\n");
      } else {
        System.out.println("despite your 98 GPA, your mother and I are very disappointed bc 98 is still less than a 105");
      }

      for(int i = 19; i > 14; i--) {  //testing to see if removing from the end works proprely
        L1.remove(i);
      }
      System.out.println(L1); // should be [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14]
      System.out.println(L1.size()); //should be 15

      try { //testing remove(index) method to see if it throws exception
        L1.remove(-1);
      } catch(IndexOutOfBoundsException e) {
        System.out.println("your remove properly throws IndexOutOfBoundsException for a negative index \n");
      }
      try {
        L1.remove(15);
      } catch(IndexOutOfBoundsException e) {
        System.out.println("your remove works for index big, if only it could remove my first test grade\n");
        System.out.println("if only it could remove all of my test grades actually");
      }

      L1.remove((Integer)0); //testing removing by value and removing from
      L1.remove((Integer)14);//the end and the start
      L1.remove((Integer)1);
      L1.remove((Integer)13);

      System.out.println(L1); // should be [2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]

      if( L1.remove((Integer) 20)) {
        System.out.println("You hath brought shame to me");
      }
      else{
        System.out.println("Nice job, you passed all of my tests, you did good, if this actually works");
      }
    }

    //Don't test all
    if(answer.equals("N")) {
      MyLinkedList L1 = new MyLinkedList(); //constructing MyLinkedList

      if( L1.size() != 0 ) {
        System.out.println("constructor doesn't properly construct");
      }
      System.out.println("Test adding?: Y/N");
      answer = input.next();

      if(answer.equals("Y")){
        for(int i = 0; i < 10; i++) { //adding values 0-9 to the list
          L1.add((Integer)i);
        }

        System.out.println(L1); //Should be[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
        System.out.println(L1.size()); //Should be 10

        for(int i = 0; i < 10; i++) {
          L1.add(i, (Integer)(10+i)); // adding using( index, value)
        }

        System.out.println(L1); //Should be [10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
        System.out.println(L1.size()); //Should be 20

        try {  //testing add to see if throws proper exception
          L1.add(-1, (Integer)(10));
        } catch( IndexOutOfBoundsException e) {
          System.out.println("your add properly throws IndexOutOfBoundsException for a negative index \n");
        }
        try {
          L1.add(21, (Integer)(10));
        } catch( IndexOutOfBoundsException e) {
          System.out.println(" your add properly throws IndexOutOfBoundsException for a big index\n");
          }
      }

      System.out.println("Test get?: Y/N");
      answer = input.next();

      if(answer.equals("Y")){
        String getTest = ""; //testing get to see if you get the right numbers
        for(int i = 0; i<L1.size(); i++) {
          getTest += L1.get(i) + " ";
        }
        System.out.println(getTest); //should be 10 11 12 13 14 15 16 17 18 19 0 1 2 3 4 5 6 7 8 9

        try { //testing get methods to see if they throw exception
          L1.get(-1);
        } catch(IndexOutOfBoundsException e) {
          System.out.println("your get properly throws IndexOutOfBoundsException for a negative index \n");
        }
        try {
          L1.get(20);
        } catch(IndexOutOfBoundsException e) {
          System.out.println("your get properly throws IndexOutOfBoundsException for a big index\n");
          }
      }

      System.out.println("Test set?: Y/N");
      answer = input.next();

      if(answer.equals("Y")){
        for(int i = 0; i< L1.size();i++) {
          L1.set(i, (Integer)i);
        }
        System.out.println(L1); // should be [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
      }

      System.out.println("Test indexOf?: Y/N");
      answer = input.next();

      if(answer.equals("Y")){
        boolean indexOfTest = true; //testing to see if your indexOf works
        for(int i =0; i< L1.size(); i++){
          if(i != L1.indexOf(i))
          indexOfTest = false;
        }
        if(indexOfTest){
          System.out.println("Your indexOf works, good job comrade \n");
        } else {
          System.out.println("You done f_cked up, comrade");
          System.out.println("say goodbye to your family, son");
        }
      }

      System.out.println("Test contains?: Y/N");
      answer = input.next();

      if(answer.equals("Y")){
        boolean containsTest = true; // testing to see if your contains works
        for(int i=0; i< L1.size(); i++) {
          if(!(L1.contains(i))) {
            containsTest = false;
          }
        }
        if(containsTest) {
          System.out.println("your contain works despite expectations\n");
        } else {
          System.out.println("despite your 98 GPA, your mother and I are very disappointed bc 98 is still less than a 105");
        }
      }

      System.out.println("Test remove?: Y/N");
      answer = input.next();

      if(answer.equals("Y")){
        for(int i = 19; i > 14; i--) {  //testing to see if removing from the end works proprely
          L1.remove(i);
        }
        System.out.println(L1); // should be [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14]
        System.out.println(L1.size()); //should be 15

        try { //testing remove(index) method to see if it throws exception
          L1.remove(-1);
        } catch(IndexOutOfBoundsException e) {
          System.out.println("your remove properly throws IndexOutOfBoundsException for a negative index \n");
        }
        try {
          L1.remove(15);
        } catch(IndexOutOfBoundsException e) {
          System.out.println("your remove works for index big, if only it could remove my first test grade\n");
          System.out.println("if only it could remove all of my test grades actually");
        }

        L1.remove((Integer)0); //testing removing by value and removing from
        L1.remove((Integer)14);//the end and the start
        L1.remove((Integer)1);
        L1.remove((Integer)13);

        System.out.println(L1); // should be [2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]

        if( L1.remove((Integer) 20)) {
          System.out.println("You hath brought shame to me");
        }
        else{
          System.out.println("Nice job, you passed all of my tests, you did good, if this actually works");
        }
      }
    }
  }
}
