public class Rectangle {
    private int width;
    private int height;

    Rectangle(int width, int height) {
        //this.width = width;
        //this.height = height;
        setHeight(height);
        setWidth(width);
        System.out.println("Yapımlanıyor...");
    }

    Rectangle() {
        this(1, 1);
    }

    int getArea() {
        return width * height;
    }

    int getPerimeter() {
        return 2 * (width + height);
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width < 0) {
            throw new IllegalArgumentException("Genişlik olumlu olmalıdır!! Sizin girdiğiniz değer:"+ width );
        } else {
            this.width = width;
        }
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (height < 0) {
            throw new IllegalArgumentException("Yükseklik olumlu olmalıdır!! Sizin girdiğiniz değer: " + height);
        } else {
            this.height = height;
        }
    }

}
