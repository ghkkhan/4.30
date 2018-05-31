
public class Grades {
    private double sem1;
    private double sem2;
    private double goal;
    private double weightSem1;
    private double weightSem2;
    private double finalGrade;
    
    
    public void setGrades(double sem1,double sem2){
        this.sem1=sem1;
        this.sem2=sem2;
    }
    
    public void setWeights(double weightSem1,double weightSem2){
        this.weightSem1=weightSem1;
        this.weightSem2=weightSem2;
    }
    
    public double getSem1(){
        return sem1;
    }
    
    public double getSem2(){
        return sem2;
    }
    
    public void setGoal(double goal){
        this.goal=goal;
    }
    
    public double getGoal(){
        return goal;
    }
    
    public void calculateFinal(){
        double finalPercent= 100.0-weightSem1-weightSem2;
        double pointsSoFar= (sem1*weightSem1+sem2*weightSem2)/100.0;
        double finalPoints= goal-pointsSoFar;
        this.finalGrade= finalPoints/finalPercent*100;
    }
    
    public double getFinalGrade(){
        return finalGrade;
    }
}
