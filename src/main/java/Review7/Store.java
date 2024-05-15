package Review7;

      public class Store {
          public static void main(String[] args) {
              Book book1 = new Book();
              book1.title = "Gone with the wind";
              book1.author = "Margaret Mitchell";
              book1.year = 1939;
              book1.price = 45;
              //book1.page=298; CE: variable does not exist in the Book class

              book1.read();
              book1.changePrice(41);
              double total = book1.totalWithTax(0.1);
              System.out.println("The price with taxes= " + total);

                //new Magazine(){}- we do not have Magazine class-so we cannot create class
          }
      }




