/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nandini
 */

class glassnode {
    float capacity, filled;
    glassnode left,right;
   glassnode(){
        capacity = 1;
        filled = 0;
        left = null;
        right = null;
    }
}
public class solution{
    public static float remainingCapacity(glassnode glass){
        if(glass.capacity == glass.filled)
            return 0;
        return glass.capacity-glass.filled;
    }
    public static glassnode fillGlass(glassnode glass, float liqQuant){
        if(glass == null)
            return glass;

        if(liqQuant <= remainingCapacity(glass)) { // liq <= cap
            glass.filled += liqQuant;
            return glass;
        }
        else{ // liq > cap
            float liqSpill = liqQuant - remainingCapacity(glass);
            glass.filled = glass.capacity;
            glass.left = fillGlass(glass.left,liqSpill/2);
            glass.right = fillGlass(glass.right,liqSpill/2);
            return glass;
        }
    }
    public static void main(String[] args) {
        glassnode parentGlass = new glassnode();
        parentGlass.left = new glassnode();
        parentGlass.right = new glassnode(); // 2 layer
        glassnode leftNode = parentGlass.left;
        leftNode.left = new glassnode();
        leftNode.right = new glassnode();
        glassnode rightNode = parentGlass.right;
        rightNode.left = leftNode.right;
        rightNode.right = new glassnode(); // 3 layer;
        parentGlass = fillGlass(parentGlass, 4);
    }
}
