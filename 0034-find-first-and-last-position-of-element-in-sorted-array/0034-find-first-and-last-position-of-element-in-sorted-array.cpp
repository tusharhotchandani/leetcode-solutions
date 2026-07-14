class Solution {
public:

    int left(vector<int>& arr , int size , int key){
        int s=0, e = size-1;
        int mid=s + (e-s)/2;
        int ans = -1;

        while(s<=e){
            if(arr[mid] == key ){
                e=mid-1;
                ans = mid;
            }
            else if(arr[mid] < key){
                s= mid+1;
            }
            else if(arr[mid] > key){
                e= mid-1;
            }

            mid = s + (e-s)/2 ;
        }
        return ans;
    }

    int right(vector<int>& arr , int size , int key){
        int s=0, e = size-1;
        int mid=s + (e-s)/2;
        int ans = -1;

        while(s<=e){
            if(arr[mid] == key ){
                s = mid+1;
                ans = mid;
            }
            else if(arr[mid] < key){
                s= mid+1;
            }
            else if(arr[mid] > key){
                e= mid-1;
            }

            mid = s + (e-s)/2 ;
        }
        return ans;
    }

    vector<int> searchRange(vector<int>& nums, int target) {
        int len = nums.size();
        vector<int> v = {-1,-1};

        v[0]=left(nums, len, target);
        v[1]=right(nums, len, target);

        return v;
    }
};