public class DiscountRate {
    public static double ServiceDiscountPremium = 0.2;
    public static double ServiceDiscountGold = 0.15;
    public static double ServiceDiscountSilver = 0.1;

    public static double ProductDiscountPremium = 0.1;
    public static double ProductDiscountGold = 0.1;
    public static double ProductDiscountSilver = 0.1;

    public static double All = 0.1;

    public static double getServiceDiscountRate(String s){
        if(s == "Premium"){
            return ServiceDiscountPremium;
        }else if(s == "Silver"){
            return ServiceDiscountSilver;
        }else if(s == "Gold"){
            return ServiceDiscountGold;
        }else{
            return All;
        }
    }

    public static double getProductDiscountRate(String s){
        if(s == "Premium"){
            return ProductDiscountPremium;
        }else if(s == "Silver"){
            return ProductDiscountSilver;
        }else if(s == "Gold"){
            return ProductDiscountGold;
        }else{
            return All;
        }
    }
}
