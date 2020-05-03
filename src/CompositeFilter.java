package com.company;

import be.uliege.montefiore.oop.audio.*;

public class CompositeFilter implements Filter{

    //CompositeFilter 's variables
     private int nbInputs;
     private int nbOutputs;

     //Concstrucor
    public CompositeFilter(final int nbInputs, final int nbOutputs){
        this.nbInputs = nbInputs;
        this.nbOutputs = nbOutputs;
    }

    public int nbInputs()
    {
        return this.nbInputs;
    }

    public int nbOutputs()
    {
        return this.nbOutputs;
    }

    public void addBlock(Filter f){
        //adds a block to the composite filter
    }

    public double[] computeOneStep(double[] input){
        //Iteration with one sample of sound.
        return input;
    }

    public void connectBlockToBlock(Filter f1, int o1, Filter f2, int i2){
        //connects the output of f1 to the input of f2
    }

    public void connectBlockToOutput(Filter f1, int o1, int o2){
        //connects the output of f1 to the output of the composite filter
    }

    public void connectInputToBlock(int i1, Filter f2, int i2){
        //connects the intput of the composite filter to the input of f2
    }

    public void reset(){
        //Reset the composite filter
    }

}
