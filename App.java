public class App {
    public static void main(String[] args) throws Exception {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        int 端数 = 0;
        int x = 0;
        int n = 0;
        do{
            System.err.println("商品の金額を入力");
           x = scan.nextInt();
           端数 = x % 10;
        }while(端数 > 0);
        do{
            System.err.println("投入金額を入力");
           n = scan.nextInt();
           端数 = n % 10;
        }while(端数 > 0 || x > n);
        int []硬貨={500,100,50,10};
        int []枚数=new int[4];
        int おつり = n-x;
        int 結果=おつり;
        int あまり = 0;
      
        for(int i = 0;i<硬貨.length;i++){
            if(おつり>=硬貨[i]){
                int k = おつり/硬貨[i];
                あまり = おつり%硬貨[i];
                枚数[i]=k;
                おつり=あまり;
            }else{
                枚数[i]=0;
            }
             

        }
        System.err.println("おつりは"+結果+"円");
        for(int j=0;j<4;j++){
            System.err.println(硬貨[j]+"円"+枚数[j]+"枚");
        }



    }
    
}
