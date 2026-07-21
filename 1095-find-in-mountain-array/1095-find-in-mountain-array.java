/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {

        int  peak = findPeak(mountainArr) ;

        int first = binarySearch(mountainArr,target,0,peak,true);

        if(first!= -1) {
            return first;
        }

        return binarySearch(mountainArr, target, peak+1, mountainArr.length()-1, false);
        
    }

    private int findPeak(MountainArray arr) {
        int start =0;
        int end = arr.length() -1;

        while(start<end) {

            int mid = start+(end-start)/2;

            if(arr.get(mid) > arr.get(mid+1)) {

                end= mid;
            }
            else{
                start=mid+1;
            }
        }

        return start;

    }

    private int binarySearch(MountainArray arr,int target, int start, int end, boolean ascending){

        while(start<=end) {

            int mid = start+(end-start)/2;

            int value = arr.get(mid);
            if (value == target) {
                return mid;
            }

            if(ascending){
                if(target<value) {
                    end=mid-1;
                }

                else{
                    start= mid+1;
                }
            }
            else{

                if(target<value) {
                    start = mid+1;
                }

                else{

                    end= mid-1;
                }
            }
        }
        return -1;
    }
}