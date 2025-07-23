int arrangeCoins(int n) {
  long left = 0,right = n;
  while(left<=right){
  long mid = (left+right)/2;
  long sum = mid*(mid+1)/2;
  if(sum == n) return mid;
  else if(sum < n)   left = mid + 1;
  else right = mid - 1;
}
return right;
}

