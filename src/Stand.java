public class Stand {
  private String standName;
  private String itemSold;
  private double itemPrice;

  public Stand(String standName, String itemSold, double itemPrice) {
    this.standName = standName;
    this.itemSold = itemSold;
    this.itemPrice = itemPrice;
  }

  public String getStandName() {
    return standName;
  }

  @Override
  public String toString() {
    return "Sells " + itemSold + " with price " + itemPrice;
  }
}