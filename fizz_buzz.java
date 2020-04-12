class Solution 
{
    public List<String> fizzBuzz(int n) 
    {
       List l1 = new ArrayList<>();
		for(int i=1;i<=n;i++)
		{
			
			l1.add(i % 15 == 0 ? "FizzBuzz" : i % 3 == 0 ? "Fizz": i % 5 == 0 ? "Buzz" : Integer.toString(i));
		}
		System.out.println(l1);
		return l1;
	}
    
}