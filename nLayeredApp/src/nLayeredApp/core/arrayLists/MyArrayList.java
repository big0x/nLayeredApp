package nLayeredApp.core.arrayLists;

import java.util.Arrays;

import nLayeredApp.core.entities.Entity;

	public class MyArrayList<T extends Entity>{
		
	    private T[] myArray;
	    private Integer size = 1;


	    public MyArrayList() {
	        this.myArray = (T[]) new Object[size];
	    }

	    public void add(T element){
	        if (size == 1){
	            myArray[size-1] = element;
	            size++;
	        }
	        else {
	            T[] tempArray = (T[]) new Object[size];
	            for (int i = 0;i<myArray.length;i++){
	                tempArray[i] =myArray[i];
	            }
	            tempArray[size-1] = element;
	            myArray = tempArray;
	            size++;
	        }
	    }

	    public void print(){
	        Arrays.stream(myArray).forEach(System.out::println);
	    }


	    public void set(Integer index, T element){
	        myArray[index] = element;
	    }

	    public void remove(Integer index){
	        if (size > 1){
	            T[] temp = (T[]) new Object[size-2];
	            int counter = 0;
	            for (int i=0;i<myArray.length;i++){
	                if (i != index){
	                    temp[counter] = myArray[i];
	                    counter++;
	                }
	            }
	            myArray = temp;
	            size-=2;
	        }
	    }


	    public T get(Integer index){
	        return myArray[index];
	    }

	    public Integer size(){
	        return size;
	    }

	}

