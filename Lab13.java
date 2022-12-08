import java.util.ArrayList;
import java.io.BufferedReader;

public class Lab13 {

	private ArrayList<Integer> inputArray = new ArrayList<>();
	
	public void readData(String filename)
	{
		
		try
		{
			BufferedReader input = new BufferedReader(new java.io.InputStreamReader(new java.io.FileInputStream(filename)));
			String inn;
			//input.readLine();
			
			while((inn = input.readLine()) != null)
			{
				inputArray.add(Integer.parseInt(inn));
			}
			input.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	public long getTotalCount()
	{
		return inputArray.stream().count();
	}
	
	public long getOddCount()
	{
		return inputArray.stream().filter(x -> x%2 == 1 ).count();
	}
	
	public long getEvenCount()
	{
		return inputArray.stream().filter(x -> x%2 == 0).count();
	}
	
	public long getDistinctGreaterThanFiveCount()
	{
		return inputArray.stream().distinct().filter(x -> x-5 > 0).count();
	}
	
	public Integer[] getResult1()
	{
		return inputArray.stream().sorted().filter(x -> x < 50 && x > 5).filter(x -> x%2 == 0).toArray(Integer[]::new);
	}
	
	public Integer[] getResult2()
	{
		return inputArray.stream().map(x -> x*x).map(x -> x*3).limit(50).toArray(Integer[]::new);
	}
	
	public Integer[] getResult3()
	{
		return inputArray.stream().filter(x -> (x-1)%2 == 0).map(x -> x*2).sorted().skip(20).distinct().toArray(Integer[]::new);
	}
	
	
	
	
}
