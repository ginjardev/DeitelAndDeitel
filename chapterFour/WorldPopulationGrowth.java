package chapterFour;

public class WorldPopulationGrowth {

    long currentWorldPopulation = 0;
    double worldPopulationGrowthRate = 0;

    public void calculateWorldPopulationTable( long currentWorldPopulation, double worldPopulationGrowthRate, int time){

        System.out.printf("%s%13s%n", "Year", "Population");
        while(time >=1){
            long newWorldPopulation = (long) ((currentWorldPopulation * worldPopulationGrowthRate * time)/100 + currentWorldPopulation);

            System.out.printf("%d%14d%n", time, newWorldPopulation);
            time--;
        }

    }

    public static void main(String[] args) {
        WorldPopulationGrowth worldPopulationGrowth = new WorldPopulationGrowth();
        worldPopulationGrowth.calculateWorldPopulationTable(123456789, 3.0,75);
    }

}
