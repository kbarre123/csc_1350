package productprinter;

/**
 *
 * @author kbarr17
 */
public class Product 
{
    private String name;
    private double price;
    
    /**
     * Construct a product
     */
    public Product(String pName, double pPrice)
    {
        name = pName;
        price = pPrice;
    }
    
    /**
     * @return get the name of the product
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * @return get the price of the product
     */
    public double getPrice()
    {
        return price;
    }
    
    public void reducePrice(int discount)
    {
        price -= discount;
    }
}
