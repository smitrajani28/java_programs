package sample_package;

public class rectangle extends shape{
    rectangle(int dim1, int dim2){
        super(dim1, dim2);
    }
    public int area(){
        return dim1*dim2;
    }
}
