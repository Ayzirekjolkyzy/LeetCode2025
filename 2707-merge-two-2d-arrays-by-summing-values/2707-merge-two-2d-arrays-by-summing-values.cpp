class Solution {
public:
    vector<vector<int>> mergeArrays(vector<vector<int>>& nums1, vector<vector<int>>& nums2) {
         vector<vector<int>> merge; int temp=0;
         for(int i=0, j=0; i<nums1.size()||j<nums2.size(); i++, j++) {
             if(i>=nums1.size()) merge.push_back({nums2[j][0], nums2[j][1]});
            else if(j>=nums2.size()) merge.push_back({nums1[i][0], nums1[i][1]});
            else{
             if(nums1[i][0]==nums2[j][0])
                 {  temp=nums1[i][1]+nums2[j][1]; merge.push_back({nums1[i][0], temp}); }
            else if(nums1[i][0]>nums2[j][0])
                 { merge.push_back({nums2[j][0], nums2[j][1]}); i--; }
            else { merge.push_back({nums1[i][0], nums1[i][1]}); j--; }
            }}
            return merge;
    }
};