/*import java.util.*;

class KnapsackGreedy
{
	void MaxProfit()
	{
		float max=i.pwratio;
		if(i1.pwratio>max && i2.pwratio<max)
			i1=max;
		else if(i1.pwratio<max && i2.pwratio<max)
			i.pwratio=max;
		else i2.pwratio=max;
	}
class items
{
	int items_profit;
	int items_weight;
	float pwratio;

	void valueues(int profit, int weight)
	{
		items_weight=weight;
		items_profit=profit;
		pwratio=profit/weight;
	}
}

public static void main(String[] args)
{
	items i=new items[];
	items i1=new items[];
	items i3=new items[];
	i.valueues(20,10);
	i1.valueues(60,3);
	i2.valueues(25,5);
	MaxProfit();
}

} */
import java.util.*;
 

public class KnapsackGreedy {

    private static double getMaxValue(int[] weight, int[] value,
                                      int capacity)
    {
        ItemValue[] iVal = new ItemValue[weight.length];
 
        for (int i = 0; i < weight.length; i++) {
            iVal[i] = new ItemValue(weight[i], value[i], i);
        }
 
    
        Arrays.sort(iVal, new Comparator<ItemValue>() {
            @Override
            public int compare(ItemValue o1, ItemValue o2)
            {
                return o2.cost.compareTo(o1.cost);
            }
        });
 
        double totalValue = 0d;
 
        for (ItemValue i : iVal) {
 
            int curweight = (int)i.weight;
            int curVal = (int)i.value;
 
            if (capacity - curweight >= 0) {
        
                capacity = capacity - curweight;
                totalValue += curVal;
            }
            else {
           
                double fraction
                    = ((double)capacity / (double)curweight);
                totalValue += (curVal * fraction);
                capacity
                    = (int)(capacity - (curweight * fraction));
                break;
            }
        }
 
        return totalValue;
    }
 
   
    static class ItemValue {
        Double cost;
        double weight, value, ind;
 
   
        public ItemValue(int weight, int value, int ind)
        {
            this.weight = weight;
            this.value = value;
            this.ind = ind;
            cost = new Double((double)value / (double)weight);
        }
    }
 
 
    public static void main(String[] args)
    {
        int[] weight = { 5, 10, 2, 30 };
        int[] valueue = { 60, 40, 100, 120 };
        int capacity = 50;
 
        double maxValue = getMaxValue(weight, valueue, capacity);
 

        System.out.println("Maximum value we can obtain = "
                           + maxValue);
    }
}