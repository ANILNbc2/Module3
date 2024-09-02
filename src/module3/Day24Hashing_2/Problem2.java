package module3.Day24Hashing_2;

import module3.Constants;

import java.util.*;

//This problem will make its own input
public class Problem2 {
    public static List<Integer[]> createInput(){
        List<Integer[]> points = new ArrayList<>();
        Random random = new Random();
        int upperLimit = 20;
        for (int i=0;i< Constants.arraySize;i++){
            Integer point[] = new Integer[2];
            point[0] = random.nextInt(upperLimit);
            point[1] = random.nextInt(upperLimit);
            points.add(point);
        }
        return points;
    }

    public static void solution(){
        List<Integer[]> points = createInput();
        Map<Integer, List<Integer[]>> xAxis = new HashMap<>();
        Map<Integer, List<Integer[]>> yAxis = new HashMap<>();
        List<Integer[]> xPoint;
        List<Integer[]> yPoint;
        for(Integer[] point:points){
            xPoint = xAxis.getOrDefault(point[0], new ArrayList<>());
            xPoint.add(point);
            xAxis.put(point[0], xPoint);
            yPoint = yAxis.getOrDefault(point[0],
                    new ArrayList<>());
            yPoint.add(point);
            yAxis.put(point[0], yPoint);
        }

        for(Integer xVal: xAxis.keySet()){
            if(xAxis.get(xVal).size() > 1) {
                List<Integer[]> xPoints = xAxis.get(xVal);
                for(Integer[] point : xPoints){
//Pending impl.
                }
            }
        }

    }

}
