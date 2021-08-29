package katatemplateproject;
public class KataTemplateProject {
    public static void main(String[] args) {    
        System.out.println(RowSumOddNumbers.rowSumOddNumbers(4));
    }
}

class RowSumOddNumbers {
    public static int rowSumOddNumbers(int n) {
        int number = 1;
        int sum=1;
        int mod=1;
        int modadding=0;
        for(int i = 0;i<n;i++){
            mod-=modadding;
            if(i>=1)modadding++;
        }
        for(int i = 1;i<n;i++){
            if(i==1){
                number+=2*(n-mod);
                sum=number;
            }
            number+=2;
            sum+=number;
        }
        return sum;
    }
    //before realising that a solution is just a simple formula n*n*n
}
