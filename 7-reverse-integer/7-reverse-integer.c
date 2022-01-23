int reverse(int x)
{
  int p = x;
  int rem = 0, rev;
  while(p != 0)
  {
     rem = p % 10;
     p /= 10;
     if (rev > INT_MAX/10 || (rev == INT_MAX / 10 && rem > 7)) return 0;
     if (rev < INT_MIN/10 || (rev == INT_MIN / 10 && rem < -8)) return 0;
     rev = rev * 10 + rem;       
  }
   
    return rev;
}
