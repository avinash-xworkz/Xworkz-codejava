class findLargeSmallDifference 
{
public static void main(String[] args)
{
  int a[]={10,11,7,12,14};
  int lar=0;
  int sm=0;
  
  for(int i=0;i<a.length;i++)
  {
  if(a[i]>lar)
  lar=a[i];
  else
  sm=a[i];
  }
  for(int i=0;i<a.length;i++)
  {
  if(a[i]<sm)
  sm=a[i];
  }
  System.out.println(lar-sm);
}
}
  
  
  
  
  
  
  
  
  
  
  