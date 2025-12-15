package Function;

public class cal {
    public static int ncrCal(int n,int r){
        int nfact=1;
        int rfact=1;
        int nrfact=1;
        for(int i=1;i<=n;i++){
            nfact=i*nfact;
        }
        for(int i=1;i<=r;i++){
            rfact=i*rfact;
        }
        for(int i=1;i<=n-r;i++){
            nrfact=i*nrfact;
        }
        return nfact/(rfact*nrfact);
    }
    public static void main(String[] args) {
        System.out.println(ncrCal(5, 2));
    }
}

