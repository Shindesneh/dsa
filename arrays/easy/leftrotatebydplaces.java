import java.util.*;
public class leftrotatebydplaces {
    static void rotatelist(List<Integer> list,int d){
        int n=list.size();
if(n==0||n%d==0 ){ // If the list is empty or
                  // d is a multiple of the list size, no rotation is needed.
    return;
}
d=d%n;// Handle cases where d is greater than the size of the list
List<Integer> rotatelist=new ArrayList<>();
rotatelist.addAll(list.subList(d,n));//add elements from d to n
rotatelist.addAll(list.subList(0,d));//add elements from 0 to d
for(int i=0;i<rotatelist.size();i++){
    System.out.print(rotatelist.get(i)+" ");

}
    }

    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5));
        int d=2;
        rotatelist(list,d);
    }
}
//output:3 4 5 1 2