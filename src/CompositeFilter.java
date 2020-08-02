package com.company;


import be.uliege.montefiore.oop.audio.Filter;

import java.util.ArrayList;
import java.util.List;
import com.company.Block;


public class CompositeFilter implements Filter{

    //CompositeFilter 's variables
     private int nbInputs;
     private int nbOutputs;
     List<Block> blockList = new ArrayList <Block>();
    static int counts = 0;
    private Object AdditionFilter;


     //Constructor
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

    public double[] computeOneStep(double[] input){
        //Iteration with one sample of sound.
        if(counts < 4)
        for(int i =0; i < blockList.size(); i++){
            System.out.println("Le block " + i + " contient le filtre " + blockList.get(i).filter + " qui a l'index " + blockList.get(i).getinputIndex());
        }
        counts++;
        return input;
    }

    public void addBlock(Filter f){
        //adds a block to the composite filter

        Block tmp = new Block(f);
        blockList.add(tmp);
        System.out.println("List :" + blockList.get(counts).filter);
        counts++;
    }



    public void connectBlockToBlock(Filter f1, int o1, Filter f2, int i2){
        //connects the output of f1 to the input of f2
        int i = 0;
        int tmp1 =0, tmp2 = 0;
        for(;i < blockList.size(); i++){
            if(f1 == blockList.get(i).filter){
                tmp1 = i;
            }
            if(f2 == blockList.get(i).filter){
                tmp2 = i;
            }
        }
        blockList.get(tmp1).nextBlock =  blockList.get(tmp2);
        blockList.get(tmp2).setInputIndex(o1);

    }

    public void connectBlockToOutput(Filter f1, int o1, int o2){
        //connects the output of f1 to the output of the composite filter
    }

    public void connectInputToBlock(int i1, Filter f2, int i2){
        //connects the input of the composite filter to the input of f2
        int i =0;
        for(; i< blockList.size(); i++){
            if(f2 == blockList.get(i).filter){
                blockList.get(i).setInputIndex(i1);
            }
        }
    }

    public void reset(){
        //Reset the composite filter
    }


}
