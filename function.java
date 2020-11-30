class function
{
public static void main(String[] args)
{
  int a[]={10,11,7,12,14};
  int lar=a[0];
  int sm=a[0];
  
  for(int i=0;i<a.length;i++)
  {
  if(a[i]>lar)
  lar=a[i];
  }
  for(int i=0;i<a.length;i++)
  {
  if(a[i]<sm)
  sm=a[i];
  }
  System.out.println(lar-sm);
}
}
  