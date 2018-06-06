
/**
 * Description:The backbone of the template system used in four_point_three
 * @Author tzhao42(2018)
 * @version 180517
 */
public class LabMaker
{
    //OUTPUTS
    private String Header ="";
    private String Purpose="";
    private String Hypothesis ="";
    private String Materials="";
    private String Diagram ="";
    private String Procedure ="";
    private String mA=""; //math analysis
    private String errorCalcs="";
    private String eA=""; //error analysis

    private String Conclusion="";
    private String Claim="";
    private String Evidence="";
    private String Reasoning="";
    
    private String Print;

    //getters for outputs
    
    public String getHeader(){
        return Header;
    }

    public String getPurpose(){
        return Purpose;
    }

    public String getHypothesis(){
        return Hypothesis;
    }

    public String getMaterials(){
        return Materials;
    }

    public String getProcedure(){
        return Procedure;
    }

    public String getmA(){
        return mA;
    }

    public String geterrorCalcs(){
        return errorCalcs;
    }

    public String geteA(){
        return eA;
    }

    public String getConclusion(){
        return Conclusion;
    }

    public String getClaim(){
        return Claim;
    }

    public String getEvidence(){
        return Evidence;
    }

    public String getReasoning(){
        return Reasoning;
    }
    
    public String getPrint(){
        return Print;
    }
    
    String Title;
    String Author;
    String Date;
    String labPartner;
    int subNum;
    public LabMaker(DataBank[] d, String Title, String Author, String Date, String labPartner, int subNum){
        this.Title = Title;
        this.Author = Author;
        this.Date = Date;
        this.labPartner = labPartner;
        this.subNum = subNum;

        for(int i = 0; i< subNum; i++){
            if(d[i].getRelation().equals("positive")||d[i].getRelation().equals("Positive")||d[i].getRelation().equals("negative")||d[i].getRelation().equals("Negative")){
                //Yay!!
            }
            else{
                throw new java.lang.RuntimeException("Error: variable 'relation' must match 'positive' or 'negative'");
            }
        }
        
        // String Equipment=d[subNum].getEquipment();
        // this.Procedure=d[subNum].getProcedure();
        // //this.Diagram=d.getDiagram();
        // double Slope=d[subNum].getSlope();
        // double yInt=d[subNum].getYint();
        // String yUnit=d[subNum].getyUnit();
        // String xUnit=d[subNum].getxUnit();
        // String yShort=d[subNum].getyShort();
        // String xShort=d[subNum].getxShort();
        // String yLong=d[subNum].getyLong();
        // String xLong=d[subNum].getxLong();
        // boolean directProp=d[subNum].getDirectProp();
        // String accSlopeSig=d[subNum].getAccSlopeSig();
        // double accSlopeValue=d[subNum].getAccSlopeValue();
        // String accYintSig=d[subNum].getAccYintSig();
        // double accYintValue=d[subNum].getAccYintValue();
        
        
        //Header
        this.Header=
        "Title: "+Title
        +"^Author: "+Author
        +"^Date Performed: "+ Date
        +"^Lab Partner: "+labPartner;
        
        //Purpose    
        Purpose += "There were " + subNum + " objectives in this lab. ^";
        for(int i = 0; i < subNum; i++){
            Purpose += "In part " + (i+1) + " we were to determine the relationship between "+d[i].getiVariable()+" and "+ d[i].getdVariable()+ ". ^";
            Purpose += d[i].getExplan() +"^";
        }
        
        //Hypothesis    
        for(int i = 0; i< subNum; i++){
            if(d[i].getRelation().equals("positive")){
                this.Hypothesis += "As " + d[i].getiVariable() + " increases, " + d[i].getdVariable() + " increases also.^";
            }
            else if(d[i].getRelation().equals("negative")){
                this.Hypothesis += "As " + d[i].getiVariable() + " increases, " + d[i].getdVariable() + " decreases.^";
            }
        }

        //Materials, array to string
        for(int i = 0; i <subNum; i++){
            for(String s:d[i].getEquipmentList()){
                this.Materials+= s+ "^";
            }
        }
        //Note: For some reason, this keeps returning the first equipment
        //  as nulleequip1 instead of equip1, which is shouldn't be happening
        //  but is happening anyway...
        
        //Procedure 
        for(int i = 0; i<subNum;i++){
            this.Procedure+=d[i].getProcedure();
        }   
        
        //mathematical analysis
        for(int i = 0; i<subNum;i++){
            if(!d[i].getYIntError()){
                this.mA+=
                "$ "+d[i].getyShort()+" \\\\to \\\\text{"+d[i].getyLong()+"} \\newline$"
                +"^$ "+d[i].getxShort()+" \\\\to \\\\text{"+d[i].getxLong()+"} \\newline$"
                +"^$ y \\\\propto x \\newline$"
                +"^$ "+d[i].getyShort()+" \\\\propto "+d[i].getxShort()+" \\newline$"
                +"^$ "+d[i].getyShort()+" = k* "+d[i].getxShort()+" \\newline$"
                +"^$ k = \\\\frac{\\\\Delta "+d[i].getyShort()+"}{\\\\Delta "+d[i].getxShort()+"} \\newline$"
                +"^$ k = "+d[i].getSlope()+" \\\\frac{"+d[i].getyUnit()+"}{"+d[i].getxUnit()+"} \\\\hspace{0.25cm}\\\\text{slope calculated by logger pro} \\newline$"
                +"^$ "+d[i].getyShort()+" = "+d[i].getSlope()+" \\\\frac{"+d[i].getyUnit()+"}{"+d[i].getxUnit()+"} * "+d[i].getxShort()+" $^^";
            }
            else{
                this.mA+=
                "$ "+d[i].getyShort()+" \\to \\text{"+d[i].getyLong()+"} \\newline$"
                +"^$ "+d[i].getxShort()+" \\to \\text{"+d[i].getxLong()+"} \\newline$"
                +"^$ y = mx + b \\newline$"
                +"^$ "+d[i].getyShort()+" = k* "+d[i].getxShort()+" + b\\newline$"
                +"^$ k = \\frac{\\Delta "+d[i].getyShort()+"}{\\Delta "+d[i].getxShort()+"} \\newline$"
                +"^$ k = "+d[i].getSlope()+" \\frac{"+d[i].getyUnit()+"}{"+d[i].getxUnit()+"} \\hspace{0.25cm}\\text{slope calculated by logger pro} \\newline$"
                +"^$ b = "+d[i].getYint()+" "+d[i].getYint()+" \\hspace{0.25cm}\\text{y-intercept calculated by logger pro}\\newline$"
                +"^$ "+d[i].getyShort()+" = "+d[i].getSlope()+" \\frac{"+d[i].getyUnit()+"}{"+d[i].getxUnit()+"} * "+d[i].getxShort()+" + "+d[i].getYint()+" "+d[i].getyUnit()+ "$^^";
            }
        }
        //Error Calcs
        double absESlope[]=new double[subNum];
        double relESlope[]=new double[subNum];
        double absEYint[]=new double[subNum];
        double relEYint[]=new double[subNum];
        for(int i = 0; i<subNum; i++){
           absESlope[i]=Math.abs(d[i].getAccSlopeValue() - d[i].getSlope());
           relESlope[i]=absESlope[i]/d[i].getAccSlopeValue();
           absEYint[i]=Math.abs(d[i].getAccYintValue() - d[i].getYint());
           relEYint[i]=absEYint[i]/d[i].getAccYintValue();
           if(d[i].getSlopeError()){
                this.errorCalcs+=
                "^^Experimental Value: Slope of "+d[i].getyLong()+" vs. "+d[i].getxLong() +" graph"
                +"^Experimental Value: "+d[i].getSlope()+" "+d[i].getyUnit()+"/"+d[i].getxUnit()
                +"^Accepted Value: "+d[i].getAccSlopeSig()
                +"^Accepted Value: "+d[i].getAccSlopeValue() +" "+d[i].getyUnit()+"/"+d[i].getxUnit()
                +"^^Absolute Error:"
                +"^Absolute Error = |accepted value - experimental value|"
                +"^Absolute Error = |"+d[i].getSlope()+" "+d[i].getyUnit()+"/"+d[i].getxUnit()+" - "+d[i].getAccSlopeValue() +" "+d[i].getyUnit()+"/"+d[i].getxUnit()
                +"|^Absolute Error = "+absESlope[i]+" "+d[i].getyUnit()+"/"+d[i].getxUnit()
                +"^^Relative Error"
                +"^Relative Error = (Absolute Error)/(Accepted Value)"
                +"^Relative Error = ("+absESlope[i]+" "+d[i].getyUnit()+"/"+d[i].getxUnit()+")/("+d[i].getAccSlopeValue()+" "+d[i].getyUnit()+"/"+d[i].getxUnit()+")"
                +"^Relative Error = "+relESlope[i]
                +"^Relative Error = "+relESlope[i]*100.00+"% ^";
           }
           if(d[i].getYIntError()){
                this.errorCalcs+=
                "^^Experimental Value: y-intercept of "+d[i].getyLong()+" vs. "+d[i].getxLong()  +" graph"
                +"^Experimental Value: "+d[i].getYint()+" "+d[i].getyUnit()
                +"^Accepted Value: "+d[i].getAccYintSig()
                +"^Accepted Value: "+ d[i].getAccYintValue() +" "+d[i].getyUnit()
                +"^^Absolute Error:"
                +"^Absolute Error = |accepted value - experimental value|"
                +"^Absolute Error = |"+d[i].getYint()+" "+d[i].getyUnit()+" - "+ d[i].getAccYintValue() +" "+d[i].getyUnit()
                +"|^Absolute Error = "+absEYint[i]+" "+d[i].getyUnit()
                +"^^Relative Error"
                +"^Relative Error = (Absolute Error)/(Accepted Value)"
                +"^Relative Error = ("+absEYint[i]+" "+d[i].getyUnit()+")/("+d[i].getAccYintValue()+" "+d[i].getyUnit()+")"
                +"^Relative Error = "+relEYint[i]
                +"^Relative Error = " + relEYint[i] * 100.00 +"% ^";
           }
        }
        //Error Analysis
        this.eA=
        "One source of error could have been [reason]."
        +"^This would have caused [variable] to be [larger/smaller] than its true value."
        +"^Another source of error could have been [reason]."
        +"^This would have caused [variable] to be [larger/smaller] than its true value.";
        
        //CONCLUSION
        
        for(int i = 0; i<subNum; i++) {
            //Claim
            
            this.Claim+= "As "+d[i].getiVariable()+" increases, "+d[i].getdVariable();
            if(d[i].getRelation().equals("positive")){
                this.Claim+=" increases as well.^";
            }
            else{
                this.Claim+=" decreases.^";
            }
    
            //Evidence and Reasoning
            if(d[i].getSlopeError()){
                this.Evidence+=
                "The "+d[i].getyLong()+" vs "+d[i].getxLong()+" graph was linear, with a slope of "+d[i].getSlope()+" "+d[i].getyUnit()+"/"+d[i].getxUnit()
                    +" that had a relative error of "+relESlope[i] * 100.00+"% off of the accepted value for "+d[i].getAccSlopeSig()
                    +" after error analysis, and a negligible y-intercept.^";
    
                Reasoning+=
                "Linearity and a negligible y-intercept in the "+d[i].getyLong()+" vs "+d[i].getxLong()+" graph indicates that "
                    +d[i].getyLong()+" and "+d[i].getxLong()+" are directly proportional. The low relative error when compared to the accepted value of "
                    +d[i].getAccSlopeSig()+" indicates that the physical significance of the slope of a "
                    +d[i].getyLong()+" vs "+d[i].getxLong()+" graph is the "+d[i].getAccSlopeSig()+".^";
            }
            else if((d[i].getSlopeError())&& (d[i].getYIntError())){
                this.Evidence+=
                "The "+d[i].getyLong()+" vs "+d[i].getxLong()+" graph was linear, with a slope of "+d[i].getSlope()+" "+d[i].getyUnit()+"/"+d[i].getxUnit()
                    +" that had a relative error of "+relESlope[i]*100.00+"% off of the accepted value for "+d[i].getAccSlopeSig()
                    +" after error analysis, and a y-intercept of "+d[i].getYint()+" "+d[i].getyUnit()
                    +" that had a relative error of "+relEYint[i]*100.00+ "% off of the accepted value for "+d[i].getAccYintSig() +"after error analysis.^";
                    
                this.Reasoning+=
                "Linearity in the "+d[i].getyLong()+" vs "+d[i].getxLong()+" graph indicates that "
                    +d[i].getyLong()+" and "+d[i].getxLong()+" have a linear relationship. "
                    +"The low relative error when compared to the accepted value of "
                    +d[i].getAccSlopeSig()+" indicates that the physical significance of the slope of a "
                    +d[i].getyLong()+" vs "+d[i].getxLong()+" graph is the "+d[i].getAccSlopeSig()+"."
                    +"The low relative error when compared to the accepted value of "
                    +d[i].getAccYintSig()+" indicates that the physical significance of the y-intercept of a "
                    +d[i].getyLong()+" vs "+d[i].getxLong()+" graph is the "+d[i].getAccYintSig()+".^";
            }
        }
        //Conclusion
        this.Conclusion ="^EDIT ME TO SOUND LESS AUTO GENERATED!!^^";
        this.Conclusion+=
        "Restatement of purpose:^"
        +this.Purpose
        +"^^Restatement of hypothesis:^"
        +this.Hypothesis
        +"^^Brief description of experiment:^"
        +"^[EDIT ME DOWN!]^"+Procedure
        +"^^Claim:^"
        +this.Claim
        +"^^Evidence:^"
        +this.Evidence
        +"^^Reasoning:^"
        +this.Reasoning
        +"^^Addressing the Hypothesis";
        if(d[0].getsupportHyp()){
            this.Conclusion+="^The data supports the claims, "
            +"and the claims support the hypothesis, "
            +"so the data supports the hypothesis.";
        }
        else{
            this.Conclusion+="^The data does not support the hypothesis.";
        }

        this.Conclusion+="^^Summary of Results Reached:^"
        +"After observing [what you observed], we found that:"
        +"^bullet point 1 (ex: Total momentum is conserved in every interaction)"
        +"^bullet point 2 (ex: translational kinetic energy is conserved in elastic collisions)";
        
        //Print form
        
        this.Print=this.Header
            +"^^Purpose:^"
            +this.Purpose
            +"^^Hypothesis:^"
            +this.Hypothesis
            +"^^Materials:^"
            +this.Materials
            +"^^Procedure:^"
            +this.Procedure
            +"^^Diagram:^"
          //  +this.Diagram
            +"^^Mathematical Analysis:^"
            +this.mA
            +"^^Error Calculations:^"
            +this.errorCalcs
            +"^^Error Analysis:^"
            +this.eA
            +"^^Conclusion:^"
            +this.Conclusion;
    }
    public void print(){
        System.out.println(this.Header
            +"^^Purpose:^^^^"
            +this.Purpose
            +"^^Hypothesis:^"
            +this.Hypothesis
            +"^^Materials:^"
            +this.Materials
            +"^Procedure:^"
            +this.Procedure
            +"^^Diagram:^"
           // +this.Diagram
            +"^^Mathematical Analysis: ^"
            +this.mA
            +"^^Error Calculations: ^"
            +this.errorCalcs
            +"^^Error Analysis: ^"
            +this.eA
            +"^^Conclusion:^"
            +this.Conclusion);
    }
}