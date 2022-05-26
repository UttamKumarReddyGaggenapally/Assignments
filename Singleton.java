public class abc {

  //static instance of class globally accessible
  public static abc instance = new abc();
  private abc() {
    // private constructor so that class
    //cannot be instantiated from outside
    //this class
  }
}
