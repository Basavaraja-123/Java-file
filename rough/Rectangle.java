class RectangleEx{
    int lenth;
    int width;
    void  multiplyRectangle(int l, int w){
        lenth=l;
        width=w;
    }
    void displyRectangle(){
        System.out.println(lenth*width);
    }
}
class Rectangle{
    public static void main(String args[]){
        RectangleEx r1= new RectangleEx();
        RectangleEx r2= new RectangleEx();

        r1.multiplyRectangle(10,20);
        r2.multiplyRectangle(30,10);
        r1.displyRectangle();
        r2.displyRectangle();
    }
}