package com.company;

import be.uliege.montefiore.oop.audio.Filter;

import javax.lang.model.type.NullType;
import java.util.ArrayList;
import java.util.List;


public class Block {

    // ****  InputBlock variables  ****
    List <com.company.Block> blockList = new ArrayList <com.company.Block>();

    // ****  OutputBlock variables ****
    double[] finalOutput;
    boolean boolOutput = false;

    // ****  BlockFilters variables ****
    private double[] input;
    private double[] output;
    private int inputIndex = -1;
    Filter filter;
    Block nextBlock;
    private int inputOccurence = 0;

    // **** AdditionBlock special variables ****
    private int[] inputAdd = new int[2];
    private int[] IndexAdd = new int[2];




    //Constructor for normal Blockfilters
    public Block(Filter F){
        this.filter = F;
    }

    //Constructor for inputBlock
    public Block(){

    }

    //Constructor for outputBlock
    public Block(int outputNumber) {
        this.finalOutput = new double[outputNumber];
        this.boolOutput = true;
    }



    public void InputBlockConnection(int inputNumber, Filter F, int filterInput){
        //code
    }

    public void setInputIndex(int index){
      /*  if(this.inputOccurence == 1){
            this.inputAdd[1] = index;
            this.inputAdd[0] =
        }else {
            this.inputIndex = index;
            this.inputOccurence++;
        }*/
        this.inputIndex = index;
    }

    public int getinputIndex(){
        return this.inputIndex;
    }
}