
Hints
1. Array values contains from 1...n

Algo:
Place every element at its correct index.

```
void sort(int[] nums) {
int i=0;
while(i<nums.length){
  int correctIndex = nums[i]-1;
  if(arr[i]!=arr[correctIndex]{
    swap(i, correctIndex);
  }else
  i++;
}

}
```
