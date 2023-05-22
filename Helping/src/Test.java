public class Test { 
  public static void main(String[] args) {
     StringBuffer sb = new StringBuffer("135");
    sb.replace(0, 7, "6789").insert(0, "12345");
    System.out.println(sb.reverse().delete(0, 5));
  }
}