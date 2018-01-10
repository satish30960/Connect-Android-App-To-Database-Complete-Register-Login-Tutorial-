# III-CSE-Coding-Skills
#include <math.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <assert.h>
#include <limits.h>
#include <stdbool.h>

int main(){
    int n; 
    scanf("%d",&n);
    int *arr = malloc(sizeof(int) * n);
    for(int arr_i = 0; arr_i < n; arr_i++){
       scanf("%d",&arr[arr_i]);
    }
     for(int arr_i = n-1; arr_i >=0; arr_i--){
       printf("%d ",arr[arr_i]);
    }
    
    return 0;
}

2)
#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>
#include <assert.h>
/* Head ends here */
int lonelyinteger(int a_size, int* a) {

    int i,j,n=a_size,temp,flag;
    for(i=0 ; i<n ; i++)
 {
  for(j=0 ; j<n-i-1 ; j++)
  {
   if(a[j]>a[j+1]) 
   {
    temp=a[j];
    a[j]=a[j+1];
    a[j+1]=temp;
   }
  }
 }
 i=0;
while(i!=n){
if(a[i]!=a[i+1])
{
    return a[i];

}
i=i+2;
}

return a[n];
}

int main() {
    int res;

    int _a_size, _a_i;
    scanf("%d", &_a_size);
    int _a[_a_size];
    for(_a_i = 0; _a_i < _a_size; _a_i++) {
        int _a_item;
        scanf("%d", &_a_item);

        _a[_a_i] = _a_item;
    }

    res = lonelyinteger(_a_size, _a);
    printf("%d", res);

    return 0;
}
3)
import java.util.*;

public class Solution {
  public static void printArr(int[] arr){
    for(int i:arr){
      System.out.print(i+" ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // the number of integer
    int n = sc.nextInt();
    // the number of left rotations
    int d = sc.nextInt();

    // cut the rotation size
    d = d%n;

    int[] arr = new int[n];
    for(int i=0; i<n; i++ ){
      arr[i] = sc.nextInt();
    }
    //printArr(arr);

    int[] otherArr = new int[n];
    for(int i=0; i<n; i++){
      // point that have to left rotation move
      int pos = (i+n-d)%n;
      otherArr[pos] = arr[i];
    }
    printArr(otherArr);
  }
}

5)
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


 
public class DynamicArray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int q = in.nextInt();
        List<Integer>[] sequences = new List[n];
        for (int n_i = 0; n_i < n; n_i++) {
            sequences[n_i] = new ArrayList<>();
        }
        int lastans = 0;
        for (int i = 0; i < q; i++) {
            int t = in.nextInt();
            int x = in.nextInt();
            int y = in.nextInt();
            List<Integer> sequence = sequences[(x^lastans)%n];
            switch (t) {
                case 1:
                    sequence.add(y);
                    break;
                case 2:
                    lastans = sequence.get(y%sequence.size());
                    System.out.println(lastans);
                    break;
            }
        }

    }

}
6)
#include <stdio.h>

int main()
{
    int n, m;
    int fst, num;
    int buf[202] = { 0 };

    scanf("%d", &n);
    scanf("%d", &fst);
    buf[101]++;
    for (int i = 1; i < n; i++) {
        scanf("%d", &num);
        buf[num - fst + 101]++;
    }

    scanf("%d", &m);
    for (int i = 0; i < m; i++) {
        scanf("%d", &num);
        buf[num - fst + 101]--;
    }

    for (int i = 0; i < 202; i++) {
        if (buf[i] < 0)
            printf("%d ", i + fst - 101);
    }
    printf("\n");

    return 0;
}
7)

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        long[] prices = new long[n];
        HashMap<Long,Integer> indices = new HashMap<>();

        
        for(int i = 0; i < n; i++){
            prices[i] = input.nextLong();
            indices.put(prices[i],i);
        }

        Arrays.sort(prices);
        Long minimumLoss = Long.MAX_VALUE;

        //Iterate from end to start
        for(int i = n-1; i >0; i--){
            //Make sure it is a smaller loss
            if(prices[i]-prices[i-1] < minimumLoss){
                //Verify if the pair is a valid transaction
                if(indices.get(prices[i]) < indices.get(prices[i-1]))
                    minimumLoss = prices[i]-prices[i-1];
            }
        }

        System.out.println(minimumLoss);

    }
}
8)
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       int n, max,sum=0;
        Scanner s = new Scanner(System.in);
     
        n = s.nextInt();
        int a[] = new int[n];
       
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        max = a[0];
        for(int i = 0; i < n; i++)
        {
            if(max < a[i])
            {
                max = a[i];
             
            }
            
        }
        
        for(int i=0;i<n;i++){
            if(a[i]!=max){
                sum=sum+a[i];
            }
        }
        if(sum==max){
          System.out.println("Yes");
            System.out.println(sum);  
        }
       
        
}
}
10)
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       int n, max,sum=0,c=0;
        Scanner s = new Scanner(System.in);
     
        n = s.nextInt();
        int a[] = new int[n];
       
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        max = a[0];
        for(int i = 0; i < n; i++)
        {
            if(max < a[i])
            {
                max = a[i];
             
            }
            
        }
        
        for(int i=0;i<n;i++){
            if(a[i]!=max){
                sum=sum+a[i];
            }
        }
        System.out.println(sum);
        
}
}
