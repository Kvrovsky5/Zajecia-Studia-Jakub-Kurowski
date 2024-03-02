class zajecia {
    public static void main (String[] args){
        calc();
        BMI();
        Avarage();

        
    }
    public static void BMI(){
        float mass = 65;
        float height = 185;

        float bmi = mass/height;

        System.out.println("Twoje BMI:" + bmi);
    }
    public static void Avarage(){
        int[] e = {20,10,5};
        float avgsum = e[0] + e[1] + e[2];
        float avg = avgsum/3;

        System.out.println("Avarage: " + avg);
    }
    public static void calc(){
        float x = 5;
        float y = 6;
        System.out.println(x + y);
        System.out.println(x * y);
        System.out.println(y / x);
        
    }
}