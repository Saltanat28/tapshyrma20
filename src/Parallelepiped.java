public class Parallelepiped {
    private double length,width,height;

    public Parallelepiped(double length, double width, double height) throws Exception {
        checkParameters(length,width,height);
    }

    private void checkParameters(double length,double width,double height) throws Exception {
        if((length < 0 || length > 20) || (width < 0 || width > 20) || (height < 0 || height > 20))
            throw new Exception("Parameters must be less than 20 and greater than 0.");
        else {
            this.length = length;
            this.width = width;
            this.height = height;
        }
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Parallelepiped{" +
                "length=" + length +
                ", width=" + width +
                ", height=" + height +
                '}';
    }

    public static void getArea(Parallelepiped parallelepiped){
        double result = 2 * ((parallelepiped.getLength() * parallelepiped.getHeight()) + (parallelepiped.getLength() * parallelepiped.getWidth()) + (parallelepiped.getHeight() * parallelepiped.getWidth()));
        System.out.println("Area of Parallelepiped is : " + result);
    }

    public static void getVolume(Parallelepiped parallelepiped){
        double result = (parallelepiped.getLength() * parallelepiped.getHeight() * parallelepiped.getWidth());
        System.out.println("Volume os Parallelepiped is : " + result);
    }
}
