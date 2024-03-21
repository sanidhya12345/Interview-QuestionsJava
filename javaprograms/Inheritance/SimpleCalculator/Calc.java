public class Calc {
    public int var1;
    public int var2;
    public void Calc(int var1,int var2){
        this.var1=var1;
        this.var2=var2;
    }
    public int addition(){
        return var1+var2;
    }
    public int subtraction(){
        return var1-var2;
    }
    public int multiplication(){
        return var1*var2;
    }
    public int division(){
        return var1/var2;
    }
}