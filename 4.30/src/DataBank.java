import java.util.*;

public class DataBank{
//INPUTS
    /*
    private static String Title;
    private static String Author;
    private static String Date;
    private static String labPartner;
    */
    private String iVariable;
    private String dVariable;
    private String explan;
    private String relation="positive"; // either "positive" or "negative" //new
    
    private String Equipment = "";
    private String[] Equiptment;

    private String Diagram = "diagram placeholder";

    private String Procedure = "";

    private double Slope;
    private double yInt; //changed from yInersept to yInt
    private String yUnit; //new (y axis units; not necessarily same as dVarUnit)
    private String xUnit; //new
    private String yShort; //new (y axis short name)
    private String xShort; //new
    private String yLong; //new (y axis long name)
    private String xLong; //new 

    //private boolean directProp; //new (whether or not this is a direct proportion)

    private boolean slopeError;
    private String accSlopeSig; //new accepted value physical significance
    private double accSlopeValue; //new value of the accepted variable
    private boolean yIntError;
    private String accYintSig;
    private double accYintValue;

    private boolean supportHyp; //whether or not the hypothesis is supported by the data

    //SETTERS AND GETTERS FOR ALL THE INPUTS
    /*
    public static String getTitle() {
        return Title;
    }
    public void setTitle(String Title) {
        this.Title = Title;
    }
    public static String getAuthor() {
        return Author;
    }
    public void setAuthor(String Author) {
        this.Author = Author;
    }
    public static String getDate() {
        return Date;
    }
    public void setDate(String Date) {
        this.Date = Date;
    }
    public static String getLabPartner() {
        return labPartner;
    }
    public void setLabPartner(String labPartner) {
        this.labPartner = labPartner;
    }
    */
    public String getiVariable() {
        return iVariable;
    }
    public void setiVariable(String iVariable) {
        this.iVariable = iVariable;
    }
    public String getdVariable() {
        return dVariable;
    }
    public void setdVariable(String dVariable) {
        this.dVariable = dVariable;
    }
    public String getExplan(){
        return explan;
    }
    public void setExplan(String explan){
        this.explan = explan;
    }
    public String getRelation() {
        return relation;
    }
    public void setRelation(String relation) {
        this.relation = relation;
    }
    public String getEquipment() {
        return Equipment;
    }
    public void setEquipment(String Equipment) {
        this.Equipment = Equipment;
        String s=Equipment;
        String[] sarry;
        String item;
        ArrayList<String> temp = new ArrayList<String>();
        int commatot=0;
        int[] commas;
        for(int i=0; i<Equipment.length(); i++){
            if(Equipment.substring(i,i+1).equals(",")){
                commatot++;
            }
        }
        commas=new int[commatot];
        int lol=0;
        for(int i=0; i<Equipment.length(); i++){
            if(Equipment.substring(i,i+1).equals(",")){
                commas[lol]=i;
                lol++;
            }
        }
        for(int j=0; j<commas.length;j++){
            if(j==0){
                item=Equipment.substring(0,commas[j]);
                temp.add(item);
            }
            // else if(j==commas.length-1){
                // item=Equipment.substring(commas[j]+1);
                // temp.add(item);
            // }
            else{
                item=Equipment.substring(commas[j-1]+1,commas[j]);
                temp.add(item);
                if(j==commas.length-1){
                    item=Equipment.substring(commas[j]+1);
                    temp.add(item);
                }
            }
        }
        int total=temp.size();
        sarry= new String[total];
        for(int index=0; index<total; index++){
            sarry[index]=temp.get(index);
        }
        this.Equiptment = sarry;
    }
    public String[] getEquipmentList(){
        return Equiptment;
    }
    public String getProcedure() {
        return Procedure;
    }
    public void setProcedure(String Procedure) {
        this.Procedure = Procedure;
    }
    public double getSlope() {
        return Slope;
    }
    public void setSlope(double Slope) {
        this.Slope = Slope;
    }
    public double getYint() {
        return yInt;
    }
    public void setYint(double yInt) {
        this.yInt = yInt;
    }
    public String getyUnit() {
        return yUnit;
    }
    public void setyUnit(String yUnit) {
        this.yUnit = yUnit;
    }
    public String getxUnit() {
        return xUnit;
    }
    public void setxUnit(String xUnit) {
        this.xUnit = xUnit;
    }
    public String getyShort() {
        return yShort;
    }
    public void setyShort(String yShort) {
        this.yShort = yShort;
    }
    public String getxShort() {
        return xShort;
    }
    public void setxShort(String xShort) {
        this.xShort = xShort;
    }
    public String getyLong() {
        return yLong;
    }
    public void setyLong(String yLong) {
        this.yLong = yLong;
    }
    public String getxLong() {
        return xLong;
    }
    public void setxLong(String xLong) {
        this.xLong = xLong;
    }
    // public boolean getDirectProp() {
        // return directProp;
    // }
    // public void setDirectProp(boolean directProp) {
        // this.directProp = directProp;
    // }
    public boolean getSlopeError() {
        return slopeError;
    }
    public void setSlopeError(boolean slopeError) {
        this.slopeError = slopeError;
    }
    public boolean getYIntError() {
        return yIntError;
    }
    public void setYIntError(boolean yIntError) {
        this.yIntError = yIntError;
    }
    //private String accSlopeSig; //new accepted value physical significance
    //private double accSlopeValue; //new value of the accepted variable
    //private String accYintSig;
    //private double accYintValue;
    
    public void setAccSlopeSig(String accSlopeSig){
        this.accSlopeSig=accSlopeSig;
    }
    
    public void setAccSlopeValue(double accSlopeValue){
        this.accSlopeValue=accSlopeValue;
    }
    
    public void setAccYintSig(String accYintSig){
        this.accYintSig=accYintSig;
    }
    
    public void setAccYintValue(double accYintValue){
        this.accYintValue=accYintValue;
    }
    public String getAccSlopeSig(){
        return accSlopeSig;
    }
    
    public double getAccSlopeValue(){
        return accSlopeValue;
    }
    
    public String getAccYintSig(){
        return accYintSig;
    }
    
    public double getAccYintValue(){
        return accYintValue;
    }
    public boolean getsupportHyp(){
        return supportHyp;
    }
    public void setsupportHyp(boolean supportHyp){
        this.supportHyp = supportHyp;
    }
}