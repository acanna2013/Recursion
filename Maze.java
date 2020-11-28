package Recursion;

public class Maze {
	private char[][] maze;
	private int row;
	private int col, i, j;
	private int add;
	private int subtract;
	
	public Maze(char[][] m, int i, int j)
	{
		maze = m;
		row = i; 
		col = j;
	}
	
	public boolean isEmpty(int row, int col) {
		if (maze[row][col] == '*' || maze[row][col] == '&')
			return false;
		else
			return true;
	}
	
	public boolean findExit()
	{
		return findExit(row, col);
	}
	
	public boolean findExit(int row, int col)
	{
		//exit found
		if ((row == 0 || row == maze.length-1 || col == 0 || col == maze[0].length-1) && isEmpty(row, col))
		{
			setIExit(row);
			setJExit(col);
			return true;
		}
		//check bounds
		else if (row < 0 || row >= maze.length || col < 0 || col >= maze.length)
			return false;
		//checks if visited/a wall
		else if (isEmpty(row, col) == false)
		{
			subtract-=1;
			return false;
		}
		else
		{
			add+=1;
			subtract+=1;
			maze[row][col] = '&';
			return findExit(row-1, col) || findExit(row+1, col) ||  findExit(row, col-1) || findExit(row, col+1);
		}
	}
	
	public void setIExit(int x)
	{
		i = x;
	}
	public int getIExit()
	{
		return i;
	}
	public void setJExit(int y)
	{
		j = y;
	}
	public int getJExit()
	{
		return j;
	}
	
	public void display()
	{
		for (int i =0; i < maze.length; i++)
		{
			for (int j = 0; j < maze[0].length; j++)
				System.out.print(maze[i][j] + " ");
			System.out.println();
		}
		
	}
	public int getSteps() {
		return Math.abs(add+subtract);
	}
}
