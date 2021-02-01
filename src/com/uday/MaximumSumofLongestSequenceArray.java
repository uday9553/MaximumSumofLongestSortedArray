package com.uday;

public class MaximumSumofLongestSequenceArray {
	public static void main(String[] args) {
		int arr[]= {20,21,22,15,16,40,20,7,8,9,2};
		int temp=0,result=0,start=0,end;
		for(int i=0;i<arr.length;i++) {
			if(i!=arr.length-1 && arr[i]<arr[i+1]) {
				continue;
			}else {
				end=i;
				temp=0;
				for(int j=start;j<=end;j++) {
					temp=temp+arr[j];
				}
				if(result<temp) {
					result=temp;
				}
				start=i+1;
			}
		}
		System.out.println("max value is "+result);
	
	}

}
