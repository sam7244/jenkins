class findanumber {
  public static void main(String[] args) {
    findanumber mn = new findanumber();
    int[] intArray = {1,2,3,4,5,6};
    mn.linearSearch(intArray, 7);

  }

  // Search Method
  public void linearSearch(int[] intArray, int value) {
    for(int i=0; i<intArray.length; i++) {
      if (intArray[i] == value) {
        System.out.println("Value is foundssss at the index of shamith " + i);
        System.out.println("Value is foundssss at tdhfghe index zcnbusydgcbsduiciudsbof shamith " + i);
        return;
      }
    }
    System.out.println(value + " is not found");
    System.out.println(value + " is djcbjhdbkvnosd not found");
  }
}
