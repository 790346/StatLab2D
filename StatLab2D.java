import java.util.*;
public class StatLab2D
{
    int[][] matrix = new int[5][5];

    public StatLab2D()
    {
    
    }
    public void loadArray2D()
    {
        for(int i = 0; i <= matrix.length; i++)
        {
            matrix[i][i] = (int)((Math.random() * 10) + 1);
        }
    }
    public void printArray2D()
    {
        for(int i = 0; i <= matrix.length; i++)
        {
            System.out.print(matrix[i][i] + "\t");
        }
    }
    public void sortArray2D()
    {
        for(int i = 0; i <= matrix.length; i++)
        {
            Arrays.sort(matrix);
        }
    }
    public double getMean2D()
    {
        double sum = 0;
        double average = 0;
        for(int i = 0; i<= matrix.length; i++)
        {
            sum = sum + matrix[i][i];
        }
        average = sum / matrix.length;
        return average;
    }
}
